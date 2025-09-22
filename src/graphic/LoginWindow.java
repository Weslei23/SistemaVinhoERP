package graphic;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame
{
    private JLabel lblTitulo, lblUsuario, lblSenha;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    public LoginWindow()
    {
        setTitle( "Tela de Login" );
        setSize( 300, 200 );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout( null );
        componentesCriar();
        setVisible( true );
    }

    private void componentesCriar()
    {
        lblTitulo = new JLabel( "Sistemas Vinhos" );
        lblTitulo.setBounds( 30, 20, 280, 30 );
        lblTitulo.setFont( new Font( Font.MONOSPACED, Font.BOLD, 26 ) );
        getContentPane().add( lblTitulo );

        lblUsuario = new JLabel( "Usuário: " );
        lblUsuario.setBounds( 20, 70, 100, 30 );
        getContentPane().add( lblUsuario );

        txtUsuario = new JTextField();
        txtUsuario.setBounds( 75, 70, 150, 30 );
        getContentPane().add( txtUsuario );

        lblSenha = new JLabel( "Senha: " );
        lblSenha.setBounds( 20, 100, 280, 30 );
        getContentPane().add( lblSenha );

        txtSenha = new JPasswordField();
        txtSenha.setBounds( 75, 100, 150, 30 );
        getContentPane().add( txtSenha );
    }

    public static void main( String[] args )
    {
        new LoginWindow();
    }
}