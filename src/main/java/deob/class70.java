package deob;

@ObfuscatedName("bg")
public class class70 {

    @ObfuscatedName("bg.n")
    public int field1140;

    @ObfuscatedName("bg.d")
    public int field1138;

    @ObfuscatedName("bg.m")
    public int[] field1141;

    @ObfuscatedName("bg.h")
    public int[] field1139;

    public class70() {
        class55.method960(16);
        this.field1140 = class55.method953() == 0 ? 1 : class55.method960(4) + 1;
        if (class55.method953() != 0) {
            class55.method960(8);
        }
        class55.method960(2);
        if (this.field1140 > 1) {
            this.field1138 = class55.method960(4);
        }
        this.field1141 = new int[this.field1140];
        this.field1139 = new int[this.field1140];
        for (int var1 = 0; var1 < this.field1140; var1++) {
            class55.method960(8);
            this.field1141[var1] = class55.method960(8);
            this.field1139[var1] = class55.method960(8);
        }
    }
}
