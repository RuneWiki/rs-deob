package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ck")
public class class150 {

    @ObfuscatedName("ck.l")
    public static class167 field2258 = null;

    @ObfuscatedName("ck.z")
    public static class167 field2257 = null;

    @ObfuscatedName("ck.x")
    public static class167 field2249 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.p(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1048(File arg0, File arg1) {
        try {
            class170 var2 = new class170(Statics.field2251, "rw", 10000L);
            class31 var3 = new class31(500);
            var3.method357(3);
            var3.method357(arg1 == null ? 0 : 1);
            var3.method364(arg0.getPath());
            if (arg1 != null) {
                var3.method364(arg1.getPath());
            }
            var2.method3262(var3.field168, 0, var3.field172);
            var2.method3278();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("i.o(Ljava/io/File;ZI)Z")
    public static boolean method1054(File arg0, boolean arg1) {
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

    @ObfuscatedName("bk.h(Ldy;I)V")
    public static void method2030(class31 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2249.method3222(0L);
            field2249.method3229(var1);
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
        arg0.method458(var1, 0, 24);
    }

    @ObfuscatedName("ay.j(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3075(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2251 = new File(Statics.field234, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2251.exists()) {
            try {
                class170 var7 = new class170(Statics.field2251, "rw", 10000L);
                class31 var8 = new class31((int) var7.method3260());
                while (var8.field172 < var8.field168.length) {
                    int var9 = var7.method3265(var8.field168, var8.field172, var8.field168.length - var8.field172);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field172 += var9;
                }
                var8.field172 = 0;
                int var10 = var8.method512();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method512();
                }
                if (var10 <= 2) {
                    var4 = var8.method380();
                    if (var11 == 1) {
                        var5 = var8.method380();
                    }
                } else {
                    var4 = var8.method405();
                    if (var11 == 1) {
                        var5 = var8.method405();
                    }
                }
                var7.method3278();
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
                if (!method1054(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1067.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2553.length; var16++) {
                    File var17 = new File(Statics.field2553[var16] + Statics.field1067[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1054(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field234 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1048(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ap.t(Ljava/lang/String;Ljava/lang/String;ZB)Lau;")
    public static class170 method3374(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2254, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class170(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2678 == 33) {
            var6 = "_rc";
        } else if (Statics.field2678 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field234, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class170(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class170(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
