package deob;

@ObfuscatedName("be")
public class class63 {

    @ObfuscatedName("be.a")
    public int field1188;

    @ObfuscatedName("be.v")
    public int field1189;

    @ObfuscatedName("be.i")
    public int[] field1190;

    @ObfuscatedName("be.b")
    public int[] field1191;

    public class63() {
        class65.method1278(16);
        this.field1188 = class65.method1288() == 0 ? 1 : class65.method1278(4) + 1;
        if (class65.method1288() != 0) {
            class65.method1278(8);
        }
        class65.method1278(2);
        if (this.field1188 > 1) {
            this.field1189 = class65.method1278(4);
        }
        this.field1190 = new int[this.field1188];
        this.field1191 = new int[this.field1188];
        for (int var1 = 0; var1 < this.field1188; var1++) {
            class65.method1278(8);
            this.field1190[var1] = class65.method1278(8);
            this.field1191[var1] = class65.method1278(8);
        }
    }
}
