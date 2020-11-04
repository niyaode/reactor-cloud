package cn.sdack.reactor.core.dao

import cn.sdack.reactor.core.entities.ClassifyEntity
import org.springframework.data.r2dbc.repository.R2dbcRepository

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2020/10/30
 * Time: 18:14
 */
interface ClassifyDao : R2dbcRepository<ClassifyEntity, Long> {

    /*fun inset(clazz: ClassifyEntity, client: DatabaseClient ) {
        client.insert().into(ClassifyEntity::class.java).using(clazz).then()
    }*/

    /*fun queryA(client: DatabaseClient) : Flux<ClassifyEntity> {
        return client.select().from(ClassifyEntity::class.java).fetch().all()
    }*/

}