package deob;

@ObfuscatedName("fo")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.a(B)J")
    public static synchronized long method584() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2409) {
            Statics.field2412 += Statics.field2409 - var0;
        }
        Statics.field2409 = var0;
        return Statics.field2412 + var0;
    }
}
