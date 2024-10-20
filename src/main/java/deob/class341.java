package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("nk")
public class class341 {

    @ObfuscatedName("nk.al")
    public static int field4204 = 0;

    @ObfuscatedName("nk.ab")
    public static class455 field4206 = new class455(4096);

    @ObfuscatedName("nk.an")
    public static int field4225 = 0;

    @ObfuscatedName("nk.ao")
    public static class455 field4207 = new class455(32);

    @ObfuscatedName("nk.av")
    public static int field4203 = 0;

    @ObfuscatedName("nk.aq")
    public static class358 field4210 = new class358();

    @ObfuscatedName("nk.ap")
    public static class455 field4222 = new class455(4096);

    @ObfuscatedName("nk.ar")
    public static int field4212 = 0;

    @ObfuscatedName("nk.ak")
    public static class455 field4213 = new class455(4096);

    @ObfuscatedName("nk.ax")
    public static int field4211 = 0;

    @ObfuscatedName("nk.am")
    public static class478 field4215 = new class478(8);

    @ObfuscatedName("nk.ae")
    public static int field4217 = 0;

    @ObfuscatedName("nk.ag")
    public static CRC32 field4208 = new CRC32();

    @ObfuscatedName("nk.af")
    public static class338[] field4219 = new class338[256];

    @ObfuscatedName("nk.ai")
    public static int field4220 = -1;

    @ObfuscatedName("nk.aw")
    public static int field4221 = 255;

    @ObfuscatedName("nk.aa")
    public static byte field4214 = 0;

    @ObfuscatedName("nk.ah")
    public static int field4223 = 0;

    @ObfuscatedName("nk.ad")
    public static int field4224 = 0;

    public class341() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gr.aj(ZI)V")
    public static void method3104(boolean arg0) {
        if (Statics.field4209 == null) {
            return;
        }
        try {
            class478 var1 = new class478(4);
            var1.method7886(arg0 ? 2 : 3);
            var1.method8033(0);
            Statics.field4209.method7039(var1.field4906, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field4209.method7040();
            } catch (Exception var4) {
            }
            field4224++;
            Statics.field4209 = null;
        }
    }

    @ObfuscatedName("aw.al(Lmx;IIIBZB)V")
    public static void method301(class338 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class339 var8 = (class339) field4206.method7619(var6);
        if (var8 != null) {
            return;
        }
        class339 var9 = (class339) field4207.method7619(var6);
        if (var9 != null) {
            return;
        }
        class339 var10 = (class339) field4222.method7619(var6);
        if (var10 == null) {
            if (!arg5) {
                class339 var11 = (class339) field4213.method7619(var6);
                if (var11 != null) {
                    return;
                }
            }
            class339 var12 = new class339();
            var12.field4182 = arg0;
            var12.field4183 = arg3;
            var12.field4185 = arg4;
            if (arg5) {
                field4206.method7616(var12, var6);
                field4225++;
            } else {
                field4210.method6084(var12);
                field4222.method7616(var12, var6);
                field4212++;
            }
        } else if (arg5) {
            var10.method7331();
            field4206.method7616(var10, var6);
            field4212--;
            field4225++;
        }
    }
}
