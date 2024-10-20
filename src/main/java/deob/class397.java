package deob;

@ObfuscatedName("ou")
public final class class397 {

    public class397() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hq.n(B)J")
    public static final synchronized long method3986() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field4263) {
            Statics.field4262 += Statics.field4263 - var0;
        }
        Statics.field4263 = var0;
        return Statics.field4262 + var0;
    }
}
