package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fp")
public class class171 {

    @ObfuscatedName("fp.c")
    public static boolean field2221 = false;

    @ObfuscatedName("fp.o")
    public static Hashtable field2220 = new Hashtable(16);

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.c(Ljava/io/File;I)V")
    public static void method39(File arg0) {
        Statics.field625 = arg0;
        if (!Statics.field625.exists()) {
            throw new RuntimeException("");
        }
        field2221 = true;
    }

    @ObfuscatedName("ap.i(Ljava/lang/String;B)Ljava/io/File;")
    public static File method219(String arg0) {
        if (!field2221) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2220.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field625, arg0);
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
            field2220.put(arg0, var2);
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
