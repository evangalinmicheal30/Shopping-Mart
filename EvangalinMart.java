import javax.swing.*;
import java.awt.*;

public class EvangalinMart extends JFrame {

    private JTextField loginEmail;
    private JPasswordField loginPassword;

    private JTextField regEmail;
    private JPasswordField regPassword;
    private JTextField dob;
    private JTextField contact;

    private JPanel mainPanel;

    public EvangalinMart() {

        setTitle("EvangalinMart - Login");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        showLoginPage();

        setVisible(true);
    }

    // =========================
    // EVANGALIN MART LOGO
    // =========================

    private JPanel createLogo() {

        JPanel logoPanel = new JPanel();

        logoPanel.setBackground(
                new Color(255, 240, 245)
        );

        logoPanel.setLayout(
                new BoxLayout(
                        logoPanel,
                        BoxLayout.Y_AXIS
                )
        );

        JLabel shopName =
                new JLabel("EvangalinMart");

        shopName.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        25
                )
        );

        shopName.setForeground(
                new Color(220, 70, 120)
        );

        shopName.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        JLabel tagline =
                new JLabel(
                        "Sweetness in Every Bite!"
                );

        tagline.setFont(
                new Font(
                        "Arial",
                        Font.ITALIC,
                        13
                )
        );

        tagline.setForeground(
                new Color(100, 100, 100)
        );

        tagline.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        logoPanel.add(shopName);

        logoPanel.add(
                Box.createVerticalStrut(5)
        );

        logoPanel.add(tagline);

        return logoPanel;
    }

    // =========================
    // LOGIN PAGE
    // =========================

    private void showLoginPage() {

        getContentPane().removeAll();

        mainPanel = new JPanel();

        mainPanel.setLayout(
                new BorderLayout()
        );

        mainPanel.setBackground(
                Color.WHITE
        );

        mainPanel.add(
                createLogo(),
                BorderLayout.NORTH
        );

        JPanel formPanel = new JPanel();

        formPanel.setBackground(
                Color.WHITE
        );

        formPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        25,
                        45,
                        25,
                        45
                )
        );

        formPanel.setLayout(
                new GridLayout(
                        6,
                        1,
                        10,
                        10
                )
        );

        JLabel title =
                new JLabel(
                        "LOGIN",
                        SwingConstants.CENTER
                );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22
                )
        );

        title.setForeground(
                new Color(90, 60, 90)
        );

        loginEmail = new JTextField();

        loginEmail.setBorder(
                BorderFactory.createTitledBorder(
                        "Email ID"
                )
        );

        loginPassword =
                new JPasswordField();

        loginPassword.setBorder(
                BorderFactory.createTitledBorder(
                        "Password"
                )
        );

        JButton loginButton =
                new JButton("LOGIN");

        loginButton.setBackground(
                new Color(255, 105, 150)
        );

        loginButton.setForeground(
                Color.WHITE
        );

        loginButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        loginButton.setFocusPainted(false);

        JButton registerButton =
                new JButton(
                        "NEW REGISTRATION"
                );

        registerButton.setBackground(
                new Color(255, 200, 220)
        );

        registerButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        13
                )
        );

        registerButton.setFocusPainted(false);

        JLabel message =
                new JLabel(
                        "",
                        SwingConstants.CENTER
                );

        loginButton.addActionListener(e -> {

            String email =
                    loginEmail.getText().trim();

            String password =
                    new String(
                            loginPassword.getPassword()
                    ).trim();

            if (email.isEmpty() ||
                    password.isEmpty()) {

                message.setText(
                        "Please enter Email and Password!"
                );

                message.setForeground(
                        Color.RED
                );

            } else if (!email.matches(
                    "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {

                message.setText(
                        "Please enter a valid Email ID!"
                );

                message.setForeground(
                        Color.RED
                );

            } else {

                message.setText(
                        "Login Successful! Welcome to EvangalinMart"
                );

                message.setForeground(
                        new Color(0, 150, 0)
                );
            }
        });

        registerButton.addActionListener(
                e -> showRegistrationPage()
        );

        formPanel.add(title);
        formPanel.add(loginEmail);
        formPanel.add(loginPassword);
        formPanel.add(loginButton);
        formPanel.add(registerButton);
        formPanel.add(message);

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        add(mainPanel);

        revalidate();
        repaint();
    }

    // =========================
    // REGISTRATION PAGE
    // =========================

    private void showRegistrationPage() {

        getContentPane().removeAll();

        mainPanel = new JPanel();

        mainPanel.setLayout(
                new BorderLayout()
        );

        mainPanel.setBackground(
                Color.WHITE
        );

        mainPanel.add(
                createLogo(),
                BorderLayout.NORTH
        );

        JPanel formPanel = new JPanel();

        formPanel.setBackground(
                Color.WHITE
        );

        formPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        15,
                        45,
                        20,
                        45
                )
        );

        formPanel.setLayout(
                new GridLayout(
                        8,
                        1,
                        8,
                        8
                )
        );

        JLabel title =
                new JLabel(
                        "NEW REGISTRATION",
                        SwingConstants.CENTER
                );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        title.setForeground(
                new Color(90, 60, 90)
        );

        regEmail = new JTextField();

        regEmail.setBorder(
                BorderFactory.createTitledBorder(
                        "Email ID"
                )
        );

        regPassword =
                new JPasswordField();

        regPassword.setBorder(
                BorderFactory.createTitledBorder(
                        "Password"
                )
        );

        dob = new JTextField();

        dob.setBorder(
                BorderFactory.createTitledBorder(
                        "Date of Birth (DD-MM-YYYY)"
                )
        );

        contact = new JTextField();

        contact.setBorder(
                BorderFactory.createTitledBorder(
                        "Contact Number"
                )
        );

        JButton registerButton =
                new JButton("REGISTER");

        registerButton.setBackground(
                new Color(255, 105, 150)
        );

        registerButton.setForeground(
                Color.WHITE
        );

        registerButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        registerButton.setFocusPainted(false);

        JButton backButton =
                new JButton(
                        "BACK TO LOGIN"
                );

        backButton.setBackground(
                new Color(255, 200, 220)
        );

        backButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        13
                )
        );

        backButton.setFocusPainted(false);

        JLabel message =
                new JLabel(
                        "",
                        SwingConstants.CENTER
                );

        registerButton.addActionListener(e -> {

            String email =
                    regEmail.getText().trim();

            String password =
                    new String(
                            regPassword.getPassword()
                    ).trim();

            String date =
                    dob.getText().trim();

            String phone =
                    contact.getText().trim();

            boolean validEmail =
                    email.matches(
                            "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$"
                    );

            boolean validPassword =
                    password.length() >= 6;

            boolean validDate =
                    date.matches(
                            "\\d{2}-\\d{2}-\\d{4}"
                    );

            boolean validPhone =
                    phone.matches("\\d{10}");

            if (validEmail &&
                    validPassword &&
                    validDate &&
                    validPhone) {

                message.setText(
                        "EvangalinMart Registration Successful!"
                );

                message.setForeground(
                        new Color(0, 150, 0)
                );

            } else {

                message.setText(
                        "Invalid Details! Please check all fields."
                );

                message.setForeground(
                        Color.RED
                );
            }
        });

        backButton.addActionListener(
                e -> showLoginPage()
        );

        formPanel.add(title);
        formPanel.add(regEmail);
        formPanel.add(regPassword);
        formPanel.add(dob);
        formPanel.add(contact);
        formPanel.add(registerButton);
        formPanel.add(backButton);
        formPanel.add(message);

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        add(mainPanel);

        revalidate();
        repaint();
    }

    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new EvangalinMart();
        });
    }
}