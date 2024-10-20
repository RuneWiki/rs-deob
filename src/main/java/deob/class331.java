package deob;

@ObfuscatedName("mi")
public final class class331 {

    public class331() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hf.ac(I)J")
    public static final synchronized long method3482() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3596) {
            Statics.field3597 += Statics.field3596 - var0;
        }
        Statics.field3596 = var0;
        return Statics.field3597 + var0;
    }
}
