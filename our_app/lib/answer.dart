import 'package:flutter/material.dart';
import 'package:rflutter_alert/rflutter_alert.dart';


import 'quiz.dart';
import 'main.dart';

class QuizCounter{
  static int Quizpoints = 0;
}
class MyApp1 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text("Quiz App"), shadowColor: Colors.brown,),
        backgroundColor: Colors.green[50],
        body: SafeArea(
          child: Padding(
            padding: const EdgeInsets.symmetric(horizontal: 10.0),
            child: QuizPage(),
          ),
        ),
      ),
    );
  }
}

class QuizPage extends StatefulWidget {
  @override
  _QuizPageState createState() => _QuizPageState();
}
class DialogExample extends StatelessWidget {
  const DialogExample({super.key});

  @override
  Widget build(BuildContext context) {
    return TextButton(
      onPressed: () => showDialog<String>(
        context: context,
        builder: (BuildContext context) => AlertDialog(
          title: const Text('You have completed the Quiz'),
          content: const Text('This is the amount of points you got:'),
          actions: <Widget>[
            TextButton(
              onPressed: () => Navigator.pop(context, 'OK'),
              child: const Text('OK'),
            ),
          ],
        ),
      ),
      child: const Text('Done!'),
    );
  }
}

class _QuizPageState extends State<QuizPage> {
  QuizBrain quizBrain = new QuizBrain();

  // List For Icons
  List<Icon> scoreKeper = [];

// new int question number tracker
  int order=1 ;

  void checkAnswer(String userAswer)
  {

    if(quizBrain.checknext() == false ) {
      showDialog(context: context, builder: (ctx) {
                  return AlertDialog(
                    title: const Text('Done!'),
                    content: Text('These are the amount of points you got:  ${QuizCounter.Quizpoints}'),
                  );
                });
      //Alert(context: context, title: "Points", desc: "These are the amount of points you got:  ${QuizCounter.Quizpoints}").show();

      setState(()
      {
        // Reset Question Counter
        quizBrain.resetnumber();
        // Reset Icons List
        scoreKeper = [];
      });


    }
    else
    {
      setState(()
      {
        if (quizBrain.getquestionAnswer() == userAswer) {
          scoreKeper.add(const Icon(Icons.check, color: Colors.green,));
          Counter.points +=1;
          QuizCounter.Quizpoints +=1;

        }
        else
        {
          scoreKeper.add(const Icon(Icons.close, color: Colors.red,));
          //Counter.points -=1;
        }

        quizBrain.nextQuestion();
      }
      );
    }

    setState(() {
      order = quizBrain.order();
      order = order+1;
    });

  }

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: <Widget>[
        Expanded(
          child: Padding(
            padding: const EdgeInsets.all(15.0),
            child: Card(
               color: Colors.brown.shade300,

              child: Center(
                child: Text(
                  'Question $order of 6',
                  style: const TextStyle(
                    fontSize: 20.0,
                    fontWeight: FontWeight.bold,
                    color: Colors.white,
                  ),
                ),
              ),

            ),
          ),
        ),
        Expanded(
          flex: 5,
          child: Padding(
            padding: const EdgeInsets.all(10.0),
            child: Center(
              child: Text(
                quizBrain.getquestiontext(),
                textAlign: TextAlign.center,
                style: const TextStyle(
                  fontSize: 25.0,
                  color: Colors.black,
                ),
              ),
            ),
          ),
        ),
        Expanded(
          child: Padding(
            padding: const EdgeInsets.all(15.0),
            child: TextButton(
              onPressed: () {
              checkAnswer('A');

              },
            style: TextButton.styleFrom(backgroundColor: Colors.green[300]),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [

                 
                 Container(
                  padding: const EdgeInsets.only(left: 7),
                   child: Text(
                        quizBrain.getAnswerA(),
                       // 'A',
                        style: const TextStyle(
                          color: Colors.white,
                          fontSize: 20.0,
                        ),
                      ),
                 ),


                ],
              ),
            ),
          ),
        ),
        Expanded(
          child: Padding(
            padding: const EdgeInsets.all(15.0),
            child: TextButton(

              onPressed: () {
                checkAnswer('B');
                //The user picked false.
              },
              style: TextButton.styleFrom(backgroundColor: Colors.greenAccent[400]),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,

                children: [

                 
                   Container(
                     padding: const EdgeInsets.only(left: 7),
                     child:  Text(
                        quizBrain.getAnswerB(),
                        //'B',
                        style: const TextStyle(
                          fontSize: 20.0,
                          color: Colors.white,
                        ),
                      ),
                   ),


                ],
              ),
            ),
          ),
        ),

Expanded(
          child: Padding(
            padding: const EdgeInsets.all(15.0),
            child: TextButton(

              onPressed: () {
                checkAnswer('C');
                //The user picked false.
              },
              style: TextButton.styleFrom(backgroundColor: Colors.green[800]),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,

                children: [

                 
                   Container(
                     padding: const EdgeInsets.only(left: 7),
                     child: Text(
                        quizBrain.getAnswerC(),
                        style: const TextStyle(
                          fontSize: 20.0,
                          color: Colors.white,
                        ),
                      ),
                   ),


                ],
              ),
            ),
          ),
        ),


        Row(children: scoreKeper,)
      ],
    );
  }
}