package deob;

@ObfuscatedName("fz")
public class class168 {

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kv.c(Lpi;Lon;B)Lon;")
    public static final class401 method4950(class421 arg0, class401 arg1) {
        int var2 = arg0.method6686();
        if (arg1 == null) {
            int var3 = class264.method5144(var2);
            arg1 = new class401(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method6686() == 1;
            int var6 = arg0.method6668();
            class392 var7;
            if (var5) {
                var7 = new class388(arg0.method6674());
            } else {
                var7 = new class391(arg0.method6669());
            }
            arg1.method6432(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("pu.l(Lon;IIB)I")
    public static int method6932(class401 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class391 var3 = (class391) arg0.method6448((long) arg1);
            return var3 == null ? arg2 : var3.field4299;
        }
    }

    @ObfuscatedName("ku.s(Lon;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method4942(class401 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class388 var3 = (class388) arg0.method6448((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4296;
        }
    }
}
