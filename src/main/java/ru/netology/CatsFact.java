package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsFact {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvoutes;

    public CatsFact(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvoutes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvoutes = upvoutes;
    }

    public Integer getUpvoutes() {
        return upvoutes;
    }

    @Override
    public String toString() {
        return "Fact:" +
                "\n text=" + text +
                "\n upvoutes=" + upvoutes;
    }
}
