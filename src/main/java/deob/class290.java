package deob;

@ObfuscatedName("lg")
public final class class290 {

    public class290() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jf.aj(B)J")
    public static final synchronized long method4466() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3306) {
            Statics.field3307 += Statics.field3306 - var0;
        }
        Statics.field3306 = var0;
        return Statics.field3307 + var0;
    }
}
