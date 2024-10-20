package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fs")
public class class172 {

    @ObfuscatedName("fs.h")
    public static int field2711 = 0;

    @ObfuscatedName("fs.z")
    public static class197 field2729 = new class197(4096);

    @ObfuscatedName("fs.x")
    public static int field2720 = 0;

    @ObfuscatedName("fs.e")
    public static class197 field2713 = new class197(32);

    @ObfuscatedName("fs.i")
    public static int field2714 = 0;

    @ObfuscatedName("fs.c")
    public static class204 field2717 = new class204();

    @ObfuscatedName("fs.n")
    public static class197 field2716 = new class197(4096);

    @ObfuscatedName("fs.l")
    public static int field2721 = 0;

    @ObfuscatedName("fs.u")
    public static class197 field2718 = new class197(4096);

    @ObfuscatedName("fs.r")
    public static int field2719 = 0;

    @ObfuscatedName("fs.p")
    public static class120 field2712 = new class120(8);

    @ObfuscatedName("fs.b")
    public static int field2710 = 0;

    @ObfuscatedName("fs.y")
    public static CRC32 field2722 = new CRC32();

    @ObfuscatedName("fs.g")
    public static class169[] field2723 = new class169[256];

    @ObfuscatedName("fs.s")
    public static byte field2724 = 0;

    @ObfuscatedName("fs.k")
    public static int field2725 = 0;

    @ObfuscatedName("fs.o")
    public static int field2726 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.j(ZI)V")
    public static void method70(boolean arg0) {
        if (Statics.field3217 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2364(arg0 ? 2 : 3);
            var1.method2348(0);
            Statics.field3217.method2814(var1.field1974, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3217.method2811();
            } catch (Exception var4) {
            }
            field2726++;
            Statics.field3217 = null;
        }
    }

    @ObfuscatedName("client.h(Lfm;II)V")
    public static void method260(class169 arg0, int arg1) {
        if (Statics.field1362 == null) {
            method583((class169) null, 255, 255, 0, (byte) 0, true);
            field2723[arg1] = arg0;
        } else {
            Statics.field1362.field1972 = arg1 * 8 + 5;
            int var2 = Statics.field1362.method2366();
            int var3 = Statics.field1362.method2366();
            arg0.method3092(var2, var3);
        }
    }

    @ObfuscatedName("k.m(Lfm;IIIBZI)V")
    public static void method583(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2729.method3498(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2713.method3498(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2716.method3498(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2718.method3498(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2732 = arg0;
            var12.field2731 = arg3;
            var12.field2733 = arg4;
            if (arg5) {
                field2729.method3499(var12, var6);
                field2720++;
            } else {
                field2717.method3600(var12);
                field2716.method3499(var12, var6);
                field2721++;
            }
        } else if (arg5) {
            var10.method3619();
            field2729.method3499(var10, var6);
            field2721--;
            field2720++;
        }
    }

    @ObfuscatedName("ek.z(IIB)V")
    public static void method2803(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class173 var4 = (class173) field2716.method3498(var2);
        if (var4 != null) {
            field2717.method3611(var4);
        }
    }
}
