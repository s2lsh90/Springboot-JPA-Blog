package com.cos.blog.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 New 하는 것은 아니고,
//특정 annotation이 붙어 있는 클래스 파일들을 New 해서 (IOC) 스프링 컨테이너에 관리 해준다.
@RestController	
public class BlogControllerTest {
	@GetMapping("/test/hello")
	public String hello() {
		return "<h2>hello spring boot</h2>";
	}
}
