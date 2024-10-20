package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ia")
public class class247 {

    @ObfuscatedName("ia.m")
    public static int field3169 = 0;

    @ObfuscatedName("ia.d")
    public static class328 field3167 = new class328(4096);

    @ObfuscatedName("ia.w")
    public static int field3168 = 0;

    @ObfuscatedName("ia.v")
    public static class328 field3175 = new class328(32);

    @ObfuscatedName("ia.q")
    public static int field3170 = 0;

    @ObfuscatedName("ia.z")
    public static class270 field3171 = new class270();

    @ObfuscatedName("ia.t")
    public static class328 field3172 = new class328(4096);

    @ObfuscatedName("ia.e")
    public static int field3173 = 0;

    @ObfuscatedName("ia.s")
    public static class328 field3176 = new class328(4096);

    @ObfuscatedName("ia.p")
    public static int field3174 = 0;

    @ObfuscatedName("ia.h")
    public static class310 field3177 = new class310(8);

    @ObfuscatedName("ia.i")
    public static int field3179 = 0;

    @ObfuscatedName("ia.b")
    public static CRC32 field3180 = new CRC32();

    @ObfuscatedName("ia.r")
    public static class246[] field3165 = new class246[256];

    @ObfuscatedName("ia.o")
    public static byte field3164 = 0;

    @ObfuscatedName("ia.c")
    public static int field3183 = 0;

    @ObfuscatedName("ia.j")
    public static int field3184 = 0;

    public class247() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.x(Llt;ZB)V")
    public static void method192(class315 arg0, boolean arg1) {
        if (Statics.field3181 != null) {
            try {
                Statics.field3181.method3285();
            } catch (Exception var15) {
            }
            Statics.field3181 = null;
        }
        Statics.field3181 = arg0;
        if (Statics.field3181 != null) {
            try {
                class310 var3 = new class310(4);
                var3.method5121(arg1 ? 2 : 3);
                var3.method5178(0);
                Statics.field3181.method3293(var3.field3710, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3181.method3285();
                } catch (Exception var13) {
                }
                field3184++;
                Statics.field3181 = null;
            }
        }
        field3177.field3711 = 0;
        Statics.field3182 = null;
        Statics.field3178 = null;
        field3179 = 0;
        while (true) {
            class243 var6 = (class243) field3175.method5546();
            if (var6 == null) {
                while (true) {
                    class243 var7 = (class243) field3176.method5546();
                    if (var7 == null) {
                        if (field3164 != 0) {
                            try {
                                class310 var8 = new class310(4);
                                var8.method5121(4);
                                var8.method5121(field3164);
                                var8.method5122(0);
                                Statics.field3181.method3293(var8.field3710, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3181.method3285();
                                } catch (Exception var11) {
                                }
                                field3184++;
                                Statics.field3181 = null;
                            }
                        }
                        field3169 = 0;
                        Statics.field3166 = Statics.method3668();
                        return;
                    }
                    field3171.method4479(var7);
                    field3172.method5548(var7, var7.field2117);
                    field3173++;
                    field3174--;
                }
            }
            field3167.method5548(var6, var6.field2117);
            field3168++;
            field3170--;
        }
    }

    @ObfuscatedName("d.m(Lih;II)V")
    public static void method43(class246 arg0, int arg1) {
        if (Statics.field60 == null) {
            method3113((class246) null, 255, 255, 0, (byte) 0, true);
            field3165[arg1] = arg0;
        } else {
            Statics.field60.field3711 = arg1 * 8 + 5;
            int var2 = Statics.field60.method5142();
            int var3 = Statics.field60.method5142();
            arg0.method3966(var2, var3);
        }
    }

    @ObfuscatedName("ef.k(Lih;IIIBZI)V")
    public static void method3113(class246 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class243 var8 = (class243) field3167.method5561(var6);
        if (var8 != null) {
            return;
        }
        class243 var9 = (class243) field3175.method5561(var6);
        if (var9 != null) {
            return;
        }
        class243 var10 = (class243) field3172.method5561(var6);
        if (var10 == null) {
            if (!arg5) {
                class243 var11 = (class243) field3176.method5561(var6);
                if (var11 != null) {
                    return;
                }
            }
            class243 var12 = new class243();
            var12.field3122 = arg0;
            var12.field3125 = arg3;
            var12.field3121 = arg4;
            if (arg5) {
                field3167.method5548(var12, var6);
                field3168++;
            } else {
                field3171.method4478(var12);
                field3172.method5548(var12, var6);
                field3173++;
            }
        } else if (arg5) {
            var10.method3351();
            field3167.method5548(var10, var6);
            field3173--;
            field3168++;
        }
    }

    @ObfuscatedName("d.d(III)I")
    public static int method44(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3182 != null && Statics.field3182.field2117 == var2 ? Statics.field3178.field3711 * 99 / (Statics.field3178.field3710.length - Statics.field3182.field3121) + 1 : 0;
    }

    @ObfuscatedName("ae.w(ZZB)I")
    public static int method262(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3170 + field3168;
        }
        if (arg1) {
            var2 += field3174 + field3173;
        }
        return var2;
    }

    @ObfuscatedName("z.v(I)V")
    public static void method77() {
        if (Statics.field3181 != null) {
            Statics.field3181.method3285();
        }
    }
}
