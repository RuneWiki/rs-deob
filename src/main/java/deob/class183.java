package deob;

@ObfuscatedName("gz")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.b(B)J")
    public static synchronized long method1711() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2506) {
            Statics.field290 += Statics.field2506 - var0;
        }
        Statics.field2506 = var0;
        return Statics.field290 + var0;
    }
}
