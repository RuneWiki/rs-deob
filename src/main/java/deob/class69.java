package deob;

@ObfuscatedName("bu")
public class class69 {

    @ObfuscatedName("bu.i")
    public int field1286;

    @ObfuscatedName("bu.v")
    public int field1285;

    @ObfuscatedName("bu.r")
    public int[] field1287;

    @ObfuscatedName("bu.n")
    public int[] field1288;

    public class69() {
        class71.method1463(16);
        this.field1286 = class71.method1474() == 0 ? 1 : class71.method1463(4) + 1;
        if (class71.method1474() != 0) {
            class71.method1463(8);
        }
        class71.method1463(2);
        if (this.field1286 > 1) {
            this.field1285 = class71.method1463(4);
        }
        this.field1287 = new int[this.field1286];
        this.field1288 = new int[this.field1286];
        for (int var1 = 0; var1 < this.field1286; var1++) {
            class71.method1463(8);
            this.field1287[var1] = class71.method1463(8);
            this.field1288[var1] = class71.method1463(8);
        }
    }
}
