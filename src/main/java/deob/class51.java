package deob;

@ObfuscatedName("bc")
public class class51 {

    @ObfuscatedName("bc.au")
    public int field376;

    @ObfuscatedName("bc.ae")
    public int field375;

    @ObfuscatedName("bc.ao")
    public int[] field377;

    @ObfuscatedName("bc.at")
    public int[] field378;

    public class51() {
        class61 var1 = class55.field394;
        var1.method1101(16);
        this.field376 = var1.method1102() == 0 ? 1 : var1.method1101(4) + 1;
        if (var1.method1102() != 0) {
            var1.method1101(8);
        }
        var1.method1101(2);
        if (this.field376 > 1) {
            this.field375 = var1.method1101(4);
        }
        this.field377 = new int[this.field376];
        this.field378 = new int[this.field376];
        for (int var2 = 0; var2 < this.field376; var2++) {
            var1.method1101(8);
            this.field377[var2] = var1.method1101(8);
            this.field378[var2] = var1.method1101(8);
        }
    }
}
