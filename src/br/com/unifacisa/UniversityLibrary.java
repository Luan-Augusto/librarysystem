package br.com.unifacisa;

import java.util.ArrayList;

public class UniversityLibrary {
    public static void main(String[] args) {
        Keyboard input = new Keyboard();
        ArrayList<Books> books = new ArrayList<>();
        ArrayList<Students> students = new ArrayList<>();
        int nextId = 0;

        while (true) {
            input.getSyso("************************************");
            input.getSyso("*        Biblioteca da Universidade de Java          *");
            input.getSyso("************************************");
            input.getSyso("* 1. Cadastrar livro        *");
            input.getSyso("* 2. Listar livros           *");
            input.getSyso("* 3. Consultar livro         *");
            input.getSyso("* 4. Remover livro           *");
            input.getSyso("* 5. Cadastrar aluno          *");
            input.getSyso("* 6. Listar alunos            *");
            input.getSyso("* 7. Consultar aluno           *");
            input.getSyso("* 8. Remover aluno           *");
            input.getSyso("* 9. Alterar livros/alunos           *");
            input.getSyso("* 10. Sair                          *");
            input.getSyso("************************************");

            int option = (int) input.readNumber("Digite sua opção: ");

            if (option == 10) {
                break;
            }

            int idBook;
            int idChoice;
            String nameBook;
            String observation;
            Books book;
            int idStudent;
            String nameStudent;
            Students student;

            switch (option) {
                case 1:
                    idBook = nextId;
                    nameBook = input.readText("Qual nome do livro? ");
                    observation = input.readText("Digite as observações sobre o livro: ");

                    book = new Books(idBook, nameBook);
                    book.setObservation(observation);

                    books.add(book);
                    input.getSyso("Livro adicionado, id: " + book.getId());
                    nextId++;
                    break;

                case 2:
                    for (Books b : books) {
                        input.getSyso(b.getId() + " - " + b.getName());
                    }
                    input.getSyso(books.size() + " Livros cadastrados.");
                    break;

                case 3:
                    idBook = (int) input.readNumber("Qual o id do livro? ");

                    for (Books b : books) {
                        if (b.getId() == idBook) {
                            input.getSyso("ID: " + b.getId());
                            input.getSyso("Nome: " + b.getName());
                            input.getSyso("Observações: " + b.getObservation());
                        }
                    }
                    break;

                case 4:
                    idBook = (int) input.readNumber("Nome do livro: ");

                    int index = 0;

                    for (Books b : books) {
                        if (b.getId() == idBook) {
                            break;
                        }
                        index++;
//                        ((b.getId() == idBook) ? break : index++);
                    }
                    input.getSyso(index == books.size() ? "ID não encontrado :(" : books.remove(index) + "Livro removido.");
                    break;

                case 5:
                    idStudent = nextId;
                    nameStudent = input.readText("Digite o nome do aluno: ");

                    student = new Students(idStudent, nameStudent);

                    students.add(student);
                    input.getSyso("Aluno adicionado, id: " + student.getId());
                    nextId++;
                    break;

                case 6:
                    for (Students s : students) {
                        input.getSyso(s.getId() + " - " + s.getName());
                    }
                    input.getSyso(students.size() + " Alunos cadastrados.");
                    break;

                case 7:
                    idStudent = (int) input.readNumber("Digite o id do aluno: ");
                    for (Students s : students) {
                        if (s.getId() == idStudent) {
                            input.getSyso("ID: " + s.getId());
                            input.getSyso("Nome: " + s.getName());
                        }
                    }
                    break;

                case 8:
                    idStudent = (int) input.readNumber("Nome do aluno: ");

                    int index2 = 0;

                    for (Students s : students) {
                        if (s.getId() == idStudent) {
                            break;
                        }
                        index2++;
                    }
                    input.getSyso(index2 == students.size() ? "ID não encontrado :(" : students.remove(index2) + "Aluno removido.");
                    break;

                case 9:
                    idChoice = (int) input.readNumber(
                            "Para alterar livro por ID digite: 1 " + "\n" +
                                    "Para alterar alno por ID digite: 2"
                    );

                    if (idChoice == 1) {
                        idBook = (int) input.readNumber("Digite o id do livro a ser alterado:");
                        for (Books b : books) {
                            if (b.getId() == idBook) {
                                String newName = input.readText("Nome do novo livro: ");
                                b.setName(newName);
                                input.getSyso("Nome modificado para: " + b.getName());
                            }
                        }
                        break;
                    }

                    if (idChoice == 2) {
                        idStudent = (int) input.readNumber("Digite o id do aluno a ser alterado: ");
                        for (Students s : students) {
                            if (s.getId() == idStudent) {
                                String newNameStudent = input.readText("Digite o novo nome do aluno: ");
                                s.setName(newNameStudent);
                                input.getSyso("Nome do aluno modificado para: " + s.getName());
                            }
                        }
                        break;
                    }
            }
        }

    }
}

