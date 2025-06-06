package com.LojaFB;
import com.LojaFB.dao.ProdutoDAO;
import com.LojaFB.menu.AdminMenu;
import com.LojaFB.menu.ClienteMenu;
import com.LojaFB.utils.InputUtils;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        AdminMenu adminMenu = new AdminMenu(produtoDAO);
        ClienteMenu clienteMenu = new ClienteMenu(produtoDAO);

        while (true) {
            System.out.println("\n=== BEM VINDO A LOJA! SELECIONE UM USUARIO ===");
            System.out.println("1. Vendedor");
            System.out.println("2. Cliente");
            System.out.println("0. Sair");

            int opcao = InputUtils.obterInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    adminMenu.exibirMenu();
                    break;
                case 2:
                    clienteMenu.exibirMenu();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
