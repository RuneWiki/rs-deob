package deob;

@ObfuscatedName("bi")
public class class59 {

    @ObfuscatedName("bi.z")
    public int field1151;

    @ObfuscatedName("bi.n")
    public int field1153;

    @ObfuscatedName("bi.u")
    public int[] field1152;

    @ObfuscatedName("bi.t")
    public int[] field1150;

    public class59() {
        class61.method1261(16);
        this.field1151 = class61.method1258() == 0 ? 1 : class61.method1261(4) + 1;
        if (class61.method1258() != 0) {
            class61.method1261(8);
        }
        class61.method1261(2);
        if (this.field1151 > 1) {
            this.field1153 = class61.method1261(4);
        }
        this.field1152 = new int[this.field1151];
        this.field1150 = new int[this.field1151];
        for (int var1 = 0; var1 < this.field1151; var1++) {
            class61.method1261(8);
            this.field1152[var1] = class61.method1261(8);
            this.field1150[var1] = class61.method1261(8);
        }
    }
}
