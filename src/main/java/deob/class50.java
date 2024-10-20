package deob;

@ObfuscatedName("au")
public class class50 {

    @ObfuscatedName("au.f")
    public int field1067;

    @ObfuscatedName("au.t")
    public int field1068;

    @ObfuscatedName("au.n")
    public int[] field1069;

    @ObfuscatedName("au.e")
    public int[] field1070;

    public class50() {
        class53.method1208(16);
        this.field1067 = class53.method1189() == 0 ? 1 : class53.method1208(4) + 1;
        if (class53.method1189() != 0) {
            class53.method1208(8);
        }
        class53.method1208(2);
        if (this.field1067 > 1) {
            this.field1068 = class53.method1208(4);
        }
        this.field1069 = new int[this.field1067];
        this.field1070 = new int[this.field1067];
        for (int var1 = 0; var1 < this.field1067; var1++) {
            class53.method1208(8);
            this.field1069[var1] = class53.method1208(8);
            this.field1070[var1] = class53.method1208(8);
        }
    }
}
