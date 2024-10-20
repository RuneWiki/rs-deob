package deob;

@ObfuscatedName("jh")
public final class class269 {

    public class269() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.c(B)J")
    public static final synchronized long method2567() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3171) {
            Statics.field4426 += Statics.field3171 - var0;
        }
        Statics.field3171 = var0;
        return Statics.field4426 + var0;
    }
}
