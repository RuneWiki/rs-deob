package deob;

@ObfuscatedName("br")
public class class69 {

    @ObfuscatedName("br.o")
    public int field1275;

    @ObfuscatedName("br.f")
    public int field1274;

    @ObfuscatedName("br.i")
    public int[] field1273;

    @ObfuscatedName("br.h")
    public int[] field1276;

    public class69() {
        class71.method1381(16);
        this.field1275 = class71.method1380() == 0 ? 1 : class71.method1381(4) + 1;
        if (class71.method1380() != 0) {
            class71.method1381(8);
        }
        class71.method1381(2);
        if (this.field1275 > 1) {
            this.field1274 = class71.method1381(4);
        }
        this.field1273 = new int[this.field1275];
        this.field1276 = new int[this.field1275];
        for (int var1 = 0; var1 < this.field1275; var1++) {
            class71.method1381(8);
            this.field1273[var1] = class71.method1381(8);
            this.field1276[var1] = class71.method1381(8);
        }
    }
}
