package day08_ternaries_switch;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber = 2;

        String location = "Location -  ",
                groups = "number of groups - ",
                teacher = "teacher in charge - ";

        if(gradeNumber >= 1 && gradeNumber <=6) {
        if (gradeNumber == 1) {
            location = "Apple Orchard";
            groups = "3";
            teacher = "Ms. Smith";
        }else if (gradeNumber == 2){
            location = "Zoo";
            groups = "7";
            teacher = "Mr.Lee";
        }else if (gradeNumber == 3){
            location = "Aquarium";
            groups = "5";
            teacher = "Ms. Wilson";
        }else if (gradeNumber == 4) {
            location = "Movie Theater";
            groups = "2";
            teacher = "Ms. Reyes";
        }else if (gradeNumber == 5) {
                location = "Museum";
                groups = "5";
                teacher = "Ms.Lela";
        }else if(gradeNumber == 6){
                location = "Six Flags";
                groups = "8";
                teacher = "Mr. Watt";
        }

        }else{
            location = "Unknown";
            groups = "0";
            teacher = "Unknown";

        }
        System.out.println("location: " + location);
        System.out.println("Number of Groups: " + groups);
        System.out.println("Teacher in charge : " + teacher);

    }
}

/*
 2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith
			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee
			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson
			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes
			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela
			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt
			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
 */