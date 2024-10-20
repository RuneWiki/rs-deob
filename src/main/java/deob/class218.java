package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ic")
public class class218 {

    @ObfuscatedName("ic.au")
    public static class528 field2361 = null;

    @ObfuscatedName("ic.ah")
    public static class528 field2362 = null;

    @ObfuscatedName("ic.az")
    public static class528 field2363 = null;

    public class218() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iw.aq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method3889(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field77 = arg4;
        Statics.field2364 = arg3;
        try {
            Statics.field2356 = System.getProperty("os.name");
        } catch (Exception var25) {
            Statics.field2356 = "Unknown";
        }
        Statics.field1271 = Statics.field2356.toLowerCase();
        Statics.field886 = null;
        try {
            Statics.field886 = System.getProperty("jagex.userhome");
        } catch (Exception var24) {
        }
        if (Statics.field886 == null) {
            try {
                Statics.field886 = System.getProperty("user.home");
            } catch (Exception var23) {
            }
        }
        if (Statics.field886 != null) {
            Statics.field886 = Statics.field886 + "/";
        }
        try {
            if (Statics.field1271.startsWith("win")) {
                if (Statics.field886 == null) {
                    Statics.field886 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field886 == null) {
                Statics.field886 = System.getenv("HOME");
            }
            if (Statics.field886 != null) {
                Statics.field886 = Statics.field886 + "/";
            }
        } catch (Exception var22) {
        }
        if (Statics.field886 == null) {
            Statics.field886 = "~/";
        }
        Statics.field1696 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field886, "/tmp/", "" };
        Statics.field1074 = new String[] { ".jagex_cache_" + Statics.field2364, ".file_store_" + Statics.field2364 };
        int var9 = 0;
        label131: while (var9 < 4) {
            Statics.field2342 = method845(arg0, arg2, var9);
            if (!Statics.field2342.exists()) {
                Statics.field2342.mkdirs();
            }
            File[] var10 = Statics.field2342.listFiles();
            if (var10 == null) {
                break;
            }
            File[] var11 = var10;
            int var12 = 0;
            while (true) {
                if (var12 >= var11.length) {
                    break label131;
                }
                File var13 = var11[var12];
                if (!method3180(var13, false)) {
                    var9++;
                    break;
                }
                var12++;
            }
        }
        class220.method2631(Statics.field2342);
        try {
            File var14 = new File(Statics.field886, "random.dat");
            if (var14.exists()) {
                field2361 = new class528(new class527(var14, "rw", 25L), 24, 0);
            } else {
                label113: for (int var15 = 0; var15 < Statics.field1074.length; var15++) {
                    for (int var16 = 0; var16 < Statics.field1696.length; var16++) {
                        File var17 = new File(Statics.field1696[var16] + Statics.field1074[var15] + File.separatorChar + "random.dat");
                        if (var17.exists()) {
                            field2361 = new class528(new class527(var17, "rw", 25L), 24, 0);
                            break label113;
                        }
                    }
                }
            }
            if (field2361 == null) {
                RandomAccessFile var18 = new RandomAccessFile(var14, "rw");
                int var19 = var18.read();
                var18.seek(0L);
                var18.write(var19);
                var18.seek(0L);
                var18.close();
                field2361 = new class528(new class527(var14, "rw", 25L), 24, 0);
            }
        } catch (IOException var26) {
        }
        field2362 = new class528(new class527(class220.method4522("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2363 = new class528(new class527(class220.method4522("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1807 = new class528[Statics.field77];
        for (int var21 = 0; var21 < Statics.field77; var21++) {
            Statics.field1807[var21] = new class528(new class527(class220.method4522("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bn.ad(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method845(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2358 = new File(Statics.field886, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2358.exists()) {
            try {
                class527 var7 = new class527(Statics.field2358, "rw", 10000L);
                class547 var8 = new class547((int) var7.method8508());
                while (var8.field5363 < var8.field5364.length) {
                    int var9 = var7.method8524(var8.field5364, var8.field5363, var8.field5364.length - var8.field5363);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field5363 += var9;
                }
                var8.field5363 = 0;
                int var10 = var8.method8804();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method8804();
                }
                if (var10 <= 2) {
                    var4 = var8.method8882();
                    if (var11 == 1) {
                        var5 = var8.method8882();
                    }
                } else {
                    var4 = var8.method8741();
                    if (var11 == 1) {
                        var5 = var8.method8741();
                    }
                }
                var7.method8506();
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
                if (!method3180(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1074.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1696.length; var16++) {
                    File var17 = new File(Statics.field1696[var16] + Statics.field1074[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3180(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field886 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method4028(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("it.ag(Ljava/io/File;Ljava/io/File;I)V")
    public static void method4028(File arg0, File arg1) {
        try {
            class527 var2 = new class527(Statics.field2358, "rw", 10000L);
            class547 var3 = new class547(500);
            var3.method8711(3);
            var3.method8711(arg1 == null ? 0 : 1);
            var3.method8720(arg0.getPath());
            if (arg1 != null) {
                var3.method8720(arg1.getPath());
            }
            var2.method8511(var3.field5364, 0, var3.field5363);
            var2.method8506();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ge.ak(Ljava/io/File;ZI)Z")
    public static boolean method3180(File arg0, boolean arg1) {
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

    @ObfuscatedName("ed.ap(Ljava/lang/String;Ljava/lang/String;ZI)Lus;")
    public static class527 method2875(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2342, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class527(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2364 == 33) {
            var6 = "_rc";
        } else if (Statics.field2364 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field886, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class527(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class527(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.an(Lvp;II)V")
    public static void method3791(class547 arg0, int arg1) {
        if (field2361 == null) {
            return;
        }
        try {
            field2361.method8529(0L);
            field2361.method8552(arg0.field5364, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("di.aj(I)V")
    public static void method2281() {
        try {
            field2362.method8528();
            for (int var0 = 0; var0 < Statics.field77; var0++) {
                Statics.field1807[var0].method8528();
            }
            field2363.method8528();
            field2361.method8528();
        } catch (Exception var2) {
        }
    }
}
