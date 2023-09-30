#include <iostream>
using namespace std;

int main() {
    double gajiDasar;
    double jamKerjaLembur;
    double gajiTotal;

    cout << "Masukkan gaji dasar karyawan: ";
    cin >> gajiDasar;
    cout << "Masukkan jumlah jam kerja lembur: ";
    cin >> jamKerjaLembur;

    // Hitung gaji total dengan tambahan lembur
    gajiTotal = gajiDasar + (jamKerjaLembur * 15); // Misalnya, tarif lembur per jam adalah 15.

    cout << "Gaji total karyawan adalah: " << gajiTotal << endl;

    return 0;
}
