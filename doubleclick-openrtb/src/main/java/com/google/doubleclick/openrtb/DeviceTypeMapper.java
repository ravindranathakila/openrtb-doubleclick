/*
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.doubleclick.openrtb;

import com.google.doubleclick.Doubleclick.BidRequest.Mobile.MobileDeviceType;
import com.google.openrtb.OpenRtb.BidRequest.Device.DeviceType;

/**
 * Maps between AdX's {@link MobileDeviceType} and OpenRTB's {@link DeviceType}.
 */
public class DeviceTypeMapper {
  public static DeviceType toOpenRtb(MobileDeviceType dc) {
    switch (dc) {
      case HIGHEND_PHONE:
      case TABLET:
      case UNKNOWN:
      default:
        return DeviceType.MOBILE;
    }
  }

  public static MobileDeviceType toDoubleClick(DeviceType openrtb) {
    switch (openrtb) {
      case CONNECTED_TV:
      case MOBILE:
        return MobileDeviceType.HIGHEND_PHONE;
      case PC:
      default:
        return MobileDeviceType.UNKNOWN;
    }
  }
}
