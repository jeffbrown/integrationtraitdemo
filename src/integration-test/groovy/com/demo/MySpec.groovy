package com.demo

import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
class MySpec extends Specification implements TestHelper {

    void "test something"() {
        expect:
        true
    }
}
