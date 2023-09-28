package lk.ijse.gdse.spring_crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDto {
    private UUID projectId;

    private String projectName;

    private String projectDeadline;

    private String projectStatus;

    @ToString.Exclude
    private TLDto tl;
}
