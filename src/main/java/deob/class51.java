package deob;

@ObfuscatedName("bq")
public class class51 {

    @ObfuscatedName("bq.ac")
    public int field372;

    @ObfuscatedName("bq.al")
    public int field371;

    @ObfuscatedName("bq.ak")
    public int[] field373;

    @ObfuscatedName("bq.ax")
    public int[] field370;

    public class51() {
        class61 var1 = class55.field406;
        var1.method1098(16);
        this.field372 = var1.method1099() == 0 ? 1 : var1.method1098(4) + 1;
        if (var1.method1099() != 0) {
            var1.method1098(8);
        }
        var1.method1098(2);
        if (this.field372 > 1) {
            this.field371 = var1.method1098(4);
        }
        this.field373 = new int[this.field372];
        this.field370 = new int[this.field372];
        for (int var2 = 0; var2 < this.field372; var2++) {
            var1.method1098(8);
            this.field373[var2] = var1.method1098(8);
            this.field370[var2] = var1.method1098(8);
        }
    }
}
