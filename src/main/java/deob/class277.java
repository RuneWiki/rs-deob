package deob;

@ObfuscatedName("jw")
public class class277 {

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iz.c(Lgp;Lhz;I)Lhz;")
    public static final class210 method4160(class195 arg0, class210 arg1) {
        int var2 = arg0.method3429();
        if (arg1 == null) {
            int var3 = class200.method2857(var2);
            arg1 = new class210(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3429() == 1;
            int var6 = arg0.method3293();
            class217 var7;
            if (var5) {
                var7 = new class208(arg0.method3427());
            } else {
                var7 = new class224(arg0.method3230());
            }
            arg1.method3610(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("g.i(Lhz;IIB)I")
    public static int method180(class210 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class224 var3 = (class224) arg0.method3603((long) arg1);
            return var3 == null ? arg2 : var3.field2660;
        }
    }

    @ObfuscatedName("et.o(Lhz;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2942(class210 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class208 var3 = (class208) arg0.method3603((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2616;
        }
    }
}
