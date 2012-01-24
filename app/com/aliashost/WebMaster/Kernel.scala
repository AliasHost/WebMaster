/*
 * This file is part of WebMaster (http://github.com/MyRuneLog/WebMaster).
 *
 * WebMaster is licensed under the Alias License Version 1.
 *
 * WebMaster is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 360 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Alias License Version 1.
 *
 * WebMaster is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Alias License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.aliashost.com/AliasLicenseVersion_1.txt> for the full license,
 * including the MIT license.
 */

package com.aliashost.WebMaster

import java.io.File

trait Kernel {
  def getName() : String
  def getIPBans() : Array[String]
  def ban( address : String ) : Unit
  def unban( address : String ) : Boolean
  def unWhitelist( address : String ) : Boolean
  def whitelist( address : String ) : Unit
  def getWhitelistedIPs() : Array[String]
  def updateWhitelist() : Unit
  def setWhitelist( whitelist : Boolean ) : Unit
  def isWhitelist() : Boolean
  def getConfigDirectory() : File
  def getLogDirectory() : File
  def getCacheDirectory() : File
  def getLogFile() : String
  def getOps() : Array[String]
  def bind(address : String, port : String) : Boolean
}
