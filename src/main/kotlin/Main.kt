fun main() {
 val person=person("agynes",30,"Rwanda")
    person.identity()

    val rectangle=rectangle(30,20)
    rectangle.calculate()

    val car=car("subaru","imprezza",2010)
    car.details()

    val student=student("Hope",20,"B")
    student.promotion()

    val book=book("Galasi","Hail Hope",2021)
    book.bookDetails()
}

//write a kotlin program that creates a class 'Person" with properties for name,age and country.Include a function to print the person's details
class person(
    var name:String,
    var age:Int,
    var country:String )
{
    fun identity(){
        println("i am $name,am $age years old,from $country")
    }

}

//no2 Write a kotlin program that creates a class 'Rectangle' with properties for width and height.Include a function to calculate the rectangle area.
class rectangle(
    var width:Int,
    var length:Int
)
{
    fun calculate(){
        println(length *width)
    }

}

//no3 Write a kotlin program that creates a class 'Class' with properties for make,model and year.Include a function to display car information
class car(
    var make:String,
    var model:String,
    var year:Int
){
    fun details(){
        println("The red $make is $model made in $year")
    }
}

//no4 Write a kotlin program that creates a class 'Student' with properties for name,age and grade.Include a function to check if student is eligeble for promotion
class student(
    var name:String,
    var age:Int,
    var grade:String
){
    fun promotion(){
        println("$name is $age years old she got $grade shw will go to the next class")
    }
}

//no5 Write a kotlin program that create a class 'Book' with properties for title,author and publication year .Include a function to display  book display
class book(
    var title:String,
    var author:String,
    var publicationYear:Int
){
    fun bookDetails(){
        println("The $title is written by $author in $publicationYear")
    }
}