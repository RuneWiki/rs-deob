package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ff")
public class class165 {

    @ObfuscatedName("ff.y")
    public static int field2637 = 0;

    @ObfuscatedName("ff.l")
    public static class190 field2640 = new class190(4096);

    @ObfuscatedName("ff.w")
    public static int field2641 = 0;

    @ObfuscatedName("ff.d")
    public static class190 field2653 = new class190(32);

    @ObfuscatedName("ff.f")
    public static int field2638 = 0;

    @ObfuscatedName("ff.i")
    public static class197 field2644 = new class197();

    @ObfuscatedName("ff.a")
    public static class190 field2651 = new class190(4096);

    @ObfuscatedName("ff.o")
    public static int field2646 = 0;

    @ObfuscatedName("ff.u")
    public static class190 field2647 = new class190(4096);

    @ObfuscatedName("ff.m")
    public static int field2648 = 0;

    @ObfuscatedName("ff.r")
    public static class114 field2649 = new class114(8);

    @ObfuscatedName("ff.g")
    public static int field2650 = 0;

    @ObfuscatedName("ff.n")
    public static CRC32 field2642 = new CRC32();

    @ObfuscatedName("ff.p")
    public static class162[] field2652 = new class162[256];

    @ObfuscatedName("ff.c")
    public static byte field2656 = 0;

    @ObfuscatedName("ff.x")
    public static int field2654 = 0;

    @ObfuscatedName("ff.q")
    public static int field2643 = 0;

    public class165() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.j(ZB)V")
    public static void method2766(boolean arg0) {
        if (Statics.field2655 == null) {
            return;
        }
        try {
            class114 var1 = new class114(4);
            var1.method2307(arg0 ? 2 : 3);
            var1.method2309(0);
            Statics.field2655.method2779(var1.field1891, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2655.method2781();
            } catch (Exception var4) {
            }
            field2643++;
            Statics.field2655 = null;
        }
    }

    @ObfuscatedName("ag.y(Lel;ZB)V")
    public static void method697(class138 arg0, boolean arg1) {
        if (Statics.field2655 != null) {
            try {
                Statics.field2655.method2781();
            } catch (Exception var10) {
            }
            Statics.field2655 = null;
        }
        Statics.field2655 = arg0;
        method2766(arg1);
        field2649.field1894 = 0;
        Statics.field1509 = null;
        Statics.field1921 = null;
        field2650 = 0;
        while (true) {
            class166 var3 = (class166) field2653.method3462();
            if (var3 == null) {
                while (true) {
                    class166 var4 = (class166) field2647.method3462();
                    if (var4 == null) {
                        if (field2656 != 0) {
                            try {
                                class114 var5 = new class114(4);
                                var5.method2307(4);
                                var5.method2307(field2656);
                                var5.method2367(0);
                                Statics.field2655.method2779(var5.field1891, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2655.method2781();
                                } catch (Exception var8) {
                                }
                                field2643++;
                                Statics.field2655 = null;
                            }
                        }
                        field2637 = 0;
                        Statics.field2639 = Statics.method2875();
                        return;
                    }
                    field2644.method3534(var4);
                    field2651.method3463(var4, var4.field3043);
                    field2646++;
                    field2648--;
                }
            }
            field2640.method3463(var3, var3.field3043);
            field2641++;
            field2638--;
        }
    }

    @ObfuscatedName("di.z(Lfc;II)V")
    public static void method2637(class162 arg0, int arg1) {
        if (Statics.field19 == null) {
            method3421((class162) null, 255, 255, 0, (byte) 0, true);
            field2652[arg1] = arg0;
        } else {
            Statics.field19.field1894 = arg1 * 8 + 5;
            int var2 = Statics.field19.method2327();
            int var3 = Statics.field19.method2327();
            arg0.method3063(var2, var3);
        }
    }

    @ObfuscatedName("fs.l(Lfc;IIIBZB)V")
    public static void method3421(class162 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class166 var8 = (class166) field2640.method3459(var6);
        if (var8 != null) {
            return;
        }
        class166 var9 = (class166) field2653.method3459(var6);
        if (var9 != null) {
            return;
        }
        class166 var10 = (class166) field2651.method3459(var6);
        if (var10 == null) {
            if (!arg5) {
                class166 var11 = (class166) field2647.method3459(var6);
                if (var11 != null) {
                    return;
                }
            }
            class166 var12 = new class166();
            var12.field2663 = arg0;
            var12.field2658 = arg3;
            var12.field2662 = arg4;
            if (arg5) {
                field2640.method3463(var12, var6);
                field2641++;
            } else {
                field2644.method3535(var12);
                field2651.method3463(var12, var6);
                field2646++;
            }
        } else if (arg5) {
            var10.method3552();
            field2640.method3463(var10, var6);
            field2646--;
            field2641++;
        }
    }

    @ObfuscatedName("ap.d(I)V")
    public static void method694() {
        if (Statics.field2655 != null) {
            Statics.field2655.method2781();
        }
    }
}
