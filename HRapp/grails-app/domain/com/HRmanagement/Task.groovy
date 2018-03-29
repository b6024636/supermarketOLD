package com.HRmanagement

class Task {
String taskName
Int numberOfPeople
String sectionName
String department
Int timeRequired
String description
Boolean taskCompleted

    static constraints = {
	taskName blank:false, nullable:false
	numberOfPeople blank:false, nullable:false
	sectionName blank:false, nullable:false
	department blank:false, nullable:false
	timeRequired blank:false, nullable:false, inList:["1 Hour", "2 Hours", "3 Hours"]
	description blank:false, nullable:false, widget:'textarea'
	taskCompleted blank:false, nullable:false
    }
}
