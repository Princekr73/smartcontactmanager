package com.smart.smartcontactmanager.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "CONTACT")
public class Contact implements java.io.Serializable  {
//    implements java.io.Serializable
    private static final long serialVersionUID = 6447416794596398975L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String name;
    private String secondName;
    private String work;
    private String email;
    private String phone;
    private String image;

//    @Column(length = 1000)
    @Lob
    private String description;


    @ManyToOne
    @JsonIgnore
    private User user;

//    @Override
//    public String toString() {
//        return "Contact{" +
//                "cId=" + cId +
//                ", name='" + name + '\'' +
//                ", secondName='" + secondName + '\'' +
//                ", work='" + work + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", image='" + image + '\'' +
//                ", description='" + description + '\'' +
//                ", user=" + user +
//                '}';
//    }

    @Override
    public boolean equals(Object obj){
        return this.cId==((Contact)obj).getCId();
    }
}
