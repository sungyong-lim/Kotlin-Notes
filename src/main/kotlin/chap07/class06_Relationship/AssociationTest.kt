package chap07.class06_Relationship

/** 연관(Association) **/

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("Dr.Lim")
    val patient1 = Patient("SY")

    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}