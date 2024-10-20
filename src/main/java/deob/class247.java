package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("it")
public class class247 {

    @ObfuscatedName("it.o")
    public static int field3198 = 0;

    @ObfuscatedName("it.j")
    public static class328 field3199 = new class328(4096);

    @ObfuscatedName("it.p")
    public static int field3201 = 0;

    @ObfuscatedName("it.g")
    public static class328 field3202 = new class328(32);

    @ObfuscatedName("it.n")
    public static int field3203 = 0;

    @ObfuscatedName("it.u")
    public static class270 field3204 = new class270();

    @ObfuscatedName("it.a")
    public static class328 field3205 = new class328(4096);

    @ObfuscatedName("it.z")
    public static int field3200 = 0;

    @ObfuscatedName("it.w")
    public static class328 field3207 = new class328(4096);

    @ObfuscatedName("it.y")
    public static int field3206 = 0;

    @ObfuscatedName("it.k")
    public static class310 field3210 = new class310(8);

    @ObfuscatedName("it.s")
    public static int field3215 = 0;

    @ObfuscatedName("it.d")
    public static CRC32 field3212 = new CRC32();

    @ObfuscatedName("it.l")
    public static class246[] field3213 = new class246[256];

    @ObfuscatedName("it.t")
    public static byte field3214 = 0;

    @ObfuscatedName("it.x")
    public static int field3208 = 0;

    @ObfuscatedName("it.b")
    public static int field3216 = 0;

    public class247() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.m(ZI)V")
    public static void method547(boolean arg0) {
        if (Statics.field3211 == null) {
            return;
        }
        try {
            class310 var1 = new class310(4);
            var1.method5437(arg0 ? 2 : 3);
            var1.method5402(0);
            Statics.field3211.method3304(var1.field3736, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3211.method3322();
            } catch (Exception var4) {
            }
            field3216++;
            Statics.field3211 = null;
        }
    }

    @ObfuscatedName("hm.o(Lig;II)V")
    public static void method3590(class246 arg0, int arg1) {
        if (Statics.field1994 == null) {
            method694((class246) null, 255, 255, 0, (byte) 0, true);
            field3213[arg1] = arg0;
        } else {
            Statics.field1994.field3734 = arg1 * 8 + 5;
            int var2 = Statics.field1994.method5209();
            int var3 = Statics.field1994.method5209();
            arg0.method4017(var2, var3);
        }
    }

    @ObfuscatedName("au.q(Lig;IIIBZI)V")
    public static void method694(class246 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class243 var8 = (class243) field3199.method5641(var6);
        if (var8 != null) {
            return;
        }
        class243 var9 = (class243) field3202.method5641(var6);
        if (var9 != null) {
            return;
        }
        class243 var10 = (class243) field3205.method5641(var6);
        if (var10 == null) {
            if (!arg5) {
                class243 var11 = (class243) field3207.method5641(var6);
                if (var11 != null) {
                    return;
                }
            }
            class243 var12 = new class243();
            var12.field3155 = arg0;
            var12.field3158 = arg3;
            var12.field3157 = arg4;
            if (arg5) {
                field3199.method5643(var12, var6);
                field3201++;
            } else {
                field3204.method4561(var12);
                field3205.method5643(var12, var6);
                field3200++;
            }
        } else if (arg5) {
            var10.method3379();
            field3199.method5643(var10, var6);
            field3200--;
            field3201++;
        }
    }

    @ObfuscatedName("ge.j(ZZI)I")
    public static int method3451(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3203 + field3201;
        }
        if (arg1) {
            var2 += field3206 + field3200;
        }
        return var2;
    }

    @ObfuscatedName("ae.p(I)V")
    public static void method278() {
        if (Statics.field3211 != null) {
            Statics.field3211.method3322();
        }
    }
}
