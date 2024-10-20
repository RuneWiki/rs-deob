package deob;

@ObfuscatedName("bm")
public class class63 {

    @ObfuscatedName("bm.g")
    public int field1188;

    @ObfuscatedName("bm.j")
    public int field1187;

    @ObfuscatedName("bm.z")
    public int[] field1186;

    @ObfuscatedName("bm.b")
    public int[] field1189;

    public class63() {
        class65.method1247(16);
        this.field1188 = class65.method1217() == 0 ? 1 : class65.method1247(4) + 1;
        if (class65.method1217() != 0) {
            class65.method1247(8);
        }
        class65.method1247(2);
        if (this.field1188 > 1) {
            this.field1187 = class65.method1247(4);
        }
        this.field1186 = new int[this.field1188];
        this.field1189 = new int[this.field1188];
        for (int var1 = 0; var1 < this.field1188; var1++) {
            class65.method1247(8);
            this.field1186[var1] = class65.method1247(8);
            this.field1189[var1] = class65.method1247(8);
        }
    }
}
