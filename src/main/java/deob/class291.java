package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("kb")
public class class291 {

    @ObfuscatedName("kb.q")
    public static int field3730 = 0;

    @ObfuscatedName("kb.j")
    public static class380 field3717 = new class380(4096);

    @ObfuscatedName("kb.m")
    public static int field3718 = 0;

    @ObfuscatedName("kb.k")
    public static class380 field3723 = new class380(32);

    @ObfuscatedName("kb.t")
    public static int field3720 = 0;

    @ObfuscatedName("kb.a")
    public static class308 field3721 = new class308();

    @ObfuscatedName("kb.e")
    public static class380 field3715 = new class380(4096);

    @ObfuscatedName("kb.i")
    public static int field3714 = 0;

    @ObfuscatedName("kb.y")
    public static class380 field3724 = new class380(4096);

    @ObfuscatedName("kb.w")
    public static int field3722 = 0;

    @ObfuscatedName("kb.s")
    public static class401 field3719 = new class401(8);

    @ObfuscatedName("kb.b")
    public static int field3727 = 0;

    @ObfuscatedName("kb.p")
    public static CRC32 field3728 = new CRC32();

    @ObfuscatedName("kb.h")
    public static class288[] field3729 = new class288[256];

    @ObfuscatedName("kb.o")
    public static byte field3725 = 0;

    @ObfuscatedName("kb.r")
    public static int field3731 = 0;

    @ObfuscatedName("kb.n")
    public static int field3732 = 0;

    public class291() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.l(Lmk;ZI)V")
    public static void method2497(class344 arg0, boolean arg1) {
        if (Statics.field3726 != null) {
            try {
                Statics.field3726.method2615();
            } catch (Exception var15) {
            }
            Statics.field3726 = null;
        }
        Statics.field3726 = arg0;
        if (Statics.field3726 != null) {
            try {
                class401 var3 = new class401(4);
                var3.method6269(arg1 ? 2 : 3);
                var3.method6262(0);
                Statics.field3726.method2596(var3.field4294, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3726.method2615();
                } catch (Exception var13) {
                }
                field3732++;
                Statics.field3726 = null;
            }
        }
        field3719.field4292 = 0;
        Statics.field1520 = null;
        Statics.field3308 = null;
        field3727 = 0;
        while (true) {
            class289 var6 = (class289) field3723.method6062();
            if (var6 == null) {
                while (true) {
                    class289 var7 = (class289) field3724.method6062();
                    if (var7 == null) {
                        if (field3725 != 0) {
                            try {
                                class401 var8 = new class401(4);
                                var8.method6269(4);
                                var8.method6269(field3725);
                                var8.method6256(0);
                                Statics.field3726.method2596(var8.field4294, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3726.method2615();
                                } catch (Exception var11) {
                                }
                                field3732++;
                                Statics.field3726 = null;
                            }
                        }
                        field3730 = 0;
                        Statics.field3716 = class398.method2299();
                        return;
                    }
                    field3721.method5005(var7);
                    field3715.method6065(var7, var7.field4075);
                    field3714++;
                    field3722--;
                }
            }
            field3717.method6065(var6, var6.field4075);
            field3718++;
            field3720--;
        }
    }

    @ObfuscatedName("du.q(Lky;II)V")
    public static void method2359(class288 arg0, int arg1) {
        if (Statics.field3981 == null) {
            method2483((class288) null, 255, 255, 0, (byte) 0, true);
            field3729[arg1] = arg0;
        } else {
            Statics.field3981.field4292 = arg1 * 8 + 5;
            int var2 = Statics.field3981.method6277();
            int var3 = Statics.field3981.method6277();
            arg0.method4751(var2, var3);
        }
    }

    @ObfuscatedName("dk.f(Lky;IIIBZI)V")
    public static void method2483(class288 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class289 var8 = (class289) field3717.method6061(var6);
        if (var8 != null) {
            return;
        }
        class289 var9 = (class289) field3723.method6061(var6);
        if (var9 != null) {
            return;
        }
        class289 var10 = (class289) field3715.method6061(var6);
        if (var10 == null) {
            if (!arg5) {
                class289 var11 = (class289) field3724.method6061(var6);
                if (var11 != null) {
                    return;
                }
            }
            class289 var12 = new class289();
            var12.field3693 = arg0;
            var12.field3690 = arg3;
            var12.field3691 = arg4;
            if (arg5) {
                field3717.method6065(var12, var6);
                field3718++;
            } else {
                field3721.method5008(var12);
                field3715.method6065(var12, var6);
                field3714++;
            }
        } else if (arg5) {
            var10.method5771();
            field3717.method6065(var10, var6);
            field3714--;
            field3718++;
        }
    }

    @ObfuscatedName("ed.j(III)V")
    public static void method2627(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class289 var4 = (class289) field3715.method6061(var2);
        if (var4 != null) {
            field3721.method5005(var4);
        }
    }

    @ObfuscatedName("ks.m(III)I")
    public static int method4705(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1520 != null && Statics.field1520.field4075 == var2 ? Statics.field3308.field4292 * 99 / (Statics.field3308.field4294.length - Statics.field1520.field3691) + 1 : 0;
    }
}
