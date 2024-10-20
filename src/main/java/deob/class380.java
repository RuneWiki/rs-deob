package deob;

@ObfuscatedName("ng")
public final class class380 {

    public class380() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.v(B)J")
    public static final synchronized long method2744() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field4147) {
            Statics.field4148 += Statics.field4147 - var0;
        }
        Statics.field4147 = var0;
        return Statics.field4148 + var0;
    }
}
