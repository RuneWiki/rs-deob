package deob;

@ObfuscatedName("kh")
public final class class298 {

    public class298() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gn.q(I)J")
    public static final synchronized long method3576() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field417) {
            Statics.field5 += Statics.field417 - var0;
        }
        Statics.field417 = var0;
        return Statics.field5 + var0;
    }
}
