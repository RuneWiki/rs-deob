package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ip")
public class class242 {

    @ObfuscatedName("ip.s")
    public static int field3267 = 0;

    @ObfuscatedName("ip.m")
    public static class194 field3273 = new class194(4096);

    @ObfuscatedName("ip.h")
    public static int field3270 = 0;

    @ObfuscatedName("ip.t")
    public static class194 field3280 = new class194(32);

    @ObfuscatedName("ip.p")
    public static int field3272 = 0;

    @ObfuscatedName("ip.d")
    public static class188 field3281 = new class188();

    @ObfuscatedName("ip.n")
    public static class194 field3274 = new class194(4096);

    @ObfuscatedName("ip.z")
    public static int field3275 = 0;

    @ObfuscatedName("ip.o")
    public static class194 field3276 = new class194(4096);

    @ObfuscatedName("ip.q")
    public static int field3285 = 0;

    @ObfuscatedName("ip.e")
    public static class177 field3278 = new class177(8);

    @ObfuscatedName("ip.l")
    public static int field3279 = 0;

    @ObfuscatedName("ip.w")
    public static CRC32 field3287 = new CRC32();

    @ObfuscatedName("ip.g")
    public static class241[] field3282 = new class241[256];

    @ObfuscatedName("ip.a")
    public static byte field3283 = 0;

    @ObfuscatedName("ip.x")
    public static int field3284 = 0;

    @ObfuscatedName("ip.b")
    public static int field3277 = 0;

    public class242() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.s(ZB)V")
    public static void method2885(boolean arg0) {
        if (Statics.field3268 == null) {
            return;
        }
        try {
            class177 var1 = new class177(4);
            var1.method3129(arg0 ? 2 : 3);
            var1.method2952(0);
            Statics.field3268.method2791(var1.field2403, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3268.method2794();
            } catch (Exception var4) {
            }
            field3277++;
            Statics.field3268 = null;
        }
    }

    @ObfuscatedName("ir.c(Lfr;ZB)V")
    public static void method3967(class159 arg0, boolean arg1) {
        if (Statics.field3268 != null) {
            try {
                Statics.field3268.method2794();
            } catch (Exception var10) {
            }
            Statics.field3268 = null;
        }
        Statics.field3268 = arg0;
        method2885(arg1);
        field3278.field2402 = 0;
        Statics.field1220 = null;
        Statics.field2817 = null;
        field3279 = 0;
        while (true) {
            class238 var3 = (class238) field3280.method3332();
            if (var3 == null) {
                while (true) {
                    class238 var4 = (class238) field3276.method3332();
                    if (var4 == null) {
                        if (field3283 != 0) {
                            try {
                                class177 var5 = new class177(4);
                                var5.method3129(4);
                                var5.method3129(field3283);
                                var5.method2951(0);
                                Statics.field3268.method2791(var5.field2403, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3268.method2794();
                                } catch (Exception var8) {
                                }
                                field3277++;
                                Statics.field3268 = null;
                            }
                        }
                        field3267 = 0;
                        Statics.field3269 = class179.method3585();
                        return;
                    }
                    field3281.method3269(var4);
                    field3274.method3330(var4, var4.field2487);
                    field3275++;
                    field3285--;
                }
            }
            field3273.method3330(var3, var3.field2487);
            field3270++;
            field3272--;
        }
    }

    @ObfuscatedName("bz.f(Lir;IB)V")
    public static void method967(class241 arg0, int arg1) {
        if (Statics.field854 == null) {
            method2891((class241) null, 255, 255, 0, (byte) 0, true);
            field3282[arg1] = arg0;
        } else {
            Statics.field854.field2402 = arg1 * 8 + 5;
            int var2 = Statics.field854.method2970();
            int var3 = Statics.field854.method2970();
            arg0.method3944(var2, var3);
        }
    }

    @ObfuscatedName("fl.m(Lir;IIIBZI)V")
    public static void method2891(class241 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class238 var8 = (class238) field3273.method3339(var6);
        if (var8 != null) {
            return;
        }
        class238 var9 = (class238) field3280.method3339(var6);
        if (var9 != null) {
            return;
        }
        class238 var10 = (class238) field3274.method3339(var6);
        if (var10 == null) {
            if (!arg5) {
                class238 var11 = (class238) field3276.method3339(var6);
                if (var11 != null) {
                    return;
                }
            }
            class238 var12 = new class238();
            var12.field3230 = arg0;
            var12.field3229 = arg3;
            var12.field3228 = arg4;
            if (arg5) {
                field3273.method3330(var12, var6);
                field3270++;
            } else {
                field3281.method3268(var12);
                field3274.method3330(var12, var6);
                field3275++;
            }
        } else if (arg5) {
            var10.method3413();
            field3273.method3330(var10, var6);
            field3275--;
            field3270++;
        }
    }

    @ObfuscatedName("o.h(IIB)I")
    public static int method49(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1220 != null && Statics.field1220.field2487 == var2 ? Statics.field2817.field2402 * 99 / (Statics.field2817.field2403.length - Statics.field1220.field3228) + 1 : 0;
    }

    @ObfuscatedName("cg.t(I)V")
    public static void method1555() {
        if (Statics.field3268 != null) {
            Statics.field3268.method2794();
        }
    }
}
