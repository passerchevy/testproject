package com.leagsoft.restservice.json;

import org.apache.log4j.Logger;
/*import org.junit.Test;
*/


public class JsonTest {
	protected static Logger  log  = Logger.getLogger (JsonTest.class);
	//@Test
	public void jsonTestff(){
		String  str = "{\"SDCardMemory\":{\"sdCardTotal\":12816904192,\"sdCardFree\":10401689600},\"MemoryInfo\":{\"total\":\"1893507072\",\"avail\":\"971567104\"},\"PhoneNumber\":null,\"strosname\":\"android\",\"DeviceType\":\"pad\",\"CPUNumCores\":4,\"CpuInfo\":{\"cpuname\":\"ARMv7 Processor rev 0 (v7l)\",\"corenum\":\"4\",\"cpufreq\":\"1512000\"},\"SystemInfo\":{\"SystemVersion\":\"aosp_flo-userdebug 4.4.2 KOT49H eng.rivertime.20140610.113516 test-keys\",\"model\":\"AOSP on Flo\",\"FirmwareVersion\":\"4.4.2\",\"KernelVersion\":\"3.4.0-gac9222c\"},\"DeviceModel\":\"AOSP on Flo\",\"DeviceRunTimes\":\"44:55\",\"isroot\":true,\"WifiMac\":\"d8:50:e6:7b:b4:dd\",\"DisplayInfo\":{\"width\":\"1200\",\"height\":\"1824\"},\"WifiDevIP\":\"192.168.95.6\",\"strdevname\":\"ASUS\"}";
		//System.out.println(str);
		log.info(str);
		
		
	}
	
	public static void main(String[] args) {
		String  str = "{\"SDCardMemory\":{\"sdCardTotal\":12816904192,\"sdCardFree\":10401689600},\"MemoryInfo\":{\"total\":\"1893507072\",\"avail\":\"971567104\"},\"PhoneNumber\":null,\"strosname\":\"android\",\"DeviceType\":\"pad\",\"CPUNumCores\":4,\"CpuInfo\":{\"cpuname\":\"ARMv7 Processor rev 0 (v7l)\",\"corenum\":\"4\",\"cpufreq\":\"1512000\"},\"SystemInfo\":{\"SystemVersion\":\"aosp_flo-userdebug 4.4.2 KOT49H eng.rivertime.20140610.113516 test-keys\",\"model\":\"AOSP on Flo\",\"FirmwareVersion\":\"4.4.2\",\"KernelVersion\":\"3.4.0-gac9222c\"},\"DeviceModel\":\"AOSP on Flo\",\"DeviceRunTimes\":\"44:55\",\"isroot\":true,\"WifiMac\":\"d8:50:e6:7b:b4:dd\",\"DisplayInfo\":{\"width\":\"1200\",\"height\":\"1824\"},\"WifiDevIP\":\"192.168.95.6\",\"strdevname\":\"ASUS\"}";
		//System.out.println(str);
		log.info(str);
	}
}
