package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class153 {

    @ObfuscatedName("eh.j")
    public static int field2505 = 0;

    @ObfuscatedName("eh.b")
    public static class177 field2503 = new class177(4096);

    @ObfuscatedName("eh.k")
    public static int field2504 = 0;

    @ObfuscatedName("eh.c")
    public static class177 field2507 = new class177(32);

    @ObfuscatedName("eh.w")
    public static int field2506 = 0;

    @ObfuscatedName("eh.l")
    public static class184 field2517 = new class184();

    @ObfuscatedName("eh.n")
    public static class177 field2501 = new class177(4096);

    @ObfuscatedName("eh.d")
    public static int field2500 = 0;

    @ObfuscatedName("eh.h")
    public static class177 field2511 = new class177(4096);

    @ObfuscatedName("eh.y")
    public static int field2509 = 0;

    @ObfuscatedName("eh.s")
    public static class108 field2512 = new class108(8);

    @ObfuscatedName("eh.u")
    public static int field2513 = 0;

    @ObfuscatedName("eh.r")
    public static CRC32 field2510 = new CRC32();

    @ObfuscatedName("eh.x")
    public static class150[] field2515 = new class150[256];

    @ObfuscatedName("eh.t")
    public static byte field2516 = 0;

    @ObfuscatedName("eh.e")
    public static int field2502 = 0;

    @ObfuscatedName("eh.m")
    public static int field2518 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.g(ZI)V")
    public static void method2336(boolean arg0) {
        if (Statics.field2514 == null) {
            return;
        }
        try {
            class108 var1 = new class108(4);
            var1.method2069(arg0 ? 2 : 3);
            var1.method2217(0);
            Statics.field2514.method2532(var1.field1828, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2514.method2537();
            } catch (Exception var4) {
            }
            field2518++;
            Statics.field2514 = null;
        }
    }

    @ObfuscatedName("dd.j(Len;ZB)V")
    public static void method2385(class132 arg0, boolean arg1) {
        if (Statics.field2514 != null) {
            try {
                Statics.field2514.method2537();
            } catch (Exception var10) {
            }
            Statics.field2514 = null;
        }
        Statics.field2514 = arg0;
        method2336(arg1);
        field2512.field1824 = 0;
        Statics.field1427 = null;
        Statics.field2400 = null;
        field2513 = 0;
        while (true) {
            class154 var3 = (class154) field2507.method3139();
            if (var3 == null) {
                while (true) {
                    class154 var4 = (class154) field2511.method3139();
                    if (var4 == null) {
                        if (field2516 != 0) {
                            try {
                                class108 var5 = new class108(4);
                                var5.method2069(4);
                                var5.method2069(field2516);
                                var5.method2195(0);
                                Statics.field2514.method2532(var5.field1828, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2514.method2537();
                                } catch (Exception var8) {
                                }
                                field2518++;
                                Statics.field2514 = null;
                            }
                        }
                        field2505 = 0;
                        Statics.field2508 = class104.method528();
                        return;
                    }
                    field2517.method3223(var4);
                    field2501.method3137(var4, var4.field2887);
                    field2500++;
                    field2509--;
                }
            }
            field2503.method3137(var3, var3.field2887);
            field2504++;
            field2506--;
        }
    }

    @ObfuscatedName("x.z(Lev;IIIBZB)V")
    public static void method480(class150 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2503.method3140(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2507.method3140(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2501.method3140(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2511.method3140(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2520 = arg0;
            var12.field2526 = arg3;
            var12.field2522 = arg4;
            if (arg5) {
                field2503.method3137(var12, var6);
                field2504++;
            } else {
                field2517.method3233(var12);
                field2501.method3137(var12, var6);
                field2500++;
            }
        } else if (arg5) {
            var10.method3235();
            field2503.method3137(var10, var6);
            field2500--;
            field2504++;
        }
    }

    @ObfuscatedName("do.b(III)V")
    public static void method2345(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class154 var4 = (class154) field2501.method3140(var2);
        if (var4 != null) {
            field2517.method3223(var4);
        }
    }

    @ObfuscatedName("dx.k(ZZI)I")
    public static int method2426(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2506 + field2504;
        }
        if (arg1) {
            var2 += field2509 + field2500;
        }
        return var2;
    }
}
