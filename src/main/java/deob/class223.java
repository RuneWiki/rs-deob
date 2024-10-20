package deob;

@ObfuscatedName("ha")
public class class223 {

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.e(Ldg;I)V")
    public static void method49(class114 arg0) {
        Statics.field3181 = arg0;
    }

    @ObfuscatedName("ei.w(Ldq;Ljava/lang/String;I)I")
    public static int method2927(class120 arg0, String arg1) {
        int var2 = arg0.field1977;
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
        arg0.method2353(var4.length);
        arg0.field1977 += Statics.field3181.method2290(var4, 0, var4.length, arg0.field1981, arg0.field1977);
        return arg0.field1977 - var2;
    }

    @ObfuscatedName("bt.f(Ldq;II)Ljava/lang/String;")
    public static String method1560(class120 arg0, int arg1) {
        try {
            int var2 = arg0.method2368();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1977 += Statics.field3181.method2285(arg0.field1981, arg0.field1977, var3, 0, var2);
            return class166.method1947(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
