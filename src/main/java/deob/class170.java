package deob;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("fj")
public class class170 {

    @ObfuscatedName("fj.r")
    public static class457 field1854 = null;

    @ObfuscatedName("fj.b")
    public static class457 field1853 = null;

    @ObfuscatedName("fj.m")
    public static class457 field1856 = null;

    public class170() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.f(Ljava/lang/String;Ljava/lang/String;ZB)Lqr;")
    public static class456 method2735(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field4573, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class456(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1105 == 33) {
            var6 = "_rc";
        } else if (Statics.field1105 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1431, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class456(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class456(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lb.w(B)[B")
    public static byte[] method5889() {
        byte[] var0 = new byte[24];
        try {
            field1854.method7765(0L);
            field1854.method7767(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("mn.v(Lrd;II)V")
    public static void method6213(class474 arg0, int arg1) {
        if (field1854 == null) {
            return;
        }
        try {
            field1854.method7765(0L);
            field1854.method7770(arg0.field4936, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("kg.s(I)V")
    public static void method5851() {
        try {
            field1853.method7764();
            for (int var0 = 0; var0 < Statics.field1851; var0++) {
                Statics.field108[var0].method7764();
            }
            field1856.method7764();
            field1854.method7764();
        } catch (Exception var2) {
        }
    }
}
