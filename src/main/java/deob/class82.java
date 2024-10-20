package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cr")
public class class82 {

    @ObfuscatedName("cr.j")
    public static class30 field1453 = null;

    @ObfuscatedName("cr.f")
    public static class30 field1449 = null;

    @ObfuscatedName("cr.h")
    public static class30 field1450 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.p(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method597(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1444 = new File(Statics.field285, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1444.exists()) {
            try {
                class29 var7 = new class29(Statics.field1444, "rw", 10000L);
                class127 var8 = new class127((int) var7.method552());
                while (var8.field2037 < var8.field2039.length) {
                    int var9 = var7.method553(var8.field2039, var8.field2037, var8.field2039.length - var8.field2037);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2037 += var9;
                }
                var8.field2037 = 0;
                int var10 = var8.method2411();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2411();
                }
                if (var10 <= 2) {
                    var4 = var8.method2420();
                    if (var11 == 1) {
                        var5 = var8.method2420();
                    }
                } else {
                    var4 = var8.method2421();
                    if (var11 == 1) {
                        var5 = var8.method2421();
                    }
                }
                var7.method548();
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
                if (!method174(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field121.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1673.length; var16++) {
                    File var17 = new File(Statics.field1673[var16] + Statics.field121[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method174(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field285 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class29 var29 = new class29(Statics.field1444, "rw", 10000L);
                class127 var30 = new class127(500);
                var30.method2397(3);
                var30.method2397(var28 == null ? 0 : 1);
                var30.method2404(var27.getPath());
                if (var28 != null) {
                    var30.method2404(((File) var28).getPath());
                }
                var29.method550(var30.field2039, 0, var30.field2037);
                var29.method548();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("e.a(Ljava/io/File;ZI)Z")
    public static boolean method174(File arg0, boolean arg1) {
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

    @ObfuscatedName("aw.q(I)V")
    public static void method859() {
        try {
            field1449.method568();
            for (int var0 = 0; var0 < Statics.field1447; var0++) {
                Statics.field2794[var0].method568();
            }
            field1450.method568();
            field1453.method568();
        } catch (Exception var2) {
        }
    }
}
