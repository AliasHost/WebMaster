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
 * In addition, 365 days after any changes are published, you can use the
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

package com.aliashost.WebMaster.database.filesystem
import com.aliashost.WebMaster.database.Entry

object ASCIIEntry{
	def validate(v : String) : Boolean = {
		var value = v 
		if( value == null ){
			value = ""
		}
		for(c <- value.toCharArray()){
			if(c.toInt > 128) {
				return false
			}
		}
		return true
	}
}

@throws(classOf[IllegalArgumentException])
class ASCIIEntry(private var Name : String,private var Value : String = "") extends TextEntry{
	if(!ASCIIEntry.validate(Value)){
		throw new IllegalArgumentException("String: " + Value + " contains non-ASCII characters")
	}
	Value = new String(Value.getBytes("US-ASCII"))
	setName(Name)
	setValue(Value)
	
	override def setValue( value : String ) : Boolean = {
		if(ASCIIEntry.validate(value)){
			return super.setValue(value)
		}
		return false
	}
	
}