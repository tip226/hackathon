import 'package:flutter/material.dart';

import 'main.dart';


class Profile extends StatelessWidget {
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
        body: const CustomScrollView(
              // This is the optimized version of ListView, where slivers don't need to be rendered when not on screen (in viewport)
              slivers: <Widget>[
                AddProfileWidget(),
                
              ],
            ),
      ),
    );
  }
}



class AddProfileWidget extends StatefulWidget {

  const AddProfileWidget({super.key});

  @override
  State<AddProfileWidget> createState() => _AddProfileWidget();
}

class _AddProfileWidget extends State<AddProfileWidget> {
  // title and idea controller are used to manage text input in respective fields
  final _usernameController = TextEditingController();
  final _emailController = TextEditingController();
  String username = '';
  String email = '';

  @override
  Widget build(BuildContext context) {
    return SliverToBoxAdapter(
        child: Column(
      children: [
        TextField(
          controller: _usernameController,
          decoration: const InputDecoration(
            hintText: 'username',
            border: OutlineInputBorder(),
          ),
          maxLength: 128, // max amount of characters accepted is 128
        ),
        TextField(
          controller: _emailController,
          decoration: const InputDecoration(
            hintText: 'email',
            border: OutlineInputBorder(),
          ),
          maxLength: 128, // max amount of characters accepted is 128
        ),
        Text(
            style: const TextStyle(height: 2, fontSize: 20),
            'Points: ${Counter.points}'
          ),
        Align(
          alignment: Alignment.centerLeft,
          child: MaterialButton(
            onPressed: () {
              // checks if both title and idea field are filled before adding
             
               
            },
            color: Colors.blueGrey,
            child: const Text('Save', style: TextStyle(color: Colors.white)),
          ),
        ),
      ],
    ));
  }
}
