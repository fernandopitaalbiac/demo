package com.example.demo.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
}
