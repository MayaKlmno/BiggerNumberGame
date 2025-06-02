package com.example.biggernumbergame

import android.graphics.Color
import android.os.Bundle
import android.os.SystemClock.sleep
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var leftButton: Button
    private lateinit var rightButton: Button
    private lateinit var score: TextView
    private var scoreCount = 0

    private var leftButtonNum = (0..9).random()
    private var rightButtonNum = (0..9).random()

    //private lateinit var layout: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        leftButton = findViewById(R.id.leftButton)
        rightButton = findViewById(R.id.rightButton)
        score = findViewById(R.id.scoreCount)

        leftButton.text = leftButtonNum.toString()
        rightButton.text = rightButtonNum.toString()

        // set each button to a random number
        leftButtonNum = (0..9).random()
        leftButton.text = leftButtonNum.toString()
        rightButtonNum = (0..9).random()
        rightButton.text = rightButtonNum.toString()

        // if the buttons are equal change them
        while(leftButtonNum == rightButtonNum){
            //leftButton = Random.nextInt(0,10)   // another way to make random
            leftButtonNum = rightButtonNum + 1
            leftButton.text = leftButtonNum.toString()
        }

        // what happens when you click one of the left button
        leftButton.setOnClickListener {
            if(leftButtonNum > rightButtonNum){
                scoreCount++
                score.text = "Score: " + scoreCount
                rightButton. setBackgroundColor(Color. rgb(135, 75, 145));
                leftButton. setBackgroundColor(Color. rgb(135, 75, 145));
            } else {
                scoreCount--
                score.text = "Score: " + scoreCount
                rightButton. setBackgroundColor(Color. rgb(255, 0, 0));
            }

            leftButtonNum = (0..9).random()
            leftButton.text = leftButtonNum.toString()
            rightButtonNum = (0..9).random()
            rightButton.text = rightButtonNum.toString()

            while(leftButtonNum == rightButtonNum){
                //leftButton = List(1){Random.nextInt(0,9)}   // my first way to try to randomize the numbers
                leftButtonNum = rightButtonNum + 1
                leftButton.text = leftButtonNum.toString()
            }

        }

        //what happens when you cick on the right button
        rightButton.setOnClickListener {
            if(rightButtonNum > leftButtonNum) {
                scoreCount++
                score.text = "Score: " + scoreCount
                rightButton. setBackgroundColor(Color. rgb(135, 75, 145));
                leftButton. setBackgroundColor(Color. rgb(135, 75, 145));

            } else {
                scoreCount--
                score.text = "Score: " + scoreCount
                leftButton. setBackgroundColor(Color. rgb(200, 0, 0));
                //sleep(100)
                //leftButton. setTextColor(Color. rgb(241, 199, 230));
            }


            leftButtonNum = (0..9).random()
            leftButton.text = leftButtonNum.toString()
            rightButtonNum = (0..9).random()
            rightButton.text = rightButtonNum.toString()



            while(leftButtonNum == rightButtonNum){
                //leftButton = List(1){Random.nextInt(0,9)}   // my first way to try to randomize the numbers
                leftButtonNum = rightButtonNum + 1
                leftButton.text = leftButtonNum.toString()
            }
        }




    }
}