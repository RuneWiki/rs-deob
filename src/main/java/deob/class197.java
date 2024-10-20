package deob;

@ObfuscatedName("gn")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.o(I)J")
    public static synchronized long method1005() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2049) {
            Statics.field2588 += Statics.field2049 - var0;
        }
        Statics.field2049 = var0;
        return Statics.field2588 + var0;
    }
}
