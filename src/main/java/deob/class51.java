package deob;

@ObfuscatedName("bv")
public class class51 {

    @ObfuscatedName("bv.az")
    public int field350;

    @ObfuscatedName("bv.ah")
    public int field348;

    @ObfuscatedName("bv.af")
    public int[] field349;

    @ObfuscatedName("bv.at")
    public int[] field347;

    public class51() {
        class61 var1 = class55.field366;
        var1.method1058(16);
        this.field350 = var1.method1059() == 0 ? 1 : var1.method1058(4) + 1;
        if (var1.method1059() != 0) {
            var1.method1058(8);
        }
        var1.method1058(2);
        if (this.field350 > 1) {
            this.field348 = var1.method1058(4);
        }
        this.field349 = new int[this.field350];
        this.field347 = new int[this.field350];
        for (int var2 = 0; var2 < this.field350; var2++) {
            var1.method1058(8);
            this.field349[var2] = var1.method1058(8);
            this.field347[var2] = var1.method1058(8);
        }
    }
}
