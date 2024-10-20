package deob;

@ObfuscatedName("gk")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.n(S)J")
    public static synchronized long method81() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2437) {
            Statics.field2433 += Statics.field2437 - var0;
        }
        Statics.field2437 = var0;
        return Statics.field2433 + var0;
    }
}
