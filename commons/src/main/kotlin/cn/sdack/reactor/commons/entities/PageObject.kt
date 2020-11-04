package cn.sdack.reactor.commons.entities

import org.springframework.data.domain.Page

data class PageObject<T>(
        var page: Int = 0,
        var pageSize: Int = 0,
        var totalPages: Int = 0,
        var totalCount: Long = 0,
        var content: T? = null
) {
    companion object {
        private val instance = JsonObject.holder

        fun toJson(page: Page<*>): PageObject<Any> {
            instance.content = page.content
            instance.page = page.number + 1
            instance.pageSize = page.size
            instance.totalPages = page.totalPages
            instance.totalCount = page.totalElements
            return instance
        }
    }

    private object JsonObject {
        val holder= PageObject<Any>()
    }
}