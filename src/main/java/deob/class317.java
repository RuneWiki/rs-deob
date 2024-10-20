package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("lc")
public class class317 {

    @ObfuscatedName("lc.q")
    public static int field4056 = 0;

    @ObfuscatedName("lc.k")
    public static class421 field4043 = new class421(4096);

    @ObfuscatedName("lc.a")
    public static int field4045 = 0;

    @ObfuscatedName("lc.m")
    public static class421 field4052 = new class421(32);

    @ObfuscatedName("lc.p")
    public static int field4046 = 0;

    @ObfuscatedName("lc.s")
    public static class334 field4041 = new class334();

    @ObfuscatedName("lc.r")
    public static class421 field4048 = new class421(4096);

    @ObfuscatedName("lc.v")
    public static int field4049 = 0;

    @ObfuscatedName("lc.y")
    public static class421 field4050 = new class421(4096);

    @ObfuscatedName("lc.c")
    public static int field4051 = 0;

    @ObfuscatedName("lc.t")
    public static class440 field4054 = new class440(8);

    @ObfuscatedName("lc.x")
    public static int field4053 = 0;

    @ObfuscatedName("lc.e")
    public static CRC32 field4059 = new CRC32();

    @ObfuscatedName("lc.f")
    public static class314[] field4055 = new class314[256];

    @ObfuscatedName("lc.d")
    public static byte field4044 = 0;

    @ObfuscatedName("lc.j")
    public static int field4057 = 0;

    @ObfuscatedName("lc.z")
    public static int field4058 = 0;

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.o(ZB)V")
    public static void method1983(boolean arg0) {
        if (Statics.field4040 == null) {
            return;
        }
        try {
            class440 var1 = new class440(4);
            var1.method6876(arg0 ? 2 : 3);
            var1.method6893(0);
            Statics.field4040.method2913(var1.field4679, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field4040.method2910();
            } catch (Exception var4) {
            }
            field4058++;
            Statics.field4040 = null;
        }
    }

    @ObfuscatedName("gf.q(Lnf;ZI)V")
    public static void method3721(class378 arg0, boolean arg1) {
        if (Statics.field4040 != null) {
            try {
                Statics.field4040.method2910();
            } catch (Exception var10) {
            }
            Statics.field4040 = null;
        }
        Statics.field4040 = arg0;
        method1983(arg1);
        field4054.field4678 = 0;
        Statics.field2814 = null;
        Statics.field4250 = null;
        field4053 = 0;
        while (true) {
            class315 var3 = (class315) field4052.method6698();
            if (var3 == null) {
                while (true) {
                    class315 var4 = (class315) field4050.method6698();
                    if (var4 == null) {
                        if (field4044 != 0) {
                            try {
                                class440 var5 = new class440(4);
                                var5.method6876(4);
                                var5.method6876(field4044);
                                var5.method6877(0);
                                Statics.field4040.method2913(var5.field4679, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field4040.method2910();
                                } catch (Exception var8) {
                                }
                                field4058++;
                                Statics.field4040 = null;
                            }
                        }
                        field4056 = 0;
                        Statics.field4042 = class270.method2485();
                        return;
                    }
                    field4041.method5406(var4);
                    field4048.method6688(var4, var4.field4468);
                    field4049++;
                    field4051--;
                }
            }
            field4043.method6688(var3, var3.field4468);
            field4045++;
            field4046--;
        }
    }

    @ObfuscatedName("iv.k(Lle;IIIBZI)V")
    public static void method4526(class314 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class315 var8 = (class315) field4043.method6687(var6);
        if (var8 != null) {
            return;
        }
        class315 var9 = (class315) field4052.method6687(var6);
        if (var9 != null) {
            return;
        }
        class315 var10 = (class315) field4048.method6687(var6);
        if (var10 == null) {
            if (!arg5) {
                class315 var11 = (class315) field4050.method6687(var6);
                if (var11 != null) {
                    return;
                }
            }
            class315 var12 = new class315();
            var12.field4017 = arg0;
            var12.field4018 = arg3;
            var12.field4019 = arg4;
            if (arg5) {
                field4043.method6688(var12, var6);
                field4045++;
            } else {
                field4041.method5405(var12);
                field4048.method6688(var12, var6);
                field4049++;
            }
        } else if (arg5) {
            var10.method6393();
            field4043.method6688(var10, var6);
            field4049--;
            field4045++;
        }
    }

    @ObfuscatedName("i.a(III)V")
    public static void method329(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class315 var4 = (class315) field4048.method6687(var2);
        if (var4 != null) {
            field4041.method5406(var4);
        }
    }

    @ObfuscatedName("p.m(III)I")
    public static int method41(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2814 != null && Statics.field2814.field4468 == var2 ? Statics.field4250.field4678 * 99 / (Statics.field4250.field4679.length - Statics.field2814.field4019) + 1 : 0;
    }

    @ObfuscatedName("cn.p(ZZB)I")
    public static int method2062(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field4046 + field4045;
        }
        if (arg1) {
            var2 += field4051 + field4049;
        }
        return var2;
    }
}
