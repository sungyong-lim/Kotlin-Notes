package chap07.class06_Relationship.p1

/** 의존(Dependency)**/

class Patient(val name: String, var id: Int){
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor ${d.name}")
    }

}

class Doctor(val name: String, val p:Patient) {
    val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient ID: $customerId")
    }
}

fun main() {
    val patient1 = Patient("SY", 1234)
    val doc1 = Doctor("Lim", patient1)

    doc1.patientList()
}