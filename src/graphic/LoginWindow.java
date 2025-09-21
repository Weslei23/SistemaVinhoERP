package graphic;

import javax.swing.*;

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
        lblTitulo.setBounds( 50, 50, 280, 30 );
        lblUsuario = new JLabel( "Usuario" );
        lblSenha = new JLabel( "Senha" );
        getContentPane().add( lblTitulo );
    }

    public static void main( String[] args )
    {
        new LoginWindow();
    }
}