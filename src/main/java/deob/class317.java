package deob;

import java.util.zip.CRC32;

@ObfuscatedName("lz")
public class class317 {

    @ObfuscatedName("lz.c")
    public static int field4000 = 0;

    @ObfuscatedName("lz.f")
    public static class419 field3998 = new class419(4096);

    @ObfuscatedName("lz.b")
    public static int field3987 = 0;

    @ObfuscatedName("lz.n")
    public static class419 field3988 = new class419(32);

    @ObfuscatedName("lz.s")
    public static int field3984 = 0;

    @ObfuscatedName("lz.l")
    public static class334 field3990 = new class334();

    @ObfuscatedName("lz.q")
    public static class419 field3991 = new class419(4096);

    @ObfuscatedName("lz.o")
    public static int field3992 = 0;

    @ObfuscatedName("lz.r")
    public static class419 field3993 = new class419(4096);

    @ObfuscatedName("lz.p")
    public static int field3994 = 0;

    @ObfuscatedName("lz.d")
    public static class438 field4003 = new class438(8);

    @ObfuscatedName("lz.u")
    public static int field3996 = 0;

    @ObfuscatedName("lz.g")
    public static CRC32 field3997 = new CRC32();

    @ObfuscatedName("lz.a")
    public static class314[] field3995 = new class314[256];

    @ObfuscatedName("lz.y")
    public static byte field3999 = 0;

    @ObfuscatedName("lz.j")
    public static int field3989 = 0;

    @ObfuscatedName("lz.e")
    public static int field3985 = 0;

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lo.v(Llx;IIIBZI)V")
    public static void method5502(class314 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class315 var8 = (class315) field3998.method6772(var6);
        if (var8 != null) {
            return;
        }
        class315 var9 = (class315) field3988.method6772(var6);
        if (var9 != null) {
            return;
        }
        class315 var10 = (class315) field3991.method6772(var6);
        if (var10 == null) {
            if (!arg5) {
                class315 var11 = (class315) field3993.method6772(var6);
                if (var11 != null) {
                    return;
                }
            }
            class315 var12 = new class315();
            var12.field3964 = arg0;
            var12.field3963 = arg3;
            var12.field3962 = arg4;
            if (arg5) {
                field3998.method6773(var12, var6);
                field3987++;
            } else {
                field3990.method5517(var12);
                field3991.method6773(var12, var6);
                field3992++;
            }
        } else if (arg5) {
            var10.method6500();
            field3998.method6773(var10, var6);
            field3992--;
            field3987++;
        }
    }

    @ObfuscatedName("by.c(IIB)V")
    public static void method1887(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class315 var4 = (class315) field3991.method6772(var2);
        if (var4 != null) {
            field3990.method5518(var4);
        }
    }
}
