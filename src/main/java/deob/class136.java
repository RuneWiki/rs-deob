package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("er")
public class class136 {

    @ObfuscatedName("er.q")
    public static class194 field2097 = null;

    @ObfuscatedName("er.i")
    public static class194 field2098 = null;

    @ObfuscatedName("er.f")
    public static class194 field2090 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.j(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method1873(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1850 = new File(Statics.field1578, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1850.exists()) {
            try {
                class193 var7 = new class193(Statics.field1850, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3439());
                while (var8.field1847 < var8.field1849.length) {
                    int var9 = var7.method3435(var8.field1849, var8.field1847, var8.field1849.length - var8.field1847);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1847 += var9;
                }
                var8.field1847 = 0;
                int var10 = var8.method2130();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2130();
                }
                if (var10 <= 2) {
                    var4 = var8.method2139();
                    if (var11 == 1) {
                        var5 = var8.method2139();
                    }
                } else {
                    var4 = var8.method2136();
                    if (var11 == 1) {
                        var5 = var8.method2136();
                    }
                }
                var7.method3434();
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
                if (!method488(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2958.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2100.length; var16++) {
                    File var17 = new File(Statics.field2100[var16] + Statics.field2958[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method488(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1578 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class193 var29 = new class193(Statics.field1850, "rw", 10000L);
                class107 var30 = new class107(500);
                var30.method2116(3);
                var30.method2116(var28 == null ? 0 : 1);
                var30.method2290(var27.getPath());
                if (var28 != null) {
                    var30.method2290(((File) var28).getPath());
                }
                var29.method3433(var30.field1849, 0, var30.field1847);
                var29.method3434();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("w.z(Ljava/io/File;ZI)Z")
    public static boolean method488(File arg0, boolean arg1) {
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

    @ObfuscatedName("gx.y(Ljava/lang/String;Ljava/lang/String;ZB)Lgi;")
    public static class193 method3322(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2093, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class193(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1940 == 33) {
            var6 = "_rc";
        } else if (Statics.field1940 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1578, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class193(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class193(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
