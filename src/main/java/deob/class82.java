package deob;

@ObfuscatedName("cb")
public final class class82 extends class204 {

    @ObfuscatedName("cb.a")
    public static class205 field1236 = new class205();

    @ObfuscatedName("cb.w")
    public int field1226;

    @ObfuscatedName("cb.e")
    public int field1224;

    @ObfuscatedName("cb.k")
    public int field1225;

    @ObfuscatedName("cb.u")
    public int field1233;

    @ObfuscatedName("cb.z")
    public int field1237;

    @ObfuscatedName("cb.t")
    public int field1222;

    @ObfuscatedName("cb.f")
    public int field1229;

    @ObfuscatedName("cb.g")
    public class117 field1230;

    @ObfuscatedName("cb.j")
    public int field1231;

    @ObfuscatedName("cb.x")
    public int field1232;

    @ObfuscatedName("cb.c")
    public int[] field1227;

    @ObfuscatedName("cb.s")
    public int field1234;

    @ObfuscatedName("cb.n")
    public class117 field1235;

    @ObfuscatedName("cb.y")
    public class267 field1228;

    @ObfuscatedName("ad.a(I)V")
    public static void method204() {
        for (class82 var0 = (class82) field1236.method3442(); var0 != null; var0 = (class82) field1236.method3444()) {
            if (var0.field1230 != null) {
                Statics.field2629.method1726(var0.field1230);
                var0.field1230 = null;
            }
            if (var0.field1235 != null) {
                Statics.field2629.method1726(var0.field1235);
                var0.field1235 = null;
            }
        }
        field1236.method3464();
    }

    @ObfuscatedName("ag.w(B)V")
    public static void method221() {
        for (class82 var0 = (class82) field1236.method3442(); var0 != null; var0 = (class82) field1236.method3444()) {
            if (var0.field1228 != null) {
                var0.method1413();
            }
        }
    }

    @ObfuscatedName("cb.e(I)V")
    public void method1413() {
        int var1 = this.field1229;
        class267 var2 = this.field1228.method4325();
        if (var2 == null) {
            this.field1229 = -1;
            this.field1222 = 0;
            this.field1231 = 0;
            this.field1232 = 0;
            this.field1227 = null;
        } else {
            this.field1229 = var2.field3554;
            this.field1222 = var2.field3555 * 128;
            this.field1231 = var2.field3556;
            this.field1232 = var2.field3547;
            this.field1227 = var2.field3541;
        }
        if (this.field1229 != var1 && this.field1230 != null) {
            Statics.field2629.method1726(this.field1230);
            this.field1230 = null;
        }
    }
}
