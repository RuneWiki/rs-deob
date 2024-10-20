package deob;

@ObfuscatedName("gg")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.a(I)J")
    public static synchronized long method1411() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2532) {
            Statics.field2528 += Statics.field2532 - var0;
        }
        Statics.field2532 = var0;
        return Statics.field2528 + var0;
    }
}
