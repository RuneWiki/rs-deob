package deob;

@ObfuscatedName("bb")
public class class51 {

    @ObfuscatedName("bb.ak")
    public int field362;

    @ObfuscatedName("bb.al")
    public int field360;

    @ObfuscatedName("bb.aj")
    public int[] field361;

    @ObfuscatedName("bb.az")
    public int[] field359;

    public class51() {
        class61 var1 = class55.field395;
        var1.method1088(16);
        this.field362 = var1.method1083() == 0 ? 1 : var1.method1088(4) + 1;
        if (var1.method1083() != 0) {
            var1.method1088(8);
        }
        var1.method1088(2);
        if (this.field362 > 1) {
            this.field360 = var1.method1088(4);
        }
        this.field361 = new int[this.field362];
        this.field359 = new int[this.field362];
        for (int var2 = 0; var2 < this.field362; var2++) {
            var1.method1088(8);
            this.field361[var2] = var1.method1088(8);
            this.field359[var2] = var1.method1088(8);
        }
    }
}
