import java.io.*;
import java.util.ArrayList;

public class TabelaRecordes implements Serializable {
    private String nomeJogador;
    private long tempoJogo;
    private transient ArrayList<TabelaRecordesListener> listeners;

    public TabelaRecordes(String nomeJogador, long tempoJogo) {
        this.nomeJogador = nomeJogador;
        this.tempoJogo = tempoJogo;
        listeners = new ArrayList<>();
    }

    public TabelaRecordes() {
        this.nomeJogador = "Anónimo";
        this.tempoJogo = 9999999;
        listeners = new ArrayList<>();
    }

    public void addTabelaRecordesListener(TabelaRecordesListener list) {
        if (listeners == null) listeners = new ArrayList<>();
        listeners.add(list);
    }

    public void removeTabelaRecordesListener(TabelaRecordesListener list) {
        if (listeners != null) listeners.remove(list);
    }

    private void notifyRecordesActualizados() {
        if (listeners != null) {
            for (TabelaRecordesListener list : listeners)
                list.recordesActualizados(this);
        }
    }


    public long getTempoJogo() {
        return tempoJogo;
    }

    public String getNomeJogador() {
        return new String(nomeJogador);
    }

    public void setTempoJogo(long tempoJogo) {
        this.tempoJogo = tempoJogo;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = new String(nomeJogador);
    }

    public void setRecorde(String nomeJogador, long tempoJogo) {
        if (tempoJogo < this.tempoJogo) {
            this.setNomeJogador(nomeJogador);
            this.setTempoJogo(tempoJogo);
            notifyRecordesActualizados();
        }
    }

    public long getRecorde() {
        return this.tempoJogo;
    }
}
