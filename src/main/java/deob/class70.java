package deob;

@ObfuscatedName("bo")
public class class70 {

    @ObfuscatedName("bo.f")
    public int field1170;

    @ObfuscatedName("bo.i")
    public int field1169;

    @ObfuscatedName("bo.u")
    public int[] field1171;

    @ObfuscatedName("bo.h")
    public int[] field1172;

    public class70() {
        class55.method999(16);
        this.field1170 = class55.method998() == 0 ? 1 : class55.method999(4) + 1;
        if (class55.method998() != 0) {
            class55.method999(8);
        }
        class55.method999(2);
        if (this.field1170 > 1) {
            this.field1169 = class55.method999(4);
        }
        this.field1171 = new int[this.field1170];
        this.field1172 = new int[this.field1170];
        for (int var1 = 0; var1 < this.field1170; var1++) {
            class55.method999(8);
            this.field1171[var1] = class55.method999(8);
            this.field1172[var1] = class55.method999(8);
        }
    }
}
