package deob;

@ObfuscatedName("ex")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.f(I)J")
    public static synchronized long method848() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2131) {
            Statics.field2130 += Statics.field2131 - var0;
        }
        Statics.field2131 = var0;
        return Statics.field2130 + var0;
    }
}
