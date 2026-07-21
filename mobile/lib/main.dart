import 'package:flutter/material.dart';
import 'screens/home_screen.dart';

void main() => runApp(const EduSphereApp());

class EduSphereApp extends StatelessWidget {
  const EduSphereApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'EduSphere',
      theme: ThemeData(useMaterial3: true, colorSchemeSeed: Colors.indigo),
      home: const LoginPage(),
    );
  }
}

class LoginPage extends StatefulWidget {
  const LoginPage({super.key});

  @override
  State<LoginPage> createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  final _usernameController = TextEditingController(text: 'admin');
  final _passwordController = TextEditingController(text: 'password');

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('EduSphere Login')),
      body: Padding(
        padding: const EdgeInsets.all(24.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text('Smart School ERP', style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold)),
            const SizedBox(height: 24),
            TextField(controller: _usernameController, decoration: const InputDecoration(labelText: 'Username')),
            const SizedBox(height: 12),
            TextField(controller: _passwordController, obscureText: true, decoration: const InputDecoration(labelText: 'Password')),
            const SizedBox(height: 20),
            FilledButton(
              onPressed: () {
                Navigator.of(context).pushReplacement(MaterialPageRoute(builder: (_) => const HomeScreen()));
              },
              child: const Text('Login'),
            )
          ],
        ),
      ),
    );
  }
}
