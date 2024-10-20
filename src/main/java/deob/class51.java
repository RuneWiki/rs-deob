package deob;

@ObfuscatedName("bt")
public class class51 {

    @ObfuscatedName("bt.at")
    public int field357;

    @ObfuscatedName("bt.an")
    public int field358;

    @ObfuscatedName("bt.av")
    public int[] field359;

    @ObfuscatedName("bt.as")
    public int[] field360;

    public class51() {
        class61 var1 = class55.field375;
        var1.method1050(16);
        this.field357 = var1.method1049() == 0 ? 1 : var1.method1050(4) + 1;
        if (var1.method1049() != 0) {
            var1.method1050(8);
        }
        var1.method1050(2);
        if (this.field357 > 1) {
            this.field358 = var1.method1050(4);
        }
        this.field359 = new int[this.field357];
        this.field360 = new int[this.field357];
        for (int var2 = 0; var2 < this.field357; var2++) {
            var1.method1050(8);
            this.field359[var2] = var1.method1050(8);
            this.field360[var2] = var1.method1050(8);
        }
    }
}
