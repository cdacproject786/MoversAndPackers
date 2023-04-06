package com.MoversAndPackersUsers.UsersModule.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceProvider {

    private int id;
    private String firmName;
    private Long mobNo;
    private String mailId;
    private String role;
    private String city;
    private String password;


}
