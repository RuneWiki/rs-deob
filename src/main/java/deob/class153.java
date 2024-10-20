package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ee")
public class class153 {

    @ObfuscatedName("ee.j")
    public static int field2506 = 0;

    @ObfuscatedName("ee.r")
    public static class177 field2503 = new class177(4096);

    @ObfuscatedName("ee.f")
    public static int field2518 = 0;

    @ObfuscatedName("ee.l")
    public static class177 field2504 = new class177(32);

    @ObfuscatedName("ee.b")
    public static int field2501 = 0;

    @ObfuscatedName("ee.k")
    public static class184 field2515 = new class184();

    @ObfuscatedName("ee.g")
    public static class177 field2507 = new class177(4096);

    @ObfuscatedName("ee.v")
    public static int field2508 = 0;

    @ObfuscatedName("ee.i")
    public static class177 field2521 = new class177(4096);

    @ObfuscatedName("ee.x")
    public static int field2510 = 0;

    @ObfuscatedName("ee.s")
    public static class108 field2512 = new class108(8);

    @ObfuscatedName("ee.z")
    public static int field2500 = 0;

    @ObfuscatedName("ee.u")
    public static CRC32 field2520 = new CRC32();

    @ObfuscatedName("ee.d")
    public static class150[] field2514 = new class150[256];

    @ObfuscatedName("ee.m")
    public static byte field2517 = 0;

    @ObfuscatedName("ee.q")
    public static int field2505 = 0;

    @ObfuscatedName("ee.e")
    public static int field2519 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.c(ZB)V")
    public static void method1802(boolean arg0) {
        if (Statics.field2509 == null) {
            return;
        }
        try {
            class108 var1 = new class108(4);
            var1.method2120(arg0 ? 2 : 3);
            var1.method2152(0);
            Statics.field2509.method2618(var1.field1830, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2509.method2601();
            } catch (Exception var4) {
            }
            field2519++;
            Statics.field2509 = null;
        }
    }

    @ObfuscatedName("et.j(Leo;IIIBZI)V")
    public static void method2725(class150 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2503.method3206(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2504.method3206(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2507.method3206(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2521.method3206(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2524 = arg0;
            var12.field2523 = arg3;
            var12.field2522 = arg4;
            if (arg5) {
                field2503.method3207(var12, var6);
                field2518++;
            } else {
                field2515.method3296(var12);
                field2507.method3207(var12, var6);
                field2508++;
            }
        } else if (arg5) {
            var10.method3310();
            field2503.method3207(var10, var6);
            field2508--;
            field2518++;
        }
    }

    @ObfuscatedName("cn.y(III)V")
    public static void method2061(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class154 var4 = (class154) field2507.method3206(var2);
        if (var4 != null) {
            field2515.method3297(var4);
        }
    }

    @ObfuscatedName("cr.r(I)V")
    public static void method1978() {
        if (Statics.field2509 != null) {
            Statics.field2509.method2601();
        }
    }
}
