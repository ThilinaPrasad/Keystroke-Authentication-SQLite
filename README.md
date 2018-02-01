# Keystroke-Authentication-SQLite
This is an authentication method implemented on keystroke dynamics bio-metric technology. 
{Import sqlite jdbc befor use this}
1.Run KeyStroke_Detector.jar file. Then Application shows the login page.
2. If You already have an user account enter your user name twice & then pressed Log In.
(When first use of the application take few seconds because application needs to setup the Sqlite embeded database)
3. If you're a new user to the system press Sign Up button & then system show the Sign Up Interface.  
4. Complete the Full Name & Age (Optional).
5. Then enter a unique user name & press Analyze button 10 times. then application indicates your key stroke properties.
(System check entered user name is not already used one)
6. After analizing the keystroke system enable the Register Button & Press it. then system send user data to Sqlite embeded database.
7. Then You can access to application using your username in login page.
(stroed user credentials are update when you login)
