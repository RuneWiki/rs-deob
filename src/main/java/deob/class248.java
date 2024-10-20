package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("im")
public class class248 {

    @ObfuscatedName("im.v")
    public static int field3209 = 0;

    @ObfuscatedName("im.w")
    public static class329 field3197 = new class329(4096);

    @ObfuscatedName("im.t")
    public static int field3194 = 0;

    @ObfuscatedName("im.j")
    public static class329 field3199 = new class329(32);

    @ObfuscatedName("im.n")
    public static int field3200 = 0;

    @ObfuscatedName("im.p")
    public static class271 field3201 = new class271();

    @ObfuscatedName("im.l")
    public static class329 field3202 = new class329(4096);

    @ObfuscatedName("im.z")
    public static int field3212 = 0;

    @ObfuscatedName("im.u")
    public static class329 field3204 = new class329(4096);

    @ObfuscatedName("im.e")
    public static int field3206 = 0;

    @ObfuscatedName("im.i")
    public static class311 field3207 = new class311(8);

    @ObfuscatedName("im.a")
    public static int field3208 = 0;

    @ObfuscatedName("im.y")
    public static CRC32 field3198 = new CRC32();

    @ObfuscatedName("im.q")
    public static class247[] field3210 = new class247[256];

    @ObfuscatedName("im.g")
    public static byte field3211 = 0;

    @ObfuscatedName("im.s")
    public static int field3205 = 0;

    @ObfuscatedName("im.o")
    public static int field3213 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.h(ZI)V")
    public static void method2372(boolean arg0) {
        if (Statics.field3195 == null) {
            return;
        }
        try {
            class311 var1 = new class311(4);
            var1.method5095(arg0 ? 2 : 3);
            var1.method5100(0);
            Statics.field3195.method3307(var1.field3753, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3195.method3288();
            } catch (Exception var4) {
            }
            field3213++;
            Statics.field3195 = null;
        }
    }

    @ObfuscatedName("he.v(Lil;IIIBZI)V")
    public static void method3768(class247 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class244 var8 = (class244) field3197.method5543(var6);
        if (var8 != null) {
            return;
        }
        class244 var9 = (class244) field3199.method5543(var6);
        if (var9 != null) {
            return;
        }
        class244 var10 = (class244) field3202.method5543(var6);
        if (var10 == null) {
            if (!arg5) {
                class244 var11 = (class244) field3204.method5543(var6);
                if (var11 != null) {
                    return;
                }
            }
            class244 var12 = new class244();
            var12.field3155 = arg0;
            var12.field3153 = arg3;
            var12.field3154 = arg4;
            if (arg5) {
                field3197.method5531(var12, var6);
                field3194++;
            } else {
                field3201.method4453(var12);
                field3202.method5531(var12, var6);
                field3212++;
            }
        } else if (arg5) {
            var10.method3353();
            field3197.method5531(var10, var6);
            field3212--;
            field3194++;
        }
    }

    @ObfuscatedName("client.x(I)V")
    public static void method1444() {
        if (Statics.field3195 != null) {
            Statics.field3195.method3288();
        }
    }
}
