package org.devlive.sdk.openai.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.devlive.sdk.openai.entity.EmbeddingEntity;
import org.devlive.sdk.openai.entity.UsageEntity;

import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbeddingResponse
{
    @JsonProperty(value = "object")
    private String object;

    @JsonProperty(value = "data")
    private List<EmbeddingEntity> embeddings;

    @JsonProperty(value = "model")
    private String model;

    @JsonProperty(value = "usage")
    private UsageEntity usage;
}
