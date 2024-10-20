package deob;

@ObfuscatedName("ep")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.p(S)J")
    public static synchronized long method1597() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1540) {
            Statics.field2107 += Statics.field1540 - var0;
        }
        Statics.field1540 = var0;
        return Statics.field2107 + var0;
    }
}
