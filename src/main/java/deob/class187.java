package deob;

@ObfuscatedName("gg")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.v(I)J")
    public static synchronized long method3154() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2397) {
            Statics.field1379 += Statics.field2397 - var0;
        }
        Statics.field2397 = var0;
        return Statics.field1379 + var0;
    }
}
