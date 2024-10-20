package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ft")
public class class161 {

    @ObfuscatedName("ft.n")
    public static boolean field2180 = false;

    @ObfuscatedName("ft.y")
    public static Hashtable field2181 = new Hashtable(16);

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.n(Ljava/io/File;I)V")
    public static void method1011(File arg0) {
        Statics.field2182 = arg0;
        if (!Statics.field2182.exists()) {
            throw new RuntimeException("");
        }
        field2180 = true;
    }

    @ObfuscatedName("an.v(Ljava/lang/String;B)Ljava/io/File;")
    public static File method620(String arg0) {
        if (!field2180) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2181.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2182, arg0);
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
            field2181.put(arg0, var2);
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
