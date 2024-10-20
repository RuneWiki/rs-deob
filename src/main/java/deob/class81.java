package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cg")
public class class81 {

    @ObfuscatedName("cg.w")
    public static class29 field1420 = null;

    @ObfuscatedName("cg.k")
    public static class29 field1421 = null;

    @ObfuscatedName("cg.v")
    public static class29 field1419 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.y(Ljava/io/File;Ljava/io/File;I)V")
    public static void method180(File arg0, File arg1) {
        try {
            class28 var2 = new class28(Statics.field1415, "rw", 10000L);
            class126 var3 = new class126(500);
            var3.method2369(3);
            var3.method2369(arg1 == null ? 0 : 1);
            var3.method2567(arg0.getPath());
            if (arg1 != null) {
                var3.method2567(arg1.getPath());
            }
            var2.method563(var3.field2025, 0, var3.field2020);
            var2.method559();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("fv.x(Ljava/io/File;ZI)Z")
    public static boolean method3087(File arg0, boolean arg1) {
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

    @ObfuscatedName("e.z(B)V")
    public static void method39() {
        try {
            File var0 = new File(Statics.field1248, "random.dat");
            if (var0.exists()) {
                field1420 = new class29(new class28(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field196.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field371.length; var2++) {
                        File var3 = new File(Statics.field371[var2] + Statics.field196[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1420 = new class29(new class28(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1420 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1420 = new class29(new class28(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dx.c(Ldr;IS)V")
    public static void method2360(class126 arg0, int arg1) {
        if (field1420 == null) {
            return;
        }
        try {
            field1420.method583(0L);
            field1420.method573(arg0.field2025, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
