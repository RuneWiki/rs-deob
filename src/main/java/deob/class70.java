package deob;

@ObfuscatedName("bg")
public class class70 {

    @ObfuscatedName("bg.x")
    public int field1164;

    @ObfuscatedName("bg.n")
    public int field1162;

    @ObfuscatedName("bg.g")
    public int[] field1163;

    @ObfuscatedName("bg.v")
    public int[] field1161;

    public class70() {
        class55.method1048(16);
        this.field1164 = class55.method1068() == 0 ? 1 : class55.method1048(4) + 1;
        if (class55.method1068() != 0) {
            class55.method1048(8);
        }
        class55.method1048(2);
        if (this.field1164 > 1) {
            this.field1162 = class55.method1048(4);
        }
        this.field1163 = new int[this.field1164];
        this.field1161 = new int[this.field1164];
        for (int var1 = 0; var1 < this.field1164; var1++) {
            class55.method1048(8);
            this.field1163[var1] = class55.method1048(8);
            this.field1161[var1] = class55.method1048(8);
        }
    }
}
