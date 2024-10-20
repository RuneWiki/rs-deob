package deob;

@ObfuscatedName("eu")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.x(B)J")
    public static synchronized long method1888() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2103) {
            Statics.field2104 += Statics.field2103 - var0;
        }
        Statics.field2103 = var0;
        return Statics.field2104 + var0;
    }
}
