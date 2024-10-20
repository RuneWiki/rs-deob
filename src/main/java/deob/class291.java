package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("kk")
public class class291 {

    @ObfuscatedName("kk.w")
    public static int field3706 = 0;

    @ObfuscatedName("kk.a")
    public static class380 field3707 = new class380(4096);

    @ObfuscatedName("kk.o")
    public static int field3717 = 0;

    @ObfuscatedName("kk.g")
    public static class380 field3709 = new class380(32);

    @ObfuscatedName("kk.e")
    public static int field3710 = 0;

    @ObfuscatedName("kk.p")
    public static class308 field3714 = new class308();

    @ObfuscatedName("kk.j")
    public static class380 field3712 = new class380(4096);

    @ObfuscatedName("kk.b")
    public static int field3713 = 0;

    @ObfuscatedName("kk.x")
    public static class380 field3711 = new class380(4096);

    @ObfuscatedName("kk.y")
    public static int field3715 = 0;

    @ObfuscatedName("kk.l")
    public static class401 field3705 = new class401(8);

    @ObfuscatedName("kk.n")
    public static int field3708 = 0;

    @ObfuscatedName("kk.q")
    public static CRC32 field3718 = new CRC32();

    @ObfuscatedName("kk.r")
    public static class288[] field3719 = new class288[256];

    @ObfuscatedName("kk.m")
    public static byte field3720 = 0;

    @ObfuscatedName("kk.c")
    public static int field3721 = 0;

    @ObfuscatedName("kk.f")
    public static int field3722 = 0;

    public class291() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hv.i(Lmp;ZB)V")
    public static void method4169(class344 arg0, boolean arg1) {
        if (Statics.field3716 != null) {
            try {
                Statics.field3716.method2613();
            } catch (Exception var15) {
            }
            Statics.field3716 = null;
        }
        Statics.field3716 = arg0;
        if (Statics.field3716 != null) {
            try {
                class401 var3 = new class401(4);
                var3.method6223(arg1 ? 2 : 3);
                var3.method6225(0);
                Statics.field3716.method2642(var3.field4302, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3716.method2613();
                } catch (Exception var13) {
                }
                field3722++;
                Statics.field3716 = null;
            }
        }
        field3705.field4300 = 0;
        Statics.field1491 = null;
        Statics.field1524 = null;
        field3708 = 0;
        while (true) {
            class289 var6 = (class289) field3709.method6028();
            if (var6 == null) {
                while (true) {
                    class289 var7 = (class289) field3711.method6028();
                    if (var7 == null) {
                        if (field3720 != 0) {
                            try {
                                class401 var8 = new class401(4);
                                var8.method6223(4);
                                var8.method6223(field3720);
                                var8.method6224(0);
                                Statics.field3716.method2642(var8.field4302, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3716.method2613();
                                } catch (Exception var11) {
                                }
                                field3722++;
                                Statics.field3716 = null;
                            }
                        }
                        field3706 = 0;
                        Statics.field4437 = class398.method2381();
                        return;
                    }
                    field3714.method4971(var7);
                    field3712.method6027(var7, var7.field4075);
                    field3713++;
                    field3715--;
                }
            }
            field3707.method6027(var6, var6.field4075);
            field3717++;
            field3710--;
        }
    }

    @ObfuscatedName("jt.w(Lkd;IIIBZS)V")
    public static void method4638(class288 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class289 var8 = (class289) field3707.method6034(var6);
        if (var8 != null) {
            return;
        }
        class289 var9 = (class289) field3709.method6034(var6);
        if (var9 != null) {
            return;
        }
        class289 var10 = (class289) field3712.method6034(var6);
        if (var10 == null) {
            if (!arg5) {
                class289 var11 = (class289) field3711.method6034(var6);
                if (var11 != null) {
                    return;
                }
            }
            class289 var12 = new class289();
            var12.field3686 = arg0;
            var12.field3682 = arg3;
            var12.field3684 = arg4;
            if (arg5) {
                field3707.method6027(var12, var6);
                field3717++;
            } else {
                field3714.method4975(var12);
                field3712.method6027(var12, var6);
                field3713++;
            }
        } else if (arg5) {
            var10.method5748();
            field3707.method6027(var10, var6);
            field3713--;
            field3717++;
        }
    }

    @ObfuscatedName("cr.s(III)V")
    public static void method2171(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class289 var4 = (class289) field3712.method6034(var2);
        if (var4 != null) {
            field3714.method4971(var4);
        }
    }

    @ObfuscatedName("cd.a(IIB)I")
    public static int method2069(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1491 != null && Statics.field1491.field4075 == var2 ? Statics.field1524.field4300 * 99 / (Statics.field1524.field4302.length - Statics.field1491.field3684) + 1 : 0;
    }
}
