package deob;

@ObfuscatedName("bl")
public class class51 {

    @ObfuscatedName("bl.aq")
    public int field354;

    @ObfuscatedName("bl.aw")
    public int field353;

    @ObfuscatedName("bl.al")
    public int[] field355;

    @ObfuscatedName("bl.ai")
    public int[] field356;

    public class51() {
        class61 var1 = class55.field393;
        var1.method1068(16);
        this.field354 = var1.method1069() == 0 ? 1 : var1.method1068(4) + 1;
        if (var1.method1069() != 0) {
            var1.method1068(8);
        }
        var1.method1068(2);
        if (this.field354 > 1) {
            this.field353 = var1.method1068(4);
        }
        this.field355 = new int[this.field354];
        this.field356 = new int[this.field354];
        for (int var2 = 0; var2 < this.field354; var2++) {
            var1.method1068(8);
            this.field355[var2] = var1.method1068(8);
            this.field356[var2] = var1.method1068(8);
        }
    }
}
