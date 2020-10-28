 package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener{count()}

    }
      var randomInt=0
     private fun rollDice()
        {
            var randomInt=(1..6).random()
            result_text.text = randomInt.toString()
            //Toast.makeText(this,"You wanna Roll!",Toast.LENGTH_SHORT).show()
            //result_text.text="You Have already Rolled!"
            var resultText:TextView=findViewById(R.id.result_text)

        }
     private fun count()
     {
         if ((randomInt >=1)&&(randomInt<6)) {
             randomInt += 1
             result_text.text = randomInt.toString()
             var resultText:TextView=findViewById(R.id.result_text)

         }
         else if(randomInt==6)
         {
             result_text.text = randomInt.toString()
             var resultText:TextView=findViewById(R.id.result_text)

         }
         else
             randomInt=1
         result_text.text = randomInt.toString()
         var resultText:TextView=findViewById(R.id.result_text)

     }

}