#include <iostream>
using namespace std;

int main() {
  int num;

  
  cout << "Quantas linhas de pirâmede você quer?: " << endl;
  cin >> num;
  
  for(int i = 0; i < num; i++){
    string A;
    for(int x = 0; x < i; x++){
      A += "A";
    }
    cout << A << endl;
  }
}