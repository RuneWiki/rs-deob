package deob;

@ObfuscatedName("fz")
public class class179 {

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.w(B)J")
    public static synchronized long method1665() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2433) {
            Statics.field2430 += Statics.field2433 - var0;
        }
        Statics.field2433 = var0;
        return Statics.field2430 + var0;
    }
}
