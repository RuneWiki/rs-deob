package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fj")
public class class158 {

    @ObfuscatedName("fj.k")
    public static class112 field2015 = null;

    @ObfuscatedName("fj.v")
    public static class112 field2021 = null;

    @ObfuscatedName("fj.p")
    public static class112 field2022 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.c(Ljava/io/File;ZI)Z")
    public static boolean method127(File arg0, boolean arg1) {
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

    @ObfuscatedName("fd.q(Ljava/lang/String;Ljava/lang/String;ZB)Ldw;")
    public static class113 method3074(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2018, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class113(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field387 == 33) {
            var6 = "_rc";
        } else if (Statics.field387 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field268, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class113(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class113(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.m(I)V")
    public static void method1585() {
        try {
            File var0 = new File(Statics.field268, "random.dat");
            if (var0.exists()) {
                field2015 = new class112(new class113(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2024.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2020.length; var2++) {
                        File var3 = new File(Statics.field2020[var2] + Statics.field2024[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2015 = new class112(new class113(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2015 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2015 = new class112(new class113(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ee.g(B)V")
    public static void method2943() {
        try {
            field2021.method2242();
            for (int var0 = 0; var0 < Statics.field4; var0++) {
                Statics.field1419[var0].method2242();
            }
            field2022.method2242();
            field2015.method2242();
        } catch (Exception var2) {
        }
    }
}
