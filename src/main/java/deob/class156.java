package deob;

import java.io.File;
import java.util.Hashtable;

@ObfuscatedName("ek")
public class class156 {

    @ObfuscatedName("ek.c")
    public static boolean field1705 = false;

    @ObfuscatedName("ek.s")
    public static Hashtable field1704 = new Hashtable(16);

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mi.c(Ljava/io/File;I)V")
    public static void method5696(File arg0) {
        Statics.field1011 = arg0;
        if (!Statics.field1011.exists()) {
            throw new RuntimeException("");
        }
        field1705 = true;
    }
}
