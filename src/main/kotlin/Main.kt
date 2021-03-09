import java.lang.invoke.SwitchPoint
import com.sun.source.tree.SwitchTree as SwitchTree1

var peopels: String = ""

fun main() {
    print("Введите количество лайков: ")
    val likes: String? = readLine()
    if (likes != null) {
        showMyMessage(likes)
    }
}

fun showMyMessage(likes:String) {
    var liked: String = "Понравилось"
    val likeOne = likes.substring(likes.length-1,likes.length)
    if (likes.length == 1 && likeOne.toInt() == 0) {
        print("Нет лайков")
    } else if (likes.length == 1 && likeOne.toInt() == 1 || likeOne.toInt() == 1 && likes.toInt() != 11) {
        peopels = "человеку"
        print("$liked $likes $peopels")
    } else {
        peopels = "людям"
        print("$liked $likes $peopels")
    }
}

