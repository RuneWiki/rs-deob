package deob;

@ObfuscatedName("be")
public class class51 {

    @ObfuscatedName("be.ac")
    public int field339;

    @ObfuscatedName("be.ae")
    public int field340;

    @ObfuscatedName("be.ag")
    public int[] field341;

    @ObfuscatedName("be.am")
    public int[] field342;

    public class51() {
        class61 var1 = class55.field365;
        var1.method1117(16);
        this.field339 = var1.method1118() == 0 ? 1 : var1.method1117(4) + 1;
        if (var1.method1118() != 0) {
            var1.method1117(8);
        }
        var1.method1117(2);
        if (this.field339 > 1) {
            this.field340 = var1.method1117(4);
        }
        this.field341 = new int[this.field339];
        this.field342 = new int[this.field339];
        for (int var2 = 0; var2 < this.field339; var2++) {
            var1.method1117(8);
            this.field341[var2] = var1.method1117(8);
            this.field342[var2] = var1.method1117(8);
        }
    }
}
