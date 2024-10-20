package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fr")
public class class168 {

    @ObfuscatedName("fr.o")
    public static class342 field2027 = null;

    @ObfuscatedName("fr.v")
    public static class342 field2022 = null;

    @ObfuscatedName("fr.k")
    public static class342 field2029 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.f(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method441(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2023 = arg3;
        Statics.field1735 = arg2;
        try {
            Statics.field3093 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field3093 = "Unknown";
        }
        Statics.field1130 = Statics.field3093.toLowerCase();
        try {
            Statics.field1495 = System.getProperty("user.home");
            if (Statics.field1495 != null) {
                Statics.field1495 = Statics.field1495 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field1130.startsWith("win")) {
                if (Statics.field1495 == null) {
                    Statics.field1495 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1495 == null) {
                Statics.field1495 = System.getenv("HOME");
            }
            if (Statics.field1495 != null) {
                Statics.field1495 = Statics.field1495 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field1495 == null) {
            Statics.field1495 = "~/";
        }
        Statics.field2025 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1495, "/tmp/", "" };
        Statics.field220 = new String[] { ".jagex_cache_" + Statics.field1735, ".file_store_" + Statics.field1735 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field2028 = Statics.method1888(arg0, arg1, var7);
            if (!Statics.field2028.exists()) {
                Statics.field2028.mkdirs();
            }
            File[] var8 = Statics.field2028.listFiles();
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
                if (!method3261(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2028;
        Statics.field70 = var12;
        if (!Statics.field70.exists()) {
            throw new RuntimeException("");
        }
        class170.field2034 = true;
        try {
            File var13 = new File(Statics.field1495, "random.dat");
            if (var13.exists()) {
                field2027 = new class342(new class343(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field220.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2025.length; var15++) {
                        File var16 = new File(Statics.field2025[var15] + Statics.field220[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2027 = new class342(new class343(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2027 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2027 = new class342(new class343(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2022 = new class342(new class343(class170.method1069("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2029 = new class342(new class343(class170.method1069("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1153 = new class342[Statics.field2023];
        for (int var20 = 0; var20 < Statics.field2023; var20++) {
            Statics.field1153[var20] = new class342(new class343(class170.method1069("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ft.y(Ljava/io/File;ZI)Z")
    public static boolean method3261(File arg0, boolean arg1) {
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

    @ObfuscatedName("ce.w(Ljava/lang/String;Ljava/lang/String;ZI)Lmk;")
    public static class343 method2049(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2028, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class343(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1735 == 33) {
            var6 = "_rc";
        } else if (Statics.field1735 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1495, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class343(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class343(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cq.p(I)[B")
    public static byte[] method1892() {
        byte[] var0 = new byte[24];
        try {
            field2027.method6091(0L);
            field2027.method6073(var0);
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

    @ObfuscatedName("fv.b(Lkq;II)V")
    public static void method3147(class300 arg0, int arg1) {
        if (field2027 == null) {
            return;
        }
        try {
            field2027.method6091(0L);
            field2027.method6076(arg0.field3704, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
