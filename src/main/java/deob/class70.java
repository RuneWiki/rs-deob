package deob;

@ObfuscatedName("bx")
public class class70 {

    @ObfuscatedName("bx.o")
    public int field1150;

    @ObfuscatedName("bx.m")
    public int field1149;

    @ObfuscatedName("bx.b")
    public int[] field1148;

    @ObfuscatedName("bx.g")
    public int[] field1151;

    public class70() {
        class55.method941(16);
        this.field1150 = class55.method940() == 0 ? 1 : class55.method941(4) + 1;
        if (class55.method940() != 0) {
            class55.method941(8);
        }
        class55.method941(2);
        if (this.field1150 > 1) {
            this.field1149 = class55.method941(4);
        }
        this.field1148 = new int[this.field1150];
        this.field1151 = new int[this.field1150];
        for (int var1 = 0; var1 < this.field1150; var1++) {
            class55.method941(8);
            this.field1148[var1] = class55.method941(8);
            this.field1151[var1] = class55.method941(8);
        }
    }
}
