package deob;

@ObfuscatedName("bg")
public class class69 {

    @ObfuscatedName("bg.e")
    public int field1255;

    @ObfuscatedName("bg.w")
    public int field1253;

    @ObfuscatedName("bg.f")
    public int[] field1254;

    @ObfuscatedName("bg.s")
    public int[] field1252;

    public class69() {
        class71.method1443(16);
        this.field1255 = class71.method1447() == 0 ? 1 : class71.method1443(4) + 1;
        if (class71.method1447() != 0) {
            class71.method1443(8);
        }
        class71.method1443(2);
        if (this.field1255 > 1) {
            this.field1253 = class71.method1443(4);
        }
        this.field1254 = new int[this.field1255];
        this.field1252 = new int[this.field1255];
        for (int var1 = 0; var1 < this.field1255; var1++) {
            class71.method1443(8);
            this.field1254[var1] = class71.method1443(8);
            this.field1252[var1] = class71.method1443(8);
        }
    }
}
