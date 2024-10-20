package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ik")
public class class215 {

    @ObfuscatedName("ik.ah")
    public static class515 field2335 = null;

    @ObfuscatedName("ik.aj")
    public static class515 field2336 = null;

    @ObfuscatedName("ik.af")
    public static class515 field2340 = null;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.aq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method417(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field170 = arg4;
        Statics.field2329 = arg3;
        try {
            Statics.field4785 = System.getProperty("os.name");
        } catch (Exception var50) {
            Statics.field4785 = "Unknown";
        }
        Statics.field2321 = Statics.field4785.toLowerCase();
        Statics.field3606 = null;
        try {
            Statics.field3606 = System.getProperty("jagex.userhome");
        } catch (Exception var49) {
        }
        if (Statics.field3606 == null) {
            try {
                Statics.field3606 = System.getProperty("user.home");
            } catch (Exception var48) {
            }
        }
        if (Statics.field3606 != null) {
            Statics.field3606 = Statics.field3606 + "/";
        }
        try {
            if (Statics.field2321.startsWith("win")) {
                if (Statics.field3606 == null) {
                    Statics.field3606 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3606 == null) {
                Statics.field3606 = System.getenv("HOME");
            }
            if (Statics.field3606 != null) {
                Statics.field3606 = Statics.field3606 + "/";
            }
        } catch (Exception var47) {
        }
        if (Statics.field3606 == null) {
            Statics.field3606 = "~/";
        }
        Statics.field44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3606, "/tmp/", "" };
        Statics.field1622 = new String[] { ".jagex_cache_" + Statics.field2329, ".file_store_" + Statics.field2329 };
        int var9 = 0;
        label240: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field2332 = new File(Statics.field3606, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field2332.exists()) {
                try {
                    class514 var14 = new class514(Statics.field2332, "rw", 10000L);
                    class534 var15 = new class534((int) var14.method8362());
                    while (var15.field5200 < var15.field5199.length) {
                        int var16 = var14.method8363(var15.field5199, var15.field5200, var15.field5199.length - var15.field5200);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5200 += var16;
                    }
                    var15.field5200 = 0;
                    int var17 = var15.method8591();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method8591();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method8603();
                        if (var18 == 1) {
                            var12 = var15.method8603();
                        }
                    } else {
                        var11 = var15.method8774();
                        if (var18 == 1) {
                            var12 = var15.method8774();
                        }
                    }
                    var14.method8360();
                } catch (IOException var52) {
                    var52.printStackTrace();
                }
                if (var11 != null) {
                    File var20 = new File(var11);
                    if (!var20.exists()) {
                        var11 = null;
                    }
                }
                if (var11 != null) {
                    File var21 = new File(var11, "test.dat");
                    if (!method2377(var21, true)) {
                        var11 = null;
                    }
                }
            }
            if (var11 == null && var9 == 0) {
                label215: for (int var22 = 0; var22 < Statics.field1622.length; var22++) {
                    for (int var23 = 0; var23 < Statics.field44.length; var23++) {
                        File var24 = new File(Statics.field44[var23] + Statics.field1622[var22] + File.separatorChar + arg0 + File.separatorChar);
                        if (var24.exists() && method2377(new File(var24, "test.dat"), true)) {
                            var11 = var24.toString();
                            var13 = true;
                            break label215;
                        }
                    }
                }
            }
            if (var11 == null) {
                var11 = Statics.field3606 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
                var13 = true;
            }
            if (var12 != null) {
                File var25 = new File(var12);
                File var26 = new File(var11);
                try {
                    File[] var27 = var25.listFiles();
                    File[] var28 = var27;
                    for (int var29 = 0; var29 < var28.length; var29++) {
                        File var30 = var28[var29];
                        File var31 = new File(var26, var30.getName());
                        boolean var32 = var30.renameTo(var31);
                        if (!var32) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var51) {
                    var51.printStackTrace();
                }
                var13 = true;
            }
            if (var13) {
                File var34 = new File(var11);
                Object var35 = null;
                try {
                    class514 var36 = new class514(Statics.field2332, "rw", 10000L);
                    class534 var37 = new class534(500);
                    var37.method8574(3);
                    var37.method8574(var35 == null ? 0 : 1);
                    var37.method8787(var34.getPath());
                    if (var35 != null) {
                        var37.method8787(((File) var35).getPath());
                    }
                    var36.method8359(var37.field5199, 0, var37.field5200);
                    var36.method8360();
                } catch (IOException var46) {
                    var46.printStackTrace();
                }
            }
            File var39 = new File(var11);
            Statics.field50 = var39;
            if (!Statics.field50.exists()) {
                Statics.field50.mkdirs();
            }
            File[] var40 = Statics.field50.listFiles();
            if (var40 != null) {
                File[] var41 = var40;
                for (int var42 = 0; var42 < var41.length; var42++) {
                    File var43 = var41[var42];
                    if (!method2377(var43, false)) {
                        var9++;
                        continue label240;
                    }
                }
            }
            break;
        }
        File var44 = Statics.field50;
        Statics.field1726 = var44;
        if (!Statics.field1726.exists()) {
            throw new RuntimeException("");
        }
        class217.field2346 = true;
        method3379();
        field2336 = new class515(new class514(class217.method3099("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2340 = new class515(new class514(class217.method3099("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1847 = new class515[Statics.field170];
        for (int var45 = 0; var45 < Statics.field170; var45++) {
            Statics.field1847[var45] = new class515(new class514(class217.method3099("main_file_cache.idx" + var45), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dp.aw(Ljava/io/File;ZS)Z")
    public static boolean method2377(File arg0, boolean arg1) {
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

    @ObfuscatedName("gu.al(Ljava/lang/String;Ljava/lang/String;ZI)Ltf;")
    public static class514 method3279(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field50, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class514(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2329 == 33) {
            var6 = "_rc";
        } else if (Statics.field2329 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3606, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class514(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class514(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ho.ai(I)V")
    public static void method3379() {
        try {
            File var0 = new File(Statics.field3606, "random.dat");
            if (var0.exists()) {
                field2335 = new class515(new class514(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1622.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field44.length; var2++) {
                        File var3 = new File(Statics.field44[var2] + Statics.field1622[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2335 = new class515(new class514(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2335 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2335 = new class515(new class514(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("pw.ar(Luq;IB)V")
    public static void method6927(class534 arg0, int arg1) {
        if (field2335 == null) {
            return;
        }
        try {
            field2335.method8385(0L);
            field2335.method8407(arg0.field5199, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ds.as(B)V")
    public static void method2337() {
        try {
            field2336.method8384();
            for (int var0 = 0; var0 < Statics.field170; var0++) {
                Statics.field1847[var0].method8384();
            }
            field2340.method8384();
            field2335.method8384();
        } catch (Exception var2) {
        }
    }
}
