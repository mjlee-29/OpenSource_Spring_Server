package api_server.spring_server.domain;

import api_server.spring_server.domain.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Book extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    public void setMember(Member member){
        if(this.member != null)
            this.member.getBookList().remove(this);
        this.member = member;
        member.getBookList().add(this);
    }

    public void upCount(){
        this.count += 1;
    }

    public void downCount(){
        this.count -= 1;
    }
}
