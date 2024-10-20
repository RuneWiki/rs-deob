package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ed")
public class class149 {

    @ObfuscatedName("ed.v")
    public static class228 field2232 = null;

    @ObfuscatedName("ed.k")
    public static class228 field2231 = null;

    @ObfuscatedName("ed.o")
    public static class228 field2230 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.h(Ljava/io/File;ZI)Z")
    public static boolean method563(File arg0, boolean arg1) {
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

    @ObfuscatedName("bj.m(Ljava/lang/String;Ljava/lang/String;ZI)Lhb;")
    public static class227 method1169(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2227, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2026 == 33) {
            var6 = "_rc";
        } else if (Statics.field2026 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field137, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("client.i(B)V")
    public static void method512() {
        try {
            File var0 = new File(Statics.field137, "random.dat");
            if (var0.exists()) {
                field2232 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2081.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2175.length; var2++) {
                        File var3 = new File(Statics.field2175[var2] + Statics.field2081[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2232 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2232 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2232 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ev.q(Ldp;IB)V")
    public static void method2712(class119 arg0, int arg1) {
        if (field2232 == null) {
            return;
        }
        try {
            field2232.method3839(0L);
            field2232.method3841(arg0.field1989, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
