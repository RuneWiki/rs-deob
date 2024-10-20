package deob;

@ObfuscatedName("el")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.o(B)J")
    public static synchronized long method2009() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2128) {
            Statics.field2125 += Statics.field2128 - var0;
        }
        Statics.field2128 = var0;
        return Statics.field2125 + var0;
    }
}
