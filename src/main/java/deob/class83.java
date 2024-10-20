package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ch")
public class class83 {

    @ObfuscatedName("ch.v")
    public static class31 field1452 = null;

    @ObfuscatedName("ch.m")
    public static class31 field1453 = null;

    @ObfuscatedName("ch.x")
    public static class31 field1454 = null;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.b(Ljava/io/File;ZB)Z")
    public static boolean method2224(File arg0, boolean arg1) {
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

    @ObfuscatedName("bj.r(Ljava/lang/String;Ljava/lang/String;ZI)Lat;")
    public static class30 method1541(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1212, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class30(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field397 == 33) {
            var6 = "_rc";
        } else if (Statics.field397 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2854, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class30(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class30(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("w.l(Lds;S)V")
    public static void method148(class128 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1452.method621(0L);
            field1452.method608(var1);
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
        arg0.method2480(var1, 0, 24);
    }

    @ObfuscatedName("dj.s(Lds;IB)V")
    public static void method2230(class128 arg0, int arg1) {
        if (field1452 == null) {
            return;
        }
        try {
            field1452.method621(0L);
            field1452.method603(arg0.field2050, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
