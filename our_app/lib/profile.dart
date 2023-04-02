import 'package:flutter/material.dart';

import 'main.dart';
import 'authentication.dart';
import 'sign_in_screen.dart';

class Profile extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Profile',
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Color(0xff0f8958),
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
  bool _isSigningOut = false;

  @override
  Widget build(BuildContext context) {
    return SliverToBoxAdapter(
        child: Column(
          children: [
            TextField(
              controller: _usernameController,
              decoration:  InputDecoration(
                hintText: '${UserInfo.name}',
                border: OutlineInputBorder(),
              ),
              maxLength: 128, // max amount of characters accepted is 128
            ),
            TextField(
              controller: _emailController,
              decoration:  InputDecoration(
                hintText: '${UserInfo.email}',
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
                onPressed: () async {
                  // checks if both title and idea field are filled before adding
                  setState(() {
                          _isSigningOut = true;
                          });
                  await Authentication.signOut(context: context);

                  setState(() {
                    _isSigningOut = false;
                  });
                  
                  Navigator.of(context)
                      .pushReplacement(MaterialPageRoute(builder: (context) => SignInScreen()));
                  
                },
                color: Colors.blueGrey,
                child: const Text('Sign out', style: TextStyle(color: Colors.white)),
              ),
            ),
          ],
    ));
  }
}
