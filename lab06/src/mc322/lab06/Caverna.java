package mc322.lab06;

public class Caverna {
    // Atributos
    private Sala salas[][];
    private Heroi heroi;

    // Construtor
    public Caverna() {
        salas = new Sala[4][4];
    }

    // Setters
    public void setSala(int x, int y, Sala sala) {
        salas[x][y] = sala;
    }
    public void setHeroi(Heroi heroi) {
        this.heroi = heroi;
    }

    // Getters
    public char getComponenteNaSala(int x, int y) {
        return salas[x][y].getComponente();
    }

    // "Pega o ouro" (atualiza o estado do herói e da sala)
    public void pegarOuro(int x, int y) {
        salas[x][y].pegarOuro();
        heroi.setOuro(true);
    }

    // Imprime o estado atual da caverna no console
    public void imprimirCaverna() {
        for (int i = 0; i < 4; i ++) {
            System.out.print(i + 1);
            for (int j = 0; j < 4; j ++) {
                if (salas[i][j].getVisitado() == true) {
                    char componente = salas[i][j].getComponente();

                    if (componente == 'O') {
                        System.out.print(" O");
                    } else if (componente == 'B') {
                        System.out.print(" B");
                    } else if (componente == 'W') {
                        System.out.print(" W");
                    } else if ((i == heroi.getX()) && (j == heroi.getY())) {
                        System.out.print(" P");
                    } else if (componente == 'f') {
                        System.out.print(" f");
                    } else if (componente == 'b') {
                        System.out.print(" b");
                    } else {
                        System.out.print(" #");
                    }
                } else {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
        System.out.println("  1 2 3 4");
        System.out.println();
    }
}
