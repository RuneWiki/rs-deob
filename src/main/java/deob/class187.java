package deob;

@ObfuscatedName("gl")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.p(I)J")
    public static synchronized long method35() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2504) {
            Statics.field2503 += Statics.field2504 - var0;
        }
        Statics.field2504 = var0;
        return Statics.field2503 + var0;
    }
}
