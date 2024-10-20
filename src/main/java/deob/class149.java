package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("es")
public class class149 {

    @ObfuscatedName("es.n")
    public static class228 field2228 = null;

    @ObfuscatedName("es.z")
    public static class228 field2227 = null;

    @ObfuscatedName("es.c")
    public static class228 field2235 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.i(Ljava/io/File;Ljava/io/File;I)V")
    public static void method125(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2223, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2296(3);
            var3.method2296(arg1 == null ? 0 : 1);
            var3.method2454(arg0.getPath());
            if (arg1 != null) {
                var3.method2454(arg1.getPath());
            }
            var2.method3824(var3.field1988, 0, var3.field1984);
            var2.method3813();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("d.v(Ljava/io/File;ZI)Z")
    public static boolean method119(File arg0, boolean arg1) {
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

    @ObfuscatedName("du.f(Ljava/lang/String;Ljava/lang/String;ZI)Lho;")
    public static class227 method2241(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3144, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2161 == 33) {
            var6 = "_rc";
        } else if (Statics.field2161 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field783, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("dj.h(Ldj;I)V")
    public static void method2295(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2228.method3836(0L);
            field2228.method3849(var1);
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
        arg0.method2305(var1, 0, 24);
    }
}
