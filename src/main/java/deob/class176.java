package deob;

@ObfuscatedName("fi")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.n(I)J")
    public static synchronized long method2396() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2415) {
            Statics.field2417 += Statics.field2415 - var0;
        }
        Statics.field2415 = var0;
        return Statics.field2417 + var0;
    }
}
