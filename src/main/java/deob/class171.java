package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fv")
public class class171 {

    @ObfuscatedName("fv.b")
    public static int field2702 = 0;

    @ObfuscatedName("fv.d")
    public static class196 field2704 = new class196(4096);

    @ObfuscatedName("fv.z")
    public static int field2705 = 0;

    @ObfuscatedName("fv.l")
    public static class196 field2706 = new class196(32);

    @ObfuscatedName("fv.m")
    public static int field2712 = 0;

    @ObfuscatedName("fv.p")
    public static class203 field2720 = new class203();

    @ObfuscatedName("fv.u")
    public static class196 field2709 = new class196(4096);

    @ObfuscatedName("fv.c")
    public static int field2708 = 0;

    @ObfuscatedName("fv.v")
    public static class196 field2707 = new class196(4096);

    @ObfuscatedName("fv.o")
    public static int field2701 = 0;

    @ObfuscatedName("fv.f")
    public static class119 field2713 = new class119(8);

    @ObfuscatedName("fv.j")
    public static int field2714 = 0;

    @ObfuscatedName("fv.y")
    public static CRC32 field2711 = new CRC32();

    @ObfuscatedName("fv.a")
    public static class168[] field2710 = new class168[256];

    @ObfuscatedName("fv.s")
    public static byte field2717 = 0;

    @ObfuscatedName("fv.e")
    public static int field2716 = 0;

    @ObfuscatedName("fv.q")
    public static int field2719 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.g(ZI)V")
    public static void method659(boolean arg0) {
        if (Statics.field2718 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2476(arg0 ? 2 : 3);
            var1.method2537(0);
            Statics.field2718.method2859(var1.field1986, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2718.method2856();
            } catch (Exception var4) {
            }
            field2719++;
            Statics.field2718 = null;
        }
    }

    @ObfuscatedName("fq.b(Lek;ZB)V")
    public static void method3001(class143 arg0, boolean arg1) {
        if (Statics.field2718 != null) {
            try {
                Statics.field2718.method2856();
            } catch (Exception var10) {
            }
            Statics.field2718 = null;
        }
        Statics.field2718 = arg0;
        method659(arg1);
        field2713.field1977 = 0;
        Statics.field2068 = null;
        Statics.field1449 = null;
        field2714 = 0;
        while (true) {
            class172 var3 = (class172) field2706.method3571();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2707.method3571();
                    if (var4 == null) {
                        if (field2717 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2476(4);
                                var5.method2476(field2717);
                                var5.method2349(0);
                                Statics.field2718.method2859(var5.field1986, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2718.method2856();
                                } catch (Exception var8) {
                                }
                                field2719++;
                                Statics.field2718 = null;
                            }
                        }
                        field2702 = 0;
                        Statics.field2703 = class115.method579();
                        return;
                    }
                    field2720.method3654(var4);
                    field2709.method3569(var4, var4.field3099);
                    field2708++;
                    field2701--;
                }
            }
            field2704.method3569(var3, var3.field3099);
            field2705++;
            field2712--;
        }
    }

    @ObfuscatedName("ab.w(Lfn;IIIBZI)V")
    public static void method670(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2704.method3573(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2706.method3573(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2709.method3573(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2707.method3573(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2723 = arg0;
            var12.field2722 = arg3;
            var12.field2724 = arg4;
            if (arg5) {
                field2704.method3569(var12, var6);
                field2705++;
            } else {
                field2720.method3653(var12);
                field2709.method3569(var12, var6);
                field2708++;
            }
        } else if (arg5) {
            var10.method3671();
            field2704.method3569(var10, var6);
            field2708--;
            field2705++;
        }
    }

    @ObfuscatedName("du.d(IIB)V")
    public static void method2683(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2709.method3573(var2);
        if (var4 != null) {
            field2720.method3654(var4);
        }
    }

    @ObfuscatedName("ad.z(ZZI)I")
    public static int method723(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2712 + field2705;
        }
        if (arg1) {
            var2 += field2708 + field2701;
        }
        return var2;
    }
}
