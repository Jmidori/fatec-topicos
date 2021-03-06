package com.escola.atividade.entidade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Atividade implements Serializable {
    @JsonProperty
    private String questao1;
    @JsonProperty
    private String questao2;
    @JsonProperty
    private String questao3;


    public String getQuestao1() {
        return questao1;
    }

    public void setQuestao1(String questao1) {
        this.questao1 = questao1;
    }

    public String getQuestao2() {
        return questao2;
    }

    public void setQuestao2(String questao2) {
        this.questao2 = questao2;
    }

    public String getQuestao3() {
        return questao3;
    }

    public void setQuestao3(String questao3) {
        this.questao3 = questao3;
    }

    @Override
    public String toString() {
        return "{" +
                "\"questao1\":\"" + questao1 + '\"' +
                ",\"questao2\":\"" + questao2 + '\"' +
                ",\"questao3\":\"" + questao3 + '\"' +
                '}';
    }
}
