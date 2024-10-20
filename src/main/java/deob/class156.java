package deob;

@ObfuscatedName("ep")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.b(B)J")
    public static synchronized long method910() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2107) {
            Statics.field2102 += Statics.field2107 - var0;
        }
        Statics.field2107 = var0;
        return Statics.field2102 + var0;
    }
}
