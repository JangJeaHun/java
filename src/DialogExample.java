import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 버튼 추가
        JButton button = new JButton("Show Dialog");
        button.setBounds(100, 50, 100, 40);
        frame.add(button);

        // 버튼 클릭 시 다이얼로그 띄우기
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "안녕하세요! 버튼을 눌렀기 때문에 다이얼로그가 출력됩니다.");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}