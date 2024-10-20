package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gw")
public class class179 {

    @ObfuscatedName("gw.av")
    public static class527 field1893 = null;

    @ObfuscatedName("gw.aq")
    public static class527 field1892 = null;

    @ObfuscatedName("gw.ap")
    public static class527 field1897 = null;

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.ak(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2308(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field2995 = arg4;
        Statics.field1896 = arg3;
        try {
            Statics.field1745 = System.getProperty("os.name");
        } catch (Exception var25) {
            Statics.field1745 = "Unknown";
        }
        Statics.field978 = Statics.field1745.toLowerCase();
        Statics.field1106 = null;
        try {
            Statics.field1106 = System.getProperty("jagex.userhome");
        } catch (Exception var24) {
        }
        if (Statics.field1106 == null) {
            try {
                Statics.field1106 = System.getProperty("user.home");
            } catch (Exception var23) {
            }
        }
        if (Statics.field1106 != null) {
            Statics.field1106 = Statics.field1106 + "/";
        }
        try {
            if (Statics.field978.startsWith("win")) {
                if (Statics.field1106 == null) {
                    Statics.field1106 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1106 == null) {
                Statics.field1106 = System.getenv("HOME");
            }
            if (Statics.field1106 != null) {
                Statics.field1106 = Statics.field1106 + "/";
            }
        } catch (Exception var22) {
        }
        if (Statics.field1106 == null) {
            Statics.field1106 = "~/";
        }
        Statics.field1816 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1106, "/tmp/", "" };
        Statics.field1017 = new String[] { ".jagex_cache_" + Statics.field1896, ".file_store_" + Statics.field1896 };
        int var9 = 0;
        label131: while (var9 < 4) {
            Statics.field22 = method8228(arg0, arg2, var9);
            if (!Statics.field22.exists()) {
                Statics.field22.mkdirs();
            }
            File[] var10 = Statics.field22.listFiles();
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
                if (!method7590(var13, false)) {
                    var9++;
                    break;
                }
                var12++;
            }
        }
        class181.method7114(Statics.field22);
        try {
            File var14 = new File(Statics.field1106, "random.dat");
            if (var14.exists()) {
                field1893 = new class527(new class526(var14, "rw", 25L), 24, 0);
            } else {
                label113: for (int var15 = 0; var15 < Statics.field1017.length; var15++) {
                    for (int var16 = 0; var16 < Statics.field1816.length; var16++) {
                        File var17 = new File(Statics.field1816[var16] + Statics.field1017[var15] + File.separatorChar + "random.dat");
                        if (var17.exists()) {
                            field1893 = new class527(new class526(var17, "rw", 25L), 24, 0);
                            break label113;
                        }
                    }
                }
            }
            if (field1893 == null) {
                RandomAccessFile var18 = new RandomAccessFile(var14, "rw");
                int var19 = var18.read();
                var18.seek(0L);
                var18.write(var19);
                var18.seek(0L);
                var18.close();
                field1893 = new class527(new class526(var14, "rw", 25L), 24, 0);
            }
        } catch (IOException var26) {
        }
        field1892 = new class527(new class526(class181.method4146("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1897 = new class527(new class526(class181.method4146("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field920 = new class527[Statics.field2995];
        for (int var21 = 0; var21 < Statics.field2995; var21++) {
            Statics.field920[var21] = new class527(new class526(class181.method4146("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("tt.al(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method8228(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1890 = new File(Statics.field1106, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1890.exists()) {
            try {
                class526 var7 = new class526(Statics.field1890, "rw", 10000L);
                class546 var8 = new class546((int) var7.method8568());
                while (var8.field5344 < var8.field5346.length) {
                    int var9 = var7.method8576(var8.field5346, var8.field5344, var8.field5346.length - var8.field5344);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field5344 += var9;
                }
                var8.field5344 = 0;
                int var10 = var8.method8796();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method8796();
                }
                if (var10 <= 2) {
                    var4 = var8.method8968();
                    if (var11 == 1) {
                        var5 = var8.method8968();
                    }
                } else {
                    var4 = var8.method8993();
                    if (var11 == 1) {
                        var5 = var8.method8993();
                    }
                }
                var7.method8566();
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
                if (!method7590(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1017.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1816.length; var16++) {
                    File var17 = new File(Statics.field1816[var16] + Statics.field1017[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method7590(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1106 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class526 var29 = new class526(Statics.field1890, "rw", 10000L);
                class546 var30 = new class546(500);
                var30.method8779(3);
                var30.method8779(var28 == null ? 0 : 1);
                var30.method8788(var27.getPath());
                if (var28 != null) {
                    var30.method8788(((File) var28).getPath());
                }
                var29.method8562(var30.field5346, 0, var30.field5344);
                var29.method8566();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("qj.aj(Ljava/io/File;ZS)Z")
    public static boolean method7590(File arg0, boolean arg1) {
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

    @ObfuscatedName("er.az(Ljava/lang/String;Ljava/lang/String;ZI)Lue;")
    public static class526 method2825(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field22, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class526(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1896 == 33) {
            var6 = "_rc";
        } else if (Statics.field1896 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1106, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class526(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class526(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cm.af(I)[B")
    public static byte[] method1076() {
        byte[] var0 = new byte[24];
        try {
            field1893.method8615(0L);
            field1893.method8589(var0);
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

    @ObfuscatedName("ea.aa(Lua;IB)V")
    public static void method2806(class546 arg0, int arg1) {
        if (field1893 == null) {
            return;
        }
        try {
            field1893.method8615(0L);
            field1893.method8588(arg0.field5346, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gj.at(I)V")
    public static void method3176() {
        try {
            field1892.method8586();
            for (int var0 = 0; var0 < Statics.field2995; var0++) {
                Statics.field920[var0].method8586();
            }
            field1897.method8586();
            field1893.method8586();
        } catch (Exception var2) {
        }
    }
}
