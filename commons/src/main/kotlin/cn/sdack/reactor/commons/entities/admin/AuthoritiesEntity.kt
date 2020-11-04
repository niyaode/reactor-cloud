package cn.sdack.reactor.commons.entities.admin

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


@Table("cc_authorities")
data class AuthoritiesEntity(

        @Id
        var id: Long? = null,

        var name: String = "",

        var code: String = "",

        var type: Int = 0,

        var remark: String? = "",

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtCreate: LocalDateTime? = null,

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtModified: LocalDateTime? = null,

        @JsonIgnore
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var isDel: LocalDateTime? = null

) {

        @Transient
        var ids: MutableList<Long> = mutableListOf()


        enum class Type(val value: Int, val desc: String) {
            NONE(0,""),
            READ(1,"只读"),
            WRITE(2,"读写");
    }

}