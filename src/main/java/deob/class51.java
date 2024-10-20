package deob;

@ObfuscatedName("bl")
public class class51 {

    @ObfuscatedName("bl.ap")
    public int field331;

    @ObfuscatedName("bl.aw")
    public int field330;

    @ObfuscatedName("bl.ak")
    public int[] field332;

    @ObfuscatedName("bl.aj")
    public int[] field333;

    public class51() {
        class61 var1 = class55.field350;
        var1.method1145(16);
        this.field331 = var1.method1135() == 0 ? 1 : var1.method1145(4) + 1;
        if (var1.method1135() != 0) {
            var1.method1145(8);
        }
        var1.method1145(2);
        if (this.field331 > 1) {
            this.field330 = var1.method1145(4);
        }
        this.field332 = new int[this.field331];
        this.field333 = new int[this.field331];
        for (int var2 = 0; var2 < this.field331; var2++) {
            var1.method1145(8);
            this.field332[var2] = var1.method1145(8);
            this.field333[var2] = var1.method1145(8);
        }
    }
}
