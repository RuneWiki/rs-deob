package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ia")
public class class251 {

    @ObfuscatedName("ia.w")
    public static int field3198 = 0;

    @ObfuscatedName("ia.l")
    public static class203 field3213 = new class203(4096);

    @ObfuscatedName("ia.u")
    public static int field3212 = 0;

    @ObfuscatedName("ia.q")
    public static class203 field3200 = new class203(32);

    @ObfuscatedName("ia.k")
    public static int field3199 = 0;

    @ObfuscatedName("ia.i")
    public static class195 field3203 = new class195();

    @ObfuscatedName("ia.x")
    public static class203 field3205 = new class203(4096);

    @ObfuscatedName("ia.e")
    public static int field3206 = 0;

    @ObfuscatedName("ia.p")
    public static class203 field3207 = new class203(4096);

    @ObfuscatedName("ia.b")
    public static int field3208 = 0;

    @ObfuscatedName("ia.g")
    public static class183 field3210 = new class183(8);

    @ObfuscatedName("ia.r")
    public static int field3211 = 0;

    @ObfuscatedName("ia.o")
    public static CRC32 field3197 = new CRC32();

    @ObfuscatedName("ia.a")
    public static class250[] field3202 = new class250[256];

    @ObfuscatedName("ia.j")
    public static byte field3214 = 0;

    @ObfuscatedName("ia.d")
    public static int field3215 = 0;

    @ObfuscatedName("ia.h")
    public static int field3216 = 0;

    public class251() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.z(ZI)V")
    public static void method4044(boolean arg0) {
        if (Statics.field3201 == null) {
            return;
        }
        try {
            class183 var1 = new class183(4);
            var1.method3235(arg0 ? 2 : 3);
            var1.method3237(0);
            Statics.field3201.method3040(var1.field2339, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3201.method3041();
            } catch (Exception var4) {
            }
            field3216++;
            Statics.field3201 = null;
        }
    }

    @ObfuscatedName("ac.w(Lfd;ZI)V")
    public static void method574(class158 arg0, boolean arg1) {
        if (Statics.field3201 != null) {
            try {
                Statics.field3201.method3041();
            } catch (Exception var10) {
            }
            Statics.field3201 = null;
        }
        Statics.field3201 = arg0;
        method4044(arg1);
        field3210.field2340 = 0;
        Statics.field3209 = null;
        Statics.field3714 = null;
        field3211 = 0;
        while (true) {
            class247 var3 = (class247) field3200.method3710();
            if (var3 == null) {
                while (true) {
                    class247 var4 = (class247) field3207.method3710();
                    if (var4 == null) {
                        if (field3214 != 0) {
                            try {
                                class183 var5 = new class183(4);
                                var5.method3235(4);
                                var5.method3235(field3214);
                                var5.method3458(0);
                                Statics.field3201.method3040(var5.field2339, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3201.method3041();
                                } catch (Exception var8) {
                                }
                                field3216++;
                                Statics.field3201 = null;
                            }
                        }
                        field3198 = 0;
                        Statics.field3204 = class185.method3250();
                        return;
                    }
                    field3203.method3600(var4);
                    field3205.method3708(var4, var4.field2422);
                    field3206++;
                    field3208--;
                }
            }
            field3213.method3708(var3, var3.field2422);
            field3212++;
            field3199--;
        }
    }

    @ObfuscatedName("bi.l(III)V")
    public static void method942(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class247 var4 = (class247) field3205.method3712(var2);
        if (var4 != null) {
            field3203.method3600(var4);
        }
    }

    @ObfuscatedName("ge.u(ZZI)I")
    public static int method3489(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3212 + field3199;
        }
        if (arg1) {
            var2 += field3208 + field3206;
        }
        return var2;
    }

    @ObfuscatedName("iz.q(I)V")
    public static void method4232() {
        if (Statics.field3201 != null) {
            Statics.field3201.method3041();
        }
    }
}
