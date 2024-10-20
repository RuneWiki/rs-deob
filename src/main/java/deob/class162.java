package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fc")
public class class162 {

    @ObfuscatedName("fc.w")
    public static int field2631 = 0;

    @ObfuscatedName("fc.e")
    public static class187 field2633 = new class187(4096);

    @ObfuscatedName("fc.h")
    public static int field2619 = 0;

    @ObfuscatedName("fc.q")
    public static class187 field2620 = new class187(32);

    @ObfuscatedName("fc.l")
    public static int field2622 = 0;

    @ObfuscatedName("fc.c")
    public static class194 field2616 = new class194();

    @ObfuscatedName("fc.f")
    public static class187 field2623 = new class187(4096);

    @ObfuscatedName("fc.s")
    public static int field2625 = 0;

    @ObfuscatedName("fc.m")
    public static class187 field2615 = new class187(4096);

    @ObfuscatedName("fc.y")
    public static int field2626 = 0;

    @ObfuscatedName("fc.z")
    public static class111 field2627 = new class111(8);

    @ObfuscatedName("fc.g")
    public static int field2628 = 0;

    @ObfuscatedName("fc.o")
    public static CRC32 field2630 = new CRC32();

    @ObfuscatedName("fc.p")
    public static class159[] field2618 = new class159[256];

    @ObfuscatedName("fc.t")
    public static byte field2632 = 0;

    @ObfuscatedName("fc.x")
    public static int field2621 = 0;

    @ObfuscatedName("fc.d")
    public static int field2635 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.n(ZB)V")
    public static void method794(boolean arg0) {
        if (Statics.field2634 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2140(arg0 ? 2 : 3);
            var1.method2273(0);
            Statics.field2634.method2648(var1.field1886, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2634.method2661();
            } catch (Exception var4) {
            }
            field2635++;
            Statics.field2634 = null;
        }
    }

    @ObfuscatedName("bw.w(Lel;ZI)V")
    public static void method1096(class135 arg0, boolean arg1) {
        if (Statics.field2634 != null) {
            try {
                Statics.field2634.method2661();
            } catch (Exception var10) {
            }
            Statics.field2634 = null;
        }
        Statics.field2634 = arg0;
        method794(arg1);
        field2627.field1888 = 0;
        Statics.field3052 = null;
        Statics.field3026 = null;
        field2628 = 0;
        while (true) {
            class163 var3 = (class163) field2620.method3345();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2615.method3345();
                    if (var4 == null) {
                        if (field2632 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2140(4);
                                var5.method2140(field2632);
                                var5.method2322(0);
                                Statics.field2634.method2648(var5.field1886, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2634.method2661();
                                } catch (Exception var8) {
                                }
                                field2635++;
                                Statics.field2634 = null;
                            }
                        }
                        field2631 = 0;
                        Statics.field2617 = class107.method2784();
                        return;
                    }
                    field2616.method3435(var4);
                    field2623.method3346(var4, var4.field3013);
                    field2625++;
                    field2626--;
                }
            }
            field2633.method3346(var3, var3.field3013);
            field2619++;
            field2622--;
        }
    }

    @ObfuscatedName("ai.i(Lfi;II)V")
    public static void method853(class159 arg0, int arg1) {
        if (Statics.field2115 == null) {
            method1441((class159) null, 255, 255, 0, (byte) 0, true);
            field2618[arg1] = arg0;
        } else {
            Statics.field2115.field1888 = arg1 * 8 + 5;
            int var2 = Statics.field2115.method2160();
            int var3 = Statics.field2115.method2160();
            arg0.method2929(var2, var3);
        }
    }

    @ObfuscatedName("bx.e(Lfi;IIIBZI)V")
    public static void method1441(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2633.method3354(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2620.method3354(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2623.method3354(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2615.method3354(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2637 = arg0;
            var12.field2638 = arg3;
            var12.field2639 = arg4;
            if (arg5) {
                field2633.method3346(var12, var6);
                field2619++;
            } else {
                field2616.method3436(var12);
                field2623.method3346(var12, var6);
                field2625++;
            }
        } else if (arg5) {
            var10.method3450();
            field2633.method3346(var10, var6);
            field2625--;
            field2619++;
        }
    }

    @ObfuscatedName("ac.h(III)I")
    public static int method776(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3052 != null && Statics.field3052.field3013 == var2 ? Statics.field3026.field1888 * 99 / (Statics.field3026.field1886.length - Statics.field3052.field2639) + 1 : 0;
    }

    @ObfuscatedName("cz.q(ZZI)I")
    public static int method1892(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2622 + field2619;
        }
        if (arg1) {
            var2 += field2626 + field2625;
        }
        return var2;
    }

    @ObfuscatedName("i.l(S)V")
    public static void method26() {
        if (Statics.field2634 != null) {
            Statics.field2634.method2661();
        }
    }
}
