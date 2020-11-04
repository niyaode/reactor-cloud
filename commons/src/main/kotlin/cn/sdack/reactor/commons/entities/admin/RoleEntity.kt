package cn.sdack.reactor.commons.entities.admin

import cn.sdack.reactor.commons.entities.BaseObject
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table( "cc_role")
data class RoleEntity(

        var pid: Long = 0,

        var userAdminId: Long = 0,

        var roleName: String = "",

        var code: String = "",

        @Transient
        var authoritiesList : MutableList<AuthoritiesEntity> = arrayListOf(),

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtCreate: LocalDateTime? = null,

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtModified: LocalDateTime? = null

) : BaseObject()