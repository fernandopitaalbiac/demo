package com.example.demo.dto;



import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsignaturaDTO {
    private Long id;
    private String nombre;
    private Long profesorId;
}
