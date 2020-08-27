rm buildSessionId.txt
java -jar sl-build-scanner.jar -config -tokenfile sltoken.txt -appname "mandroid_example_appyApp" -branchname "master" -buildname "$1" -pi "*io.sealights.android.example.*"