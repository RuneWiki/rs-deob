package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("es")
public class class150 {

    @ObfuscatedName("es.o")
    public static int field2483 = 0;

    @ObfuscatedName("es.b")
    public static class174 field2485 = new class174(4096);

    @ObfuscatedName("es.w")
    public static int field2486 = 0;

    @ObfuscatedName("es.r")
    public static class174 field2496 = new class174(32);

    @ObfuscatedName("es.l")
    public static int field2484 = 0;

    @ObfuscatedName("es.s")
    public static class181 field2489 = new class181();

    @ObfuscatedName("es.f")
    public static class174 field2488 = new class174(4096);

    @ObfuscatedName("es.x")
    public static int field2491 = 0;

    @ObfuscatedName("es.h")
    public static class174 field2493 = new class174(4096);

    @ObfuscatedName("es.a")
    public static int field2505 = 0;

    @ObfuscatedName("es.i")
    public static class107 field2494 = new class107(8);

    @ObfuscatedName("es.d")
    public static int field2497 = 0;

    @ObfuscatedName("es.p")
    public static CRC32 field2492 = new CRC32();

    @ObfuscatedName("es.z")
    public static class147[] field2499 = new class147[256];

    @ObfuscatedName("es.t")
    public static byte field2500 = 0;

    @ObfuscatedName("es.c")
    public static int field2501 = 0;

    @ObfuscatedName("es.q")
    public static int field2502 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.o(Ldq;ZS)V")
    public static void method848(class130 arg0, boolean arg1) {
        if (Statics.field2482 != null) {
            try {
                Statics.field2482.method2504();
            } catch (Exception var10) {
            }
            Statics.field2482 = null;
        }
        Statics.field2482 = arg0;
        Statics.method2633(arg1);
        field2494.field1841 = 0;
        Statics.field2670 = null;
        Statics.field2495 = null;
        field2497 = 0;
        while (true) {
            class151 var3 = (class151) field2496.method3096();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2493.method3096();
                    if (var4 == null) {
                        if (field2500 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2051(4);
                                var5.method2051(field2500);
                                var5.method2052(0);
                                Statics.field2482.method2509(var5.field1840, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2482.method2504();
                                } catch (Exception var8) {
                                }
                                field2502++;
                                Statics.field2482 = null;
                            }
                        }
                        field2483 = 0;
                        Statics.field2503 = class103.method833();
                        return;
                    }
                    field2489.method3181(var4);
                    field2488.method3091(var4, var4.field2874);
                    field2491++;
                    field2505--;
                }
            }
            field2485.method3091(var3, var3.field2874);
            field2486++;
            field2484--;
        }
    }

    @ObfuscatedName("co.y(Lei;II)V")
    public static void method2013(class147 arg0, int arg1) {
        if (Statics.field2498 == null) {
            method697((class147) null, 255, 255, 0, (byte) 0, true);
            field2499[arg1] = arg0;
        } else {
            Statics.field2498.field1841 = arg1 * 8 + 5;
            int var2 = Statics.field2498.method2207();
            int var3 = Statics.field2498.method2207();
            arg0.method2747(var2, var3);
        }
    }

    @ObfuscatedName("ap.b(Lei;IIIBZI)V")
    public static void method697(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2485.method3092(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2496.method3092(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2488.method3092(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2493.method3092(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2506 = arg0;
            var12.field2507 = arg3;
            var12.field2508 = arg4;
            if (arg5) {
                field2485.method3091(var12, var6);
                field2486++;
            } else {
                field2489.method3171(var12);
                field2488.method3091(var12, var6);
                field2491++;
            }
        } else if (arg5) {
            var10.method3187();
            field2485.method3091(var10, var6);
            field2491--;
            field2486++;
        }
    }

    @ObfuscatedName("client.w(IIB)V")
    public static void method465(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2488.method3092(var2);
        if (var4 != null) {
            field2489.method3181(var4);
        }
    }

    @ObfuscatedName("client.r(ZZI)I")
    public static int method337(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2486 + field2484;
        }
        if (arg1) {
            var2 += field2505 + field2491;
        }
        return var2;
    }
}
