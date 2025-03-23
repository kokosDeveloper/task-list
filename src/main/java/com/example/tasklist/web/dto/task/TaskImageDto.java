package com.example.tasklist.web.dto.task;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@Schema(description = "Task image DTO")
public class TaskImageDto {
    @NotNull(message = "Image must not be null")
    private MultipartFile file;
}
