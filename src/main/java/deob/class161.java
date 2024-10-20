package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fs")
public class class161 {

    @ObfuscatedName("fs.p")
    public static boolean field2131 = false;

    @ObfuscatedName("fs.w")
    public static Hashtable field2132 = new Hashtable(16);

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ir.p(Ljava/io/File;B)V")
    public static void method4027(File arg0) {
        Statics.field3761 = arg0;
        if (!Statics.field3761.exists()) {
            throw new RuntimeException("");
        }
        field2131 = true;
    }

    @ObfuscatedName("aa.i(Ljava/lang/String;I)Ljava/io/File;")
    public static File method214(String arg0) {
        if (!field2131) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2132.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field3761, arg0);
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
            field2132.put(arg0, var2);
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
