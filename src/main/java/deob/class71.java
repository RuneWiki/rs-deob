package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("be")
public class class71 {

    @ObfuscatedName("be.p")
    public static boolean field1304 = false;

    @ObfuscatedName("be.w")
    public static Hashtable field1298 = new Hashtable(16);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.p(Ljava/io/File;B)V")
    public static void method1198(File arg0) {
        Statics.field1299 = arg0;
        if (!Statics.field1299.exists()) {
            throw new RuntimeException("");
        }
        field1304 = true;
    }

    @ObfuscatedName("h.j(Ljava/lang/String;I)Ljava/io/File;")
    public static File method31(String arg0) {
        if (!field1304) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1298.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1299, arg0);
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
            field1298.put(arg0, var2);
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
