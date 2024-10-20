package deob;

@ObfuscatedName("f")
public class class17 {

    @ObfuscatedName("f.t")
    public int field230;

    @ObfuscatedName("f.n")
    public int field231;

    @ObfuscatedName("f.q")
    public int[] field232;

    @ObfuscatedName("f.h")
    public int[] field233;

    public class17() {
        class130.method1517(16);
        this.field230 = class130.method1516() == 0 ? 1 : class130.method1517(4) + 1;
        if (class130.method1516() != 0) {
            class130.method1517(8);
        }
        class130.method1517(2);
        if (this.field230 > 1) {
            this.field231 = class130.method1517(4);
        }
        this.field232 = new int[this.field230];
        this.field233 = new int[this.field230];
        for (int var1 = 0; var1 < this.field230; var1++) {
            class130.method1517(8);
            this.field232[var1] = class130.method1517(8);
            this.field233[var1] = class130.method1517(8);
        }
    }
}
