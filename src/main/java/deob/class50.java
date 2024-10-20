package deob;

@ObfuscatedName("af")
public class class50 {

    @ObfuscatedName("af.i")
    public int field1088;

    @ObfuscatedName("af.v")
    public int field1090;

    @ObfuscatedName("af.m")
    public int[] field1089;

    @ObfuscatedName("af.j")
    public int[] field1087;

    public class50() {
        class53.method1218(16);
        this.field1088 = class53.method1217() == 0 ? 1 : class53.method1218(4) + 1;
        if (class53.method1217() != 0) {
            class53.method1218(8);
        }
        class53.method1218(2);
        if (this.field1088 > 1) {
            this.field1090 = class53.method1218(4);
        }
        this.field1089 = new int[this.field1088];
        this.field1087 = new int[this.field1088];
        for (int var1 = 0; var1 < this.field1088; var1++) {
            class53.method1218(8);
            this.field1089[var1] = class53.method1218(8);
            this.field1087[var1] = class53.method1218(8);
        }
    }
}
