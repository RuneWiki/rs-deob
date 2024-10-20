package deob;

@ObfuscatedName("fe")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fg.c(B)J")
    public static synchronized long method2679() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2372) {
            Statics.field322 += Statics.field2372 - var0;
        }
        Statics.field2372 = var0;
        return Statics.field322 + var0;
    }
}
