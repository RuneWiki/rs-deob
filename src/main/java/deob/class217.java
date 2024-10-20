package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("il")
public class class217 {

    @ObfuscatedName("il.ab")
    public static boolean field2364 = false;

    @ObfuscatedName("il.an")
    public static Hashtable field2363 = new Hashtable(16);

    public class217() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.ab(Ljava/io/File;I)V")
    public static void method3288(File arg0) {
        Statics.field75 = arg0;
        if (!Statics.field75.exists()) {
            throw new RuntimeException("");
        }
        field2364 = true;
    }

    @ObfuscatedName("gk.ay(Ljava/lang/String;S)Ljava/io/File;")
    public static File method3282(String arg0) {
        if (!field2364) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2363.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field75, arg0);
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
            field2363.put(arg0, var2);
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

    @ObfuscatedName("ba.an(I)V")
    public static void method796() {
        field2363.clear();
    }
}
