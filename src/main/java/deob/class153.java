package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("el")
public class class153 {

    @ObfuscatedName("el.k")
    public static class232 field2300 = null;

    @ObfuscatedName("el.x")
    public static class232 field2305 = null;

    @ObfuscatedName("el.u")
    public static class232 field2298 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gv.a(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method3526(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3186 = new File(Statics.field3260, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3186.exists()) {
            try {
                class231 var7 = new class231(Statics.field3186, "rw", 10000L);
                class123 var8 = new class123((int) var7.method3937());
                while (var8.field2071 < var8.field2076.length) {
                    int var9 = var7.method3935(var8.field2076, var8.field2071, var8.field2076.length - var8.field2071);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2071 += var9;
                }
                var8.field2071 = 0;
                int var10 = var8.method2395();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2395();
                }
                if (var10 <= 2) {
                    var4 = var8.method2398();
                    if (var11 == 1) {
                        var5 = var8.method2398();
                    }
                } else {
                    var4 = var8.method2426();
                    if (var11 == 1) {
                        var5 = var8.method2426();
                    }
                }
                var7.method3954();
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
                if (!method1298(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2083.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2121.length; var16++) {
                    File var17 = new File(Statics.field2121[var16] + Statics.field2083[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1298(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field3260 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1537(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("bi.d(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1537(File arg0, File arg1) {
        try {
            class231 var2 = new class231(Statics.field3186, "rw", 10000L);
            class123 var3 = new class123(500);
            var3.method2380(3);
            var3.method2380(arg1 == null ? 0 : 1);
            var3.method2388(arg0.getPath());
            if (arg1 != null) {
                var3.method2388(arg1.getPath());
            }
            var2.method3932(var3.field2076, 0, var3.field2071);
            var2.method3954();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bj.v(Ljava/io/File;ZI)Z")
    public static boolean method1298(File arg0, boolean arg1) {
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

    @ObfuscatedName("cy.r(Ljava/lang/String;Ljava/lang/String;ZI)Lht;")
    public static class231 method2099(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2301, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2249 == 33) {
            var6 = "_rc";
        } else if (Statics.field2249 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3260, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("dz.z(I)V")
    public static void method2650() {
        try {
            File var0 = new File(Statics.field3260, "random.dat");
            if (var0.exists()) {
                field2300 = new class232(new class231(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2083.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2121.length; var2++) {
                        File var3 = new File(Statics.field2121[var2] + Statics.field2083[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2300 = new class232(new class231(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2300 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2300 = new class232(new class231(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ae.t(I)V")
    public static void method1001() {
        try {
            field2305.method3956();
            for (int var0 = 0; var0 < Statics.field2302; var0++) {
                Statics.field3277[var0].method3956();
            }
            field2298.method3956();
            field2300.method3956();
        } catch (Exception var2) {
        }
    }
}
