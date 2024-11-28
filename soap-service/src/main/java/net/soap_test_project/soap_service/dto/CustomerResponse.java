package net.soap_test_project.soap_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerResponse {
    private String identity;
    private String name;
    private String email;
}
