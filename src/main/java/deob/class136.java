package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class136 {

    @ObfuscatedName("ex.x")
    public static class197 field2073 = null;

    @ObfuscatedName("ex.k")
    public static class197 field2075 = null;

    @ObfuscatedName("ex.o")
    public static class197 field2076 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.g(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method327(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1760 = arg3;
        Statics.field2077 = arg2;
        try {
            Statics.field1688 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field1688 = "Unknown";
        }
        Statics.field936 = Statics.field1688.toLowerCase();
        try {
            Statics.field17 = System.getProperty("user.home");
            if (Statics.field17 != null) {
                Statics.field17 = Statics.field17 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field936.startsWith("win")) {
                if (Statics.field17 == null) {
                    Statics.field17 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field17 == null) {
                Statics.field17 = System.getenv("HOME");
            }
            if (Statics.field17 != null) {
                Statics.field17 = Statics.field17 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field17 == null) {
            Statics.field17 = "~/";
        }
        Statics.field169 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field17, "/tmp/", "" };
        Statics.field2068 = new String[] { ".jagex_cache_" + Statics.field2077, ".file_store_" + Statics.field2077 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field2072 = Statics.method1050(arg0, arg1, var7);
            if (!Statics.field2072.exists()) {
                Statics.field2072.mkdirs();
            }
            File[] var8 = Statics.field2072.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label83;
                }
                File var11 = var9[var10];
                if (!method2384(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2072;
        Statics.field1928 = var12;
        if (!Statics.field1928.exists()) {
            throw new RuntimeException("");
        }
        class122.field1929 = true;
        method541();
        field2075 = new class197(new class196(class122.method2040("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2076 = new class197(new class196(class122.method2040("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field574 = new class197[Statics.field1760];
        for (int var13 = 0; var13 < Statics.field1760; var13++) {
            Statics.field574[var13] = new class197(new class196(class122.method2040("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dh.h(Ljava/io/File;ZB)Z")
    public static boolean method2384(File arg0, boolean arg1) {
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

    @ObfuscatedName("eo.m(Ljava/lang/String;Ljava/lang/String;ZI)Lgz;")
    public static class196 method2652(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2072, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class196(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2077 == 33) {
            var6 = "_rc";
        } else if (Statics.field2077 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field17, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class196(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class196(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ah.u(I)V")
    public static void method541() {
        try {
            File var0 = new File(Statics.field17, "random.dat");
            if (var0.exists()) {
                field2073 = new class197(new class196(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2068.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field169.length; var2++) {
                        File var3 = new File(Statics.field169[var2] + Statics.field2068[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2073 = new class197(new class196(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2073 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2073 = new class197(new class196(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
