package deob;

@ObfuscatedName("fx")
public class class177 {

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.e(I)J")
    public static synchronized long method2903() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2396) {
            Statics.field3721 += Statics.field2396 - var0;
        }
        Statics.field2396 = var0;
        return Statics.field3721 + var0;
    }
}
