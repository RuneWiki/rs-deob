package deob;

import java.io.File;
import java.util.Hashtable;

@ObfuscatedName("bu")
public class class72 {

    @ObfuscatedName("bu.f")
    public static boolean field1297 = false;

    @ObfuscatedName("bu.n")
    public static Hashtable field1296 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.f(Ljava/io/File;I)V")
    public static void method1417(File arg0) {
        Statics.field1299 = arg0;
        if (!Statics.field1299.exists()) {
            throw new RuntimeException("");
        }
        field1297 = true;
    }
}
