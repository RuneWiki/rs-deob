package deob;

@ObfuscatedName("mb")
public final class class318 {

    public class318() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.aq(I)J")
    public static final synchronized long method2218() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3453) {
            Statics.field3452 += Statics.field3453 - var0;
        }
        Statics.field3453 = var0;
        return Statics.field3452 + var0;
    }
}
