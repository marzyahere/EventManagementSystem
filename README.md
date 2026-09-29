# Event Management System

A Java Swing desktop application for managing events. Built as an OOP lab
project in my first year.

## Features
- Add, update and delete events
- Click a table row to load it into the form for editing
- Date picker (JCalendar) and location dropdown

## Tech Stack
- Java 21
- Swing (GUI)
- Maven
- JCalendar 1.4

## How to Run
1. Install JDK 21
2. Clone this repo: `git clone https://github.com/marzyahere/EventManagementSystem.git`
3. Open the project in NetBeans (or any Java IDE)
4. Run `EventManagementSystem.java`

## Known Issues (to be fixed)
- [ ] Location and duration values are swapped when adding an event
- [ ] Update writes the duration into the Location column
- [ ] Update crashes if no row is selected
- [ ] No input validation (empty fields, duplicate IDs)
- [ ] Data is not saved to file, so it is lost when the app closes

## Planned Improvements
- Save and load events from a file
- Separate the business logic from the GUI class
- Rename "Catagory" to "Category" everywhere