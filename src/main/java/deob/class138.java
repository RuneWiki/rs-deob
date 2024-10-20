package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("el")
public class class138 {

    @ObfuscatedName("el.h")
    public static class208 field2076 = null;

    @ObfuscatedName("el.y")
    public static class208 field2080 = null;

    @ObfuscatedName("el.p")
    public static class208 field2078 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.g(Ljava/io/File;ZI)Z")
    public static boolean method858(File arg0, boolean arg1) {
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

    @ObfuscatedName("de.j(Ljava/lang/String;Ljava/lang/String;ZB)Lgb;")
    public static class207 method2318(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2073, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class207(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2065 == 33) {
            var6 = "_rc";
        } else if (Statics.field2065 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field546, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class207(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class207(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ec.z(I)V")
    public static void method2841() {
        try {
            File var0 = new File(Statics.field546, "random.dat");
            if (var0.exists()) {
                field2076 = new class208(new class207(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2081.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2082.length; var2++) {
                        File var3 = new File(Statics.field2082[var2] + Statics.field2081[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2076 = new class208(new class207(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2076 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2076 = new class208(new class207(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
