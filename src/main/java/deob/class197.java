package deob;

@ObfuscatedName("gy")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ks.g(I)J")
    public static synchronized long method4873() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1593) {
            Statics.field2588 += Statics.field1593 - var0;
        }
        Statics.field1593 = var0;
        return Statics.field2588 + var0;
    }
}
