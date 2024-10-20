package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("jg")
public class class265 {

    @ObfuscatedName("jg.q")
    public static int field3418 = 0;

    @ObfuscatedName("jg.a")
    public static class215 field3413 = new class215(4096);

    @ObfuscatedName("jg.l")
    public static int field3415 = 0;

    @ObfuscatedName("jg.b")
    public static class215 field3416 = new class215(32);

    @ObfuscatedName("jg.e")
    public static int field3417 = 0;

    @ObfuscatedName("jg.x")
    public static class207 field3429 = new class207();

    @ObfuscatedName("jg.p")
    public static class215 field3419 = new class215(4096);

    @ObfuscatedName("jg.g")
    public static int field3420 = 0;

    @ObfuscatedName("jg.n")
    public static class215 field3421 = new class215(4096);

    @ObfuscatedName("jg.o")
    public static int field3422 = 0;

    @ObfuscatedName("jg.u")
    public static class195 field3424 = new class195(8);

    @ObfuscatedName("jg.k")
    public static int field3425 = 0;

    @ObfuscatedName("jg.w")
    public static CRC32 field3426 = new CRC32();

    @ObfuscatedName("jg.d")
    public static class264[] field3427 = new class264[256];

    @ObfuscatedName("jg.f")
    public static byte field3428 = 0;

    @ObfuscatedName("jg.r")
    public static int field3430 = 0;

    @ObfuscatedName("jg.y")
    public static int field3414 = 0;

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("in.t(ZI)V")
    public static void method4183(boolean arg0) {
        if (Statics.field621 == null) {
            return;
        }
        try {
            class195 var1 = new class195(4);
            var1.method3220(arg0 ? 2 : 3);
            var1.method3222(0);
            Statics.field621.method3021(var1.field2544, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field621.method3022();
            } catch (Exception var4) {
            }
            field3414++;
            Statics.field621 = null;
        }
    }

    @ObfuscatedName("fd.q(Lfy;ZB)V")
    public static void method2975(class170 arg0, boolean arg1) {
        if (Statics.field621 != null) {
            try {
                Statics.field621.method3022();
            } catch (Exception var10) {
            }
            Statics.field621 = null;
        }
        Statics.field621 = arg0;
        method4183(arg1);
        field3424.field2545 = 0;
        Statics.field2173 = null;
        Statics.field1661 = null;
        field3425 = 0;
        while (true) {
            class261 var3 = (class261) field3416.method3667();
            if (var3 == null) {
                while (true) {
                    class261 var4 = (class261) field3421.method3667();
                    if (var4 == null) {
                        if (field3428 != 0) {
                            try {
                                class195 var5 = new class195(4);
                                var5.method3220(4);
                                var5.method3220(field3428);
                                var5.method3323(0);
                                Statics.field621.method3021(var5.field2544, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field621.method3022();
                                } catch (Exception var8) {
                                }
                                field3414++;
                                Statics.field621 = null;
                            }
                        }
                        field3418 = 0;
                        Statics.field2102 = Statics.method426();
                        return;
                    }
                    field3429.method3574(var4);
                    field3419.method3669(var4, var4.field2636);
                    field3420++;
                    field3422--;
                }
            }
            field3413.method3669(var3, var3.field2636);
            field3415++;
            field3417--;
        }
    }

    @ObfuscatedName("fd.i(Lju;IIIBZI)V")
    public static void method2996(class264 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class261 var8 = (class261) field3413.method3677(var6);
        if (var8 != null) {
            return;
        }
        class261 var9 = (class261) field3416.method3677(var6);
        if (var9 != null) {
            return;
        }
        class261 var10 = (class261) field3419.method3677(var6);
        if (var10 == null) {
            if (!arg5) {
                class261 var11 = (class261) field3421.method3677(var6);
                if (var11 != null) {
                    return;
                }
            }
            class261 var12 = new class261();
            var12.field3375 = arg0;
            var12.field3373 = arg3;
            var12.field3374 = arg4;
            if (arg5) {
                field3413.method3669(var12, var6);
                field3415++;
            } else {
                field3429.method3573(var12);
                field3419.method3669(var12, var6);
                field3420++;
            }
        } else if (arg5) {
            var10.method3761();
            field3413.method3669(var10, var6);
            field3420--;
            field3415++;
        }
    }

    @ObfuscatedName("et.a(IIB)V")
    public static void method2831(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class261 var4 = (class261) field3419.method3677(var2);
        if (var4 != null) {
            field3429.method3574(var4);
        }
    }
}
