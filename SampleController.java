package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.application.Platform;	//�t�H�[������� �ɕK�v
import java.util.concurrent.TimeUnit;

public class SampleController {
	@FXML private Label lbl;
	@FXML private Label lbl1;
	@FXML private Button cmd;
	@FXML private Button cmdClose;
    @FXML
    protected void doSomething() {
        Random rnd = new Random();
        int i = rnd.nextInt(20) + 20;
        String srnd = String.valueOf(i);
        lbl.setText(srnd);
        int[] a = {1,2,3,4,5,6};
        int[] b;
        b = a;
        b[0] = 100;
        String sb = String.valueOf(a[0]);

        lbl1.setText(sb);
    }
    @FXML
    protected void frmclose() {
        String msg = "�����l�ł���";
        String msg2 = "�܂����Ă�";
    	lbl.setText(msg);
     	lbl1.setText(msg2);
    	try {
			TimeUnit.MILLISECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
    	try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
       // �t�H�[�������
    	Platform.exit();
    }
}
