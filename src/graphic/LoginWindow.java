package graphic;

import javax.swing.*;

public class LoginWindow extends JFrame
{
    

    public LoginWindow()
    {
        setTitle( "Tela de Login" );
        setSize( 300, 200 );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout( null );
        setVisible( true );
    }

    public static void main( String[] args )
    {
        new LoginWindow();
    }
}