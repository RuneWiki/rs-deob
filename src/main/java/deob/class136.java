package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("et")
public class class136 {

    @ObfuscatedName("et.e")
    public static boolean field2079 = false;

    @ObfuscatedName("et.f")
    public static Hashtable field2080 = new Hashtable(16);

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.e(Ljava/io/File;I)V")
    public static void method1950(File arg0) {
        Statics.field2076 = arg0;
        if (!Statics.field2076.exists()) {
            throw new RuntimeException("");
        }
        field2079 = true;
    }

    @ObfuscatedName("aw.w(Ljava/lang/String;B)Ljava/io/File;")
    public static File method813(String arg0) {
        if (!field2079) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2080.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2076, arg0);
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
            field2080.put(arg0, var2);
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
