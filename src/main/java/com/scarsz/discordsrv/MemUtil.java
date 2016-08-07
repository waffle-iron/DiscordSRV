package com.scarsz.discordsrv;

import java.util.HashMap;
import java.util.Map;

public class MemUtil {

    public static Map<String, String> get() {
        HashMap<String, String> result = new HashMap<>();

        Runtime runtime = Runtime.getRuntime();

        float free = runtime.freeMemory();
        float used = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        float total = runtime.totalMemory();
        float max = runtime.maxMemory();

        // MB
        String freeMB = String.valueOf(free / 1024 / 1024);
        if (freeMB.split("\\.")[1].length() > 1) freeMB = freeMB.split("\\.")[0] + "." + freeMB.split("\\.")[1].substring(0, 2);
        result.put("freeMB", freeMB);
        String usedMB = String.valueOf(used / 1024 / 1024);
        if (usedMB.split("\\.")[1].length() > 1) usedMB = usedMB.split("\\.")[0] + "." + usedMB.split("\\.")[1].substring(0, 2);
        result.put("usedMB", usedMB);
        String totalMB = String.valueOf(total / 1024 / 1024);
        if (totalMB.split("\\.")[1].length() > 1) totalMB = totalMB.split("\\.")[0] + "." + totalMB.split("\\.")[1].substring(0, 2);
        result.put("totalMB", totalMB);
        String maxMB = String.valueOf(max / 1024 / 1024);
        if (maxMB.split("\\.")[1].length() > 1) maxMB = maxMB.split("\\.")[0] + "." + maxMB.split("\\.")[1].substring(0, 2);
        result.put("maxMB", maxMB);

        // GB
        String freeGB = String.valueOf(free / 1024 / 1024 / 1024);
        if (freeGB.split("\\.")[1].length() > 1) freeGB = freeGB.split("\\.")[0] + "." + freeGB.split("\\.")[1].substring(0, 2);
        result.put("freeGB", freeGB);
        String usedGB = String.valueOf(used / 1024 / 1024 / 1024);
        if (usedGB.split("\\.")[1].length() > 1) usedGB = usedGB.split("\\.")[0] + "." + usedGB.split("\\.")[1].substring(0, 2);
        result.put("usedGB", usedGB);
        String totalGB = String.valueOf(total / 1024 / 1024 / 1024);
        if (totalGB.split("\\.")[1].length() > 1) totalGB = totalGB.split("\\.")[0] + "." + totalGB.split("\\.")[1].substring(0, 2);
        result.put("totalGB", totalGB);
        String maxGB = String.valueOf(max / 1024 / 1024 / 1024);
        if (maxGB.split("\\.")[1].length() > 1) maxGB = maxGB.split("\\.")[0] + "." + maxGB.split("\\.")[1].substring(0, 2);
        result.put("maxGB", maxGB);

        return result;
    }

}