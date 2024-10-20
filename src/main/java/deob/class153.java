package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class153 {

    @ObfuscatedName("ex.v")
    public static class232 field2296 = null;

    @ObfuscatedName("ex.h")
    public static class232 field2291 = null;

    @ObfuscatedName("ex.u")
    public static class232 field2290 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.m(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method114(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2293 = new File(Statics.field1156, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2293.exists()) {
            try {
                class231 var7 = new class231(Statics.field2293, "rw", 10000L);
                class123 var8 = new class123((int) var7.method3945());
                while (var8.field2046 < var8.field2048.length) {
                    int var9 = var7.method3941(var8.field2048, var8.field2046, var8.field2048.length - var8.field2046);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2046 += var9;
                }
                var8.field2046 = 0;
                int var10 = var8.method2398();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2398();
                }
                if (var10 <= 2) {
                    var4 = var8.method2423();
                    if (var11 == 1) {
                        var5 = var8.method2423();
                    }
                } else {
                    var4 = var8.method2424();
                    if (var11 == 1) {
                        var5 = var8.method2424();
                    }
                }
                var7.method3954();
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
                if (!method2336(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1155.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1160.length; var16++) {
                    File var17 = new File(Statics.field1160[var16] + Statics.field1155[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2336(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1156 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class231 var29 = new class231(Statics.field2293, "rw", 10000L);
                class123 var30 = new class123(500);
                var30.method2399(3);
                var30.method2399(var28 == null ? 0 : 1);
                var30.method2407(var27.getPath());
                if (var28 != null) {
                    var30.method2407(((File) var28).getPath());
                }
                var29.method3938(var30.field2048, 0, var30.field2046);
                var29.method3954();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("dw.w(Ljava/io/File;ZB)Z")
    public static boolean method2336(File arg0, boolean arg1) {
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

    @ObfuscatedName("r.e(Ljava/lang/String;Ljava/lang/String;ZI)Lhz;")
    public static class231 method92(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2292, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field575 == 33) {
            var6 = "_rc";
        } else if (Statics.field575 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1156, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class231(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class231(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dq.o(Ldj;I)V")
    public static void method2704(class123 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2296.method3958(0L);
            field2296.method3971(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2584(var1, 0, 24);
    }
}
