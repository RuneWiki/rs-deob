package deob;

@ObfuscatedName("bu")
public class class62 {

    @ObfuscatedName("bu.k")
    public int field1179;

    @ObfuscatedName("bu.r")
    public int field1181;

    @ObfuscatedName("bu.y")
    public int[] field1180;

    @ObfuscatedName("bu.w")
    public int[] field1178;

    public class62() {
        class64.method1283(16);
        this.field1179 = class64.method1285() == 0 ? 1 : class64.method1283(4) + 1;
        if (class64.method1285() != 0) {
            class64.method1283(8);
        }
        class64.method1283(2);
        if (this.field1179 > 1) {
            this.field1181 = class64.method1283(4);
        }
        this.field1180 = new int[this.field1179];
        this.field1178 = new int[this.field1179];
        for (int var1 = 0; var1 < this.field1179; var1++) {
            class64.method1283(8);
            this.field1180[var1] = class64.method1283(8);
            this.field1178[var1] = class64.method1283(8);
        }
    }
}
