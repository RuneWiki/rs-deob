package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("if")
public class class212 {

    @ObfuscatedName("if.av")
    public static class508 field2290 = null;

    @ObfuscatedName("if.ax")
    public static class508 field2291 = null;

    @ObfuscatedName("if.as")
    public static class508 field2283 = null;

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nq.at(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method5661(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field1465 = arg4;
        Statics.field5092 = arg3;
        try {
            Statics.field1089 = System.getProperty("os.name");
        } catch (Exception var24) {
            Statics.field1089 = "Unknown";
        }
        Statics.field1765 = Statics.field1089.toLowerCase();
        Statics.field926 = null;
        try {
            Statics.field926 = System.getProperty("jagex.userhome");
        } catch (Exception var23) {
        }
        if (Statics.field926 == null) {
            try {
                Statics.field926 = System.getProperty("user.home");
            } catch (Exception var22) {
            }
        }
        if (Statics.field926 != null) {
            Statics.field926 = Statics.field926 + "/";
        }
        try {
            if (Statics.field1765.startsWith("win")) {
                if (Statics.field926 == null) {
                    Statics.field926 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field926 == null) {
                Statics.field926 = System.getenv("HOME");
            }
            if (Statics.field926 != null) {
                Statics.field926 = Statics.field926 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field926 == null) {
            Statics.field926 = "~/";
        }
        Statics.field3092 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field926, "/tmp/", "" };
        Statics.field1040 = new String[] { ".jagex_cache_" + Statics.field5092, ".file_store_" + Statics.field5092 };
        int var9 = 0;
        label107: while (var9 < 4) {
            Statics.field2286 = method3350(arg0, arg2, var9);
            if (!Statics.field2286.exists()) {
                Statics.field2286.mkdirs();
            }
            File[] var10 = Statics.field2286.listFiles();
            if (var10 == null) {
                break;
            }
            File[] var11 = var10;
            int var12 = 0;
            while (true) {
                if (var12 >= var11.length) {
                    break label107;
                }
                File var13 = var11[var12];
                boolean var16;
                try {
                    RandomAccessFile var14 = new RandomAccessFile(var13, "rw");
                    int var15 = var14.read();
                    var14.seek(0L);
                    var14.write(var15);
                    var14.seek(0L);
                    var14.close();
                    var16 = true;
                } catch (Exception var20) {
                    var16 = false;
                }
                if (!var16) {
                    var9++;
                    break;
                }
                var12++;
            }
        }
        File var18 = Statics.field2286;
        Statics.field2297 = var18;
        if (!Statics.field2297.exists()) {
            throw new RuntimeException("");
        }
        class214.field2298 = true;
        method2736();
        field2291 = new class508(new class507(class214.method101("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2283 = new class508(new class507(class214.method101("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field127 = new class508[Statics.field1465];
        for (int var19 = 0; var19 < Statics.field1465; var19++) {
            Statics.field127[var19] = new class508(new class507(class214.method101("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("gd.ah(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3350(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2285 = new File(Statics.field926, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2285.exists()) {
            try {
                class507 var7 = new class507(Statics.field2285, "rw", 10000L);
                class527 var8 = new class527((int) var7.method8214());
                while (var8.field5137 < var8.field5140.length) {
                    int var9 = var7.method8198(var8.field5140, var8.field5137, var8.field5140.length - var8.field5137);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field5137 += var9;
                }
                var8.field5137 = 0;
                int var10 = var8.method8410();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method8410();
                }
                if (var10 <= 2) {
                    var4 = var8.method8422();
                    if (var11 == 1) {
                        var5 = var8.method8422();
                    }
                } else {
                    var4 = var8.method8631();
                    if (var11 == 1) {
                        var5 = var8.method8631();
                    }
                }
                var7.method8195();
            } catch (IOException var45) {
                var45.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var43) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label134: for (int var19 = 0; var19 < Statics.field1040.length; var19++) {
                for (int var20 = 0; var20 < Statics.field3092.length; var20++) {
                    File var21 = new File(Statics.field3092[var20] + Statics.field1040[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var42) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label134;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field926 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var36 = new File(var4);
            Object var37 = null;
            try {
                class507 var38 = new class507(Statics.field2285, "rw", 10000L);
                class527 var39 = new class527(500);
                var39.method8393(3);
                var39.method8393(var37 == null ? 0 : 1);
                var39.method8402(var36.getPath());
                if (var37 != null) {
                    var39.method8402(((File) var37).getPath());
                }
                var38.method8203(var39.field5140, 0, var39.field5137);
                var38.method8195();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("fm.ar(Ljava/lang/String;Ljava/lang/String;ZI)Lto;")
    public static class507 method2944(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2286, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class507(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field5092 == 33) {
            var6 = "_rc";
        } else if (Statics.field5092 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field926, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class507(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class507(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ef.ao(I)V")
    public static void method2736() {
        try {
            File var0 = new File(Statics.field926, "random.dat");
            if (var0.exists()) {
                field2290 = new class508(new class507(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1040.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field3092.length; var2++) {
                        File var3 = new File(Statics.field3092[var2] + Statics.field1040[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2290 = new class508(new class507(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2290 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2290 = new class508(new class507(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("fo.ab(I)[B")
    public static byte[] method3034() {
        byte[] var0 = new byte[24];
        try {
            field2290.method8218(0L);
            field2290.method8220(var0);
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

    @ObfuscatedName("gh.au(I)V")
    public static void method3343() {
        try {
            field2291.method8217();
            for (int var0 = 0; var0 < Statics.field1465; var0++) {
                Statics.field127[var0].method8217();
            }
            field2283.method8217();
            field2290.method8217();
        } catch (Exception var2) {
        }
    }
}
