import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Students")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(name = "registration_date")
    private Date registrationDate;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<PurchaseList> purchaseLists;

}
