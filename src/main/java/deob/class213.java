package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ic")
public class class213 {

    @ObfuscatedName("ic.an")
    public static class512 field2313 = null;

    @ObfuscatedName("ic.ad")
    public static class512 field2308 = null;

    @ObfuscatedName("ic.ax")
    public static class512 field2309 = null;

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.am(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2394(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field2304 = arg4;
        Statics.field1995 = arg3;
        try {
            Statics.field1384 = System.getProperty("os.name");
        } catch (Exception var30) {
            Statics.field1384 = "Unknown";
        }
        Statics.field1927 = Statics.field1384.toLowerCase();
        Statics.field2445 = null;
        try {
            Statics.field2445 = System.getProperty("jagex.userhome");
        } catch (Exception var29) {
        }
        if (Statics.field2445 == null) {
            try {
                Statics.field2445 = System.getProperty("user.home");
            } catch (Exception var28) {
            }
        }
        if (Statics.field2445 != null) {
            Statics.field2445 = Statics.field2445 + "/";
        }
        try {
            if (Statics.field1927.startsWith("win")) {
                if (Statics.field2445 == null) {
                    Statics.field2445 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2445 == null) {
                Statics.field2445 = System.getenv("HOME");
            }
            if (Statics.field2445 != null) {
                Statics.field2445 = Statics.field2445 + "/";
            }
        } catch (Exception var27) {
        }
        if (Statics.field2445 == null) {
            Statics.field2445 = "~/";
        }
        Statics.field495 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2445, "/tmp/", "" };
        Statics.field1459 = new String[] { ".jagex_cache_" + Statics.field1995, ".file_store_" + Statics.field1995 };
        int var9 = 0;
        label139: while (var9 < 4) {
            Statics.field4504 = method5701(arg0, arg2, var9);
            if (!Statics.field4504.exists()) {
                Statics.field4504.mkdirs();
            }
            File[] var10 = Statics.field4504.listFiles();
            if (var10 == null) {
                break;
            }
            File[] var11 = var10;
            int var12 = 0;
            while (true) {
                if (var12 >= var11.length) {
                    break label139;
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
                } catch (Exception var26) {
                    var16 = false;
                }
                if (!var16) {
                    var9++;
                    break;
                }
                var12++;
            }
        }
        class215.method6534(Statics.field4504);
        try {
            File var18 = new File(Statics.field2445, "random.dat");
            if (var18.exists()) {
                field2313 = new class512(new class511(var18, "rw", 25L), 24, 0);
            } else {
                label120: for (int var19 = 0; var19 < Statics.field1459.length; var19++) {
                    for (int var20 = 0; var20 < Statics.field495.length; var20++) {
                        File var21 = new File(Statics.field495[var20] + Statics.field1459[var19] + File.separatorChar + "random.dat");
                        if (var21.exists()) {
                            field2313 = new class512(new class511(var21, "rw", 25L), 24, 0);
                            break label120;
                        }
                    }
                }
            }
            if (field2313 == null) {
                RandomAccessFile var22 = new RandomAccessFile(var18, "rw");
                int var23 = var22.read();
                var22.seek(0L);
                var22.write(var23);
                var22.seek(0L);
                var22.close();
                field2313 = new class512(new class511(var18, "rw", 25L), 24, 0);
            }
        } catch (IOException var31) {
        }
        field2308 = new class512(new class511(class215.method3274("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2309 = new class512(new class511(class215.method3274("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2310 = new class512[Statics.field2304];
        for (int var25 = 0; var25 < Statics.field2304; var25++) {
            Statics.field2310[var25] = new class512(new class511(class215.method3274("main_file_cache.idx" + var25), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ma.ap(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method5701(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3442 = new File(Statics.field2445, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3442.exists()) {
            try {
                class511 var7 = new class511(Statics.field3442, "rw", 10000L);
                class531 var8 = new class531((int) var7.method8350());
                while (var8.field5181 < var8.field5178.length) {
                    int var9 = var7.method8351(var8.field5178, var8.field5181, var8.field5178.length - var8.field5181);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field5181 += var9;
                }
                var8.field5181 = 0;
                int var10 = var8.method8561();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method8561();
                }
                if (var10 <= 2) {
                    var4 = var8.method8635();
                    if (var11 == 1) {
                        var5 = var8.method8635();
                    }
                } else {
                    var4 = var8.method8573();
                    if (var11 == 1) {
                        var5 = var8.method8573();
                    }
                }
                var7.method8352();
            } catch (IOException var39) {
                var39.printStackTrace();
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
                } catch (Exception var37) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label119: for (int var19 = 0; var19 < Statics.field1459.length; var19++) {
                for (int var20 = 0; var20 < Statics.field495.length; var20++) {
                    File var21 = new File(Statics.field495[var20] + Statics.field1459[var19] + File.separatorChar + arg0 + File.separatorChar);
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
                        } catch (Exception var36) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label119;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2445 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var38) {
                var38.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method3091(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("fc.af(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3091(File arg0, File arg1) {
        try {
            class511 var2 = new class511(Statics.field3442, "rw", 10000L);
            class531 var3 = new class531(500);
            var3.method8699(3);
            var3.method8699(arg1 == null ? 0 : 1);
            var3.method8553(arg0.getPath());
            if (arg1 != null) {
                var3.method8553(arg1.getPath());
            }
            var2.method8348(var3.field5178, 0, var3.field5181);
            var2.method8352();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("nc.aj(Ljava/lang/String;Ljava/lang/String;ZB)Ltt;")
    public static class511 method6289(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field4504, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class511(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1995 == 33) {
            var6 = "_rc";
        } else if (Statics.field1995 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2445, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class511(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class511(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fr.aq(B)[B")
    public static byte[] method3014() {
        byte[] var0 = new byte[24];
        try {
            field2313.method8376(0L);
            field2313.method8378(var0);
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

    @ObfuscatedName("eo.ar(I)V")
    public static void method2655() {
        try {
            field2308.method8391();
            for (int var0 = 0; var0 < Statics.field2304; var0++) {
                Statics.field2310[var0].method8391();
            }
            field2309.method8391();
            field2313.method8391();
        } catch (Exception var2) {
        }
    }
}
