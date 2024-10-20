package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fe")
public class class168 {

    @ObfuscatedName("fe.h")
    public static class122 field2199 = null;

    @ObfuscatedName("fe.t")
    public static class122 field2200 = null;

    @ObfuscatedName("fe.i")
    public static class122 field2201 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.d(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2891(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2500 = new File(Statics.field1326, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2500.exists()) {
            try {
                class123 var7 = new class123(Statics.field2500, "rw", 10000L);
                class195 var8 = new class195((int) var7.method2364());
                while (var8.field2568 < var8.field2569.length) {
                    int var9 = var7.method2374(var8.field2569, var8.field2568, var8.field2569.length - var8.field2568);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2568 += var9;
                }
                var8.field2568 = 0;
                int var10 = var8.method3330();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3330();
                }
                if (var10 <= 2) {
                    var4 = var8.method3381();
                    if (var11 == 1) {
                        var5 = var8.method3381();
                    }
                } else {
                    var4 = var8.method3244();
                    if (var11 == 1) {
                        var5 = var8.method3244();
                    }
                }
                var7.method2367();
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
                if (!method210(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2195.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2202.length; var16++) {
                    File var17 = new File(Statics.field2202[var16] + Statics.field2195[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method210(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1326 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class123 var29 = new class123(Statics.field2500, "rw", 10000L);
                class195 var30 = new class195(500);
                var30.method3243(3);
                var30.method3243(var28 == null ? 0 : 1);
                var30.method3252(var27.getPath());
                if (var28 != null) {
                    var30.method3252(((File) var28).getPath());
                }
                var29.method2384(var30.field2569, 0, var30.field2568);
                var29.method2367();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ap.z(Ljava/io/File;ZI)Z")
    public static boolean method210(File arg0, boolean arg1) {
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

    @ObfuscatedName("cp.n(Ljava/lang/String;Ljava/lang/String;ZB)Ldi;")
    public static class123 method1806(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2198, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field656 == 33) {
            var6 = "_rc";
        } else if (Statics.field656 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1326, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class123(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class123(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
