package deob;

@ObfuscatedName("mm")
public final class class316 {

    public class316() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oc.ac(I)J")
    public static final synchronized long method6401() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1593) {
            Statics.field3406 += Statics.field1593 - var0;
        }
        Statics.field1593 = var0;
        return Statics.field3406 + var0;
    }
}
