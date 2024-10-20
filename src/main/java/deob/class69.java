package deob;

@ObfuscatedName("bx")
public class class69 {

    @ObfuscatedName("bx.l")
    public int field1268;

    @ObfuscatedName("bx.e")
    public int field1265;

    @ObfuscatedName("bx.q")
    public int[] field1267;

    @ObfuscatedName("bx.o")
    public int[] field1266;

    public class69() {
        class71.method1461(16);
        this.field1268 = class71.method1460() == 0 ? 1 : class71.method1461(4) + 1;
        if (class71.method1460() != 0) {
            class71.method1461(8);
        }
        class71.method1461(2);
        if (this.field1268 > 1) {
            this.field1265 = class71.method1461(4);
        }
        this.field1267 = new int[this.field1268];
        this.field1266 = new int[this.field1268];
        for (int var1 = 0; var1 < this.field1268; var1++) {
            class71.method1461(8);
            this.field1267[var1] = class71.method1461(8);
            this.field1266[var1] = class71.method1461(8);
        }
    }
}
