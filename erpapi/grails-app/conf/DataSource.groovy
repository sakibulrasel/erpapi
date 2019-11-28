dataSource {
    pooled = true

//    driverClassName = "oracle.jdbc.OracleDriver"
    driverClassName = "oracle.jdbc.OracleDriver"
    dialect = org.hibernate.dialect.OracleDialect
//    logSql=true
    // symphony test
//    username = "edierp"
//    password = "edi_erp_423"
    //production
//    username = "liteerp"
//    password = "lt_erp_321"
//    local unchange
//    username = "liteerp"
//    password = "liteerp"


}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            username = "SYMERPTEST"                                     //test
            password = "sym_erp_test"                                //test
            url = "jdbc:oracle:thin:@192.168.1.205:1521:erpdb"     //test

//            username = "liteerp"                                 //live
//            password = "lt_erp_321"                              //live
//            url = "jdbc:oracle:thin:@192.168.1.126:1521:EGDB01"  //live

//             url = "jdbc:oracle:thin:@202.0.94.38:1521:erpdb"
//                url = "jdbc:oracle:thin:@localhost:1521:orcl"
//              url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
            //for symphony
//                        username = "symerp"                                   //symphony live
//                        password = "sym_erp_321"                              //symphony live
//                        url = "jdbc:oracle:thin:@192.168.1.105:1521:EGDB01"   //symphony live
        }
    }
    test {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
//      url = "jdbc:oracle:thin:@192.168.1.19:1521:db11g"
            //           url = "jdbc:oracle:thin:@192.168.11.70:1521:WINMAXDB"
//            url = "jdbc:oracle:thin:@27.147.216.150:1521:WINMAXDB"
//              url = "jdbc:oracle:thin:@27.147.216.149:1521:WINMAXDB"
        }
    }
    production {
        dataSource {


            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
//      url = "jdbc:oracle:thin:@192.168.1.19:1521:db11g"

//            url = "jdbc:oracle:thin:@27.147.216.149:1521:WINMAXDB"

            //litetel test
//            username = "edierp"
//            password = "edi_erp_423"
//            url = "jdbc:oracle:thin:@192.168.1.205:1521:erpdb"

            //litetel live
//               username = "liteerp"
//               password = "lt_erp_321"
//               url = "jdbc:oracle:thin:@192.168.1.126:1521:EGDB01"
            // at central warehouse
//            username = "liteerp"
//            password = "lt_erp_321"
//            url = "jdbc:oracle:thin:@172.20.28.124:1521:EGDB01"
// at new live
//            username = "liteerp"
//            password = "lt_erp_321"
//            url = "jdbc:oracle:thin:@172.20.106.12:1521:EGDB01"

//            url = "jdbc:oracle:thin:@localhost:1521:XE"
//            url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
// database for symphony
//            username = "symerp"
//            password = "sym_erp_321"
//            url = "jdbc:oracle:thin:@192.168.1.105:1521:EGDB01"




        }
    }
}





