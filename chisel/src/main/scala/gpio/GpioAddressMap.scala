// SPDX-FileCopyrightText: 2020 Muhammad Hadir Khan
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// SPDX-License-Identifier: Apache-2.0
package gpio
import chisel3._

object GpioAddressMap {
  val GPIO_INTR_STATE_OFFSET = 0.U
  val GPIO_INTR_ENABLE_OFFSET = 4.U
  val GPIO_INTR_TEST_OFFSET = 8.U
  val GPIO_DATA_IN_OFFSET = 12.U
  val GPIO_DIRECT_OUT_OFFSET = 16.U
  val GPIO_MASKED_OUT_LOWER_OFFSET = 20.U
  val GPIO_MASKED_OUT_UPPER_OFFSET = 24.U
  val GPIO_DIRECT_OE_OFFSET = 28.U
  val GPIO_MASKED_OE_LOWER_OFFSET = 32.U
  val GPIO_MASKED_OE_UPPER_OFFSET = 36.U
  val GPIO_INTR_CTRL_EN_RISING_OFFSET = 40.U
  val GPIO_INTR_CTRL_EN_FALLING_OFFSET = 44.U
  val GPIO_INTR_CTRL_EN_LVLHIGH_OFFSET = 48.U
  val GPIO_INTR_CTRL_EN_LVLLOW_OFFSET = 52.U
}