package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fg")
public class class162 {

    @ObfuscatedName("fg.k")
    public static int field2631 = 0;

    @ObfuscatedName("fg.n")
    public static class187 field2633 = new class187(4096);

    @ObfuscatedName("fg.t")
    public static int field2641 = 0;

    @ObfuscatedName("fg.e")
    public static class187 field2635 = new class187(32);

    @ObfuscatedName("fg.q")
    public static int field2642 = 0;

    @ObfuscatedName("fg.z")
    public static class194 field2637 = new class194();

    @ObfuscatedName("fg.v")
    public static class187 field2630 = new class187(4096);

    @ObfuscatedName("fg.b")
    public static int field2639 = 0;

    @ObfuscatedName("fg.f")
    public static class187 field2640 = new class187(4096);

    @ObfuscatedName("fg.i")
    public static int field2632 = 0;

    @ObfuscatedName("fg.j")
    public static class111 field2634 = new class111(8);

    @ObfuscatedName("fg.r")
    public static int field2643 = 0;

    @ObfuscatedName("fg.x")
    public static CRC32 field2644 = new CRC32();

    @ObfuscatedName("fg.a")
    public static class159[] field2647 = new class159[256];

    @ObfuscatedName("fg.p")
    public static byte field2646 = 0;

    @ObfuscatedName("fg.c")
    public static int field2638 = 0;

    @ObfuscatedName("fg.u")
    public static int field2650 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gv.y(ZB)V")
    public static void method3528(boolean arg0) {
        if (Statics.field2636 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2145(arg0 ? 2 : 3);
            var1.method2147(0);
            Statics.field2636.method2649(var1.field1897, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2636.method2640();
            } catch (Exception var4) {
            }
            field2650++;
            Statics.field2636 = null;
        }
    }

    @ObfuscatedName("dd.k(Leo;ZI)V")
    public static void method2469(class135 arg0, boolean arg1) {
        if (Statics.field2636 != null) {
            try {
                Statics.field2636.method2640();
            } catch (Exception var10) {
            }
            Statics.field2636 = null;
        }
        Statics.field2636 = arg0;
        method3528(arg1);
        field2634.field1902 = 0;
        Statics.field1532 = null;
        Statics.field651 = null;
        field2643 = 0;
        while (true) {
            class163 var3 = (class163) field2635.method3360();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2640.method3360();
                    if (var4 == null) {
                        if (field2646 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2145(4);
                                var5.method2145(field2646);
                                var5.method2319(0);
                                Statics.field2636.method2649(var5.field1897, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2636.method2640();
                                } catch (Exception var8) {
                                }
                                field2650++;
                                Statics.field2636 = null;
                            }
                        }
                        field2631 = 0;
                        Statics.field2648 = class107.method78();
                        return;
                    }
                    field2637.method3448(var4);
                    field2630.method3358(var4, var4.field3024);
                    field2639++;
                    field2632--;
                }
            }
            field2633.method3358(var3, var3.field3024);
            field2641++;
            field2642--;
        }
    }

    @ObfuscatedName("eg.g(Lfl;II)V")
    public static void method2864(class159 arg0, int arg1) {
        if (Statics.field1969 == null) {
            method2816((class159) null, 255, 255, 0, (byte) 0, true);
            field2647[arg1] = arg0;
        } else {
            Statics.field1969.field1902 = arg1 * 8 + 5;
            int var2 = Statics.field1969.method2165();
            int var3 = Statics.field1969.method2165();
            arg0.method2965(var2, var3);
        }
    }

    @ObfuscatedName("en.n(Lfl;IIIBZB)V")
    public static void method2816(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2633.method3357(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2635.method3357(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2630.method3357(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2640.method3357(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2653 = arg0;
            var12.field2652 = arg3;
            var12.field2654 = arg4;
            if (arg5) {
                field2633.method3358(var12, var6);
                field2641++;
            } else {
                field2637.method3452(var12);
                field2630.method3358(var12, var6);
                field2639++;
            }
        } else if (arg5) {
            var10.method3461();
            field2633.method3358(var10, var6);
            field2639--;
            field2641++;
        }
    }

    @ObfuscatedName("y.t(III)V")
    public static void method5(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class163 var4 = (class163) field2630.method3357(var2);
        if (var4 != null) {
            field2637.method3448(var4);
        }
    }

    @ObfuscatedName("dx.e(III)I")
    public static int method2484(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1532 != null && Statics.field1532.field3024 == var2 ? Statics.field651.field1902 * 99 / (Statics.field651.field1897.length - Statics.field1532.field2654) + 1 : 0;
    }

    @ObfuscatedName("er.q(ZZB)I")
    public static int method2793(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2642 + field2641;
        }
        if (arg1) {
            var2 += field2639 + field2632;
        }
        return var2;
    }

    @ObfuscatedName("dk.z(I)V")
    public static void method2493() {
        if (Statics.field2636 != null) {
            Statics.field2636.method2640();
        }
    }
}
