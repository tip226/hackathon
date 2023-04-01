class Question {
  late String questionText;
  late String questionAnswer;

  Question({required String q,required String a})
  {
    questionText = q;
    questionAnswer = a;

  }

}
class Answer {
  late String aAns;
  late String bAns;
  late String cAns;
  Answer({required String a,required String b, required String c})
  {
    aAns = a;
    bAns = b;
    cAns = c;

  }

}