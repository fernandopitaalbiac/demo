package com.example.demo.dto;



import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesorDTO {
    private Long id;
    private String nombre;
    private String especialidad1;
    private String especialidad2;
}
