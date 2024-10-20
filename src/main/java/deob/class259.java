package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class259 {

    @ObfuscatedName("io.q")
    public static int field3374 = 0;

    @ObfuscatedName("io.p")
    public static class211 field3360 = new class211(4096);

    @ObfuscatedName("io.a")
    public static int field3361 = 0;

    @ObfuscatedName("io.h")
    public static class211 field3364 = new class211(32);

    @ObfuscatedName("io.l")
    public static int field3358 = 0;

    @ObfuscatedName("io.y")
    public static class205 field3357 = new class205();

    @ObfuscatedName("io.g")
    public static class211 field3365 = new class211(4096);

    @ObfuscatedName("io.c")
    public static int field3363 = 0;

    @ObfuscatedName("io.u")
    public static class211 field3362 = new class211(4096);

    @ObfuscatedName("io.r")
    public static int field3367 = 0;

    @ObfuscatedName("io.s")
    public static class194 field3369 = new class194(8);

    @ObfuscatedName("io.f")
    public static int field3370 = 0;

    @ObfuscatedName("io.x")
    public static CRC32 field3371 = new CRC32();

    @ObfuscatedName("io.j")
    public static class258[] field3372 = new class258[256];

    @ObfuscatedName("io.z")
    public static byte field3373 = 0;

    @ObfuscatedName("io.e")
    public static int field3368 = 0;

    @ObfuscatedName("io.k")
    public static int field3375 = 0;

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hq.b(ZB)V")
    public static void method4013(boolean arg0) {
        if (Statics.field3366 == null) {
            return;
        }
        try {
            class194 var1 = new class194(4);
            var1.method3232(arg0 ? 2 : 3);
            var1.method3234(0);
            Statics.field3366.method3019(var1.field2541, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3366.method3020();
            } catch (Exception var4) {
            }
            field3375++;
            Statics.field3366 = null;
        }
    }

    @ObfuscatedName("dl.q(Lfi;ZI)V")
    public static void method2135(class169 arg0, boolean arg1) {
        if (Statics.field3366 != null) {
            try {
                Statics.field3366.method3020();
            } catch (Exception var10) {
            }
            Statics.field3366 = null;
        }
        Statics.field3366 = arg0;
        method4013(arg1);
        field3369.field2538 = 0;
        Statics.field2181 = null;
        Statics.field1882 = null;
        field3370 = 0;
        while (true) {
            class255 var3 = (class255) field3364.method3677();
            if (var3 == null) {
                while (true) {
                    class255 var4 = (class255) field3362.method3677();
                    if (var4 == null) {
                        if (field3373 != 0) {
                            try {
                                class194 var5 = new class194(4);
                                var5.method3232(4);
                                var5.method3232(field3373);
                                var5.method3233(0);
                                Statics.field3366.method3019(var5.field2541, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3366.method3020();
                                } catch (Exception var8) {
                                }
                                field3375++;
                                Statics.field3366 = null;
                            }
                        }
                        field3374 = 0;
                        Statics.field3359 = class196.method3211();
                        return;
                    }
                    field3357.method3619(var4);
                    field3365.method3675(var4, var4.field2613);
                    field3363++;
                    field3367--;
                }
            }
            field3360.method3675(var3, var3.field2613);
            field3361++;
            field3358--;
        }
    }

    @ObfuscatedName("ff.o(Lia;IB)V")
    public static void method2999(class258 arg0, int arg1) {
        if (Statics.field3755 == null) {
            method1870((class258) null, 255, 255, 0, (byte) 0, true);
            field3372[arg1] = arg0;
        } else {
            Statics.field3755.field2538 = arg1 * 8 + 5;
            int var2 = Statics.field3755.method3261();
            int var3 = Statics.field3755.method3261();
            arg0.method4286(var2, var3);
        }
    }

    @ObfuscatedName("cs.p(Lia;IIIBZI)V")
    public static void method1870(class258 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class255 var8 = (class255) field3360.method3674(var6);
        if (var8 != null) {
            return;
        }
        class255 var9 = (class255) field3364.method3674(var6);
        if (var9 != null) {
            return;
        }
        class255 var10 = (class255) field3365.method3674(var6);
        if (var10 == null) {
            if (!arg5) {
                class255 var11 = (class255) field3362.method3674(var6);
                if (var11 != null) {
                    return;
                }
            }
            class255 var12 = new class255();
            var12.field3320 = arg0;
            var12.field3319 = arg3;
            var12.field3318 = arg4;
            if (arg5) {
                field3360.method3675(var12, var6);
                field3361++;
            } else {
                field3357.method3618(var12);
                field3365.method3675(var12, var6);
                field3363++;
            }
        } else if (arg5) {
            var10.method3766();
            field3360.method3675(var10, var6);
            field3363--;
            field3361++;
        }
    }

    @ObfuscatedName("hx.a(III)I")
    public static int method3998(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2181 != null && Statics.field2181.field2613 == var2 ? Statics.field1882.field2538 * 99 / (Statics.field1882.field2541.length - Statics.field2181.field3318) + 1 : 0;
    }

    @ObfuscatedName("ac.l(B)V")
    public static void method565() {
        if (Statics.field3366 != null) {
            Statics.field3366.method3020();
        }
    }
}
