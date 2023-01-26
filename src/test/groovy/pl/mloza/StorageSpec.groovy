package pl.mloza

import spock.lang.Specification

class StorageSpec extends Specification {

    def storage = new StorageImpl()

    def 'should store and read data'() {
        given:
            byte[] bytes = "data".getBytes()
            def data = new ByteArrayInputStream(bytes)
            def name = "Data1"
        when:
            storage.store(name, data)
        then:
            storage.read(name).readAllBytes() == bytes
    }

}
