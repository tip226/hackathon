import 'package:flutter/material.dart';


class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Profile',
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.red,
          title: const Center(
            child: Text('Profile'),
          ),
        ),
      ),
    );
  }
}