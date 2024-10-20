package deob;

@ObfuscatedName("ki")
public final class class307 {

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.z(B)J")
    public static final synchronized long method2184() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3724) {
            Statics.field2537 += Statics.field3724 - var0;
        }
        Statics.field3724 = var0;
        return Statics.field2537 + var0;
    }
}
