package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fk")
public class class161 {

    @ObfuscatedName("fk.y")
    public static boolean field2019 = false;

    @ObfuscatedName("fk.n")
    public static Hashtable field2021 = new Hashtable(16);

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.y(Ljava/io/File;B)V")
    public static void method2374(File arg0) {
        Statics.field2020 = arg0;
        if (!Statics.field2020.exists()) {
            throw new RuntimeException("");
        }
        field2019 = true;
    }

    @ObfuscatedName("fd.c(Ljava/lang/String;B)Ljava/io/File;")
    public static File method3230(String arg0) {
        if (!field2019) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2021.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2020, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            field2021.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }
}
