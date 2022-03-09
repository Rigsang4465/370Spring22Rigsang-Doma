 My Tip calculator

Steps for how we can use the android app Tip calculator:

Step1: Start out with launching the android studio app.

Step2:  I have three java files in the app\ java file

- [ ]  **edu.qc.seclass.tipcalculator**
  - [ ] MainActivity
    1. The amount of the check.
    2.  The number of people splitting the check.
    3. Amount of tips
    4. The total amount each person should pay. This should be rounded to an integer.
    5.  Display the message if it's empty or invalid.
- [ ] **edu.qc.seclass.tipcalculator**(andriodTest)
  - [ ] ExampleInstrumentedTest
- [ ] **edu.qc.seclass.tipcalculator**(test)	
  - [ ] ​	ExamPleUnitTest

Step3: Run or launch the App. Make sure to select the correct runner. In my case, I have Pixel 2 APU 28. This should open the Android emulator for the TipCalculatorActivity.

Step4: Calculate each tip and total tip as well as throw error if we enter an invalid number

If the user enters the right value do the following:

- Enter the positive number for the check amount 
- Enter the positive number for Party Size 
- Enter the button to calculate each percentage by a given percent

If the user enters the wrong value do the following:

- A negative value is prevented from letting the user enter on my activity_main.xml
- Throw an error if user zero and null.
