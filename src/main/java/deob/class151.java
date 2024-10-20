package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("es")
public class class151 {

    @ObfuscatedName("es.j")
    public static int field2477 = 0;

    @ObfuscatedName("es.y")
    public static class173 field2470 = new class173(4096);

    @ObfuscatedName("es.x")
    public static int field2471 = 0;

    @ObfuscatedName("es.e")
    public static class173 field2478 = new class173(32);

    @ObfuscatedName("es.m")
    public static int field2479 = 0;

    @ObfuscatedName("es.s")
    public static class170 field2474 = new class170();

    @ObfuscatedName("es.p")
    public static class173 field2475 = new class173(4096);

    @ObfuscatedName("es.w")
    public static int field2473 = 0;

    @ObfuscatedName("es.r")
    public static class173 field2469 = new class173(4096);

    @ObfuscatedName("es.n")
    public static int field2476 = 0;

    @ObfuscatedName("es.h")
    public static class125 field2480 = new class125(8);

    @ObfuscatedName("es.l")
    public static int field2481 = 0;

    @ObfuscatedName("es.g")
    public static CRC32 field2483 = new CRC32();

    @ObfuscatedName("es.v")
    public static class152[] field2472 = new class152[256];

    @ObfuscatedName("es.i")
    public static byte field2485 = 0;

    @ObfuscatedName("es.k")
    public static int field2486 = 0;

    @ObfuscatedName("es.o")
    public static int field2487 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.c(ZI)V")
    public static void method1274(boolean arg0) {
        if (Statics.field2484 == null) {
            return;
        }
        try {
            class125 var1 = new class125(4);
            var1.method2339(arg0 ? 2 : 3);
            var1.method2332(0);
            Statics.field2484.method1328(var1.field2002, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2484.method1340();
            } catch (Exception var4) {
            }
            field2487++;
            Statics.field2484 = null;
        }
    }

    @ObfuscatedName("u.j(Lem;IB)V")
    public static void method245(class152 arg0, int arg1) {
        if (Statics.field97 == null) {
            method25((class152) null, 255, 255, 0, (byte) 0, true);
            field2472[arg1] = arg0;
        } else {
            Statics.field97.field2003 = arg1 * 8 + 5;
            int var2 = Statics.field97.method2489();
            int var3 = Statics.field97.method2489();
            arg0.method2905(var2, var3);
        }
    }

    @ObfuscatedName("y.f(Lem;IIIBZI)V")
    public static void method25(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class153 var8 = (class153) field2470.method3129(var6);
        if (var8 != null) {
            return;
        }
        class153 var9 = (class153) field2478.method3129(var6);
        if (var9 != null) {
            return;
        }
        class153 var10 = (class153) field2475.method3129(var6);
        if (var10 == null) {
            if (!arg5) {
                class153 var11 = (class153) field2469.method3129(var6);
                if (var11 != null) {
                    return;
                }
            }
            class153 var12 = new class153();
            var12.field2501 = arg0;
            var12.field2502 = arg3;
            var12.field2500 = arg4;
            if (arg5) {
                field2470.method3137(var12, var6);
                field2471++;
            } else {
                field2474.method3108(var12);
                field2475.method3137(var12, var6);
                field2473++;
            }
        } else if (arg5) {
            var10.method3127();
            field2470.method3137(var10, var6);
            field2473--;
            field2471++;
        }
    }

    @ObfuscatedName("by.y(IIS)V")
    public static void method1440(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class153 var4 = (class153) field2475.method3129(var2);
        if (var4 != null) {
            field2474.method3103(var4);
        }
    }

    @ObfuscatedName("ca.x(ZZI)I")
    public static int method1758(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2479 + field2471;
        }
        if (arg1) {
            var2 += field2476 + field2473;
        }
        return var2;
    }

    @ObfuscatedName("es.e(B)V")
    public static void method2902() {
        if (Statics.field2484 != null) {
            Statics.field2484.method1340();
        }
    }
}
