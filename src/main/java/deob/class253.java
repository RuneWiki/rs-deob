package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ie")
public class class253 {

    @ObfuscatedName("ie.s")
    public static int field3237 = 0;

    @ObfuscatedName("ie.k")
    public static class205 field3226 = new class205(4096);

    @ObfuscatedName("ie.u")
    public static int field3227 = 0;

    @ObfuscatedName("ie.i")
    public static class205 field3228 = new class205(32);

    @ObfuscatedName("ie.t")
    public static int field3229 = 0;

    @ObfuscatedName("ie.p")
    public static class197 field3230 = new class197();

    @ObfuscatedName("ie.l")
    public static class205 field3231 = new class205(4096);

    @ObfuscatedName("ie.b")
    public static int field3223 = 0;

    @ObfuscatedName("ie.c")
    public static class205 field3233 = new class205(4096);

    @ObfuscatedName("ie.d")
    public static int field3232 = 0;

    @ObfuscatedName("ie.z")
    public static class185 field3235 = new class185(8);

    @ObfuscatedName("ie.q")
    public static int field3224 = 0;

    @ObfuscatedName("ie.y")
    public static CRC32 field3239 = new CRC32();

    @ObfuscatedName("ie.h")
    public static class252[] field3234 = new class252[256];

    @ObfuscatedName("ie.x")
    public static byte field3240 = 0;

    @ObfuscatedName("ie.f")
    public static int field3241 = 0;

    @ObfuscatedName("ie.r")
    public static int field3242 = 0;

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.v(ZB)V")
    public static void method3107(boolean arg0) {
        if (Statics.field3238 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3258(arg0 ? 2 : 3);
            var1.method3268(0);
            Statics.field3238.method3041(var1.field2387, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3238.method3036();
            } catch (Exception var4) {
            }
            field3242++;
            Statics.field3238 = null;
        }
    }

    @ObfuscatedName("cc.s(Lfh;ZB)V")
    public static void method2107(class160 arg0, boolean arg1) {
        if (Statics.field3238 != null) {
            try {
                Statics.field3238.method3036();
            } catch (Exception var10) {
            }
            Statics.field3238 = null;
        }
        Statics.field3238 = arg0;
        method3107(arg1);
        field3235.field2386 = 0;
        Statics.field2532 = null;
        Statics.field3236 = null;
        field3224 = 0;
        while (true) {
            class249 var3 = (class249) field3228.method3741();
            if (var3 == null) {
                while (true) {
                    class249 var4 = (class249) field3233.method3741();
                    if (var4 == null) {
                        if (field3240 != 0) {
                            try {
                                class185 var5 = new class185(4);
                                var5.method3258(4);
                                var5.method3258(field3240);
                                var5.method3259(0);
                                Statics.field3238.method3041(var5.field2387, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3238.method3036();
                                } catch (Exception var8) {
                                }
                                field3242++;
                                Statics.field3238 = null;
                            }
                        }
                        field3237 = 0;
                        Statics.field3225 = class187.method3154();
                        return;
                    }
                    field3230.method3632(var4);
                    field3231.method3733(var4, var4.field2464);
                    field3223++;
                    field3232--;
                }
            }
            field3226.method3733(var3, var3.field2464);
            field3227++;
            field3229--;
        }
    }

    @ObfuscatedName("am.o(Liy;II)V")
    public static void method575(class252 arg0, int arg1) {
        if (Statics.field2417 == null) {
            method613((class252) null, 255, 255, 0, (byte) 0, true);
            field3234[arg1] = arg0;
        } else {
            Statics.field2417.field2386 = arg1 * 8 + 5;
            int var2 = Statics.field2417.method3279();
            int var3 = Statics.field2417.method3279();
            arg0.method4381(var2, var3);
        }
    }

    @ObfuscatedName("aj.k(Liy;IIIBZI)V")
    public static void method613(class252 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class249 var8 = (class249) field3226.method3735(var6);
        if (var8 != null) {
            return;
        }
        class249 var9 = (class249) field3228.method3735(var6);
        if (var9 != null) {
            return;
        }
        class249 var10 = (class249) field3231.method3735(var6);
        if (var10 == null) {
            if (!arg5) {
                class249 var11 = (class249) field3233.method3735(var6);
                if (var11 != null) {
                    return;
                }
            }
            class249 var12 = new class249();
            var12.field3185 = arg0;
            var12.field3184 = arg3;
            var12.field3186 = arg4;
            if (arg5) {
                field3226.method3733(var12, var6);
                field3227++;
            } else {
                field3230.method3631(var12);
                field3231.method3733(var12, var6);
                field3223++;
            }
        } else if (arg5) {
            var10.method3826();
            field3226.method3733(var10, var6);
            field3223--;
            field3227++;
        }
    }

    @ObfuscatedName("bv.u(III)V")
    public static void method1518(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class249 var4 = (class249) field3231.method3735(var2);
        if (var4 != null) {
            field3230.method3632(var4);
        }
    }

    @ObfuscatedName("ha.i(IIB)I")
    public static int method3886(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2532 != null && Statics.field2532.field2464 == var2 ? Statics.field3236.field2386 * 99 / (Statics.field3236.field2387.length - Statics.field2532.field3186) + 1 : 0;
    }

    @ObfuscatedName("dk.t(ZZI)I")
    public static int method2464(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3229 + field3227;
        }
        if (arg1) {
            var2 += field3232 + field3223;
        }
        return var2;
    }

    @ObfuscatedName("bx.c(I)V")
    public static void method991() {
        if (Statics.field3238 != null) {
            Statics.field3238.method3036();
        }
    }
}
