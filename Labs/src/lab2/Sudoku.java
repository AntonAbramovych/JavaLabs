import java.util.Scanner;

public class Sudoku {

    private String showTable;
    private int line, lineVerify, column, columnVerify, number, numberVerify, t, section, trying = 0;
    private boolean check = false, verify = false;
    private int tab[][][] = new int[3][3][9];
    Scanner input = new Scanner(System.in);

    public Sudoku() {
    
    }

 
    public void createTable() {
        for (number = 0; number <= 8; number++) {
            for (line = 0; line <= 2; line++) {
                for (column = 0; column <= 2; column++) {
                    do {
                        verify = true;
                        t = (int) (Math.random() * 10);
                        verifyBlock();
                        verifyLine();
                        verifyColumn();
                        rebootRandom();
                    } while (verify == false);
                    tab[line][column][number] = t;
                }
            }
        }
    }

    public void verifyBlock() {
        for (lineVerify = 0; lineVerify <= 2; lineVerify++) {
            for (columnVerify = 0; columnVerify <= 2; columnVerify++) {
                if (t == tab[lineVerify][columnVerify][number] || t == 0)
                    verify = false;
            }
        }
    }

  
    public void verifyLine() {
        if (number >= 0 && number <= 2)
            section = 0;
        else if (number >= 3 && number <= 5)
            section = 3;
        else
            section = 6;
        for (numberVerify = section; numberVerify <= section + 2; numberVerify++) {
            for (columnVerify = 0; columnVerify <= 2; columnVerify++) {
                if (t == tab[line][columnVerify][numberVerify] || t == 0)
                    verify = false;
            }
        }
    }


    public void verifyColumn() {
        if (number == 0 || number == 3 || number == 6)
            section = 0;
        else if (number == 1 || number == 4 || number == 7)
            section = 1;
        else
            section = 2;
        for (numberVerify = section; numberVerify <= section + 6; numberVerify = numberVerify + 3) {
            for (lineVerify = 0; lineVerify <= 2; lineVerify++)
                if (t == tab[lineVerify][column][numberVerify] || t == 0) {
                    verify = false;
                }
        }
    }


    public void rebootRandom() {
        if (number >= 0 && number <= 2)
            section = 0;
        else if (number >= 3 && number <= 5)
            section = 3;
        else
            section = 6;
        if (trying > 600) {
            for (numberVerify = section; numberVerify <= section + 2; numberVerify++) {
                for (lineVerify = 0; lineVerify <= 2; lineVerify++) {
                    for (columnVerify = 0; columnVerify <= 2; columnVerify++) {
                        tab[lineVerify][columnVerify][numberVerify] = 0;
                    }
                }
            }
            trying = 0;
            number = section;
            line = 0;
            column = 0;
        }
        trying++;
    }


    public void createZeros() {
        for (number = 0; number <= 8; number++) {
            for (line = (int) (Math.random() * 3); line <= (int) (Math.random() * 3); line++) {
                for (column = (int) (Math.random() * 3); column <= (int) (Math.random() * 3); column++) {
                    tab[line][column][number] = 0;
                }
            }
        }
    }

    do{
        showTable = "";
        dontShowTwice();
        System.out.print("\n Table: \n \n" + showTable + "\n");
        createSudoku();
    }while(check != true);
    System.out.println("You won!");

    public void dontShowTwice() {
        for (section = 0; section <= 6; section = (section + 3)) {
            for (line = 0; line <= 2; line++) {
                for (number = section; number <= section + 2; number++) {
                    for (column = 0; column <= 2; column++) {
                        showTable += tab[line][column][number] + "\t";
                    }
                    showTable += "\t";
                }
                showTable += "\n" + "\n";
            }
            showTable += "\n";
        }
    }


    public void createSudoku(){
        do {
            do {
                System.out.println("Line: ");
                line = input.nextInt();
                System.out.println("Column: ");
                column = input.nextInt();
                if (line > 9 || column > 9 || line < 1 || column < 1)
                    System.out.println("Escolha uma posicao entre 1 e 9");
            } while (line > 9 || column > 9 || line < 1 || column < 1);

            if (line >= 1 && line <= 3) {
                line -= 1;
                if (column >= 1 && column <= 3) {
                    number = 0;
                    column -= 1;
                } else if (column >= 4 && column <= 6) {
                    number = 1;
                    column -= 4;
                } else {
                    number = 2;
                    column -= 7;
                }
            } else if (line >= 4 && line <= 6) {
                line = line - 4;
                if (column >= 1 && column <= 3) {
                    number = 3;
                    column = column - 1;
                } else if (column >= 4 && column <= 6) {
                    number = 4;
                    column = column - 4;
                } else {
                    number = 5;
                    column = column - 7;
                }
            } else {
                line = line - 7;
                if (column >= 1 && column <= 3) {
                    number = 6;
                    column = column - 1;
                } else if (column >= 4 && column <= 6) {
                    number = 7;
                    column = column - 4;
                } else {
                    number = 8;
                    column = column - 7;
                }
            }
            verifyPosition();
        } while (tab[line][column][number] != 0);
        System.out.println("Number: ");
        t = input.nextInt();

        verify = true;
        testBlock();
        testLine();
        testColumn();
        verify = true;
        verifyTable();
        if (verify != false)
            check = true;
    }


    /**
     * Verifica se a posicao ja foi preenchida
     */
    public void verifyPosition() {
        if (tab[line][column][number] != 0)
            System.out.println("Posicao preenchida, escolha outra");
    }

    /**
     * Verifica se number esta repetido no mesmo bloco
     */
    public void testBlock() {
        for (lineVerify = 0; lineVerify <= 2; lineVerify++) {
            for (columnVerify = 0; columnVerify <= 2; columnVerify++) {
                if (t == tab[lineVerify][columnVerify][number] || t == 0)
                    verify = false;
            }
        }
    }

    /**
     * Verifica se esta repetido na mesma linha
     */
    public void testLine() {
        if(number >= 0 && number <= 2)
            section = 0;
        else if(number >= 3 && number <= 5)
            section = 3;
        else
            section = 6;
        for (numberVerify = section; numberVerify <= section + 2; numberVerify++) {
            for (columnVerify = 0; columnVerify <= 2; columnVerify++) {
                if (t == tab[line][columnVerify][numberVerify] || t == 0)
                    verify = false;
            }
        }
    }

    /**
     * Verifica se esta repetido na mesma coluna
     */
    public void testColumn() {
        if (number == 0 || number == 3 || number == 6)
            section = 0;
        else if (number == 1 || number == 4 || number == 7)
            section = 1;
        else
            section = 2;
        for (numberVerify = section; numberVerify <= section + 6; numberVerify = numberVerify + 3) {
            for (lineVerify = 0; lineVerify <= 2; lineVerify++) {
                if (t == tab[lineVerify][column][numberVerify] || t == 0)
                    verify = false;
            }
        }
        // caso o numero nao esteja repetido
        if (verify == false)
            System.out.println("Numero errado, tente novamente");
        else
            tab[line][column][number] = t;
    }

    /**
     * Verifica se tabela esta completa
     */
    public void verifyTable() {
        for (number = 0; number <= 8; number++) {
            for (line = 0; line <= 2; line++) {
                for (column = 0; column <= 2; column++) {
                    if (tab[line][column][number] == 0)
                        verify = false;
                }
            }
        }
    }
}