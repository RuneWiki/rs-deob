package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bm")
public class class72 {

    @ObfuscatedName("bm.p")
    public static boolean field1320 = false;

    @ObfuscatedName("bm.a")
    public static Hashtable field1325 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.p(Ljava/io/File;I)V")
    public static void method1880(File arg0) {
        Statics.field1319 = arg0;
        if (!Statics.field1319.exists()) {
            throw new RuntimeException("");
        }
        field1320 = true;
    }

    @ObfuscatedName("eu.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3118(String arg0) {
        if (!field1320) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1325.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1319, arg0);
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
            field1325.put(arg0, var2);
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
