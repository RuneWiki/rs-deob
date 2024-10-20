package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ev")
public class class149 {

    @ObfuscatedName("ev.v")
    public static class228 field2235 = null;

    @ObfuscatedName("ev.o")
    public static class228 field2225 = null;

    @ObfuscatedName("ev.n")
    public static class228 field2230 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.g(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1072(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field205 = arg3;
        Statics.field2231 = arg2;
        try {
            Statics.field725 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field725 = "Unknown";
        }
        Statics.field586 = Statics.field725.toLowerCase();
        try {
            Statics.field1997 = System.getProperty("user.home");
            if (Statics.field1997 != null) {
                Statics.field1997 = Statics.field1997 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field586.startsWith("win")) {
                if (Statics.field1997 == null) {
                    Statics.field1997 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1997 == null) {
                Statics.field1997 = System.getenv("HOME");
            }
            if (Statics.field1997 != null) {
                Statics.field1997 = Statics.field1997 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field1997 == null) {
            Statics.field1997 = "~/";
        }
        Statics.field2232 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1997, "/tmp/", "" };
        Statics.field1617 = new String[] { ".jagex_cache_" + Statics.field2231, ".file_store_" + Statics.field2231 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field181 = method185(arg0, arg1, var7);
            if (!Statics.field181.exists()) {
                Statics.field181.mkdirs();
            }
            File[] var8 = Statics.field181.listFiles();
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
                if (!method2074(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field181;
        Statics.field2079 = var12;
        if (!Statics.field2079.exists()) {
            throw new RuntimeException("");
        }
        class135.field2080 = true;
        try {
            File var13 = new File(Statics.field1997, "random.dat");
            if (var13.exists()) {
                field2235 = new class228(new class227(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field1617.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2232.length; var15++) {
                        File var16 = new File(Statics.field2232[var15] + Statics.field1617[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2235 = new class228(new class227(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2235 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2235 = new class228(new class227(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2225 = new class228(new class227(class135.method2163("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2230 = new class228(new class227(class135.method2163("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1092 = new class228[Statics.field205];
        for (int var20 = 0; var20 < Statics.field205; var20++) {
            Statics.field1092[var20] = new class228(new class227(class135.method2163("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("j.b(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method185(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2224 = new File(Statics.field1997, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2224.exists()) {
            try {
                class227 var7 = new class227(Statics.field2224, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3908());
                while (var8.field1977 < var8.field1986.length) {
                    int var9 = var7.method3902(var8.field1986, var8.field1977, var8.field1986.length - var8.field1977);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1977 += var9;
                }
                var8.field1977 = 0;
                int var10 = var8.method2362();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2362();
                }
                if (var10 <= 2) {
                    var4 = var8.method2517();
                    if (var11 == 1) {
                        var5 = var8.method2517();
                    }
                } else {
                    var4 = var8.method2372();
                    if (var11 == 1) {
                        var5 = var8.method2372();
                    }
                }
                var7.method3900();
            } catch (IOException var28) {
                var28.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method2074(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1617.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2232.length; var16++) {
                    File var17 = new File(Statics.field2232[var16] + Statics.field1617[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2074(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1997 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method128(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("c.w(Ljava/io/File;Ljava/io/File;I)V")
    public static void method128(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2224, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2476(3);
            var3.method2476(arg1 == null ? 0 : 1);
            var3.method2356(arg0.getPath());
            if (arg1 != null) {
                var3.method2356(arg1.getPath());
            }
            var2.method3918(var3.field1986, 0, var3.field1977);
            var2.method3900();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("cu.d(Ljava/io/File;ZB)Z")
    public static boolean method2074(File arg0, boolean arg1) {
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

    @ObfuscatedName("aw.z(Ljava/lang/String;Ljava/lang/String;ZI)Lhd;")
    public static class227 method736(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field181, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2231 == 33) {
            var6 = "_rc";
        } else if (Statics.field2231 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1997, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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
}
