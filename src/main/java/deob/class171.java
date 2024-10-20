package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fw")
public class class171 {

    @ObfuscatedName("fw.t")
    public static boolean field2195 = false;

    @ObfuscatedName("fw.i")
    public static Hashtable field2191 = new Hashtable(16);

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.t(Ljava/io/File;B)V")
    public static void method1760(File arg0) {
        Statics.field2190 = arg0;
        if (!Statics.field2190.exists()) {
            throw new RuntimeException("");
        }
        field2195 = true;
    }

    @ObfuscatedName("jv.q(Ljava/lang/String;I)Ljava/io/File;")
    public static File method4563(String arg0) {
        if (!field2195) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2191.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2190, arg0);
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
            field2191.put(arg0, var2);
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
