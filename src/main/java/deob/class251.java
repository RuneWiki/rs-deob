package deob;

@ObfuscatedName("in")
public class class251 {

    public class251() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.i(Lfp;Lgi;B)Lgi;")
    public static final class188 method475(class175 arg0, class188 arg1) {
        int var2 = arg0.method2999();
        if (arg1 == null) {
            int var3 = class179.method2906(var2);
            arg1 = new class188(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method2999() == 1;
            int var6 = arg0.method2997();
            class194 var7;
            if (var5) {
                var7 = new class187(arg0.method3002());
            } else {
                var7 = new class200(arg0.method2998());
            }
            arg1.method3319(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("m.j(Lgi;III)I")
    public static int method161(class188 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class200 var3 = (class200) arg0.method3318((long) arg1);
            return var3 == null ? arg2 : var3.field2488;
        }
    }

    @ObfuscatedName("ah.a(Lgi;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method564(class188 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class187 var3 = (class187) arg0.method3318((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2451;
        }
    }
}
