package deob;

@ObfuscatedName("al")
public class class50 {

    @ObfuscatedName("al.c")
    public int field1104;

    @ObfuscatedName("al.q")
    public int field1102;

    @ObfuscatedName("al.y")
    public int[] field1103;

    @ObfuscatedName("al.v")
    public int[] field1101;

    public class50() {
        class53.method1144(16);
        this.field1104 = class53.method1143() == 0 ? 1 : class53.method1144(4) + 1;
        if (class53.method1143() != 0) {
            class53.method1144(8);
        }
        class53.method1144(2);
        if (this.field1104 > 1) {
            this.field1102 = class53.method1144(4);
        }
        this.field1103 = new int[this.field1104];
        this.field1101 = new int[this.field1104];
        for (int var1 = 0; var1 < this.field1104; var1++) {
            class53.method1144(8);
            this.field1103[var1] = class53.method1144(8);
            this.field1101[var1] = class53.method1144(8);
        }
    }
}
