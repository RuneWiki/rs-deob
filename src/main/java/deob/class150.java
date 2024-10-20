package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class150 {

    @ObfuscatedName("eo.v")
    public static int field2484 = 0;

    @ObfuscatedName("eo.g")
    public static class174 field2495 = new class174(4096);

    @ObfuscatedName("eo.x")
    public static int field2487 = 0;

    @ObfuscatedName("eo.b")
    public static class174 field2497 = new class174(32);

    @ObfuscatedName("eo.q")
    public static int field2489 = 0;

    @ObfuscatedName("eo.l")
    public static class181 field2490 = new class181();

    @ObfuscatedName("eo.m")
    public static class174 field2491 = new class174(4096);

    @ObfuscatedName("eo.u")
    public static int field2492 = 0;

    @ObfuscatedName("eo.s")
    public static class174 field2485 = new class174(4096);

    @ObfuscatedName("eo.f")
    public static int field2499 = 0;

    @ObfuscatedName("eo.y")
    public static class107 field2502 = new class107(8);

    @ObfuscatedName("eo.j")
    public static int field2483 = 0;

    @ObfuscatedName("eo.d")
    public static CRC32 field2493 = new CRC32();

    @ObfuscatedName("eo.o")
    public static class147[] field2498 = new class147[256];

    @ObfuscatedName("eo.r")
    public static byte field2488 = 0;

    @ObfuscatedName("eo.t")
    public static int field2500 = 0;

    @ObfuscatedName("eo.k")
    public static int field2501 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.e(ZI)V")
    public static void method556(boolean arg0) {
        if (Statics.field2496 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2102(arg0 ? 2 : 3);
            var1.method2217(0);
            Statics.field2496.method2556(var1.field1849, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2496.method2571();
            } catch (Exception var4) {
            }
            field2501++;
            Statics.field2496 = null;
        }
    }

    @ObfuscatedName("ey.i(III)V")
    public static void method2786(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2491.method3171(var2);
        if (var4 != null) {
            field2490.method3239(var4);
        }
    }

    @ObfuscatedName("ee.g(ZZB)I")
    public static int method2808(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2489 + field2487;
        }
        if (arg1) {
            var2 += field2499 + field2492;
        }
        return var2;
    }

    @ObfuscatedName("bz.x(I)V")
    public static void method1368() {
        if (Statics.field2496 != null) {
            Statics.field2496.method2571();
        }
    }
}
