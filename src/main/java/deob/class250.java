package deob;

@ObfuscatedName("ik")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.i(Lfp;Lgn;I)Lgn;")
    public static final class187 method1072(class174 arg0, class187 arg1) {
        int var2 = arg0.method3061();
        if (arg1 == null) {
            int var3 = class178.method740(var2);
            arg1 = new class187(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3061() == 1;
            int var6 = arg0.method2917();
            class193 var7;
            if (var5) {
                var7 = new class186(arg0.method2884());
            } else {
                var7 = new class199(arg0.method2885());
            }
            arg1.method3198(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("cb.w(Lgn;III)I")
    public static int method1727(class187 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class199 var3 = (class199) arg0.method3197((long) arg1);
            return var3 == null ? arg2 : var3.field2488;
        }
    }

    @ObfuscatedName("cj.a(Lgn;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method1585(class187 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method3197((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2451;
        }
    }
}
