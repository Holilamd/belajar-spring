package belajarjava.belajarspring.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "kategori")
@Data

public class Category implements Serializable {

    private static final Long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "nama", length = 100)
    String name;

    @Column(name = "keterangan")
    String description;

    @Column(name = "status")
    String status;

//    @Builder.Default
    @Column(name = "rec_dibuat_tgljam")
    Date createDate = new Date();
}
