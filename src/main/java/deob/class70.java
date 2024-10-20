package deob;

@ObfuscatedName("bw")
public class class70 {

    @ObfuscatedName("bw.p")
    public int field1149;

    @ObfuscatedName("bw.g")
    public int field1147;

    @ObfuscatedName("bw.x")
    public int[] field1146;

    @ObfuscatedName("bw.q")
    public int[] field1148;

    public class70() {
        class55.method937(16);
        this.field1149 = class55.method936() == 0 ? 1 : class55.method937(4) + 1;
        if (class55.method936() != 0) {
            class55.method937(8);
        }
        class55.method937(2);
        if (this.field1149 > 1) {
            this.field1147 = class55.method937(4);
        }
        this.field1146 = new int[this.field1149];
        this.field1148 = new int[this.field1149];
        for (int var1 = 0; var1 < this.field1149; var1++) {
            class55.method937(8);
            this.field1146[var1] = class55.method937(8);
            this.field1148[var1] = class55.method937(8);
        }
    }
}
