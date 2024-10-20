package deob;

@ObfuscatedName("ft")
public class class177 {

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.i(I)J")
    public static synchronized long method608() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2413) {
            Statics.field2411 += Statics.field2413 - var0;
        }
        Statics.field2413 = var0;
        return Statics.field2411 + var0;
    }
}
