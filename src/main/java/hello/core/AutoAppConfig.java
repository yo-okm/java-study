package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 미지정시 @ComponentScan 이 붙은 설정 정보 클래스의 패키지가 시작 위치
        // basePackages = "hello.core.member", // {"hello.core.member", "..."}
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
