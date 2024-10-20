package deob;

@ObfuscatedName("am")
public class class49 {

    @ObfuscatedName("am.u")
    public int field1075;

    @ObfuscatedName("am.k")
    public int field1073;

    @ObfuscatedName("am.x")
    public int[] field1074;

    @ObfuscatedName("am.m")
    public int[] field1076;

    public class49() {
        class52.method1176(16);
        this.field1075 = class52.method1175() == 0 ? 1 : class52.method1176(4) + 1;
        if (class52.method1175() != 0) {
            class52.method1176(8);
        }
        class52.method1176(2);
        if (this.field1075 > 1) {
            this.field1073 = class52.method1176(4);
        }
        this.field1074 = new int[this.field1075];
        this.field1076 = new int[this.field1075];
        for (int var1 = 0; var1 < this.field1075; var1++) {
            class52.method1176(8);
            this.field1074[var1] = class52.method1176(8);
            this.field1076[var1] = class52.method1176(8);
        }
    }
}
