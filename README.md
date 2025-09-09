# Deploying GreetingServlet on Tomcat (Manual)

## Project Overview
This project is a Java servlet web application that:
- Displays a greeting message (`GreetingServlet.java`)
- Shows current date and time
- Uses `styles.css` for styling and `images/flower.jpg` for display

## Step 1: Export WAR File

In Eclipse:

1. Right-click project → `Export…` → `Web` → `WAR file` → `Next`
2. Set destination folder (e.g., `~/Desktop/GreetingServlet.war`)
3. Check **Include project libraries**
4. Click **Finish**

✅ Result: `GreetingServlet.war`

---

## Step 2: Locate Tomcat
1. brew --prefix tomcat
2. brew list tomcat (find the webapps)

## Step 3: Deploy WAR

1. Copy the WAR file to Tomcat’s webapps folder:
example: cp ~/Downloads/SSP_Ex11.war /opt/homebrew/Cellar/tomcat/11.0.11/libexec/webapps/
2. Tomcat automatically unpacks the WAR into:
/opt/homebrew/Cellar/tomcat/11.0.11/libexec/webapps/SSP_Ex11

##Step 4: Start Tomcat
/opt/homebrew/Cellar/tomcat/11.0.11/libexec/bin/startup.sh

##Step 5: Access the Servlet

Open a browser and navigate to:

http://localhost:8080/SSP_Ex11/greeting











