package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ft")
public class class168 {

    @ObfuscatedName("ft.h")
    public static boolean field1864 = false;

    @ObfuscatedName("ft.v")
    public static Hashtable field1866 = new Hashtable(16);

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.h(Ljava/io/File;I)V")
    public static void method3171(File arg0) {
        Statics.field1865 = arg0;
        if (!Statics.field1865.exists()) {
            throw new RuntimeException("");
        }
        field1864 = true;
    }

    @ObfuscatedName("kf.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method5726(String arg0) {
        if (!field1864) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1866.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1865, arg0);
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
            field1866.put(arg0, var2);
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
