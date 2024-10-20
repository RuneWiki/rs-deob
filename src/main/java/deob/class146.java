package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ez")
public class class146 {

    @ObfuscatedName("ez.i")
    public static boolean field1567 = false;

    @ObfuscatedName("ez.s")
    public static Hashtable field1566 = new Hashtable(16);

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.i(Ljava/io/File;I)V")
    public static void method2373(File arg0) {
        Statics.field1564 = arg0;
        if (!Statics.field1564.exists()) {
            throw new RuntimeException("");
        }
        field1567 = true;
    }

    @ObfuscatedName("mv.w(Ljava/lang/String;S)Ljava/io/File;")
    public static File method5593(String arg0) {
        if (!field1567) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1566.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1564, arg0);
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
            field1566.put(arg0, var2);
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
