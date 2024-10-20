package deob;

@ObfuscatedName("bi")
public class class69 {

    @ObfuscatedName("bi.k")
    public int field1258;

    @ObfuscatedName("bi.h")
    public int field1260;

    @ObfuscatedName("bi.o")
    public int[] field1257;

    @ObfuscatedName("bi.z")
    public int[] field1259;

    public class69() {
        class71.method1413(16);
        this.field1258 = class71.method1412() == 0 ? 1 : class71.method1413(4) + 1;
        if (class71.method1412() != 0) {
            class71.method1413(8);
        }
        class71.method1413(2);
        if (this.field1258 > 1) {
            this.field1260 = class71.method1413(4);
        }
        this.field1257 = new int[this.field1258];
        this.field1259 = new int[this.field1258];
        for (int var1 = 0; var1 < this.field1258; var1++) {
            class71.method1413(8);
            this.field1257[var1] = class71.method1413(8);
            this.field1259[var1] = class71.method1413(8);
        }
    }
}
