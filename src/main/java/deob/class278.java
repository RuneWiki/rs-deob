package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("jb")
public class class278 {

    @ObfuscatedName("jb.s")
    public static int field3596 = 0;

    @ObfuscatedName("jb.j")
    public static class364 field3598 = new class364(4096);

    @ObfuscatedName("jb.l")
    public static int field3599 = 0;

    @ObfuscatedName("jb.n")
    public static class364 field3600 = new class364(32);

    @ObfuscatedName("jb.w")
    public static int field3607 = 0;

    @ObfuscatedName("jb.f")
    public static class295 field3602 = new class295();

    @ObfuscatedName("jb.o")
    public static class364 field3615 = new class364(4096);

    @ObfuscatedName("jb.x")
    public static int field3604 = 0;

    @ObfuscatedName("jb.r")
    public static class364 field3611 = new class364(4096);

    @ObfuscatedName("jb.p")
    public static int field3606 = 0;

    @ObfuscatedName("jb.a")
    public static class385 field3608 = new class385(8);

    @ObfuscatedName("jb.u")
    public static int field3609 = 0;

    @ObfuscatedName("jb.c")
    public static CRC32 field3610 = new CRC32();

    @ObfuscatedName("jb.m")
    public static class275[] field3612 = new class275[256];

    @ObfuscatedName("jb.b")
    public static byte field3613 = 0;

    @ObfuscatedName("jb.z")
    public static int field3601 = 0;

    @ObfuscatedName("jb.d")
    public static int field3605 = 0;

    public class278() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.s(Llp;ZI)V")
    public static void method2272(class330 arg0, boolean arg1) {
        if (Statics.field3614 != null) {
            try {
                Statics.field3614.method2335();
            } catch (Exception var15) {
            }
            Statics.field3614 = null;
        }
        Statics.field3614 = arg0;
        if (Statics.field3614 != null) {
            try {
                class385 var3 = new class385(4);
                var3.method5941(arg1 ? 2 : 3);
                var3.method6121(0);
                Statics.field3614.method2342(var3.field4184, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3614.method2335();
                } catch (Exception var13) {
                }
                field3605++;
                Statics.field3614 = null;
            }
        }
        field3608.field4182 = 0;
        Statics.field3595 = null;
        Statics.field1248 = null;
        field3609 = 0;
        while (true) {
            class276 var6 = (class276) field3600.method5746();
            if (var6 == null) {
                while (true) {
                    class276 var7 = (class276) field3611.method5746();
                    if (var7 == null) {
                        if (field3613 != 0) {
                            try {
                                class385 var8 = new class385(4);
                                var8.method5941(4);
                                var8.method5941(field3613);
                                var8.method6132(0);
                                Statics.field3614.method2342(var8.field4184, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3614.method2335();
                                } catch (Exception var11) {
                                }
                                field3605++;
                                Statics.field3614 = null;
                            }
                        }
                        field3596 = 0;
                        Statics.field3597 = class382.method2013();
                        return;
                    }
                    field3602.method4694(var7);
                    field3615.method5747(var7, var7.field3966);
                    field3604++;
                    field3606--;
                }
            }
            field3598.method5747(var6, var6.field3966);
            field3599++;
            field3607--;
        }
    }

    @ObfuscatedName("ek.t(Ljs;IIIBZI)V")
    public static void method2366(class275 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class276 var8 = (class276) field3598.method5756(var6);
        if (var8 != null) {
            return;
        }
        class276 var9 = (class276) field3600.method5756(var6);
        if (var9 != null) {
            return;
        }
        class276 var10 = (class276) field3615.method5756(var6);
        if (var10 == null) {
            if (!arg5) {
                class276 var11 = (class276) field3611.method5756(var6);
                if (var11 != null) {
                    return;
                }
            }
            class276 var12 = new class276();
            var12.field3577 = arg0;
            var12.field3574 = arg3;
            var12.field3573 = arg4;
            if (arg5) {
                field3598.method5747(var12, var6);
                field3599++;
            } else {
                field3602.method4693(var12);
                field3615.method5747(var12, var6);
                field3604++;
            }
        } else if (arg5) {
            var10.method5445();
            field3598.method5747(var10, var6);
            field3604--;
            field3599++;
        }
    }

    @ObfuscatedName("ee.v(IIB)V")
    public static void method2371(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class276 var4 = (class276) field3615.method5756(var2);
        if (var4 != null) {
            field3602.method4694(var4);
        }
    }
}
