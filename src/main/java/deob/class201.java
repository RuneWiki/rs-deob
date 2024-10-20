package deob;

@ObfuscatedName("hu")
public class class201 {

    public class201() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.az(Lur;Lto;I)Lto;")
    public static final class508 method2084(class535 arg0, class508 arg1) {
        int var2 = arg0.method8462();
        if (arg1 == null) {
            int var3 = class320.method3400(var2);
            arg1 = new class508(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8462() == 1;
            int var6 = arg0.method8466();
            class493 var7;
            if (var5) {
                var7 = new class490(arg0.method8473());
            } else {
                var7 = new class492(arg0.method8682());
            }
            arg1.method8200(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("bz.af(Lto;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method396(class508 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class490 var3 = (class490) arg0.method8177((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4947;
        }
    }
}
