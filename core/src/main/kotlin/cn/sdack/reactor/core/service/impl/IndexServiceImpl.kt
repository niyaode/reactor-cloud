package cn.sdack.reactor.core.service.impl

import cn.sdack.reactor.core.service.IndexService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Service

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2020/11/1
 * Time: 8:42
 */
@Service
class IndexServiceImpl: IndexService {

    @Autowired
    lateinit var client: DatabaseClient

}