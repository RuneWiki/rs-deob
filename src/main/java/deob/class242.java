package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iw")
public class class242 {

    @ObfuscatedName("iw.o")
    public static int field3256 = 0;

    @ObfuscatedName("iw.k")
    public static class194 field3250 = new class194(4096);

    @ObfuscatedName("iw.f")
    public static int field3251 = 0;

    @ObfuscatedName("iw.i")
    public static class194 field3267 = new class194(32);

    @ObfuscatedName("iw.j")
    public static int field3253 = 0;

    @ObfuscatedName("iw.m")
    public static class188 field3259 = new class188();

    @ObfuscatedName("iw.u")
    public static class194 field3255 = new class194(4096);

    @ObfuscatedName("iw.r")
    public static int field3249 = 0;

    @ObfuscatedName("iw.v")
    public static class194 field3257 = new class194(4096);

    @ObfuscatedName("iw.h")
    public static int field3258 = 0;

    @ObfuscatedName("iw.q")
    public static class177 field3248 = new class177(8);

    @ObfuscatedName("iw.c")
    public static int field3261 = 0;

    @ObfuscatedName("iw.z")
    public static CRC32 field3262 = new CRC32();

    @ObfuscatedName("iw.g")
    public static class241[] field3263 = new class241[256];

    @ObfuscatedName("iw.d")
    public static byte field3264 = 0;

    @ObfuscatedName("iw.y")
    public static int field3265 = 0;

    @ObfuscatedName("iw.t")
    public static int field3266 = 0;

    public class242() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.w(ZI)V")
    public static void method2132(boolean arg0) {
        if (Statics.field2365 == null) {
            return;
        }
        try {
            class177 var1 = new class177(4);
            var1.method3075(arg0 ? 2 : 3);
            var1.method2871(0);
            Statics.field2365.method2699(var1.field2419, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2365.method2705();
            } catch (Exception var4) {
            }
            field3266++;
            Statics.field2365 = null;
        }
    }

    @ObfuscatedName("cp.o(Lfa;ZB)V")
    public static void method1651(class159 arg0, boolean arg1) {
        if (Statics.field2365 != null) {
            try {
                Statics.field2365.method2705();
            } catch (Exception var10) {
            }
            Statics.field2365 = null;
        }
        Statics.field2365 = arg0;
        method2132(arg1);
        field3248.field2412 = 0;
        Statics.field3254 = null;
        Statics.field2614 = null;
        field3261 = 0;
        while (true) {
            class238 var3 = (class238) field3267.method3251();
            if (var3 == null) {
                while (true) {
                    class238 var4 = (class238) field3257.method3251();
                    if (var4 == null) {
                        if (field3264 != 0) {
                            try {
                                class177 var5 = new class177(4);
                                var5.method3075(4);
                                var5.method3075(field3264);
                                var5.method2903(0);
                                Statics.field2365.method2699(var5.field2419, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2365.method2705();
                                } catch (Exception var8) {
                                }
                                field3266++;
                                Statics.field2365 = null;
                            }
                        }
                        field3256 = 0;
                        Statics.field3252 = class179.method1665();
                        return;
                    }
                    field3259.method3191(var4);
                    field3255.method3253(var4, var4.field2490);
                    field3249++;
                    field3258--;
                }
            }
            field3250.method3253(var3, var3.field2490);
            field3251++;
            field3253--;
        }
    }

    @ObfuscatedName("aa.x(Lio;II)V")
    public static void method636(class241 arg0, int arg1) {
        if (Statics.field12 == null) {
            method322((class241) null, 255, 255, 0, (byte) 0, true);
            field3263[arg1] = arg0;
        } else {
            Statics.field12.field2412 = arg1 * 8 + 5;
            int var2 = Statics.field12.method2904();
            int var3 = Statics.field12.method2904();
            arg0.method3838(var2, var3);
        }
    }

    @ObfuscatedName("aq.k(Lio;IIIBZI)V")
    public static void method322(class241 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class238 var8 = (class238) field3250.method3252(var6);
        if (var8 != null) {
            return;
        }
        class238 var9 = (class238) field3267.method3252(var6);
        if (var9 != null) {
            return;
        }
        class238 var10 = (class238) field3255.method3252(var6);
        if (var10 == null) {
            if (!arg5) {
                class238 var11 = (class238) field3257.method3252(var6);
                if (var11 != null) {
                    return;
                }
            }
            class238 var12 = new class238();
            var12.field3207 = arg0;
            var12.field3210 = arg3;
            var12.field3208 = arg4;
            if (arg5) {
                field3250.method3253(var12, var6);
                field3251++;
            } else {
                field3259.method3192(var12);
                field3255.method3253(var12, var6);
                field3249++;
            }
        } else if (arg5) {
            var10.method3331();
            field3250.method3253(var10, var6);
            field3249--;
            field3251++;
        }
    }

    @ObfuscatedName("fo.f(III)I")
    public static int method2823(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3254 != null && Statics.field3254.field2490 == var2 ? Statics.field2614.field2412 * 99 / (Statics.field2614.field2419.length - Statics.field3254.field3208) + 1 : 0;
    }

    @ObfuscatedName("p.i(ZZI)I")
    public static int method61(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3253 + field3251;
        }
        if (arg1) {
            var2 += field3258 + field3249;
        }
        return var2;
    }

    @ObfuscatedName("ak.j(I)V")
    public static void method352() {
        if (Statics.field2365 != null) {
            Statics.field2365.method2705();
        }
    }
}
