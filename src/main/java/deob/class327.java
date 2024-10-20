package deob;

@ObfuscatedName("mq")
public final class class327 {

    public class327() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jw.aq(I)J")
    public static final synchronized long method4500() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3557) {
            Statics.field3556 += Statics.field3557 - var0;
        }
        Statics.field3557 = var0;
        return Statics.field3556 + var0;
    }
}
