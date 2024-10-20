package deob;

@ObfuscatedName("bw")
public class class70 {

    @ObfuscatedName("bw.b")
    public int field1131;

    @ObfuscatedName("bw.l")
    public int field1130;

    @ObfuscatedName("bw.i")
    public int[] field1132;

    @ObfuscatedName("bw.t")
    public int[] field1129;

    public class70() {
        class55.method1033(16);
        this.field1131 = class55.method1036() == 0 ? 1 : class55.method1033(4) + 1;
        if (class55.method1036() != 0) {
            class55.method1033(8);
        }
        class55.method1033(2);
        if (this.field1131 > 1) {
            this.field1130 = class55.method1033(4);
        }
        this.field1132 = new int[this.field1131];
        this.field1129 = new int[this.field1131];
        for (int var1 = 0; var1 < this.field1131; var1++) {
            class55.method1033(8);
            this.field1132[var1] = class55.method1033(8);
            this.field1129[var1] = class55.method1033(8);
        }
    }
}
