package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fu")
public class class172 {

    @ObfuscatedName("fu.w")
    public static int field2714 = 0;

    @ObfuscatedName("fu.s")
    public static class197 field2716 = new class197(4096);

    @ObfuscatedName("fu.p")
    public static int field2731 = 0;

    @ObfuscatedName("fu.h")
    public static class197 field2726 = new class197(32);

    @ObfuscatedName("fu.g")
    public static int field2719 = 0;

    @ObfuscatedName("fu.a")
    public static class204 field2720 = new class204();

    @ObfuscatedName("fu.r")
    public static class197 field2721 = new class197(4096);

    @ObfuscatedName("fu.k")
    public static int field2722 = 0;

    @ObfuscatedName("fu.m")
    public static class197 field2713 = new class197(4096);

    @ObfuscatedName("fu.n")
    public static int field2724 = 0;

    @ObfuscatedName("fu.j")
    public static class120 field2728 = new class120(8);

    @ObfuscatedName("fu.o")
    public static int field2727 = 0;

    @ObfuscatedName("fu.x")
    public static CRC32 field2717 = new CRC32();

    @ObfuscatedName("fu.q")
    public static class169[] field2730 = new class169[256];

    @ObfuscatedName("fu.u")
    public static byte field2734 = 0;

    @ObfuscatedName("fu.t")
    public static int field2732 = 0;

    @ObfuscatedName("fu.d")
    public static int field2733 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.e(ZI)V")
    public static void method578(boolean arg0) {
        if (Statics.field2729 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2397(arg0 ? 2 : 3);
            var1.method2342(0);
            Statics.field2729.method2802(var1.field1981, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2729.method2801();
            } catch (Exception var4) {
            }
            field2733++;
            Statics.field2729 = null;
        }
    }

    @ObfuscatedName("aw.w(Lfl;IIIBZB)V")
    public static void method769(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2716.method3507(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2726.method3507(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2721.method3507(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2713.method3507(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2738 = arg0;
            var12.field2739 = arg3;
            var12.field2740 = arg4;
            if (arg5) {
                field2716.method3508(var12, var6);
                field2731++;
            } else {
                field2720.method3594(var12);
                field2721.method3508(var12, var6);
                field2722++;
            }
        } else if (arg5) {
            var10.method3610();
            field2716.method3508(var10, var6);
            field2722--;
            field2731++;
        }
    }
}
