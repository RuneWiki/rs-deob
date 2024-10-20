package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ee")
public class class149 {

    @ObfuscatedName("ee.x")
    public static class228 field2233 = null;

    @ObfuscatedName("ee.k")
    public static class228 field2236 = null;

    @ObfuscatedName("ee.z")
    public static class228 field2235 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.l(Ljava/io/File;Ljava/io/File;B)V")
    public static void method3645(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2232, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2503(3);
            var3.method2503(arg1 == null ? 0 : 1);
            var3.method2495(arg0.getPath());
            if (arg1 != null) {
                var3.method2495(arg1.getPath());
            }
            var2.method3829(var3.field1986, 0, var3.field1988);
            var2.method3817();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("aj.e(Ljava/io/File;ZB)Z")
    public static boolean method714(File arg0, boolean arg1) {
        try {
            RandomAccessFile var2 = new RandomAccessFile(arg0, "rw");
            int var3 = var2.read();
            var2.seek(0L);
            var2.write(var3);
            var2.seek(0L);
            var2.close();
            if (arg1) {
                arg0.delete();
            }
            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    @ObfuscatedName("ba.q(Ljava/lang/String;Ljava/lang/String;ZI)Lhg;")
    public static class227 method1596(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field777, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1205 == 33) {
            var6 = "_rc";
        } else if (Statics.field1205 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2001, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class227(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class227(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("an.o(Ldl;I)V")
    public static void method937(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2233.method3836(0L);
            field2233.method3838(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2420(var1, 0, 24);
    }

    @ObfuscatedName("dq.g(I)V")
    public static void method2676() {
        try {
            field2236.method3835();
            for (int var0 = 0; var0 < Statics.field2130; var0++) {
                Statics.field1862[var0].method3835();
            }
            field2235.method3835();
            field2233.method3835();
        } catch (Exception var2) {
        }
    }
}
