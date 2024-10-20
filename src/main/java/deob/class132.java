package deob;

@ObfuscatedName("en")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.d(I)J")
    public static synchronized long method1336() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1973) {
            Statics.field1974 += Statics.field1973 - var0;
        }
        Statics.field1973 = var0;
        return Statics.field1974 + var0;
    }
}
