package deob;

@ObfuscatedName("by")
public class class51 {

    @ObfuscatedName("by.ab")
    public int field334;

    @ObfuscatedName("by.ay")
    public int field333;

    @ObfuscatedName("by.an")
    public int[] field335;

    @ObfuscatedName("by.au")
    public int[] field336;

    public class51() {
        class61 var1 = class55.field353;
        var1.method1091(16);
        this.field334 = var1.method1083() == 0 ? 1 : var1.method1091(4) + 1;
        if (var1.method1083() != 0) {
            var1.method1091(8);
        }
        var1.method1091(2);
        if (this.field334 > 1) {
            this.field333 = var1.method1091(4);
        }
        this.field335 = new int[this.field334];
        this.field336 = new int[this.field334];
        for (int var2 = 0; var2 < this.field334; var2++) {
            var1.method1091(8);
            this.field335[var2] = var1.method1091(8);
            this.field336[var2] = var1.method1091(8);
        }
    }
}
