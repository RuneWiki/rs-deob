package deob;

@ObfuscatedName("jz")
public final class class270 {

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.v(I)J")
    public static final synchronized long method2724() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3150) {
            Statics.field3148 += Statics.field3150 - var0;
        }
        Statics.field3150 = var0;
        return Statics.field3148 + var0;
    }
}
