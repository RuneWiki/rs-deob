package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iq")
public class class251 {

    @ObfuscatedName("iq.m")
    public static int field3210 = 0;

    @ObfuscatedName("iq.b")
    public static class203 field3212 = new class203(4096);

    @ObfuscatedName("iq.f")
    public static int field3213 = 0;

    @ObfuscatedName("iq.n")
    public static class203 field3214 = new class203(32);

    @ObfuscatedName("iq.h")
    public static int field3215 = 0;

    @ObfuscatedName("iq.x")
    public static class195 field3216 = new class195();

    @ObfuscatedName("iq.j")
    public static class203 field3217 = new class203(4096);

    @ObfuscatedName("iq.a")
    public static int field3220 = 0;

    @ObfuscatedName("iq.l")
    public static class203 field3223 = new class203(4096);

    @ObfuscatedName("iq.d")
    public static int field3211 = 0;

    @ObfuscatedName("iq.g")
    public static class183 field3209 = new class183(8);

    @ObfuscatedName("iq.c")
    public static int field3222 = 0;

    @ObfuscatedName("iq.t")
    public static CRC32 field3219 = new CRC32();

    @ObfuscatedName("iq.i")
    public static class250[] field3225 = new class250[256];

    @ObfuscatedName("iq.z")
    public static byte field3226 = 0;

    @ObfuscatedName("iq.k")
    public static int field3227 = 0;

    @ObfuscatedName("iq.r")
    public static int field3228 = 0;

    public class251() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.m(ZI)V")
    public static void method140(boolean arg0) {
        if (Statics.field3218 == null) {
            return;
        }
        try {
            class183 var1 = new class183(4);
            var1.method3246(arg0 ? 2 : 3);
            var1.method3248(0);
            Statics.field3218.method3042(var1.field2366, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3218.method3043();
            } catch (Exception var4) {
            }
            field3228++;
            Statics.field3218 = null;
        }
    }

    @ObfuscatedName("ea.q(Lic;II)V")
    public static void method3001(class250 arg0, int arg1) {
        if (Statics.field3925 == null) {
            Statics.method625((class250) null, 255, 255, 0, (byte) 0, true);
            field3225[arg1] = arg0;
        } else {
            Statics.field3925.field2360 = arg1 * 8 + 5;
            int var2 = Statics.field3925.method3267();
            int var3 = Statics.field3925.method3267();
            arg0.method4360(var2, var3);
        }
    }

    @ObfuscatedName("aw.j(III)V")
    public static void method540(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class247 var4 = (class247) field3217.method3748(var2);
        if (var4 != null) {
            field3216.method3649(var4);
        }
    }

    @ObfuscatedName("j.a(IIB)I")
    public static int method92(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3817 != null && Statics.field3817.field2450 == var2 ? Statics.field2772.field2360 * 99 / (Statics.field2772.field2366.length - Statics.field3817.field3170) + 1 : 0;
    }

    @ObfuscatedName("dw.l(ZZI)I")
    public static int method2367(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3215 + field3213;
        }
        if (arg1) {
            var2 += field3220 + field3211;
        }
        return var2;
    }
}
