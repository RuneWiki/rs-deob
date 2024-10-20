package deob;

@ObfuscatedName("gq")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.c(I)J")
    public static synchronized long method26() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2580) {
            Statics.field3912 += Statics.field2580 - var0;
        }
        Statics.field2580 = var0;
        return Statics.field3912 + var0;
    }
}
