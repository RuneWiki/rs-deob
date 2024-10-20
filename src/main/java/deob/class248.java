package deob;

@ObfuscatedName("iv")
public class class248 {

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.u(Lkg;Llb;B)Llb;")
    public static final class316 method3036(class300 arg0, class316 arg1) {
        int var2 = arg0.method5138();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class316(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method5138() == 1;
            int var13 = arg0.method5287();
            class181 var14;
            if (var12) {
                var14 = new class177(arg0.method5147());
            } else {
                var14 = new class180(arg0.method5277());
            }
            arg1.method5531(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("hz.f(Llb;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method3828(class316 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class177 var3 = (class177) arg0.method5521((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2121;
        }
    }
}
