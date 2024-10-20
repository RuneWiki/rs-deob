package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("en")
public class class150 {

    @ObfuscatedName("en.y")
    public static class229 field2270 = null;

    @ObfuscatedName("en.p")
    public static class229 field2265 = null;

    @ObfuscatedName("en.k")
    public static class229 field2269 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.t(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2100(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field775 = new File(Statics.field2273, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field775.exists()) {
            try {
                class228 var7 = new class228(Statics.field775, "rw", 10000L);
                class120 var8 = new class120((int) var7.method3804());
                while (var8.field2001 < var8.field2002.length) {
                    int var9 = var7.method3815(var8.field2002, var8.field2001, var8.field2002.length - var8.field2001);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2001 += var9;
                }
                var8.field2001 = 0;
                int var10 = var8.method2334();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2334();
                }
                if (var10 <= 2) {
                    var4 = var8.method2317();
                    if (var11 == 1) {
                        var5 = var8.method2317();
                    }
                } else {
                    var4 = var8.method2318();
                    if (var11 == 1) {
                        var5 = var8.method2318();
                    }
                }
                var7.method3803();
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
                if (!method2643(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field144.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2272.length; var16++) {
                    File var17 = new File(Statics.field2272[var16] + Statics.field144[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2643(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2273 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1175(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("bb.i(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1175(File arg0, File arg1) {
        try {
            class228 var2 = new class228(Statics.field775, "rw", 10000L);
            class120 var3 = new class120(500);
            var3.method2293(3);
            var3.method2293(arg1 == null ? 0 : 1);
            var3.method2301(arg0.getPath());
            if (arg1 != null) {
                var3.method2301(arg1.getPath());
            }
            var2.method3802(var3.field2002, 0, var3.field2001);
            var2.method3803();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("es.g(Ljava/io/File;ZI)Z")
    public static boolean method2643(File arg0, boolean arg1) {
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

    @ObfuscatedName("u.h(Ljava/lang/String;Ljava/lang/String;ZI)Lha;")
    public static class228 method161(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2271, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1958 == 33) {
            var6 = "_rc";
        } else if (Statics.field1958 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2273, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class228(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class228(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aa.z(Ldr;I)V")
    public static void method888(class120 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2270.method3825(0L);
            field2270.method3827(var1);
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
        arg0.method2302(var1, 0, 24);
    }

    @ObfuscatedName("dx.r(Ldr;II)V")
    public static void method2572(class120 arg0, int arg1) {
        if (field2270 == null) {
            return;
        }
        try {
            field2270.method3825(0L);
            field2270.method3842(arg0.field2002, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ce.f(B)V")
    public static void method2001() {
        try {
            field2265.method3824();
            for (int var0 = 0; var0 < Statics.field2266; var0++) {
                Statics.field2094[var0].method3824();
            }
            field2269.method3824();
            field2270.method3824();
        } catch (Exception var2) {
        }
    }
}
