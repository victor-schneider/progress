#include <iostream>
using namespace std;

int main() {
  float notas[10], media = 0, acima = 0;

  for(int i = 0; i < 10; i++){
    cout << "Digite a " << i+1 << "ª nota: " << endl;
    cin >> notas[i];

    media += notas[i];
  }
  media /= 10;
  
  for(int i = 0; i < 10; i++){
    if(notas[i] > media)
      acima++;
  }

  cout << acima;
}
