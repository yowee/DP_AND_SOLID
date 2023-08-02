package com.example.myapplication.design_patterns.structural

interface Entity{
    fun getEntityName(): String
}

class Team(private val name : String) : Entity{
    override fun getEntityName(): String {
        return name
    }

}
class Raywenderlich(private val name : String) : Entity{
    private val teamList = ArrayList<Entity>()
    override fun getEntityName(): String {
        return name + ", " + teamList.map { team -> team.getEntityName() }.joinToString(", ")
    }

    fun addTeamMember(member: Entity){
        teamList.add(member)
    }
}

fun main() {
    val composite = Raywenderlich("Ray")
    val ericTeamComposite = Raywenderlich("Eric")
    val aaqib = Team("Aaqib")
    val vijay = Team("Vijay")
    ericTeamComposite.addTeamMember(aaqib)
    ericTeamComposite.addTeamMember(vijay)
    composite.addTeamMember(ericTeamComposite)
    print(composite.getEntityName()) // Ray, Eric, Aaqib, Vijay

}