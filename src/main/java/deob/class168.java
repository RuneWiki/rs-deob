package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fh")
public class class168 {

    @ObfuscatedName("fh.c")
    public static class342 field2026 = null;

    @ObfuscatedName("fh.r")
    public static class342 field2030 = null;

    @ObfuscatedName("fh.y")
    public static class342 field2029 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.s(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method48(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3636 = new File(Statics.field3638, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3636.exists()) {
            try {
                class343 var7 = new class343(Statics.field3636, "rw", 10000L);
                class300 var8 = new class300((int) var7.method6034());
                while (var8.field3704 < var8.field3701.length) {
                    int var9 = var7.method6038(var8.field3701, var8.field3704, var8.field3701.length - var8.field3704);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3704 += var9;
                }
                var8.field3704 = 0;
                int var10 = var8.method5179();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5179();
                }
                if (var10 <= 2) {
                    var4 = var8.method5062();
                    if (var11 == 1) {
                        var5 = var8.method5062();
                    }
                } else {
                    var4 = var8.method5231();
                    if (var11 == 1) {
                        var5 = var8.method5231();
                    }
                }
                var7.method6036();
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
                if (!method881(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1182.length; var15++) {
                for (int var16 = 0; var16 < Statics.field48.length; var16++) {
                    File var17 = new File(Statics.field48[var16] + Statics.field1182[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method881(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field3638 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method918(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("bo.j(Ljava/io/File;Ljava/io/File;I)V")
    public static void method918(File arg0, File arg1) {
        try {
            class343 var2 = new class343(Statics.field3636, "rw", 10000L);
            class300 var3 = new class300(500);
            var3.method5083(3);
            var3.method5083(arg1 == null ? 0 : 1);
            var3.method5045(arg0.getPath());
            if (arg1 != null) {
                var3.method5045(arg1.getPath());
            }
            var2.method6043(var3.field3701, 0, var3.field3704);
            var2.method6036();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bw.i(Ljava/io/File;ZB)Z")
    public static boolean method881(File arg0, boolean arg1) {
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

    @ObfuscatedName("fu.k(Ljava/lang/String;Ljava/lang/String;ZI)Lmm;")
    public static class343 method3196(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2024, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class343(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field544 == 33) {
            var6 = "_rc";
        } else if (Statics.field544 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3638, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class343(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class343(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("da.u(B)V")
    public static void method2267() {
        try {
            File var0 = new File(Statics.field3638, "random.dat");
            if (var0.exists()) {
                field2026 = new class342(new class343(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1182.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field48.length; var2++) {
                        File var3 = new File(Statics.field48[var2] + Statics.field1182[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2026 = new class342(new class343(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2026 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2026 = new class342(new class343(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("v.n(Lky;IB)V")
    public static void method257(class300 arg0, int arg1) {
        if (field2026 == null) {
            return;
        }
        try {
            field2026.method6005(0L);
            field2026.method6010(arg0.field3701, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
