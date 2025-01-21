#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Function to calculate total signal degradation
int calculateSignalLoss(const vector<int>& arr) {
    int n = arr.size();
    if (n == 0) return 0;

    // Arrays to store the maximum values to the left and right of each station
    vector<int> leftMax(n, 0), rightMax(n, 0);

    // Fill leftMax array
    leftMax[0] = arr[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = max(leftMax[i - 1], arr[i]);
    }

    // Fill rightMax array
    rightMax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = max(rightMax[i + 1], arr[i]);
    }

    // Calculate total signal degradation
    int totalLoss = 0;
    for (int i = 0; i < n; i++) {
        int degradation = min(leftMax[i], rightMax[i]) - arr[i];
        if (degradation > 0) {
            totalLoss += degradation;
        }
    }

    return totalLoss;
}

int main() {
    // Input array representing signal intensities
    vector<int> arr = {4, 2, 0, 3, 2, 5};

    // Calculate and print the total signal loss
    cout << "Total Signal Loss: " << calculateSignalLoss(arr) << endl;

    return 0;
}
