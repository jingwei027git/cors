package tw.com.softpower.demo.cors.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Client implements Serializable {

    private String name;
    private Integer age;

}
