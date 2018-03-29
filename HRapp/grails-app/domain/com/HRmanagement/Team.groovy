package com.HRmanagement

class Team {
String teamName
Int numberOfEmployees
String sectionName
String description

    static constraints = {
	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false, widget:'textarea'
    }

}
