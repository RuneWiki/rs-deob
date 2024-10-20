package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("jb")
public class class277 {

    @ObfuscatedName("jb.e")
    public static int field3615 = 0;

    @ObfuscatedName("jb.y")
    public static class363 field3606 = new class363(4096);

    @ObfuscatedName("jb.j")
    public static int field3604 = 0;

    @ObfuscatedName("jb.o")
    public static class363 field3621 = new class363(32);

    @ObfuscatedName("jb.m")
    public static int field3609 = 0;

    @ObfuscatedName("jb.r")
    public static class294 field3610 = new class294();

    @ObfuscatedName("jb.h")
    public static class363 field3611 = new class363(4096);

    @ObfuscatedName("jb.d")
    public static int field3612 = 0;

    @ObfuscatedName("jb.z")
    public static class363 field3613 = new class363(4096);

    @ObfuscatedName("jb.b")
    public static int field3614 = 0;

    @ObfuscatedName("jb.g")
    public static class384 field3607 = new class384(8);

    @ObfuscatedName("jb.x")
    public static int field3616 = 0;

    @ObfuscatedName("jb.q")
    public static CRC32 field3608 = new CRC32();

    @ObfuscatedName("jb.p")
    public static class274[] field3618 = new class274[256];

    @ObfuscatedName("jb.c")
    public static byte field3619 = 0;

    @ObfuscatedName("jb.n")
    public static int field3620 = 0;

    @ObfuscatedName("jb.l")
    public static int field3603 = 0;

    public class277() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.f(ZI)V")
    public static void method2087(boolean arg0) {
        if (Statics.field3617 == null) {
            return;
        }
        try {
            class384 var1 = new class384(4);
            var1.method5880(arg0 ? 2 : 3);
            var1.method5882(0);
            Statics.field3617.method2370(var1.field4160, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3617.method2364();
            } catch (Exception var4) {
            }
            field3603++;
            Statics.field3617 = null;
        }
    }

    @ObfuscatedName("ew.e(Llk;ZB)V")
    public static void method2615(class330 arg0, boolean arg1) {
        if (Statics.field3617 != null) {
            try {
                Statics.field3617.method2364();
            } catch (Exception var10) {
            }
            Statics.field3617 = null;
        }
        Statics.field3617 = arg0;
        method2087(arg1);
        field3607.field4161 = 0;
        Statics.field236 = null;
        Statics.field3136 = null;
        field3616 = 0;
        while (true) {
            class275 var3 = (class275) field3621.method5693();
            if (var3 == null) {
                while (true) {
                    class275 var4 = (class275) field3613.method5693();
                    if (var4 == null) {
                        if (field3619 != 0) {
                            try {
                                class384 var5 = new class384(4);
                                var5.method5880(4);
                                var5.method5880(field3619);
                                var5.method5881(0);
                                Statics.field3617.method2370(var5.field4160, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3617.method2364();
                                } catch (Exception var8) {
                                }
                                field3603++;
                                Statics.field3617 = null;
                            }
                        }
                        field3615 = 0;
                        Statics.field3605 = class381.method4000();
                        return;
                    }
                    field3610.method4705(var4);
                    field3611.method5692(var4, var4.field3937);
                    field3612++;
                    field3614--;
                }
            }
            field3606.method5692(var3, var3.field3937);
            field3604++;
            field3609--;
        }
    }

    @ObfuscatedName("cz.v(Ljf;IIIBZI)V")
    public static void method1772(class274 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class275 var8 = (class275) field3606.method5691(var6);
        if (var8 != null) {
            return;
        }
        class275 var9 = (class275) field3621.method5691(var6);
        if (var9 != null) {
            return;
        }
        class275 var10 = (class275) field3611.method5691(var6);
        if (var10 == null) {
            if (!arg5) {
                class275 var11 = (class275) field3613.method5691(var6);
                if (var11 != null) {
                    return;
                }
            }
            class275 var12 = new class275();
            var12.field3577 = arg0;
            var12.field3575 = arg3;
            var12.field3576 = arg4;
            if (arg5) {
                field3606.method5692(var12, var6);
                field3604++;
            } else {
                field3610.method4704(var12);
                field3611.method5692(var12, var6);
                field3612++;
            }
        } else if (arg5) {
            var10.method5404();
            field3606.method5692(var10, var6);
            field3612--;
            field3604++;
        }
    }

    @ObfuscatedName("ia.y(III)I")
    public static int method4384(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field236 != null && Statics.field236.field3937 == var2 ? Statics.field3136.field4161 * 99 / (Statics.field3136.field4160.length - Statics.field236.field3576) + 1 : 0;
    }

    @ObfuscatedName("jf.j(ZZI)I")
    public static int method4498(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3609 + field3604;
        }
        if (arg1) {
            var2 += field3614 + field3612;
        }
        return var2;
    }
}
