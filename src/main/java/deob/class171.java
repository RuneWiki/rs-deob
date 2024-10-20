package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fe")
public class class171 {

    @ObfuscatedName("fe.e")
    public static int field2723 = 0;

    @ObfuscatedName("fe.b")
    public static class196 field2724 = new class196(4096);

    @ObfuscatedName("fe.p")
    public static int field2734 = 0;

    @ObfuscatedName("fe.s")
    public static class196 field2727 = new class196(32);

    @ObfuscatedName("fe.y")
    public static int field2722 = 0;

    @ObfuscatedName("fe.t")
    public static class203 field2728 = new class203();

    @ObfuscatedName("fe.w")
    public static class196 field2729 = new class196(4096);

    @ObfuscatedName("fe.h")
    public static int field2741 = 0;

    @ObfuscatedName("fe.d")
    public static class196 field2731 = new class196(4096);

    @ObfuscatedName("fe.l")
    public static int field2732 = 0;

    @ObfuscatedName("fe.f")
    public static class119 field2730 = new class119(8);

    @ObfuscatedName("fe.a")
    public static int field2733 = 0;

    @ObfuscatedName("fe.r")
    public static CRC32 field2736 = new CRC32();

    @ObfuscatedName("fe.j")
    public static class168[] field2737 = new class168[256];

    @ObfuscatedName("fe.z")
    public static byte field2738 = 0;

    @ObfuscatedName("fe.m")
    public static int field2739 = 0;

    @ObfuscatedName("fe.g")
    public static int field2740 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.o(ZB)V")
    public static void method3035(boolean arg0) {
        if (Statics.field2726 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2322(arg0 ? 2 : 3);
            var1.method2423(0);
            Statics.field2726.method2820(var1.field1977, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2726.method2816();
            } catch (Exception var4) {
            }
            field2740++;
            Statics.field2726 = null;
        }
    }

    @ObfuscatedName("fp.e(Ler;ZI)V")
    public static void method3247(class143 arg0, boolean arg1) {
        if (Statics.field2726 != null) {
            try {
                Statics.field2726.method2816();
            } catch (Exception var10) {
            }
            Statics.field2726 = null;
        }
        Statics.field2726 = arg0;
        method3035(arg1);
        field2730.field1974 = 0;
        Statics.field694 = null;
        Statics.field772 = null;
        field2733 = 0;
        while (true) {
            class172 var3 = (class172) field2727.method3548();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2731.method3548();
                    if (var4 == null) {
                        if (field2738 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2322(4);
                                var5.method2322(field2738);
                                var5.method2481(0);
                                Statics.field2726.method2820(var5.field1977, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2726.method2816();
                                } catch (Exception var8) {
                                }
                                field2740++;
                                Statics.field2726 = null;
                            }
                        }
                        field2723 = 0;
                        Statics.field2648 = class115.method102();
                        return;
                    }
                    field2728.method3630(var4);
                    field2729.method3544(var4, var4.field3113);
                    field2741++;
                    field2732--;
                }
            }
            field2724.method3544(var3, var3.field3113);
            field2734++;
            field2722--;
        }
    }

    @ObfuscatedName("bs.u(Lfr;IIIBZI)V")
    public static void method1511(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2724.method3545(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2727.method3545(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2729.method3545(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2731.method3545(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2746 = arg0;
            var12.field2743 = arg3;
            var12.field2745 = arg4;
            if (arg5) {
                field2724.method3544(var12, var6);
                field2734++;
            } else {
                field2728.method3639(var12);
                field2729.method3544(var12, var6);
                field2741++;
            }
        } else if (arg5) {
            var10.method3645();
            field2724.method3544(var10, var6);
            field2741--;
            field2734++;
        }
    }

    @ObfuscatedName("cp.b(III)V")
    public static void method1753(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2729.method3545(var2);
        if (var4 != null) {
            field2728.method3630(var4);
        }
    }

    @ObfuscatedName("aa.p(ZZI)I")
    public static int method666(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2734 + field2722;
        }
        if (arg1) {
            var2 += field2741 + field2732;
        }
        return var2;
    }
}
