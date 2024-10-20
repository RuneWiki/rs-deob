package deob;

@ObfuscatedName("fd")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("he.d(B)J")
    public static synchronized long method3746() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2382) {
            Statics.field2390 += Statics.field2382 - var0;
        }
        Statics.field2382 = var0;
        return Statics.field2390 + var0;
    }
}
