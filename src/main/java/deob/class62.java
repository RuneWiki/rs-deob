package deob;

@ObfuscatedName("bt")
public class class62 {

    @ObfuscatedName("bt.y")
    public int field1164;

    @ObfuscatedName("bt.u")
    public int field1167;

    @ObfuscatedName("bt.k")
    public int[] field1166;

    @ObfuscatedName("bt.v")
    public int[] field1165;

    public class62() {
        class64.method1255(16);
        this.field1164 = class64.method1254() == 0 ? 1 : class64.method1255(4) + 1;
        if (class64.method1254() != 0) {
            class64.method1255(8);
        }
        class64.method1255(2);
        if (this.field1164 > 1) {
            this.field1167 = class64.method1255(4);
        }
        this.field1166 = new int[this.field1164];
        this.field1165 = new int[this.field1164];
        for (int var1 = 0; var1 < this.field1164; var1++) {
            class64.method1255(8);
            this.field1166[var1] = class64.method1255(8);
            this.field1165[var1] = class64.method1255(8);
        }
    }
}
