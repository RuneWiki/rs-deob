package deob;

@ObfuscatedName("ft")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.p(B)J")
    public static synchronized long method2747() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2427) {
            Statics.field2425 += Statics.field2427 - var0;
        }
        Statics.field2427 = var0;
        return Statics.field2425 + var0;
    }
}
