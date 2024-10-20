package deob;

@ObfuscatedName("gm")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.d(I)J")
    public static synchronized long method2932() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2511) {
            Statics.field3784 += Statics.field2511 - var0;
        }
        Statics.field2511 = var0;
        return Statics.field3784 + var0;
    }
}
