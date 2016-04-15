package rand

import java.util.*

/**
 * Created by kamedon on 4/15/16.
 */
class RandCache {
    val rand: Int

    init {
        rand = Random().nextInt()
    }

}
