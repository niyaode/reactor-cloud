package cn.sdack.reactor.commons.entities.admin

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@Table("cc_company")
data class CompanyEntity(

        @Id
        var id: Long? = null,

        var userAdminId: Long = 0,

        var name: String = "",

        var shopMax: Int = 0,

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
        var expTime: LocalDateTime? = null,

        var isLock: Int = 5, // 5 同音 无效

        var remark: String = "",

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

}