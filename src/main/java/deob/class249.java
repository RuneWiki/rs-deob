package deob;

@ObfuscatedName("iv")
public class class249 {

    public class249() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.c(Lkp;Llp;B)Llp;")
    public static final class317 method1064(class301 arg0, class317 arg1) {
        int var2 = arg0.method5129();
        if (arg1 == null) {
            int var3 = class189.method2097(var2);
            arg1 = new class317(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5129() == 1;
            int var6 = arg0.method5133();
            class181 var7;
            if (var5) {
                var7 = new class177(arg0.method5138());
            } else {
                var7 = new class180(arg0.method5134());
            }
            arg1.method5496(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("du.o(Llp;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2650(class317 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class177 var3 = (class177) arg0.method5510((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2108;
        }
    }
}
