package deob;

@ObfuscatedName("bu")
public class class63 {

    @ObfuscatedName("bu.v")
    public int field1179;

    @ObfuscatedName("bu.t")
    public int field1181;

    @ObfuscatedName("bu.f")
    public int[] field1180;

    @ObfuscatedName("bu.j")
    public int[] field1178;

    public class63() {
        class65.method1282(16);
        this.field1179 = class65.method1277() == 0 ? 1 : class65.method1282(4) + 1;
        if (class65.method1277() != 0) {
            class65.method1282(8);
        }
        class65.method1282(2);
        if (this.field1179 > 1) {
            this.field1181 = class65.method1282(4);
        }
        this.field1180 = new int[this.field1179];
        this.field1178 = new int[this.field1179];
        for (int var1 = 0; var1 < this.field1179; var1++) {
            class65.method1282(8);
            this.field1180[var1] = class65.method1282(8);
            this.field1178[var1] = class65.method1282(8);
        }
    }
}
