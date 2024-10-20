package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fh")
public class class168 {

    @ObfuscatedName("fh.o")
    public static class122 field2175 = null;

    @ObfuscatedName("fh.c")
    public static class122 field2180 = null;

    @ObfuscatedName("fh.v")
    public static class122 field2174 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.t(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2644(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field490 = new File(Statics.field2183, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field490.exists()) {
            try {
                class123 var7 = new class123(Statics.field490, "rw", 10000L);
                class195 var8 = new class195((int) var7.method2332());
                while (var8.field2545 < var8.field2544.length) {
                    int var9 = var7.method2318(var8.field2544, var8.field2545, var8.field2544.length - var8.field2545);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2545 += var9;
                }
                var8.field2545 = 0;
                int var10 = var8.method3236();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3236();
                }
                if (var10 <= 2) {
                    var4 = var8.method3246();
                    if (var11 == 1) {
                        var5 = var8.method3246();
                    }
                } else {
                    var4 = var8.method3247();
                    if (var11 == 1) {
                        var5 = var8.method3247();
                    }
                }
                var7.method2315();
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
                if (!method718(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2187.length; var15++) {
                for (int var16 = 0; var16 < Statics.field301.length; var16++) {
                    File var17 = new File(Statics.field301[var16] + Statics.field2187[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method718(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2183 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method742(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ba.q(Ljava/io/File;Ljava/io/File;B)V")
    public static void method742(File arg0, File arg1) {
        try {
            class123 var2 = new class123(Statics.field490, "rw", 10000L);
            class195 var3 = new class195(500);
            var3.method3220(3);
            var3.method3220(arg1 == null ? 0 : 1);
            var3.method3366(arg0.getPath());
            if (arg1 != null) {
                var3.method3366(arg1.getPath());
            }
            var2.method2314(var3.field2544, 0, var3.field2545);
            var2.method2315();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ad.i(Ljava/io/File;ZB)Z")
    public static boolean method718(File arg0, boolean arg1) {
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

    @ObfuscatedName("ky.a(Ljava/lang/String;Ljava/lang/String;ZI)Lde;")
    public static class123 method4893(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2093, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field508 == 33) {
            var6 = "_rc";
        } else if (Statics.field508 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2183, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ch.l(I)V")
    public static void method1754() {
        try {
            File var0 = new File(Statics.field2183, "random.dat");
            if (var0.exists()) {
                field2175 = new class122(new class123(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2187.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field301.length; var2++) {
                        File var3 = new File(Statics.field301[var2] + Statics.field2187[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2175 = new class122(new class123(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2175 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2175 = new class122(new class123(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
