package deob;

@ObfuscatedName("ab")
public class class51 {

    @ObfuscatedName("ab.i")
    public int field1093;

    @ObfuscatedName("ab.b")
    public int field1096;

    @ObfuscatedName("ab.r")
    public int[] field1095;

    @ObfuscatedName("ab.l")
    public int[] field1094;

    public class51() {
        class54.method1185(16);
        this.field1093 = class54.method1184() == 0 ? 1 : class54.method1185(4) + 1;
        if (class54.method1184() != 0) {
            class54.method1185(8);
        }
        class54.method1185(2);
        if (this.field1093 > 1) {
            this.field1096 = class54.method1185(4);
        }
        this.field1095 = new int[this.field1093];
        this.field1094 = new int[this.field1093];
        for (int var1 = 0; var1 < this.field1093; var1++) {
            class54.method1185(8);
            this.field1095[var1] = class54.method1185(8);
            this.field1094[var1] = class54.method1185(8);
        }
    }
}
