package deob;

@ObfuscatedName("bc")
public class class62 {

    @ObfuscatedName("bc.g")
    public int field1181;

    @ObfuscatedName("bc.i")
    public int field1180;

    @ObfuscatedName("bc.k")
    public int[] field1179;

    @ObfuscatedName("bc.e")
    public int[] field1182;

    public class62() {
        class64.method1242(16);
        this.field1181 = class64.method1241() == 0 ? 1 : class64.method1242(4) + 1;
        if (class64.method1241() != 0) {
            class64.method1242(8);
        }
        class64.method1242(2);
        if (this.field1181 > 1) {
            this.field1180 = class64.method1242(4);
        }
        this.field1179 = new int[this.field1181];
        this.field1182 = new int[this.field1181];
        for (int var1 = 0; var1 < this.field1181; var1++) {
            class64.method1242(8);
            this.field1179[var1] = class64.method1242(8);
            this.field1182[var1] = class64.method1242(8);
        }
    }
}
