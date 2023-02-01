package individual.shoppingmall.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @OneToMany(mappedBy = "item")
    private List<Reply> replies = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Image> images = new ArrayList<>();

    @Column(name = "item_name")
    private String name;

    private int price;
    private int stockQuantity;
    private String description;
    // 상품 등록 날짜
    private LocalDateTime itemDate;
    // 상품 조회수
    private int itemHits;

}
