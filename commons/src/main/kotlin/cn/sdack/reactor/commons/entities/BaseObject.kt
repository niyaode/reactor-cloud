package cn.sdack.reactor.commons.entities

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.time.LocalDateTime

open class BaseObject(

        @Id
        open var id: Long? = null,

        @Transient
        open var ids: MutableList<Long> = mutableListOf(),

        open var shopId: Long = 0,

        @Transient
        open var shopIds: MutableList<Long> = mutableListOf(),

        @Transient
        open var shopName: String = "",

        @Transient
        open var token: String = "",

        open var remark: String? = "",

        @JsonIgnore
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        open var isDel: LocalDateTime? = null
) {

        open interface ID

        open interface Add

        open interface Edit
}