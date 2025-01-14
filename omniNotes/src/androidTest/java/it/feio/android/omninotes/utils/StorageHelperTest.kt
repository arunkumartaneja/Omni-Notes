/*
 * Copyright (C) 2013-2024 Federico Iosue (federico@iosue.it)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.feio.android.omninotes.utils

import it.feio.android.omninotes.testutils.BaseAndroidTestCase
import org.junit.Assert.assertTrue
import org.junit.Test

class StorageHelperTest : BaseAndroidTestCase() {

    @Test
    fun getOrCreateExternalStoragePublicDir() {
        val dir = StorageHelper.getOrCreateExternalStoragePublicDir()

        assertTrue(dir.canRead())
        assertTrue(dir.canWrite())
    }
}