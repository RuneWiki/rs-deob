package deob;

@ObfuscatedName("ba")
public class class70 {

    @ObfuscatedName("ba.k")
    public int field1148;

    @ObfuscatedName("ba.y")
    public int field1147;

    @ObfuscatedName("ba.o")
    public int[] field1149;

    @ObfuscatedName("ba.r")
    public int[] field1150;

    public class70() {
        class55.method979(16);
        this.field1148 = class55.method969() == 0 ? 1 : class55.method979(4) + 1;
        if (class55.method969() != 0) {
            class55.method979(8);
        }
        class55.method979(2);
        if (this.field1148 > 1) {
            this.field1147 = class55.method979(4);
        }
        this.field1149 = new int[this.field1148];
        this.field1150 = new int[this.field1148];
        for (int var1 = 0; var1 < this.field1148; var1++) {
            class55.method979(8);
            this.field1149[var1] = class55.method979(8);
            this.field1150[var1] = class55.method979(8);
        }
    }
}
