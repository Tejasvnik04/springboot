package com.example.kusiii.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.*;

@Entity
public class Entity1 {
String Name;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getMessage() {
	return Message;
}
public void setMessage(String message) {
	Message = message;
}
@Id
String Email;
String Phone;
String Message;

}
