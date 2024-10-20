package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("jx")
public class class276 {

    @ObfuscatedName("jx.n")
    public static int field3602 = 0;

    @ObfuscatedName("jx.y")
    public static class362 field3603 = new class362(4096);

    @ObfuscatedName("jx.p")
    public static int field3604 = 0;

    @ObfuscatedName("jx.j")
    public static class362 field3615 = new class362(32);

    @ObfuscatedName("jx.r")
    public static int field3616 = 0;

    @ObfuscatedName("jx.b")
    public static class293 field3610 = new class293();

    @ObfuscatedName("jx.d")
    public static class362 field3617 = new class362(4096);

    @ObfuscatedName("jx.s")
    public static int field3609 = 0;

    @ObfuscatedName("jx.u")
    public static class362 field3605 = new class362(4096);

    @ObfuscatedName("jx.l")
    public static int field3611 = 0;

    @ObfuscatedName("jx.e")
    public static class383 field3612 = new class383(8);

    @ObfuscatedName("jx.a")
    public static int field3613 = 0;

    @ObfuscatedName("jx.m")
    public static CRC32 field3606 = new CRC32();

    @ObfuscatedName("jx.z")
    public static class273[] field3601 = new class273[256];

    @ObfuscatedName("jx.w")
    public static byte field3608 = 0;

    @ObfuscatedName("jx.t")
    public static int field3614 = 0;

    @ObfuscatedName("jx.h")
    public static int field3618 = 0;

    public class276() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jd.v(ZB)V")
    public static void method4405(boolean arg0) {
        if (Statics.field3607 == null) {
            return;
        }
        try {
            class383 var1 = new class383(4);
            var1.method6043(arg0 ? 2 : 3);
            var1.method5950(0);
            Statics.field3607.method2333(var1.field4155, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3607.method2357();
            } catch (Exception var4) {
            }
            field3618++;
            Statics.field3607 = null;
        }
    }

    @ObfuscatedName("fn.n(Ljp;II)V")
    public static void method3330(class273 arg0, int arg1) {
        if (Statics.field1476 == null) {
            method4384((class273) null, 255, 255, 0, (byte) 0, true);
            field3601[arg1] = arg0;
        } else {
            Statics.field1476.field4158 = arg1 * 8 + 5;
            int var2 = Statics.field1476.method5970();
            int var3 = Statics.field1476.method5970();
            arg0.method4425(var2, var3);
        }
    }

    @ObfuscatedName("if.f(Ljp;IIIBZB)V")
    public static void method4384(class273 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class274 var8 = (class274) field3603.method5766(var6);
        if (var8 != null) {
            return;
        }
        class274 var9 = (class274) field3615.method5766(var6);
        if (var9 != null) {
            return;
        }
        class274 var10 = (class274) field3617.method5766(var6);
        if (var10 == null) {
            if (!arg5) {
                class274 var11 = (class274) field3605.method5766(var6);
                if (var11 != null) {
                    return;
                }
            }
            class274 var12 = new class274();
            var12.field3581 = arg0;
            var12.field3582 = arg3;
            var12.field3580 = arg4;
            if (arg5) {
                field3603.method5768(var12, var6);
                field3604++;
            } else {
                field3610.method4700(var12);
                field3617.method5768(var12, var6);
                field3609++;
            }
        } else if (arg5) {
            var10.method5487();
            field3603.method5768(var10, var6);
            field3609--;
            field3604++;
        }
    }

    @ObfuscatedName("jb.y(IIS)V")
    public static void method4615(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class274 var4 = (class274) field3617.method5766(var2);
        if (var4 != null) {
            field3610.method4699(var4);
        }
    }

    @ObfuscatedName("dq.p(IIB)I")
    public static int method2281(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1462 != null && Statics.field1462.field3938 == var2 ? Statics.field457.field4158 * 99 / (Statics.field457.field4155.length - Statics.field1462.field3580) + 1 : 0;
    }

    @ObfuscatedName("ej.j(I)V")
    public static void method2438() {
        if (Statics.field3607 != null) {
            Statics.field3607.method2357();
        }
    }
}
