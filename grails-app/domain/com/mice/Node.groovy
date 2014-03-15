package com.mice

class Node {
	
	String label
	Double data
	Date dateCreated
	Date lastUpdated

    static constraints = {
    label blank:false, unique:true
	data nullable: true
	}
}
