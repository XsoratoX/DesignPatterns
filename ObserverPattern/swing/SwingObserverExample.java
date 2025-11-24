import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String args[]) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("これをするべきですか？");

        // Without lambdas
        // button.addActionListener(new AngelListener());
        // button.addActionListener(new DevilListener());

        // With lambdas
        button.addActionListener(event -> System.out.println("してはいけません，後悔しますよ！"));
        button.addActionListener(event -> System.out.println("さあ，やってしまいなさい！"));

        // set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    /*
     * Remove these two inner classes to use lambda expressions instead.
     * 
     * class AngelListener implements ActionListener {
     * public void actionPerformed(ActionEvent event) {
     * System.out.println("してはいけません，後悔しますよ！");
     * }
     * }
     * 
     * class DevilListener implements ActionListener {
     * public void actionPerformed(ActionEvent event) {
     * System.out.println("さあ，やってしまいなさい！");
     * }
     * }
     */
}