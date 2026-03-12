package Practice2

class Time(
    var hour: Int,
    var minute: Int,
    var second: Int,
) {

    fun toUniversal(): String{
        var time: String = "$hour:"
        if (minute < 10) time += "0"
        time += "$minute:"

        if (second < 10)time += "0"
        time += "$second"
        return time
    }

    fun toStandard(): String{
        var h = hour
        if (h == 0) h = 12
        else if (h > 12) h -= 12

        var time : String = "$h:"

        if (minute < 10) time += "0"
        time += "$minute:"

        if (second < 10)time += "0"
        time += "$second"

        var timeEnd = " AM"
        if (hour > 12) timeEnd = " PM"

        return time + timeEnd
    }

    fun add(t: Time){
        this.hour += t.hour
        this.minute += t.minute
        this.second += t.second

        if(this.hour >= 24){
            this.hour -= 24
        }

        if (t.minute > 60){
            this.hour++
            this.minute -= 60
        }

        if (t.second > 60){
            this.minute++
            this.second -= 60
        }
    }
}

fun main() {
    val t = Time(23,5,6)
    println(t.toUniversal())
    println(t.toStandard())

    val t2 = Time(4,23,33)
    t.add(t2)
    println(t.toUniversal())
    println(t.toStandard())
}