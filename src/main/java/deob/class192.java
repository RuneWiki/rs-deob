package deob;

@ObfuscatedName("gj")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.a(I)J")
    public static synchronized long method183() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2440) {
            Statics.field2438 += Statics.field2440 - var0;
        }
        Statics.field2440 = var0;
        return Statics.field2438 + var0;
    }
}
