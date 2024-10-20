package deob;

@ObfuscatedName("gl")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.s(B)J")
    public static synchronized long method2705() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2528) {
            Statics.field2526 += Statics.field2528 - var0;
        }
        Statics.field2528 = var0;
        return Statics.field2526 + var0;
    }
}
