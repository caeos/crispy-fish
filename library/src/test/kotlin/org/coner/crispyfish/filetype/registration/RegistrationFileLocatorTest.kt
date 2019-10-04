package org.coner.crispyfish.filetype.registration

import assertk.all
import assertk.assertThat
import assertk.assertions.hasExtension
import assertk.assertions.isNotNull
import assertk.assertions.prop
import org.coner.crispyfish.test.Events
import org.junit.Test
import java.io.File

class RegistrationFileLocatorTest {

    @Test
    fun itShouldLocateRegistrationFile() {
        val locator = Events.Thscc2016Points3Danville.eventControlFile.registrationFileLocator

        val actual = locator.locate()

        assertThat(actual).all {
            isNotNull()
            prop("file", RegistrationFile::file).hasExtension("rgg")
        }
    }
}