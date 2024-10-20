package deob;

@ObfuscatedName("gk")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.g(S)J")
    public static synchronized long method2664() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2421) {
            Statics.field2420 += Statics.field2421 - var0;
        }
        Statics.field2421 = var0;
        return Statics.field2420 + var0;
    }
}
