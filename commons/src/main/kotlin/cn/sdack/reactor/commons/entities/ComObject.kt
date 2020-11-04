package cn.sdack.reactor.commons.entities


/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2020/10/22
 * Time: 9:51
 */

open class ComObject(

        var comId: Long = 0,

        @Transient
        var comIds: MutableList<Long> = mutableListOf()
) : BaseObject()