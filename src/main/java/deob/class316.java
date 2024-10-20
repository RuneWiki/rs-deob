package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("lt")
public class class316 {

    @ObfuscatedName("lt.v")
    public static int field4016 = 0;

    @ObfuscatedName("lt.f")
    public static class420 field4018 = new class420(4096);

    @ObfuscatedName("lt.j")
    public static int field4019 = 0;

    @ObfuscatedName("lt.e")
    public static class420 field4020 = new class420(32);

    @ObfuscatedName("lt.g")
    public static int field4031 = 0;

    @ObfuscatedName("lt.w")
    public static class333 field4021 = new class333();

    @ObfuscatedName("lt.y")
    public static class420 field4023 = new class420(4096);

    @ObfuscatedName("lt.i")
    public static int field4024 = 0;

    @ObfuscatedName("lt.s")
    public static class420 field4022 = new class420(4096);

    @ObfuscatedName("lt.t")
    public static int field4026 = 0;

    @ObfuscatedName("lt.u")
    public static class443 field4017 = new class443(8);

    @ObfuscatedName("lt.h")
    public static int field4028 = 0;

    @ObfuscatedName("lt.l")
    public static CRC32 field4015 = new CRC32();

    @ObfuscatedName("lt.p")
    public static class313[] field4036 = new class313[256];

    @ObfuscatedName("lt.b")
    public static int field4032 = -1;

    @ObfuscatedName("lt.n")
    public static int field4033 = 255;

    @ObfuscatedName("lt.o")
    public static byte field4034 = 0;

    @ObfuscatedName("lt.m")
    public static int field4035 = 0;

    @ObfuscatedName("lt.d")
    public static int field4027 = 0;

    public class316() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.c(ZB)V")
    public static void method2568(boolean arg0) {
        if (Statics.field4025 == null) {
            return;
        }
        try {
            class443 var1 = new class443(4);
            var1.method7031(arg0 ? 2 : 3);
            var1.method7033(0);
            Statics.field4025.method6210(var1.field4701, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field4025.method6196();
            } catch (Exception var4) {
            }
            field4027++;
            Statics.field4025 = null;
        }
    }

    @ObfuscatedName("cu.v(Llc;II)V")
    public static void method2288(class313 arg0, int arg1) {
        if (arg0.field3991) {
            if (arg1 <= field4032) {
                throw new RuntimeException("");
            }
            if (arg1 < field4033) {
                field4033 = arg1;
            }
        } else if (arg1 >= field4033) {
            throw new RuntimeException("");
        } else if (arg1 > field4032) {
            field4032 = arg1;
        }
        if (Statics.field1863 == null) {
            method2838((class313) null, 255, 255, 0, (byte) 0, true);
            field4036[arg1] = arg0;
        } else {
            method4985(arg0, arg1);
        }
    }

    @ObfuscatedName("jr.q(Llc;IB)V")
    public static void method4985(class313 arg0, int arg1) {
        Statics.field1863.field4700 = arg1 * 8 + 5;
        if (Statics.field1863.field4700 < Statics.field1863.field4701.length) {
            int var2 = Statics.field1863.method7052();
            int var3 = Statics.field1863.method7052();
            arg0.method5255(var2, var3);
        } else if (arg0.field3991) {
            arg0.method5277();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ex.f(Llc;IIIBZB)V")
    public static void method2838(class313 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class314 var8 = (class314) field4018.method6765(var6);
        if (var8 != null) {
            return;
        }
        class314 var9 = (class314) field4020.method6765(var6);
        if (var9 != null) {
            return;
        }
        class314 var10 = (class314) field4023.method6765(var6);
        if (var10 == null) {
            if (!arg5) {
                class314 var11 = (class314) field4022.method6765(var6);
                if (var11 != null) {
                    return;
                }
            }
            class314 var12 = new class314();
            var12.field3993 = arg0;
            var12.field3996 = arg3;
            var12.field3994 = arg4;
            if (arg5) {
                field4018.method6774(var12, var6);
                field4019++;
            } else {
                field4021.method5521(var12);
                field4023.method6774(var12, var6);
                field4024++;
            }
        } else if (arg5) {
            var10.method6493();
            field4018.method6774(var10, var6);
            field4024--;
            field4019++;
        }
    }

    @ObfuscatedName("ct.e(ZZI)I")
    public static int method2432(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field4031 + field4019;
        }
        if (arg1) {
            var2 += field4026 + field4024;
        }
        return var2;
    }
}
