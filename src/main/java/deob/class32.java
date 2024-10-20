package deob;

@ObfuscatedName("aa")
public class class32 {

    @ObfuscatedName("aa.s")
    public int field257;

    @ObfuscatedName("aa.t")
    public int field256;

    @ObfuscatedName("aa.v")
    public int[] field255;

    @ObfuscatedName("aa.j")
    public int[] field258;

    public class32() {
        class35.method688(16);
        this.field257 = class35.method705() == 0 ? 1 : class35.method688(4) + 1;
        if (class35.method705() != 0) {
            class35.method688(8);
        }
        class35.method688(2);
        if (this.field257 > 1) {
            this.field256 = class35.method688(4);
        }
        this.field255 = new int[this.field257];
        this.field258 = new int[this.field257];
        for (int var1 = 0; var1 < this.field257; var1++) {
            class35.method688(8);
            this.field255[var1] = class35.method688(8);
            this.field258[var1] = class35.method688(8);
        }
    }
}
