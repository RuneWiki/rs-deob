package deob;

@ObfuscatedName("br")
public class class69 {

    @ObfuscatedName("br.j")
    public int field1263;

    @ObfuscatedName("br.h")
    public int field1264;

    @ObfuscatedName("br.m")
    public int[] field1265;

    @ObfuscatedName("br.z")
    public int[] field1266;

    public class69() {
        class71.method1440(16);
        this.field1263 = class71.method1434() == 0 ? 1 : class71.method1440(4) + 1;
        if (class71.method1434() != 0) {
            class71.method1440(8);
        }
        class71.method1440(2);
        if (this.field1263 > 1) {
            this.field1264 = class71.method1440(4);
        }
        this.field1265 = new int[this.field1263];
        this.field1266 = new int[this.field1263];
        for (int var1 = 0; var1 < this.field1263; var1++) {
            class71.method1440(8);
            this.field1265[var1] = class71.method1440(8);
            this.field1266[var1] = class71.method1440(8);
        }
    }
}
