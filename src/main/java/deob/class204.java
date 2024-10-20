package deob;

@ObfuscatedName("ga")
public class class204 {

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.m(I)J")
    public static synchronized long method3658() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1848) {
            Statics.field2453 += Statics.field1848 - var0;
        }
        Statics.field1848 = var0;
        return Statics.field2453 + var0;
    }
}
