package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ey")
public class class149 {

    @ObfuscatedName("ey.p")
    public static class228 field2199 = null;

    @ObfuscatedName("ey.a")
    public static class228 field2207 = null;

    @ObfuscatedName("ey.v")
    public static class228 field2205 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.m(Ljava/io/File;Ljava/io/File;I)V")
    public static void method585(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2202, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2366(3);
            var3.method2366(arg1 == null ? 0 : 1);
            var3.method2374(arg0.getPath());
            if (arg1 != null) {
                var3.method2374(arg1.getPath());
            }
            var2.method3920(var3.field1959, 0, var3.field1955);
            var2.method3921();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("aw.l(Ljava/io/File;ZB)Z")
    public static boolean method920(File arg0, boolean arg1) {
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

    @ObfuscatedName("m.y(Ljava/lang/String;Ljava/lang/String;ZB)Lhj;")
    public static class227 method4(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2203, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field252 == 33) {
            var6 = "_rc";
        } else if (Statics.field252 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2046, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cr.u(I)V")
    public static void method2173() {
        try {
            File var0 = new File(Statics.field2046, "random.dat");
            if (var0.exists()) {
                field2199 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1175.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1936.length; var2++) {
                        File var3 = new File(Statics.field1936[var2] + Statics.field1175[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2199 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2199 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2199 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dd.k(Ldx;B)V")
    public static void method2675(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2199.method3938(0L);
            field2199.method3939(var1);
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
        arg0.method2375(var1, 0, 24);
    }

    @ObfuscatedName("o.j(B)V")
    public static void method602() {
        try {
            field2207.method3937();
            for (int var0 = 0; var0 < Statics.field2204; var0++) {
                Statics.field2209[var0].method3937();
            }
            field2205.method3937();
            field2199.method3937();
        } catch (Exception var2) {
        }
    }
}
