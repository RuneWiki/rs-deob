package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cv")
public class class81 {

    @ObfuscatedName("cv.r")
    public static class29 field1399 = null;

    @ObfuscatedName("cv.n")
    public static class29 field1400 = null;

    @ObfuscatedName("cv.b")
    public static class29 field1403 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.c(Ljava/io/File;ZI)Z")
    public static boolean method117(File arg0, boolean arg1) {
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

    @ObfuscatedName("ek.j(I)V")
    public static void method2566() {
        try {
            File var0 = new File(Statics.field117, "random.dat");
            if (var0.exists()) {
                field1399 = new class29(new class28(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field378.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field99.length; var2++) {
                        File var3 = new File(Statics.field99[var2] + Statics.field378[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1399 = new class29(new class28(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1399 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1399 = new class29(new class28(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cf.f(Ldl;II)V")
    public static void method2010(class125 arg0, int arg1) {
        if (field1399 == null) {
            return;
        }
        try {
            field1399.method531(0L);
            field1399.method539(arg0.field2002, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
