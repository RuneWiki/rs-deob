package deob;

@ObfuscatedName("bu")
public class class70 {

    @ObfuscatedName("bu.i")
    public int field1153;

    @ObfuscatedName("bu.e")
    public int field1151;

    @ObfuscatedName("bu.f")
    public int[] field1152;

    @ObfuscatedName("bu.k")
    public int[] field1150;

    public class70() {
        class55.method936(16);
        this.field1153 = class55.method961() == 0 ? 1 : class55.method936(4) + 1;
        if (class55.method961() != 0) {
            class55.method936(8);
        }
        class55.method936(2);
        if (this.field1153 > 1) {
            this.field1151 = class55.method936(4);
        }
        this.field1152 = new int[this.field1153];
        this.field1150 = new int[this.field1153];
        for (int var1 = 0; var1 < this.field1153; var1++) {
            class55.method936(8);
            this.field1152[var1] = class55.method936(8);
            this.field1150[var1] = class55.method936(8);
        }
    }
}
