package deob;

@ObfuscatedName("bx")
public class class70 {

    @ObfuscatedName("bx.x")
    public int field1155;

    @ObfuscatedName("bx.j")
    public int field1153;

    @ObfuscatedName("bx.c")
    public int[] field1152;

    @ObfuscatedName("bx.d")
    public int[] field1154;

    public class70() {
        class55.method1038(16);
        this.field1155 = class55.method1037() == 0 ? 1 : class55.method1038(4) + 1;
        if (class55.method1037() != 0) {
            class55.method1038(8);
        }
        class55.method1038(2);
        if (this.field1155 > 1) {
            this.field1153 = class55.method1038(4);
        }
        this.field1152 = new int[this.field1155];
        this.field1154 = new int[this.field1155];
        for (int var1 = 0; var1 < this.field1155; var1++) {
            class55.method1038(8);
            this.field1152[var1] = class55.method1038(8);
            this.field1154[var1] = class55.method1038(8);
        }
    }
}
