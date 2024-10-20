package deob;

@ObfuscatedName("mb")
public final class class313 {

    public class313() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ha.at(B)J")
    public static final synchronized long method3460() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3395) {
            Statics.field3396 += Statics.field3395 - var0;
        }
        Statics.field3395 = var0;
        return Statics.field3396 + var0;
    }
}
