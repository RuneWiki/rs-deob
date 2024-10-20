package deob;

@ObfuscatedName("br")
public class class51 {

    @ObfuscatedName("br.aq")
    public int field338;

    @ObfuscatedName("br.ad")
    public int field336;

    @ObfuscatedName("br.ag")
    public int[] field337;

    @ObfuscatedName("br.ak")
    public int[] field335;

    public class51() {
        class61 var1 = class55.field354;
        var1.method1104(16);
        this.field338 = var1.method1092() == 0 ? 1 : var1.method1104(4) + 1;
        if (var1.method1092() != 0) {
            var1.method1104(8);
        }
        var1.method1104(2);
        if (this.field338 > 1) {
            this.field336 = var1.method1104(4);
        }
        this.field337 = new int[this.field338];
        this.field335 = new int[this.field338];
        for (int var2 = 0; var2 < this.field338; var2++) {
            var1.method1104(8);
            this.field337[var2] = var1.method1104(8);
            this.field335[var2] = var1.method1104(8);
        }
    }
}
