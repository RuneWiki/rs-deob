package deob;

@ObfuscatedName("ge")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.n(I)J")
    public static synchronized long method938() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2544) {
            Statics.field2545 += Statics.field2544 - var0;
        }
        Statics.field2544 = var0;
        return Statics.field2545 + var0;
    }
}
