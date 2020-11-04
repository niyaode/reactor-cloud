package cn.sdack.reactor.commons.entities.admin

import cn.sdack.reactor.commons.entities.BaseObject
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("cc_user_admin")
data class UserAdminEntity(

        var pid: Long = 0,

        var level: Int = 5,

        var comId: Long = 0,

        var phone: Long = 0,

        var nickname: String = "",

        var userName: String = "",

        var sex: Int = 0,

        var headHost: String = "",

        var headPath: String = "",

        var isLock: Int = 5,


        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var expTime: LocalDateTime? = null,

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtCreate: LocalDateTime? = null,

        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        @JsonSerialize(using = LocalDateTimeSerializer::class)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var gmtModified: LocalDateTime? = null

//        @Transient
//        var authority: MutableList<GrantedAuthority> = mutableListOf()


) : BaseObject() {

    @Transient
    var comName: String = ""

    @JsonIgnore
    var pwd: String = ""

    @Transient
    var oldPwd: String = ""

    enum class Level(val value: Int, val desc: String) {
        SUPER(0,"超级管理员"),
        ADMIN(1,"系统管理员"),
        COM(2,"企业主"),
        COM_ADMIN(3,"企业管理员"),
        SHOP(4,"店长"),
        SHOP_ADMIN(5,"店员");
    }

    enum class Sex(val value: Int, val desc: String) {
        NONE(0,""),
        MAN(1,"男人"),
        WOMAN(2,"女人")
        ;
    }

   /* @JsonIgnore
    override fun getAuthorities(): MutableCollection<GrantedAuthority> {
        return authority
    }

    @JsonIgnore
    override fun getPassword(): String {
        return pwd
    }

    @JsonIgnore
    override fun isEnabled(): Boolean {
        return isDel == null
    }

    override fun getUsername(): String {
        return phone.toString()
    }

    @JsonIgnore
    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    @JsonIgnore
    override fun isAccountNonExpired(): Boolean {
        if (expTime == null) {
            return true
        }
        return LocalDateTime.now().isBefore(expTime)
    }

    @JsonIgnore
    override fun isAccountNonLocked(): Boolean {
        return isLock == 0
    }*/

}