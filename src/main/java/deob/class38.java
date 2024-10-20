package deob;

@ObfuscatedName("dd")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.b(B)J")
    public static synchronized long method2385() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field460) {
            Statics.field462 += Statics.field460 - var0;
        }
        Statics.field460 = var0;
        return Statics.field462 + var0;
    }
}
