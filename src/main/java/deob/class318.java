package deob;

@ObfuscatedName("mc")
public final class class318 {

    public class318() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.az(I)J")
    public static final synchronized long method3596() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3473) {
            Statics.field3471 += Statics.field3473 - var0;
        }
        Statics.field3473 = var0;
        return Statics.field3471 + var0;
    }
}
