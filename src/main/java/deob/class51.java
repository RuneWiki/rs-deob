package deob;

@ObfuscatedName("br")
public class class51 {

    @ObfuscatedName("br.at")
    public int field341;

    @ObfuscatedName("br.ah")
    public int field342;

    @ObfuscatedName("br.ar")
    public int[] field344;

    @ObfuscatedName("br.ao")
    public int[] field343;

    public class51() {
        class61 var1 = class55.field360;
        var1.method1106(16);
        this.field341 = var1.method1107() == 0 ? 1 : var1.method1106(4) + 1;
        if (var1.method1107() != 0) {
            var1.method1106(8);
        }
        var1.method1106(2);
        if (this.field341 > 1) {
            this.field342 = var1.method1106(4);
        }
        this.field344 = new int[this.field341];
        this.field343 = new int[this.field341];
        for (int var2 = 0; var2 < this.field341; var2++) {
            var1.method1106(8);
            this.field344[var2] = var1.method1106(8);
            this.field343[var2] = var1.method1106(8);
        }
    }
}
