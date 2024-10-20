package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ff")
public class class161 {

    @ObfuscatedName("ff.v")
    public static boolean field2020 = false;

    @ObfuscatedName("ff.o")
    public static Hashtable field2018 = new Hashtable(16);

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.v(Ljava/io/File;I)V")
    public static void method1670(File arg0) {
        Statics.field2024 = arg0;
        if (!Statics.field2024.exists()) {
            throw new RuntimeException("");
        }
        field2020 = true;
    }

    @ObfuscatedName("bx.s(Ljava/lang/String;I)Ljava/io/File;")
    public static File method990(String arg0) {
        if (!field2020) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2018.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2024, arg0);
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
            field2018.put(arg0, var2);
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
