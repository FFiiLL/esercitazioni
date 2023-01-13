/*

Copyright 2021 Luca Prigioniero, Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

public enum Mode {
  POSITION(0),
  IMMEDIATE(1),
  RELATIVE(2);

  private final int code;

  private Mode(int code) {
    this.code = code;
  }

  // EFFECTS: Restituisce la costante
  static Mode fromCode(int code) {
    for (Mode m : values()) if (m.code == code) return m;

    throw new IllegalArgumentException("Invalid Mode: " + code);
  }
}
