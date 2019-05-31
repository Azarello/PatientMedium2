package furhatos.app.patientmedium2

import furhatos.app.patientmedium2.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class Patientmedium2Skill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
