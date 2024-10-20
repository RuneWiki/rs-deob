package deob;

@ObfuscatedName("hu")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.af(Lsg;Lro;B)Lro;")
    public static final class464 method2057(class489 arg0, class464 arg1) {
        int var2 = arg0.method8248();
        if (arg1 == null) {
            int var3 = class296.method1948(var2);
            arg1 = new class464(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8248() == 1;
            int var6 = arg0.method8252();
            class449 var7;
            if (var5) {
                var7 = new class445(arg0.method8259());
            } else {
                var7 = new class448(arg0.method8254());
            }
            arg1.method7946(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("hx.an(Lro;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method3440(class464 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class445 var3 = (class445) arg0.method7945((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4741;
        }
    }
}
