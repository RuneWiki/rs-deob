package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("kk")
public class class308 {

    @ObfuscatedName("kk.l")
    public static int field3924 = 0;

    @ObfuscatedName("kk.e")
    public static class402 field3915 = new class402(4096);

    @ObfuscatedName("kk.r")
    public static int field3921 = 0;

    @ObfuscatedName("kk.o")
    public static class402 field3917 = new class402(32);

    @ObfuscatedName("kk.i")
    public static int field3918 = 0;

    @ObfuscatedName("kk.w")
    public static class325 field3919 = new class325();

    @ObfuscatedName("kk.v")
    public static class402 field3914 = new class402(4096);

    @ObfuscatedName("kk.a")
    public static int field3920 = 0;

    @ObfuscatedName("kk.y")
    public static class402 field3922 = new class402(4096);

    @ObfuscatedName("kk.u")
    public static int field3913 = 0;

    @ObfuscatedName("kk.x")
    public static class421 field3925 = new class421(8);

    @ObfuscatedName("kk.n")
    public static int field3927 = 0;

    @ObfuscatedName("kk.d")
    public static CRC32 field3928 = new CRC32();

    @ObfuscatedName("kk.f")
    public static class305[] field3929 = new class305[256];

    @ObfuscatedName("kk.g")
    public static byte field3930 = 0;

    @ObfuscatedName("kk.t")
    public static int field3931 = 0;

    @ObfuscatedName("kk.k")
    public static int field3932 = 0;

    public class308() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.c(ZS)V")
    public static void method2310(boolean arg0) {
        if (Statics.field3916 == null) {
            return;
        }
        try {
            class421 var1 = new class421(4);
            var1.method6644(arg0 ? 2 : 3);
            var1.method6703(0);
            Statics.field3916.method2788(var1.field4511, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3916.method2780();
            } catch (Exception var4) {
            }
            field3932++;
            Statics.field3916 = null;
        }
    }

    @ObfuscatedName("ik.l(Lkz;IIIBZB)V")
    public static void method4360(class305 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class306 var8 = (class306) field3915.method6456(var6);
        if (var8 != null) {
            return;
        }
        class306 var9 = (class306) field3917.method6456(var6);
        if (var9 != null) {
            return;
        }
        class306 var10 = (class306) field3914.method6456(var6);
        if (var10 == null) {
            if (!arg5) {
                class306 var11 = (class306) field3922.method6456(var6);
                if (var11 != null) {
                    return;
                }
            }
            class306 var12 = new class306();
            var12.field3890 = arg0;
            var12.field3889 = arg3;
            var12.field3892 = arg4;
            if (arg5) {
                field3915.method6455(var12, var6);
                field3921++;
            } else {
                field3919.method5254(var12);
                field3914.method6455(var12, var6);
                field3920++;
            }
        } else if (arg5) {
            var10.method6163();
            field3915.method6455(var10, var6);
            field3920--;
            field3921++;
        }
    }
}
