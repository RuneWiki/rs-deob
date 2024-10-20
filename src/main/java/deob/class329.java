package deob;

@ObfuscatedName("mw")
public final class class329 {

    public class329() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kl.ab(I)J")
    public static final synchronized long method5009() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3542) {
            Statics.field5015 += Statics.field3542 - var0;
        }
        Statics.field3542 = var0;
        return Statics.field5015 + var0;
    }
}
