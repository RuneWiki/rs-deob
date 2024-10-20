package deob;

@ObfuscatedName("bz")
public class class51 {

    @ObfuscatedName("bz.am")
    public int field361;

    @ObfuscatedName("bz.ap")
    public int field359;

    @ObfuscatedName("bz.af")
    public int[] field360;

    @ObfuscatedName("bz.aj")
    public int[] field358;

    public class51() {
        class61 var1 = class55.field377;
        var1.method1129(16);
        this.field361 = var1.method1130() == 0 ? 1 : var1.method1129(4) + 1;
        if (var1.method1130() != 0) {
            var1.method1129(8);
        }
        var1.method1129(2);
        if (this.field361 > 1) {
            this.field359 = var1.method1129(4);
        }
        this.field360 = new int[this.field361];
        this.field358 = new int[this.field361];
        for (int var2 = 0; var2 < this.field361; var2++) {
            var1.method1129(8);
            this.field360[var2] = var1.method1129(8);
            this.field358[var2] = var1.method1129(8);
        }
    }
}
