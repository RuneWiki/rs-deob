package deob;

@ObfuscatedName("bn")
public class class64 {

    @ObfuscatedName("bn.n")
    public int field1210;

    @ObfuscatedName("bn.w")
    public int field1213;

    @ObfuscatedName("bn.i")
    public int[] field1212;

    @ObfuscatedName("bn.e")
    public int[] field1211;

    public class64() {
        class66.method1302(16);
        this.field1210 = class66.method1310() == 0 ? 1 : class66.method1302(4) + 1;
        if (class66.method1310() != 0) {
            class66.method1302(8);
        }
        class66.method1302(2);
        if (this.field1210 > 1) {
            this.field1213 = class66.method1302(4);
        }
        this.field1212 = new int[this.field1210];
        this.field1211 = new int[this.field1210];
        for (int var1 = 0; var1 < this.field1210; var1++) {
            class66.method1302(8);
            this.field1212[var1] = class66.method1302(8);
            this.field1211[var1] = class66.method1302(8);
        }
    }
}
