package deob;

@ObfuscatedName("gq")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.c(I)J")
    public static synchronized long method918() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2399) {
            Statics.field2398 += Statics.field2399 - var0;
        }
        Statics.field2399 = var0;
        return Statics.field2398 + var0;
    }
}
