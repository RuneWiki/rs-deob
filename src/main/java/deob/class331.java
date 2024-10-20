package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ll")
public class class331 {

    @ObfuscatedName("ll.f")
    public static int field4184 = 0;

    @ObfuscatedName("ll.x")
    public static class441 field4183 = new class441(4096);

    @ObfuscatedName("ll.h")
    public static int field4167 = 0;

    @ObfuscatedName("ll.j")
    public static class441 field4168 = new class441(32);

    @ObfuscatedName("ll.y")
    public static int field4169 = 0;

    @ObfuscatedName("ll.d")
    public static class348 field4170 = new class348();

    @ObfuscatedName("ll.n")
    public static class441 field4171 = new class441(4096);

    @ObfuscatedName("ll.r")
    public static int field4177 = 0;

    @ObfuscatedName("ll.l")
    public static class441 field4173 = new class441(4096);

    @ObfuscatedName("ll.s")
    public static int field4166 = 0;

    @ObfuscatedName("ll.o")
    public static class464 field4165 = new class464(8);

    @ObfuscatedName("ll.z")
    public static int field4179 = 0;

    @ObfuscatedName("ll.w")
    public static CRC32 field4174 = new CRC32();

    @ObfuscatedName("ll.q")
    public static class328[] field4178 = new class328[256];

    @ObfuscatedName("ll.i")
    public static int field4175 = -1;

    @ObfuscatedName("ll.e")
    public static int field4180 = 255;

    @ObfuscatedName("ll.g")
    public static byte field4181 = 0;

    @ObfuscatedName("ll.k")
    public static int field4182 = 0;

    @ObfuscatedName("ll.v")
    public static int field4164 = 0;

    public class331() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.a(ZB)V")
    public static void method692(boolean arg0) {
        if (Statics.field4176 == null) {
            return;
        }
        try {
            class464 var1 = new class464(4);
            var1.method7698(arg0 ? 2 : 3);
            var1.method7700(0);
            Statics.field4176.method6852(var1.field4867, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field4176.method6853();
            } catch (Exception var4) {
            }
            field4164++;
            Statics.field4176 = null;
        }
    }

    @ObfuscatedName("ba.f(Llx;II)V")
    public static void method1742(class328 arg0, int arg1) {
        if (arg0.field4141) {
            if (arg1 <= field4175) {
                throw new RuntimeException("");
            }
            if (arg1 < field4180) {
                field4180 = arg1;
            }
        } else if (arg1 >= field4180) {
            throw new RuntimeException("");
        } else if (arg1 > field4175) {
            field4175 = arg1;
        }
        if (Statics.field1362 == null) {
            method2978((class328) null, 255, 255, 0, (byte) 0, true);
            field4178[arg1] = arg0;
            return;
        }
        Statics.field1362.field4864 = arg1 * 8 + 5;
        if (Statics.field1362.field4864 >= Statics.field1362.field4867.length) {
            if (!arg0.field4141) {
                throw new RuntimeException("");
            }
            arg0.method5743();
        } else {
            int var2 = Statics.field1362.method7720();
            int var3 = Statics.field1362.method7720();
            arg0.method5765(var2, var3);
        }
    }

    @ObfuscatedName("fm.c(Llx;IIIBZI)V")
    public static void method2978(class328 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class329 var8 = (class329) field4183.method7466(var6);
        if (var8 != null) {
            return;
        }
        class329 var9 = (class329) field4168.method7466(var6);
        if (var9 != null) {
            return;
        }
        class329 var10 = (class329) field4171.method7466(var6);
        if (var10 == null) {
            if (!arg5) {
                class329 var11 = (class329) field4173.method7466(var6);
                if (var11 != null) {
                    return;
                }
            }
            class329 var12 = new class329();
            var12.field4144 = arg0;
            var12.field4143 = arg3;
            var12.field4146 = arg4;
            if (arg5) {
                field4183.method7468(var12, var6);
                field4167++;
            } else {
                field4170.method6016(var12);
                field4171.method7468(var12, var6);
                field4177++;
            }
        } else if (arg5) {
            var10.method7169();
            field4183.method7468(var10, var6);
            field4177--;
            field4167++;
        }
    }

    @ObfuscatedName("bl.x(III)V")
    public static void method1049(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class329 var4 = (class329) field4171.method7466(var2);
        if (var4 != null) {
            field4170.method6024(var4);
        }
    }

    @ObfuscatedName("gz.h(III)I")
    public static int method3707(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1438 != null && Statics.field1438.field4635 == var2 ? Statics.field4611.field4864 * 99 / (Statics.field4611.field4867.length - Statics.field1438.field4146) + 1 : 0;
    }

    @ObfuscatedName("lk.j(S)V")
    public static void method5689() {
        if (Statics.field4176 != null) {
            Statics.field4176.method6853();
        }
    }
}
