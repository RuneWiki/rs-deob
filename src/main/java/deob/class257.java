package deob;

@ObfuscatedName("ir")
public class class257 {

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.b(Lfs;Lgu;I)Lgu;")
    public static final class194 method194(class181 arg0, class194 arg1) {
        int var2 = arg0.method2945();
        if (arg1 == null) {
            int var3 = class185.method159(var2);
            arg1 = new class194(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2945() == 1;
            int var6 = arg0.method3010();
            class200 var7;
            if (var5) {
                var7 = new class193(arg0.method2953());
            } else {
                var7 = new class206(arg0.method2996());
            }
            arg1.method3301(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("iv.s(Lgu;III)I")
    public static int method4097(class194 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class206 var3 = (class206) arg0.method3308((long) arg1);
            return var3 == null ? arg2 : var3.field2570;
        }
    }

    @ObfuscatedName("co.r(Lgu;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method1712(class194 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class193 var3 = (class193) arg0.method3308((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2533;
        }
    }
}
