import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    BufferedReader reader;
    Escola e1;

    public static void main(String[] args) throws Exception {
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();

        se.reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Nome da Escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("Telefone: ");
        se.e1.setFone(se.reader.readLine());

        se.menu();
    }

    private void menu() throws Exception {
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("-------------------------");
            System.out.println("[1] Cadastrar nova turma");
            System.out.println("[2] Listar turmas existentes");
            System.out.println("[3] Consultar uma turma");
            System.out.println("[4] Sair");
            System.out.println("-------------------------");
            opcao = this.reader.readLine();
            switch (opcao) {
                case "1":
                    cadastrarTurma();
                    break;
                case "2":
                    listarTurmas();
                    break;
                case "3":
                    consultarTurma();
                    break;
                default:
                    break;
            }
        }
    }

    private void cadastrarTurma() throws Exception {
        Turma t = new Turma();
        System.out.println("CADASTRO DE TURMA");
        System.out.println("Nro da turma: ");

        // String num = reader.readLine();
        // int nroInt = Integer.parseInt(num);
        // t.setNroTurma(nroInt);
        // ou:
        t.setNroTurma(Integer.parseInt(reader.readLine()));

        System.out.println("Nome do curso: ");
        t.setNomeCurso(reader.readLine());
        System.out.println("Ano de ingresso: ");
        t.setAnoIngresso(Integer.parseInt(reader.readLine()));

        System.out.println("---Alunos---");
        for (int i = 0; i < 40; i++) {
            System.out.println("Nome do aluno: ");
            String nome = reader.readLine();
            if (nome.equals("")) {
                break;
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Matrícula: ");
            aluno.setMatricula(reader.readLine());
            System.out.println("Nota 1: ");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 2: ");
            aluno.setNota2(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 3: ");
            aluno.setNota3(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 4: ");
            aluno.setNota4(Float.parseFloat(reader.readLine()));
            t.setAluno(aluno);
        }
        e1.setTurma(t);
    }

    public void listarTurmas() {
        System.out.println("------------------------");
        System.out.println("Listagem de Turmas");
        for (int i = 0; i < e1.getQtdeTurmas(); i++) {
            System.out.println(
                    "Número" + e1.getTurma(i).getNroTurma() + " - Curso " + e1.getTurma(i).getAnoIngresso() + "- Ano: "
                            + e1.getTurma(i).getAnoIngresso() + " - Qtd de alunos " + e1.getTurma(i).getQtdeAlunos());

            Turma t = e1.getTurma(i);
            System.out.println(
                    "Número" + t.getNroTurma() + " - Curso " + t.getAnoIngresso() + "- Ano: "
                            + t.getAnoIngresso() + " - Qtd de alunos " + t.getQtdeAlunos());

        }
    }

    private void consultarTurma() throws Exception {
        System.out.println("------------------------");
        System.out.println("Consulta de Turma");
        System.out.println("Número a Turma:");
        int numTurma = Integer.parseInt(reader.readLine());
        boolean achou = false;
        for (int i = 0; i < e1.getQtdeTurmas(); i++) {
            Turma t = e1.getTurma(i);
            if (t.getNroTurma() == numTurma) {
                System.out.println("[ALUNOS DA TURMA]");
                int posAluno = 0;
                while(t.getAluno(posAluno) != null){
                    String linha = "Nome: " + t.getAluno(posAluno).getNome()
                    + "- Matricula" + t.getAluno(posAluno).getMatricula()
                    + " - Média " + t.getAluno(posAluno).calcularMedia();
                    System.out.println(linha);

                    posAluno++;
                }
                achou = true;
                break;
            }

        }
        if (!achou) {
            System.out.println("Turma não encontrada");
        }

    }

}
