package individual.shoppingmall.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @Column(name = "member_name")
    private String name;

    private String nickname;

    private String phone;

    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    private String email_check; // 이메일 수신 여부

    @Enumerated
    private MemberGrade memberGrade; // 등급

    private LocalDateTime insertDate; // 가입날짜

    @Embedded
    private Address address;

}
