import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('EduSphere Home')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const Text('Welcome back, Admin', style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold)),
            const SizedBox(height: 16),
            Wrap(
              spacing: 12,
              runSpacing: 12,
              children: [
                _moduleCard('Attendance', '91.4% today'),
                _moduleCard('Results', 'Mid-term results published'),
                _moduleCard('Fees', 'Pending fees: ₹24,000'),
                _moduleCard('AI Insights', '3 improvement suggestions'),
              ],
            ),
          ],
        ),
      ),
    );
  }

  Widget _moduleCard(String title, String subtitle) {
    return SizedBox(
      width: 160,
      child: Card(
        child: Padding(
          padding: const EdgeInsets.all(16),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(title, style: const TextStyle(fontWeight: FontWeight.bold)),
              const SizedBox(height: 8),
              Text(subtitle),
            ],
          ),
        ),
      ),
    );
  }
}
