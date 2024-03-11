package com.example.demo;

public class ProcessoTarefaEvento {

    private int idProcessoTarefaEvento;
    private boolean inRegistrado;

    public ProcessoTarefaEvento(int id_temp){
        this.idProcessoTarefaEvento = id_temp;
    }

    public int getIdProcessoTarefaEvento(){
        return this.idProcessoTarefaEvento;
    }

}
