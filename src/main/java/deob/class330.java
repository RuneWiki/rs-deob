package deob;

@ObfuscatedName("lm")
public class class330 implements class331 {

    @ObfuscatedName("lm.a(I)Lli;")
    public class332 method5794() {
        byte var1;
        if (Statics.field222.startsWith("win")) {
            var1 = 1;
        } else if (Statics.field222.startsWith("mac")) {
            var1 = 2;
        } else if (Statics.field222.startsWith("linux")) {
            var1 = 3;
        } else {
            var1 = 4;
        }
        String var2;
        try {
            var2 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var39) {
            var2 = "";
        }
        String var4;
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var38) {
            var4 = "";
        }
        String var6 = "Unknown";
        String var7 = "1.1";
        try {
            var6 = System.getProperty("java.vendor");
            var7 = System.getProperty("java.version");
        } catch (Exception var37) {
        }
        boolean var9;
        if (var2.startsWith("amd64") || var2.startsWith("x86_64")) {
            var9 = true;
        } else {
            var9 = false;
        }
        byte var10 = 0;
        if (var1 == 1) {
            if (var4.indexOf("4.0") != -1) {
                var10 = 1;
            } else if (var4.indexOf("4.1") != -1) {
                var10 = 2;
            } else if (var4.indexOf("4.9") != -1) {
                var10 = 3;
            } else if (var4.indexOf("5.0") != -1) {
                var10 = 4;
            } else if (var4.indexOf("5.1") != -1) {
                var10 = 5;
            } else if (var4.indexOf("5.2") != -1) {
                var10 = 8;
            } else if (var4.indexOf("6.0") != -1) {
                var10 = 6;
            } else if (var4.indexOf("6.1") != -1) {
                var10 = 7;
            } else if (var4.indexOf("6.2") != -1) {
                var10 = 9;
            } else if (var4.indexOf("6.3") != -1) {
                var10 = 10;
            } else if (var4.indexOf("10.0") != -1) {
                var10 = 11;
            }
        } else if (var1 == 2) {
            if (var4.indexOf("10.4") != -1) {
                var10 = 20;
            } else if (var4.indexOf("10.5") != -1) {
                var10 = 21;
            } else if (var4.indexOf("10.6") != -1) {
                var10 = 22;
            } else if (var4.indexOf("10.7") != -1) {
                var10 = 23;
            } else if (var4.indexOf("10.8") != -1) {
                var10 = 24;
            } else if (var4.indexOf("10.9") != -1) {
                var10 = 25;
            } else if (var4.indexOf("10.10") != -1) {
                var10 = 26;
            } else if (var4.indexOf("10.11") != -1) {
                var10 = 27;
            } else if (var4.indexOf("10.12") != -1) {
                var10 = 28;
            } else if (var4.indexOf("10.13") != -1) {
                var10 = 29;
            }
        }
        byte var11;
        if (var6.toLowerCase().indexOf("sun") != -1) {
            var11 = 1;
        } else if (var6.toLowerCase().indexOf("microsoft") != -1) {
            var11 = 2;
        } else if (var6.toLowerCase().indexOf("apple") != -1) {
            var11 = 3;
        } else if (var6.toLowerCase().indexOf("oracle") == -1) {
            var11 = 4;
        } else {
            var11 = 5;
        }
        int var12 = 2;
        int var13 = 0;
        try {
            while (var12 < var7.length()) {
                char var14 = var7.charAt(var12);
                if (var14 < '0' || var14 > '9') {
                    break;
                }
                var13 = var13 * 10 + (var14 - '0');
                var12++;
            }
        } catch (Exception var42) {
        }
        int var17 = var7.indexOf(46, 2) + 1;
        int var18 = 0;
        try {
            while (var17 < var7.length()) {
                char var19 = var7.charAt(var17);
                if (var19 < '0' || var19 > '9') {
                    break;
                }
                var18 = var18 * 10 + (var19 - '0');
                var17++;
            }
        } catch (Exception var41) {
        }
        int var22 = var7.indexOf(95, 4) + 1;
        int var23 = 0;
        try {
            while (var22 < var7.length()) {
                char var24 = var7.charAt(var22);
                if (var24 < '0' || var24 > '9') {
                    break;
                }
                var23 = var23 * 10 + (var24 - '0');
                var22++;
            }
        } catch (Exception var40) {
        }
        int var27 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        int var28;
        if (var13 > 3) {
            var28 = Runtime.getRuntime().availableProcessors();
        } else {
            var28 = 0;
        }
        byte var29 = 0;
        String var30 = "";
        String var31 = "";
        String var32 = "";
        String var33 = "";
        String var34 = "";
        String var35 = "";
        int[] var36 = new int[3];
        return new class332(var1, var9, var10, var11, var13, var18, var23, false, var27, var28, var29, 0, var30, var31, var32, var33, 0, 0, 0, 0, var34, var35, var36, 0, "");
    }
}
