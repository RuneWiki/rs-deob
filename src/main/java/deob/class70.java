package deob;

@ObfuscatedName("bp")
public class class70 {

    @ObfuscatedName("bp.u")
    public int field1140;

    @ObfuscatedName("bp.x")
    public int field1138;

    @ObfuscatedName("bp.i")
    public int[] field1139;

    @ObfuscatedName("bp.a")
    public int[] field1141;

    public class70() {
        class55.method947(16);
        this.field1140 = class55.method946() == 0 ? 1 : class55.method947(4) + 1;
        if (class55.method946() != 0) {
            class55.method947(8);
        }
        class55.method947(2);
        if (this.field1140 > 1) {
            this.field1138 = class55.method947(4);
        }
        this.field1139 = new int[this.field1140];
        this.field1141 = new int[this.field1140];
        for (int var1 = 0; var1 < this.field1140; var1++) {
            class55.method947(8);
            this.field1139[var1] = class55.method947(8);
            this.field1141[var1] = class55.method947(8);
        }
    }
}
