import 'package:camera/camera.dart';
import 'package:flutter/material.dart';
import 'package:our_app/profile.dart';
import 'dart:async';
import 'package:provider/provider.dart';
import 'home_page.dart';
import 'question.dart';
import 'answer.dart';
// Provides functions which use REST calls and interprets responses


class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage>{
   @override
     Widget build(BuildContext context) {
    // This method is rerun every time setState is called
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return ChangeNotifierProvider(
        create: (BuildContext context) {  },
        child: Scaffold(
            appBar: AppBar(
              // Here we take the value from the MyHomePage object that was created by
              // the App.build method, and use it to set our appbar title.
              title: const Text("Profile Pic"),

            ),
            ));
  }
}


Future<void> implement() async {
  // Ensure that plugin services are initialized so that `availableCameras()`
  // can be called before `runApp()`
  WidgetsFlutterBinding.ensureInitialized();

  // Obtain a list of the available cameras on the device.
  final cameras = await availableCameras();

  // Get a specific camera from the list of available cameras.
  final firstCamera = cameras.first;

 
}
class TabBarDemo extends StatelessWidget {
  const TabBarDemo({super.key});
  Future<CameraDescription> implement() async {
  // Ensure that plugin services are initialized so that `availableCameras()`
  // can be called before `runApp()`
  WidgetsFlutterBinding.ensureInitialized();

  // Obtain a list of the available cameras on the device.
  final cameras = await availableCameras();

  // Get a specific camera from the list of available cameras.
  final firstCamera = cameras.first;
  return firstCamera;
 
}

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: DefaultTabController(
        length: 2,
        child: Scaffold(
          appBar: AppBar(
            bottom: const TabBar(
              tabs: [
                Tab(icon:Icon(Icons.camera_alt_outlined)),
                Tab(icon: Icon(Icons.face_outlined)),
              ],
            ),
            title: const Text('Flicko'),
            backgroundColor: Colors.green,
          ),
          body:  TabBarView(
            children: [
              //TakePictureScreen(camera: implement().then((value) => null),),
              //HomePage(),
              MyApp1(),
              Profile(),
            ],
          ),
        ),
      ),
    );
  }
}
