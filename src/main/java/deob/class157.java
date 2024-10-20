package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fs")
public class class157 {

    @ObfuscatedName("fs.a")
    public static class123 field2161 = null;

    @ObfuscatedName("fs.y")
    public static class123 field2163 = null;

    @ObfuscatedName("fs.w")
    public static class123 field2160 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.m(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1631(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field782 = new File(Statics.field1605, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field782.exists()) {
            try {
                class124 var7 = new class124(Statics.field782, "rw", 10000L);
                class181 var8 = new class181((int) var7.method2260());
                while (var8.field2498 < var8.field2499.length) {
                    int var9 = var7.method2246(var8.field2499, var8.field2498, var8.field2499.length - var8.field2498);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2498 += var9;
                }
                var8.field2498 = 0;
                int var10 = var8.method3012();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3012();
                }
                if (var10 <= 2) {
                    var4 = var8.method3035();
                    if (var11 == 1) {
                        var5 = var8.method3035();
                    }
                } else {
                    var4 = var8.method3057();
                    if (var11 == 1) {
                        var5 = var8.method3057();
                    }
                }
                var7.method2243();
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
                if (!method221(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2165.length; var15++) {
                for (int var16 = 0; var16 < Statics.field561.length; var16++) {
                    File var17 = new File(Statics.field561[var16] + Statics.field2165[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method221(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1605 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            Statics.method76(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("al.i(Ljava/io/File;ZI)Z")
    public static boolean method221(File arg0, boolean arg1) {
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

    @ObfuscatedName("fa.j(Ljava/lang/String;Ljava/lang/String;ZI)Ldj;")
    public static class124 method2895(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field329, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class124(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3343 == 33) {
            var6 = "_rc";
        } else if (Statics.field3343 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1605, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class124(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class124(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ai.v(I)V")
    public static void method586() {
        try {
            File var0 = new File(Statics.field1605, "random.dat");
            if (var0.exists()) {
                field2161 = new class123(new class124(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2165.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field561.length; var2++) {
                        File var3 = new File(Statics.field561[var2] + Statics.field2165[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2161 = new class123(new class124(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2161 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2161 = new class123(new class124(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
