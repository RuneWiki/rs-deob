package deob;

@ObfuscatedName("iu")
public class class248 {

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hd.f(Lkq;Llc;B)Llc;")
    public static final class316 method3588(class300 arg0, class316 arg1) {
        int var2 = arg0.method5110();
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
            boolean var12 = arg0.method5110() == 1;
            int var13 = arg0.method5226();
            class188 var14;
            if (var12) {
                var14 = new class184(arg0.method5119());
            } else {
                var14 = new class187(arg0.method5192());
            }
            arg1.method5469(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("cb.i(Llc;IIS)I")
    public static int method1895(class316 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class187 var3 = (class187) arg0.method5467((long) arg1);
            return var3 == null ? arg2 : var3.field2321;
        }
    }

    @ObfuscatedName("s.y(Llc;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method131(class316 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class184 var3 = (class184) arg0.method5467((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2317;
        }
    }
}
