import javax.swing.*;
import java.awt.*;

public class BotaoCampoMinado extends JButton {
    private int estado;
    private int linha;
    private int coluna;

    public BotaoCampoMinado(int linha, int coluna) {
        this.estado = CampoMinado.TAPADO;
        this.linha = linha;
        this.coluna = coluna;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        switch (estado) {
            case CampoMinado.VAZIO:
                this.setText("");
                this.setBackground(Color.LIGHT_GRAY);
                break;
            case CampoMinado.TAPADO:
                this.setText("");
                this.setBackground(null);
                break;
            case CampoMinado.DUVIDA:
                this.setText("?");
                this.setBackground(Color.YELLOW);
                break;
            case CampoMinado.MARCADO:
                this.setText("!");
                this.setBackground(Color.RED);
                break;
            case CampoMinado.REBENTADO:
                this.setText("*");
                this.setBackground(Color.ORANGE);
                break;
            default:
                this.setText(String.valueOf(estado));
                this.setBackground(Color.LIGHT_GRAY);
                break;
        }
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
}
