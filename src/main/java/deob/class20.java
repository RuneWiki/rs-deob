package deob;

@ObfuscatedName("w")
public final class class20 extends class187 {

    @ObfuscatedName("w.k")
    public static class178 field531 = new class178();

    @ObfuscatedName("w.y")
    public int field532;

    @ObfuscatedName("w.s")
    public int field544;

    @ObfuscatedName("w.g")
    public int field533;

    @ObfuscatedName("w.h")
    public int field534;

    @ObfuscatedName("w.l")
    public int field535;

    @ObfuscatedName("w.e")
    public int field536;

    @ObfuscatedName("w.u")
    public int field537;

    @ObfuscatedName("w.j")
    public int field538;

    @ObfuscatedName("w.c")
    public class58 field539;

    @ObfuscatedName("w.d")
    public int field541;

    @ObfuscatedName("w.v")
    public int[] field542;

    @ObfuscatedName("w.n")
    public int field545;

    @ObfuscatedName("w.z")
    public class58 field540;

    @ObfuscatedName("w.a")
    public class36 field543;

    @ObfuscatedName("ao.k(B)V")
    public static void method571() {
        for (class20 var0 = (class20) field531.method3301(); var0 != null; var0 = (class20) field531.method3278()) {
            if (var0.field539 != null) {
                Statics.field2152.method947(var0.field539);
                var0.field539 = null;
            }
            if (var0.field540 != null) {
                Statics.field2152.method947(var0.field540);
                var0.field540 = null;
            }
        }
        field531.method3270();
    }

    @ObfuscatedName("client.y(I)V")
    public static void method365() {
        for (class20 var0 = (class20) field531.method3301(); var0 != null; var0 = (class20) field531.method3278()) {
            if (var0.field543 != null) {
                var0.method446();
            }
        }
    }

    @ObfuscatedName("w.s(B)V")
    public void method446() {
        int var1 = this.field538;
        class36 var2 = this.field543.method614();
        if (var2 == null) {
            this.field538 = -1;
            this.field537 = 0;
            this.field544 = 0;
            this.field541 = 0;
            this.field542 = null;
        } else {
            this.field538 = var2.field870;
            this.field537 = var2.field869 * 128;
            this.field544 = var2.field872;
            this.field541 = var2.field873;
            this.field542 = var2.field874;
        }
        if (this.field538 != var1 && this.field539 != null) {
            Statics.field2152.method947(this.field539);
            this.field539 = null;
        }
    }
}
