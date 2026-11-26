#include <iostream>
using namespace std;

int random(int min, int max) {
    int rndNum = (rand() % max) + min;
    return rndNum;
}

int main() {
	int min, max;
    cout << "Set the range\n";
    cout << "Please enter the minimum: ";
	cin >> min;
    cout << "Please enter the maximum: ";
    cin >> max;

    int rndNum = random(min, max);

    int userNum;
    for (int i = 0; i < 10; i++) {
        cout << endl;
        cout << "Attempt #" << to_string(i + 1) << endl;
        cout << "Enter guess: ";
        cin >> userNum;

        if (userNum == rndNum) {
            cout << "Good work! You guessed the number!";
            break;
        }
        else if (i + 1 != 10) {
            if (userNum < rndNum) {
                cout << "Hint: the number is greater than " << to_string(userNum) << endl;
            }
            else if (userNum > rndNum) {
                cout << "Hint: the number is less than " << to_string(userNum) << endl;
            }
        }
        else if (i + 1 == 10) {
            cout << "Better luck next time!";
        }
    }
    
    return 0;
}
