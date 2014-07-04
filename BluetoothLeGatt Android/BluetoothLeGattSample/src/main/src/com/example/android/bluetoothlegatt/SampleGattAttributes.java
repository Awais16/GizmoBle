/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    
    public static String WEIGHT_MEASUREMENT = "f1b41cde-dbf5-4acf-8679-ecb8b4dca6fe";
    public static String CHAR_WEIGHT = "f1b41cde-dbf5-4acf-8679-ecb8b4dca6fe";

    static {
        // Sample Services.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        
        attributes.put("00431c4a-a7a4-428b-a96d-d92d43c8c7cf", "Gizmo Weight service");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");

        
        //attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002A24-0000-1000-8000-00805f9b34fb", "Model Number");
        attributes.put("00002A25-0000-1000-8000-00805f9b34fb", "Serial Number");
        
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        
        attributes.put("f1b41cde-dbf5-4acf-8679-ecb8b4dca6fe", "Weight Data");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Gap Appearance");
        
        attributes.put("00002a19-0000-1000-8000-00805f9b34fb", "Battery Level");
        
        
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
