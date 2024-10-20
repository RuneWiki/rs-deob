package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fk")
public class class158 {

    @ObfuscatedName("fk.r")
    public static class112 field2015 = null;

    @ObfuscatedName("fk.k")
    public static class112 field2014 = null;

    @ObfuscatedName("fk.m")
    public static class112 field2008 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.f(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method4236(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2012 = arg3;
        Statics.field1707 = arg2;
        try {
            Statics.field1942 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field1942 = "Unknown";
        }
        Statics.field2312 = Statics.field1942.toLowerCase();
        try {
            Statics.field1490 = System.getProperty("user.home");
            if (Statics.field1490 != null) {
                Statics.field1490 = Statics.field1490 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2312.startsWith("win")) {
                if (Statics.field1490 == null) {
                    Statics.field1490 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1490 == null) {
                Statics.field1490 = System.getenv("HOME");
            }
            if (Statics.field1490 != null) {
                Statics.field1490 = Statics.field1490 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field1490 == null) {
            Statics.field1490 = "~/";
        }
        Statics.field486 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1490, "/tmp/", "" };
        Statics.field1095 = new String[] { ".jagex_cache_" + Statics.field1707, ".file_store_" + Statics.field1707 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2011 = method3234(arg0, arg1, var7);
            if (!Statics.field2011.exists()) {
                Statics.field2011.mkdirs();
            }
            File[] var8 = Statics.field2011.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label79;
                }
                File var11 = var9[var10];
                if (!method4410(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class161.method637(Statics.field2011);
        method3220();
        field2014 = new class112(new class113(class161.method2982("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2008 = new class112(new class113(class161.method2982("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1060 = new class112[Statics.field2012];
        for (int var12 = 0; var12 < Statics.field2012; var12++) {
            Statics.field1060[var12] = new class112(new class113(class161.method2982("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("fv.h(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3234(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1851 = new File(Statics.field1490, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1851.exists()) {
            try {
                class113 var7 = new class113(Statics.field1851, "rw", 10000L);
                class185 var8 = new class185((int) var7.method2330());
                while (var8.field2397 < var8.field2399.length) {
                    int var9 = var7.method2331(var8.field2399, var8.field2397, var8.field2399.length - var8.field2397);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2397 += var9;
                }
                var8.field2397 = 0;
                int var10 = var8.method3323();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3323();
                }
                if (var10 <= 2) {
                    var4 = var8.method3333();
                    if (var11 == 1) {
                        var5 = var8.method3333();
                    }
                } else {
                    var4 = var8.method3334();
                    if (var11 == 1) {
                        var5 = var8.method3334();
                    }
                }
                var7.method2343();
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
                if (!method4410(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1095.length; var15++) {
                for (int var16 = 0; var16 < Statics.field486.length; var16++) {
                    File var17 = new File(Statics.field486[var16] + Statics.field1095[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method4410(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1490 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class113 var29 = new class113(Statics.field1851, "rw", 10000L);
                class185 var30 = new class185(500);
                var30.method3531(3);
                var30.method3531(var28 == null ? 0 : 1);
                var30.method3316(var27.getPath());
                if (var28 != null) {
                    var30.method3316(((File) var28).getPath());
                }
                var29.method2347(var30.field2399, 0, var30.field2397);
                var29.method2343();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ip.e(Ljava/io/File;ZB)Z")
    public static boolean method4410(File arg0, boolean arg1) {
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

    @ObfuscatedName("o.b(Ljava/lang/String;Ljava/lang/String;ZI)Ldf;")
    public static class113 method212(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2011, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class113(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1707 == 33) {
            var6 = "_rc";
        } else if (Statics.field1707 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1490, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("fq.l(I)V")
    public static void method3220() {
        try {
            File var0 = new File(Statics.field1490, "random.dat");
            if (var0.exists()) {
                field2015 = new class112(new class113(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1095.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field486.length; var2++) {
                        File var3 = new File(Statics.field486[var2] + Statics.field1095[var1] + File.separatorChar + "random.dat");
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

    @ObfuscatedName("k.w(I)[B")
    public static byte[] method133() {
        byte[] var0 = new byte[24];
        try {
            field2015.method2297(0L);
            field2015.method2316(var0);
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

    @ObfuscatedName("j.d(I)V")
    public static void method299() {
        try {
            field2014.method2299();
            for (int var0 = 0; var0 < Statics.field2012; var0++) {
                Statics.field1060[var0].method2299();
            }
            field2008.method2299();
            field2015.method2299();
        } catch (Exception var2) {
        }
    }
}
