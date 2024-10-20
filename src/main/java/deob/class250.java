package deob;

@ObfuscatedName("ir")
public class class250 {

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.w(Lfz;Lgk;I)Lgk;")
    public static final class187 method2227(class174 arg0, class187 arg1) {
        int var2 = arg0.method2971();
        if (arg1 == null) {
            int var3 = class178.method629(var2);
            arg1 = new class187(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2971() == 1;
            int var6 = arg0.method2975();
            class193 var7;
            if (var5) {
                var7 = new class186(arg0.method3111());
            } else {
                var7 = new class199(arg0.method3131());
            }
            arg1.method3324(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("hk.s(Lgk;IIB)I")
    public static int method3857(class187 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class199 var3 = (class199) arg0.method3331((long) arg1);
            return var3 == null ? arg2 : var3.field2479;
        }
    }

    @ObfuscatedName("gy.q(Lgk;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method3625(class187 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method3331((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2442;
        }
    }
}
