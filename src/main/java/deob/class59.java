package deob;

@ObfuscatedName("bd")
public class class59 {

    @ObfuscatedName("bd.m")
    public int field1150;

    @ObfuscatedName("bd.k")
    public int field1151;

    @ObfuscatedName("bd.y")
    public int[] field1152;

    @ObfuscatedName("bd.g")
    public int[] field1153;

    public class59() {
        class61.method1262(16);
        this.field1150 = class61.method1241() == 0 ? 1 : class61.method1262(4) + 1;
        if (class61.method1241() != 0) {
            class61.method1262(8);
        }
        class61.method1262(2);
        if (this.field1150 > 1) {
            this.field1151 = class61.method1262(4);
        }
        this.field1152 = new int[this.field1150];
        this.field1153 = new int[this.field1150];
        for (int var1 = 0; var1 < this.field1150; var1++) {
            class61.method1262(8);
            this.field1152[var1] = class61.method1262(8);
            this.field1153[var1] = class61.method1262(8);
        }
    }
}
