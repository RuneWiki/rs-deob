package deob;

@ObfuscatedName("hf")
public class class203 {

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.ak(Lua;Ltu;I)Ltu;")
    public static final class519 method2113(class546 arg0, class519 arg1) {
        int var2 = arg0.method8796();
        if (arg1 == null) {
            int var3 = Statics.method4498(var2);
            arg1 = new class519(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8796() == 1;
            int var6 = arg0.method8790();
            class504 var7;
            if (var5) {
                var7 = new class501(arg0.method8806());
            } else {
                var7 = new class503(arg0.method8801());
            }
            arg1.method8513(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("dv.al(Ltu;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method2600(class519 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class501 var3 = (class501) arg0.method8506((long) arg1);
            return var3 == null ? arg2 : (String) var3.field5045;
        }
    }
}
