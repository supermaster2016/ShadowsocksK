/**
 * Copyright (C) 2017 lhyz
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
package com.github.shadowsocks.k

import android.app.Application

/**
 * hello,kotlin
 * Created by lhyz on 2017/5/28.
 */
class ShadowsocksApplication : Application() {
    companion object {
        /**
         * 限制外部修改，一般为了方便外部访问，都需要默认放开get，但是set可以被私有化
         */
        lateinit var app: ShadowsocksApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }
}