package sdu.cs58.suteenart.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1.Explicit ปากาศตัวแปร
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString , userString , passString ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2.Initial view ผูกตัวแปรบน java ให้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.TXTName);
        usernameEditText = findViewById(R.id.TXTUsername);
        passwordEditText = findViewById(R.id.TXTPassword);
        loginButton = findViewById(R.id.BTNLogin);
        //3.สั่งให้ปุ่มค่อยฟังเมื่อ user ทำการคลิกปุ่ม
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ดึงข้อมูลที่ user ป้อนในหน้า ui มาเก็บในตัวแปรชนิด String
                nameString = nameEditText.getText().toString().trim();
                userString = usernameEditText.getText().toString().trim();
                passString = passwordEditText.getText().toString().trim();

                //ตรวจสอบค่าว่าง
                if ((nameString.length()==0)||(userString.length()==0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ข้อมูลให้ครบทุกช่อง" , Toast.LENGTH_SHORT).show();
                }

                //ตรวจสอบ login
                if ((userString.equals("admin")) && (passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "Login Success" , Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Login Fail" , Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(getApplicationContext(),"Sub BOIIII!!!!" + nameString,Toast.LENGTH_SHORT).show();
            }
        });

    } //end method onCreate
} //end class
