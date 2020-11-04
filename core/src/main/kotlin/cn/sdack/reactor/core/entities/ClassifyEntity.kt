package cn.sdack.reactor.core.entities

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import org.springframework.data.annotation.*
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2020/10/20
 * Time: 15:11
 */
@Table(value = "erp_classify")
data class ClassifyEntity(


        @Id
        var id: Long? = null,


        var pid: Long = 0,

        var name: String = "",

        var mobileName: String = "",

        var url: String = "",

        var level: Int = 0,

        var type: Int = 0,

        var iconHost: String = "",

        var iconPath: String = "",

        var isShow: Int = 0,

        var isHot: Int = 0,

        var sort: Int = 0,

        var remark: String = "",
//        @Version
//        var version:Long = 0,
        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtCreate: LocalDateTime? = null,

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtModified: LocalDateTime? = null,

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var isDel: LocalDateTime? = null



) {
        @Transient
        var ids: MutableList<Long> = mutableListOf()

        @Transient
        var children: MutableList<ClassifyEntity> = mutableListOf()

}