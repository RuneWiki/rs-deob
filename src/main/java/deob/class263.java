package deob;

@ObfuscatedName("ju")
public class class263 {

    public class263() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.z(Lgk;Lgu;I)Lgu;")
    public static final class198 method612(class183 arg0, class198 arg1) {
        int var2 = arg0.method3247();
        if (arg1 == null) {
            int var3 = class188.method2961(var2);
            arg1 = new class198(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3247() == 1;
            int var6 = arg0.method3255();
            class205 var7;
            if (var5) {
                var7 = new class196(arg0.method3441());
            } else {
                var7 = new class212(arg0.method3374());
            }
            arg1.method3636(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("bc.w(Lgu;IIS)I")
    public static int method1561(class198 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class212 var3 = (class212) arg0.method3637((long) arg1);
            return var3 == null ? arg2 : var3.field2439;
        }
    }

    @ObfuscatedName("t.s(Lgu;ILjava/lang/String;S)Ljava/lang/String;")
    public static String method172(class198 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class196 var3 = (class196) arg0.method3637((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2395;
        }
    }
}
