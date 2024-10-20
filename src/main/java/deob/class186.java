package deob;

@ObfuscatedName("hz")
public class class186 {

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.aq(Lvp;Lth;I)Lth;")
    public static final class520 method2650(class547 arg0, class520 arg1) {
        int var2 = arg0.method8804();
        if (arg1 == null) {
            int var3 = class329.method6778(var2);
            arg1 = new class520(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8804() == 1;
            int var6 = arg0.method8732();
            class505 var7;
            if (var5) {
                var7 = new class502(arg0.method8739());
            } else {
                var7 = new class504(arg0.method8734());
            }
            arg1.method8443(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("js.ad(Lth;III)I")
    public static int method4567(class520 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class504 var3 = (class504) arg0.method8442((long) arg1);
            return var3 == null ? arg2 : var3.field5080;
        }
    }

    @ObfuscatedName("ej.ag(Lth;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2668(class520 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class502 var3 = (class502) arg0.method8442((long) arg1);
            return var3 == null ? arg2 : (String) var3.field5078;
        }
    }
}
