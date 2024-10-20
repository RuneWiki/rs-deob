package deob;

@ObfuscatedName("jw")
public class class265 {

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gy.i(Ljy;B)V")
    public static void method3656(class264 arg0) {
        Statics.field3205 = arg0;
    }

    @ObfuscatedName("eu.w(Lop;Ljava/lang/String;B)I")
    public static int method2514(class401 arg0, String arg1) {
        int var2 = arg0.field4300;
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg1.charAt(var5);
            if (!(var6 <= 0 || var6 >= 128) || !(var6 < 160 || var6 > 255)) {
                var4[var5] = (byte) var6;
            } else if (var6 == 8364) {
                var4[var5] = -128;
            } else if (var6 == 8218) {
                var4[var5] = -126;
            } else if (var6 == 402) {
                var4[var5] = -125;
            } else if (var6 == 8222) {
                var4[var5] = -124;
            } else if (var6 == 8230) {
                var4[var5] = -123;
            } else if (var6 == 8224) {
                var4[var5] = -122;
            } else if (var6 == 8225) {
                var4[var5] = -121;
            } else if (var6 == 710) {
                var4[var5] = -120;
            } else if (var6 == 8240) {
                var4[var5] = -119;
            } else if (var6 == 352) {
                var4[var5] = -118;
            } else if (var6 == 8249) {
                var4[var5] = -117;
            } else if (var6 == 338) {
                var4[var5] = -116;
            } else if (var6 == 381) {
                var4[var5] = -114;
            } else if (var6 == 8216) {
                var4[var5] = -111;
            } else if (var6 == 8217) {
                var4[var5] = -110;
            } else if (var6 == 8220) {
                var4[var5] = -109;
            } else if (var6 == 8221) {
                var4[var5] = -108;
            } else if (var6 == 8226) {
                var4[var5] = -107;
            } else if (var6 == 8211) {
                var4[var5] = -106;
            } else if (var6 == 8212) {
                var4[var5] = -105;
            } else if (var6 == 732) {
                var4[var5] = -104;
            } else if (var6 == 8482) {
                var4[var5] = -103;
            } else if (var6 == 353) {
                var4[var5] = -102;
            } else if (var6 == 8250) {
                var4[var5] = -101;
            } else if (var6 == 339) {
                var4[var5] = -100;
            } else if (var6 == 382) {
                var4[var5] = -98;
            } else if (var6 == 376) {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        arg0.method6301(var4.length);
        arg0.field4300 += Statics.field3205.method4608(var4, 0, var4.length, arg0.field4302, arg0.field4300);
        return arg0.field4300 - var2;
    }

    @ObfuscatedName("eo.s(Lop;B)Ljava/lang/String;")
    public static String method2651(class401 arg0) {
        return method3563(arg0, 32767);
    }

    @ObfuscatedName("gl.a(Lop;II)Ljava/lang/String;")
    public static String method3563(class401 arg0, int arg1) {
        try {
            int var2 = arg0.method6254();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field4300 += Statics.field3205.method4609(arg0.field4302, arg0.field4300, var3, 0, var2);
            return class317.method4623(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
