package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ew")
public class class156 {

    @ObfuscatedName("ew.d")
    public static class110 field1989 = null;

    @ObfuscatedName("ew.s")
    public static class110 field1990 = null;

    @ObfuscatedName("ew.p")
    public static class110 field1994 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.w(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1780(File arg0, File arg1) {
        try {
            class111 var2 = new class111(Statics.field1985, "rw", 10000L);
            class183 var3 = new class183(500);
            var3.method3246(3);
            var3.method3246(arg1 == null ? 0 : 1);
            var3.method3385(arg0.getPath());
            if (arg1 != null) {
                var3.method3385(arg1.getPath());
            }
            var2.method2343(var3.field2366, 0, var3.field2360);
            var2.method2351();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("i.m(Ljava/io/File;ZI)Z")
    public static boolean method272(File arg0, boolean arg1) {
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

    @ObfuscatedName("io.q(Ljava/lang/String;Ljava/lang/String;ZI)Ldw;")
    public static class111 method4229(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1986, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class111(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3766 == 33) {
            var6 = "_rc";
        } else if (Statics.field3766 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1823, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class111(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class111(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kj.x(I)V")
    public static void method5029() {
        try {
            File var0 = new File(Statics.field1823, "random.dat");
            if (var0.exists()) {
                field1989 = new class110(new class111(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1996.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1982.length; var2++) {
                        File var3 = new File(Statics.field1982[var2] + Statics.field1996[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1989 = new class110(new class111(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1989 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1989 = new class110(new class111(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("hu.j(I)[B")
    public static byte[] method4147() {
        byte[] var0 = new byte[24];
        try {
            field1989.method2308(0L);
            field1989.method2328(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("gu.a(Lgy;IB)V")
    public static void method3541(class183 arg0, int arg1) {
        if (field1989 == null) {
            return;
        }
        try {
            field1989.method2308(0L);
            field1989.method2313(arg0.field2366, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bz.l(I)V")
    public static void method1722() {
        try {
            field1990.method2307();
            for (int var0 = 0; var0 < Statics.field1991; var0++) {
                Statics.field1984[var0].method2307();
            }
            field1994.method2307();
            field1989.method2307();
        } catch (Exception var2) {
        }
    }
}
