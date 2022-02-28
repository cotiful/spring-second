package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    // 구체적으로 멀 달라고 요청해야함.-body x
    @GetMapping("/post/{id}")
    public String test1(@PathVariable int id) {
        return "주세요 id :" + id;
    }

    // Select * from post where title = ?
    // 프레임은 쿼리스트링을 사용하지 않아도 된다.
    // http://localhost:8000/post?tit

    public String search(String title) { // 주소에다가 그냥 적으면 query String이 저절로 된다.
        return "주세요 Title :" + title;
    }

    // Http://localhost:8000/post
    // body -:title=제목1&content=내용1 ->쿼리스트링과 같은 타입
    // header : Content-type : application/ x-www-from-urlencoded 이렇게 알려줘야 함.
    // 뭘 줘야함 - body O
    // Request.getparameter()메서드가 스프링 기본 파싱 전략 x-www~이것밖에 모름
    @PostMapping("/post")
    public String test2(String title, String content) {
        return "줄게요:title" + title + ",content:" + content;
    }

    // UPDATE post SET title = ?, content = ?, WHERE id =?
    // Where은 HEADER에다가 보내줘야 한다.(주소) ->규칙, Where 조건은 주소에 적어줘야 한다.
    // title, content (primary key: id)
    // 멀 줘야함 - Body O
    // API 문서를 만들어줘야 백앤드 개발자가 알고 작업을 함.
    @PutMapping("/post/{id}")
    public String test3(String title, String content, @PathVariable int id) {
        return "바꿔주세요:" + title + ",content:" + content + ",id:" + id;
    }

    // http://localhost:8000/post?title=제목1
    // DELETE from post WHERE id = ?

    // http://localhost:8000/post/1
    // Delete from post where id =?, Primary key는 ID로 하자고 약속한다.
    // 삭제해주세요, - body X
    @DeleteMapping("/post/{id}")
    public String test4(@PathVariable int id) {
        return "삭제해주세요 id" + id;
    }
}
