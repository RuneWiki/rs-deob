package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ek")
public class class136 {

    @ObfuscatedName("ek.h")
    public static class196 field2085 = null;

    @ObfuscatedName("ek.a")
    public static class196 field2086 = null;

    @ObfuscatedName("ek.u")
    public static class196 field2081 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.e(Ljava/io/File;ZI)Z")
    public static boolean method2357(File arg0, boolean arg1) {
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

    @ObfuscatedName("g.o(Ljava/lang/String;Ljava/lang/String;ZB)Lgk;")
    public static class195 method522(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2087, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1898 == 33) {
            var6 = "_rc";
        } else if (Statics.field1898 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1825, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dt.y(B)V")
    public static void method2499() {
        try {
            File var0 = new File(Statics.field1825, "random.dat");
            if (var0.exists()) {
                field2085 = new class196(new class195(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2088.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field62.length; var2++) {
                        File var3 = new File(Statics.field62[var2] + Statics.field2088[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2085 = new class196(new class195(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2085 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2085 = new class196(new class195(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("h.b(Ldl;II)V")
    public static void method126(class107 arg0, int arg1) {
        if (field2085 == null) {
            return;
        }
        try {
            field2085.method3353(0L);
            field2085.method3358(arg0.field1840, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
