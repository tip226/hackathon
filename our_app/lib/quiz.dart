import 'question.dart';


class QuizBrain {
  int _questionumber=0;

  final List<Question> _questionbank = [

    Question(q: 'Which of these is used to categorize hurricanes by their wind speeds?', a: 'B'),
    Question(q: 'Who started the trend of naming hurricanes?',a: 'A'),
    Question(q: 'All of the following are true about disasters except...',a: 'C'),
    Question(q: 'How often does a lightning strike occur worldwide?',a: 'B'),
    Question(q: 'Where does a Hurricane get its strength from?',a: 'C'),
    Question(q: 'What dangerous natural disaster happens mostly in the summer and is caused by high winds and very hot temperatures?', a: 'B'),
  ];

  final List<Answer> _answerbank = [

    Answer(a:"Richter Scale", b:"Saffir-Simpson scale",c:"Fujita scale"),
    Answer(a:"Clement Wragge", b:"William Shakespeare",c:"Theodore Roosevelt"),
    Answer(a:"A disaster may be caused by nature or have human origins", b:"A disaster may be caused by nature or have human origins",c:"A disaster always receives widespread media coverage"),
    Answer(a:"2 to 3 times every second", b:"50-100 times every second",c:"Once every hour"),
    Answer(a:"Land", b:"Trees",c:"Warn Ocean Water"),
    Answer(a:"Tornados", b:"Wildfires",c:"Hurricanes"),

  ];

  void shuffle(){
    _questionbank.shuffle();
  }


  
  int order (){
    print('order quiz brain num question : $_questionumber');
    return _questionumber;
  }







  void nextQuestion()
  {

    if (_questionumber < _questionbank.length)

    {
      _questionumber++;
    }

  }

    bool checknext()
  {
    if(_questionumber < _questionbank.length-1)
    {
      // Return true if there are additional questions.
      return true;
    }
    else
    {

      return false;
    }


  }

  void resetnumber()
  {

    _questionumber =0;
  }
 
  String getquestiontext()
  {
    return _questionbank[_questionumber].questionText;
  }

 String getAnswerA()
  {
    return _answerbank[_questionumber].aAns;
  }

String getAnswerB()
  {
    return _answerbank[_questionumber].bAns;
  }
  String getAnswerC()
  {
    return _answerbank[_questionumber].cAns;
  }


  String getquestionAnswer()
  {
    return _questionbank[_questionumber].questionAnswer;
  }


}
