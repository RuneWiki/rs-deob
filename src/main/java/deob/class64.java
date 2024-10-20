package deob;

@ObfuscatedName("bj")
public class class64 {

    @ObfuscatedName("bj.p")
    public int field1222;

    @ObfuscatedName("bj.k")
    public int field1221;

    @ObfuscatedName("bj.e")
    public int[] field1219;

    @ObfuscatedName("bj.f")
    public int[] field1220;

    public class64() {
        class66.method1322(16);
        this.field1222 = class66.method1301() == 0 ? 1 : class66.method1322(4) + 1;
        if (class66.method1301() != 0) {
            class66.method1322(8);
        }
        class66.method1322(2);
        if (this.field1222 > 1) {
            this.field1221 = class66.method1322(4);
        }
        this.field1219 = new int[this.field1222];
        this.field1220 = new int[this.field1222];
        for (int var1 = 0; var1 < this.field1222; var1++) {
            class66.method1322(8);
            this.field1219[var1] = class66.method1322(8);
            this.field1220[var1] = class66.method1322(8);
        }
    }
}
