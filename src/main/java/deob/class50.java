package deob;

@ObfuscatedName("ac")
public class class50 {

    @ObfuscatedName("ac.a")
    public int field1099;

    @ObfuscatedName("ac.x")
    public int field1100;

    @ObfuscatedName("ac.e")
    public int[] field1101;

    @ObfuscatedName("ac.r")
    public int[] field1102;

    public class50() {
        class53.method1207(16);
        this.field1099 = class53.method1189() == 0 ? 1 : class53.method1207(4) + 1;
        if (class53.method1189() != 0) {
            class53.method1207(8);
        }
        class53.method1207(2);
        if (this.field1099 > 1) {
            this.field1100 = class53.method1207(4);
        }
        this.field1101 = new int[this.field1099];
        this.field1102 = new int[this.field1099];
        for (int var1 = 0; var1 < this.field1099; var1++) {
            class53.method1207(8);
            this.field1101[var1] = class53.method1207(8);
            this.field1102[var1] = class53.method1207(8);
        }
    }
}
