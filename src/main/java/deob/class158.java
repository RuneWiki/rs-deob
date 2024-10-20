package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fq")
public class class158 {

    @ObfuscatedName("fq.d")
    public static class112 field2012 = null;

    @ObfuscatedName("fq.w")
    public static class112 field2013 = null;

    @ObfuscatedName("fq.a")
    public static class112 field2014 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.v(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1833(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2006 = arg3;
        Statics.field1099 = arg2;
        try {
            Statics.field538 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field538 = "Unknown";
        }
        Statics.field1981 = Statics.field538.toLowerCase();
        try {
            Statics.field1233 = System.getProperty("user.home");
            if (Statics.field1233 != null) {
                Statics.field1233 = Statics.field1233 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field1981.startsWith("win")) {
                if (Statics.field1233 == null) {
                    Statics.field1233 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1233 == null) {
                Statics.field1233 = System.getenv("HOME");
            }
            if (Statics.field1233 != null) {
                Statics.field1233 = Statics.field1233 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1233 == null) {
            Statics.field1233 = "~/";
        }
        Statics.field347 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1233, "/tmp/", "" };
        Statics.field1952 = new String[] { ".jagex_cache_" + Statics.field1099, ".file_store_" + Statics.field1099 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field617 = method4256(arg0, arg1, var7);
            if (!Statics.field617.exists()) {
                Statics.field617.mkdirs();
            }
            File[] var8 = Statics.field617.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label115;
                }
                File var11 = var9[var10];
                if (!method1797(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class161.method1670(Statics.field617);
        try {
            File var12 = new File(Statics.field1233, "random.dat");
            if (var12.exists()) {
                field2012 = new class112(new class113(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field1952.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field347.length; var14++) {
                        File var15 = new File(Statics.field347[var14] + Statics.field1952[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2012 = new class112(new class113(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2012 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2012 = new class112(new class113(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2013 = new class112(new class113(class161.method990("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2014 = new class112(new class113(class161.method990("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field197 = new class112[Statics.field2006];
        for (int var19 = 0; var19 < Statics.field2006; var19++) {
            Statics.field197[var19] = new class112(new class113(class161.method990("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("iz.s(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method4256(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1906 = new File(Statics.field1233, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1906.exists()) {
            try {
                class113 var7 = new class113(Statics.field1906, "rw", 10000L);
                class185 var8 = new class185((int) var7.method2324());
                while (var8.field2386 < var8.field2387.length) {
                    int var9 = var7.method2329(var8.field2387, var8.field2386, var8.field2387.length - var8.field2386);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2386 += var9;
                }
                var8.field2386 = 0;
                int var10 = var8.method3274();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3274();
                }
                if (var10 <= 2) {
                    var4 = var8.method3284();
                    if (var11 == 1) {
                        var5 = var8.method3284();
                    }
                } else {
                    var4 = var8.method3285();
                    if (var11 == 1) {
                        var5 = var8.method3285();
                    }
                }
                var7.method2326();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method1797(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1952.length; var15++) {
                for (int var16 = 0; var16 < Statics.field347.length; var16++) {
                    File var17 = new File(Statics.field347[var16] + Statics.field1952[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1797(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1233 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class113 var29 = new class113(Statics.field1906, "rw", 10000L);
                class185 var30 = new class185(500);
                var30.method3258(3);
                var30.method3258(var28 == null ? 0 : 1);
                var30.method3267(var27.getPath());
                if (var28 != null) {
                    var30.method3267(((File) var28).getPath());
                }
                var29.method2333(var30.field2387, 0, var30.field2386);
                var29.method2326();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("cs.o(Ljava/io/File;ZI)Z")
    public static boolean method1797(File arg0, boolean arg1) {
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

    @ObfuscatedName("r.k(Ljava/lang/String;Ljava/lang/String;ZI)Ldv;")
    public static class113 method372(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field617, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class113(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1099 == 33) {
            var6 = "_rc";
        } else if (Statics.field1099 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1233, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("fu.u(B)[B")
    public static byte[] method3001() {
        byte[] var0 = new byte[24];
        try {
            field2012.method2308(0L);
            field2012.method2300(var0);
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

    @ObfuscatedName("ju.i(I)V")
    public static void method4842() {
        try {
            field2013.method2297();
            for (int var0 = 0; var0 < Statics.field2006; var0++) {
                Statics.field197[var0].method2297();
            }
            field2014.method2297();
            field2012.method2297();
        } catch (Exception var2) {
        }
    }
}
