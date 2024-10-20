package deob;

@ObfuscatedName("bg")
public class class51 {

    @ObfuscatedName("bg.aw")
    public int field384;

    @ObfuscatedName("bg.ay")
    public int field382;

    @ObfuscatedName("bg.ar")
    public int[] field381;

    @ObfuscatedName("bg.am")
    public int[] field383;

    public class51() {
        class61 var1 = class55.field416;
        var1.method1114(16);
        this.field384 = var1.method1115() == 0 ? 1 : var1.method1114(4) + 1;
        if (var1.method1115() != 0) {
            var1.method1114(8);
        }
        var1.method1114(2);
        if (this.field384 > 1) {
            this.field382 = var1.method1114(4);
        }
        this.field381 = new int[this.field384];
        this.field383 = new int[this.field384];
        for (int var2 = 0; var2 < this.field384; var2++) {
            var1.method1114(8);
            this.field381[var2] = var1.method1114(8);
            this.field383[var2] = var1.method1114(8);
        }
    }
}
