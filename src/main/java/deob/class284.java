package deob;

@ObfuscatedName("ji")
public class class284 {

    public class284() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.f(Lnu;Lme;I)Lme;")
    public static final class360 method1975(class382 arg0, class360 arg1) {
        int var2 = arg0.method5856();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class360(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method5856() == 1;
            int var13 = arg0.method5875();
            class351 var14;
            if (var12) {
                var14 = new class347(arg0.method5865());
            } else {
                var14 = new class350(arg0.method5861());
            }
            arg1.method5630(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("ar.o(Lme;ILjava/lang/String;S)Ljava/lang/String;")
    public static String method549(class360 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class347 var3 = (class347) arg0.method5621((long) arg1);
            return var3 == null ? arg2 : (String) var3.field3937;
        }
    }
}
