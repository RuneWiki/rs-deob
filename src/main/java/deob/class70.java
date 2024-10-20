package deob;

@ObfuscatedName("bq")
public class class70 {

    @ObfuscatedName("bq.q")
    public int field1164;

    @ObfuscatedName("bq.d")
    public int field1162;

    @ObfuscatedName("bq.h")
    public int[] field1163;

    @ObfuscatedName("bq.p")
    public int[] field1161;

    public class70() {
        class55.method1034(16);
        this.field1164 = class55.method1033() == 0 ? 1 : class55.method1034(4) + 1;
        if (class55.method1033() != 0) {
            class55.method1034(8);
        }
        class55.method1034(2);
        if (this.field1164 > 1) {
            this.field1162 = class55.method1034(4);
        }
        this.field1163 = new int[this.field1164];
        this.field1161 = new int[this.field1164];
        for (int var1 = 0; var1 < this.field1164; var1++) {
            class55.method1034(8);
            this.field1163[var1] = class55.method1034(8);
            this.field1161[var1] = class55.method1034(8);
        }
    }
}
