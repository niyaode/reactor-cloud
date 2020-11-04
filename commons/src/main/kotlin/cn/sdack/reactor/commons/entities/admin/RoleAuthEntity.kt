package cn.sdack.reactor.commons.entities.admin

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@Table("cc_role_auth")
data class RoleAuthEntity(

        @Id
        var id: Long? = null,

        var shopId: Long = 0,

        var authId: Long = 0,

        var roleId: Long = 0,

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
        var gmtCreate: LocalDateTime? = null
)