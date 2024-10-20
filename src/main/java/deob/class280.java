package deob;

@ObfuscatedName("jl")
public final class class280 {

    public class280() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.a(B)J")
    public static final synchronized long method2629() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3268) {
            Statics.field3269 += Statics.field3268 - var0;
        }
        Statics.field3268 = var0;
        return Statics.field3269 + var0;
    }
}
