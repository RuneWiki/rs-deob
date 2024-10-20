package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eg")
public class class144 {

    @ObfuscatedName("eg.u")
    public static class222 field2136 = null;

    @ObfuscatedName("eg.m")
    public static class222 field2145 = null;

    @ObfuscatedName("eg.e")
    public static class222 field2138 = null;

    public class144() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.j(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method127(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2139 = arg3;
        Statics.field2148 = arg2;
        try {
            Statics.field1871 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field1871 = "Unknown";
        }
        Statics.field1356 = Statics.field1871.toLowerCase();
        try {
            Statics.field2146 = System.getProperty("user.home");
            if (Statics.field2146 != null) {
                Statics.field2146 = Statics.field2146 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field1356.startsWith("win")) {
                if (Statics.field2146 == null) {
                    Statics.field2146 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2146 == null) {
                Statics.field2146 = System.getenv("HOME");
            }
            if (Statics.field2146 != null) {
                Statics.field2146 = Statics.field2146 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field2146 == null) {
            Statics.field2146 = "~/";
        }
        Statics.field857 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2146, "/tmp/", "" };
        Statics.field160 = new String[] { ".jagex_cache_" + Statics.field2148, ".file_store_" + Statics.field2148 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field604 = Statics.method2850(arg0, arg1, var7);
            if (!Statics.field604.exists()) {
                Statics.field604.mkdirs();
            }
            File[] var8 = Statics.field604.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label119;
                }
                File var11 = var9[var10];
                if (!method632(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field604;
        Statics.field1973 = var12;
        if (!Statics.field1973.exists()) {
            throw new RuntimeException("");
        }
        class130.field1979 = true;
        try {
            File var13 = new File(Statics.field2146, "random.dat");
            if (var13.exists()) {
                field2136 = new class222(new class221(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field160.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field857.length; var15++) {
                        File var16 = new File(Statics.field857[var15] + Statics.field160[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2136 = new class222(new class221(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2136 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2136 = new class222(new class221(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2145 = new class222(new class221(class130.method1025("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2138 = new class222(new class221(class130.method1025("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2143 = new class222[Statics.field2139];
        for (int var20 = 0; var20 < Statics.field2139; var20++) {
            Statics.field2143[var20] = new class222(new class221(class130.method1025("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("k.z(Ljava/io/File;ZI)Z")
    public static boolean method632(File arg0, boolean arg1) {
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

    @ObfuscatedName("f.l(Ljava/lang/String;Ljava/lang/String;ZB)Lhd;")
    public static class221 method99(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field604, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class221(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2148 == 33) {
            var6 = "_rc";
        } else if (Statics.field2148 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2146, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class221(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class221(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
