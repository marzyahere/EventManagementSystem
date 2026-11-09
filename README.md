# Event Management System

A Java Swing desktop app for managing events. Built as an Object Oriented Programming lab project.

## Features
- Add, update and delete events
- Click a table row to load it into the form for editing
- Date picker (JCalendar) and location dropdown
- Blocks duplicate event IDs and double-booked locations (same place on the same date)
- Shows a message if Update is pressed with no row selected

## Tech Stack
- Java 21
- Swing (GUI)
- Maven
- JCalendar 1.4

## How to Run
1. Install JDK 21
2. Clone this repo: `git clone https://github.com/marzyahere/event-management-system.git`
3. Open the project in NetBeans or VS Code
4. Run `EventManagementSystem.java`

## Bugs Fixed
- [x] Location and duration were swapped when adding an event
- [x] Update wrote the duration into the Location column
- [x] Update crashed when no row was selected
- [x] Duplicate IDs and double bookings were allowed

## Known Issues
- [ ] Empty fields are still accepted when adding an event
- [ ] Data is not saved to a file, so it is lost when the app closes

## Planned Improvements
- Save and load events from a file
- Separate the business logic from the GUI class
- Rename "Catagory" to "Category" everywhere
