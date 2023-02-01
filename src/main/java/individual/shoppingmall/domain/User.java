package individual.shoppingmall.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    private String password;

    @Column(name = "user_name")
    private String name;

    private String nickname;

    private String phone;

    private String email;

    private String email_check; // 이메일 수신 여부

    @Enumerated
    private UserGrade userGrade; // 등급

    private LocalDateTime insertDate; // 가입날짜

    @Embedded
    private Address address;
}
