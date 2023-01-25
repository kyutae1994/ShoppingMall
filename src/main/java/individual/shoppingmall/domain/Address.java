package individual.shoppingmall.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String address_number;   // 우편번호
    private String address;  // 주소
    private String detail_address;  // 상세주소

    protected Address() {}
}
