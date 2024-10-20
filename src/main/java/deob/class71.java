package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bz")
public class class71 {

    @ObfuscatedName("bz.c")
    public static boolean field1293 = false;

    @ObfuscatedName("bz.f")
    public static Hashtable field1287 = new Hashtable(16);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.c(Ljava/io/File;S)V")
    public static void method55(File arg0) {
        Statics.field1286 = arg0;
        if (!Statics.field1286.exists()) {
            throw new RuntimeException("");
        }
        field1293 = true;
    }

    @ObfuscatedName("d.j(Ljava/lang/String;I)Ljava/io/File;")
    public static File method231(String arg0) {
        if (!field1293) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1287.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1286, arg0);
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
            field1287.put(arg0, var2);
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
