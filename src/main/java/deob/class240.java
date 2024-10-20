package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ie")
public class class240 {

    @ObfuscatedName("ie.n")
    public static int field3252 = 0;

    @ObfuscatedName("ie.y")
    public static class192 field3239 = new class192(4096);

    @ObfuscatedName("ie.w")
    public static int field3250 = 0;

    @ObfuscatedName("ie.k")
    public static class192 field3237 = new class192(32);

    @ObfuscatedName("ie.v")
    public static int field3242 = 0;

    @ObfuscatedName("ie.z")
    public static class186 field3243 = new class186();

    @ObfuscatedName("ie.r")
    public static class192 field3246 = new class192(4096);

    @ObfuscatedName("ie.u")
    public static int field3236 = 0;

    @ObfuscatedName("ie.d")
    public static class192 field3241 = new class192(4096);

    @ObfuscatedName("ie.o")
    public static int field3247 = 0;

    @ObfuscatedName("ie.s")
    public static class175 field3248 = new class175(8);

    @ObfuscatedName("ie.m")
    public static int field3249 = 0;

    @ObfuscatedName("ie.t")
    public static CRC32 field3245 = new CRC32();

    @ObfuscatedName("ie.f")
    public static class239[] field3251 = new class239[256];

    @ObfuscatedName("ie.b")
    public static byte field3244 = 0;

    @ObfuscatedName("ie.x")
    public static int field3253 = 0;

    @ObfuscatedName("ie.i")
    public static int field3254 = 0;

    public class240() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ja.e(ZI)V")
    public static void method4567(boolean arg0) {
        if (Statics.field3238 == null) {
            return;
        }
        try {
            class175 var1 = new class175(4);
            var1.method2913(arg0 ? 2 : 3);
            var1.method2915(0);
            Statics.field3238.method2785(var1.field2376, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3238.method2792();
            } catch (Exception var4) {
            }
            field3254++;
            Statics.field3238 = null;
        }
    }

    @ObfuscatedName("jn.n(Lfy;ZI)V")
    public static void method4430(class161 arg0, boolean arg1) {
        if (Statics.field3238 != null) {
            try {
                Statics.field3238.method2792();
            } catch (Exception var10) {
            }
            Statics.field3238 = null;
        }
        Statics.field3238 = arg0;
        method4567(arg1);
        field3248.field2381 = 0;
        Statics.field1386 = null;
        Statics.field3651 = null;
        field3249 = 0;
        while (true) {
            class236 var3 = (class236) field3237.method3295();
            if (var3 == null) {
                while (true) {
                    class236 var4 = (class236) field3241.method3295();
                    if (var4 == null) {
                        if (field3244 != 0) {
                            try {
                                class175 var5 = new class175(4);
                                var5.method2913(4);
                                var5.method2913(field3244);
                                var5.method2914(0);
                                Statics.field3238.method2785(var5.field2376, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3238.method2792();
                                } catch (Exception var8) {
                                }
                                field3254++;
                                Statics.field3238 = null;
                            }
                        }
                        field3252 = 0;
                        Statics.field3240 = class177.method2903();
                        return;
                    }
                    field3243.method3230(var4);
                    field3246.method3293(var4, var4.field2451);
                    field3236++;
                    field3247--;
                }
            }
            field3239.method3293(var3, var3.field2451);
            field3250++;
            field3242--;
        }
    }

    @ObfuscatedName("by.g(Lid;II)V")
    public static void method934(class239 arg0, int arg1) {
        if (Statics.field324 == null) {
            method4338((class239) null, 255, 255, 0, (byte) 0, true);
            field3251[arg1] = arg0;
        } else {
            Statics.field324.field2381 = arg1 * 8 + 5;
            int var2 = Statics.field324.method2933();
            int var3 = Statics.field324.method2933();
            arg0.method3915(var2, var3);
        }
    }

    @ObfuscatedName("ij.y(Lid;IIIBZI)V")
    public static void method4338(class239 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class236 var8 = (class236) field3239.method3294(var6);
        if (var8 != null) {
            return;
        }
        class236 var9 = (class236) field3237.method3294(var6);
        if (var9 != null) {
            return;
        }
        class236 var10 = (class236) field3246.method3294(var6);
        if (var10 == null) {
            if (!arg5) {
                class236 var11 = (class236) field3241.method3294(var6);
                if (var11 != null) {
                    return;
                }
            }
            class236 var12 = new class236();
            var12.field3193 = arg0;
            var12.field3194 = arg3;
            var12.field3192 = arg4;
            if (arg5) {
                field3239.method3293(var12, var6);
                field3250++;
            } else {
                field3243.method3229(var12);
                field3246.method3293(var12, var6);
                field3236++;
            }
        } else if (arg5) {
            var10.method3380();
            field3239.method3293(var10, var6);
            field3236--;
            field3250++;
        }
    }

    @ObfuscatedName("fh.w(III)V")
    public static void method3065(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class236 var4 = (class236) field3246.method3294(var2);
        if (var4 != null) {
            field3243.method3230(var4);
        }
    }

    @ObfuscatedName("ie.k(III)I")
    public static int method3935(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1386 != null && Statics.field1386.field2451 == var2 ? Statics.field3651.field2381 * 99 / (Statics.field3651.field2376.length - Statics.field1386.field3192) + 1 : 0;
    }

    @ObfuscatedName("ca.v(B)V")
    public static void method1606() {
        if (Statics.field3238 != null) {
            Statics.field3238.method2792();
        }
    }
}
