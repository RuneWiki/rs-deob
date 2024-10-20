package deob;

@ObfuscatedName("lw")
public final class class301 {

    public class301() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jo.at(I)J")
    public static final synchronized long method4630() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3365) {
            Statics.field3366 += Statics.field3365 - var0;
        }
        Statics.field3365 = var0;
        return Statics.field3366 + var0;
    }
}
