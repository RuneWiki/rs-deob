package deob;

@ObfuscatedName("fa")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hi.i(B)J")
    public static synchronized long method3821() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2397) {
            Statics.field2401 += Statics.field2397 - var0;
        }
        Statics.field2397 = var0;
        return Statics.field2401 + var0;
    }
}
