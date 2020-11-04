package cn.sdack.reactor.commons.entities

data class JsonObject<T>(
        var succeed: Boolean = false,
        var code: Int = 0,
        var message: String = "",
        var data: T? = null
) {
    companion object {
        private val instance = JsonObject.holder

        fun toJson(succeed: Boolean = false,data: Any? = null,message: String = "",code: Int = 0): cn.sdack.reactor.commons.entities.JsonObject<Any> {
            instance.succeed = succeed
            if (succeed) {
                instance.code = 0
            } else {
                instance.code = -1
            }
            if (code > 0) {
                instance.code = code
            }
            instance.data = data
            instance.message = message
            return instance
        }
    }

    private object JsonObject {
        val holder= JsonObject<Any>()
    }
}