package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("el")
public class class153 {

    @ObfuscatedName("el.y")
    public static int field2497 = 0;

    @ObfuscatedName("el.j")
    public static class177 field2485 = new class177(4096);

    @ObfuscatedName("el.w")
    public static int field2492 = 0;

    @ObfuscatedName("el.c")
    public static class177 field2489 = new class177(32);

    @ObfuscatedName("el.x")
    public static int field2490 = 0;

    @ObfuscatedName("el.f")
    public static class184 field2491 = new class184();

    @ObfuscatedName("el.t")
    public static class177 field2488 = new class177(4096);

    @ObfuscatedName("el.n")
    public static int field2493 = 0;

    @ObfuscatedName("el.p")
    public static class177 field2494 = new class177(4096);

    @ObfuscatedName("el.a")
    public static int field2502 = 0;

    @ObfuscatedName("el.r")
    public static class108 field2496 = new class108(8);

    @ObfuscatedName("el.u")
    public static int field2495 = 0;

    @ObfuscatedName("el.i")
    public static CRC32 field2498 = new CRC32();

    @ObfuscatedName("el.h")
    public static class150[] field2499 = new class150[256];

    @ObfuscatedName("el.k")
    public static byte field2487 = 0;

    @ObfuscatedName("el.v")
    public static int field2501 = 0;

    @ObfuscatedName("el.m")
    public static int field2500 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.l(ZI)V")
    public static void method795(boolean arg0) {
        if (Statics.field1441 == null) {
            return;
        }
        try {
            class108 var1 = new class108(4);
            var1.method2226(arg0 ? 2 : 3);
            var1.method2149(0);
            Statics.field1441.method2593(var1.field1828, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field1441.method2599();
            } catch (Exception var4) {
            }
            field2500++;
            Statics.field1441 = null;
        }
    }

    @ObfuscatedName("dk.g(Lex;IIIBZI)V")
    public static void method2342(class150 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2485.method3254(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2489.method3254(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2488.method3254(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2494.method3254(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2515 = arg0;
            var12.field2505 = arg3;
            var12.field2507 = arg4;
            if (arg5) {
                field2485.method3260(var12, var6);
                field2492++;
            } else {
                field2491.method3335(var12);
                field2488.method3260(var12, var6);
                field2493++;
            }
        } else if (arg5) {
            var10.method3349();
            field2485.method3260(var10, var6);
            field2493--;
            field2492++;
        }
    }

    @ObfuscatedName("p.j(III)V")
    public static void method140(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class154 var4 = (class154) field2488.method3254(var2);
        if (var4 != null) {
            field2491.method3336(var4);
        }
    }

    @ObfuscatedName("ev.w(IIB)I")
    public static int method2592(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field564 != null && Statics.field564.field2886 == var2 ? Statics.field1877.field1823 * 99 / (Statics.field1877.field1828.length - Statics.field564.field2507) + 1 : 0;
    }

    @ObfuscatedName("es.c(ZZI)I")
    public static int method2728(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2492 + field2490;
        }
        if (arg1) {
            var2 += field2502 + field2493;
        }
        return var2;
    }

    @ObfuscatedName("de.x(B)V")
    public static void method2442() {
        if (Statics.field1441 != null) {
            Statics.field1441.method2599();
        }
    }
}
