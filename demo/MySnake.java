package demo;
import javax.swing.*;
public class MySnake {
    public static void main(String[]args)
    {
        //创建一个窗口
        JFrame frame = new JFrame();
        //指定窗口参数
        frame.setBounds(600,20,700,900);
        //不允许拖拽改变大小
        frame.setResizable(false);
        //点击窗口关闭按钮时，执行操作是推出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyPanel());

        //展现出来
        frame.setVisible(true);
    }
}
