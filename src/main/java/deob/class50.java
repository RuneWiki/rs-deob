package deob;

@ObfuscatedName("bf")
public class class50 {

    @ObfuscatedName("bf.aj")
    public int field356;

    @ObfuscatedName("bf.al")
    public int field355;

    @ObfuscatedName("bf.ac")
    public int[] field353;

    @ObfuscatedName("bf.ab")
    public int[] field354;

    public class50() {
        class53.method997(16);
        this.field356 = class53.method1027() == 0 ? 1 : class53.method997(4) + 1;
        if (class53.method1027() != 0) {
            class53.method997(8);
        }
        class53.method997(2);
        if (this.field356 > 1) {
            this.field355 = class53.method997(4);
        }
        this.field353 = new int[this.field356];
        this.field354 = new int[this.field356];
        for (int var1 = 0; var1 < this.field356; var1++) {
            class53.method997(8);
            this.field353[var1] = class53.method997(8);
            this.field354[var1] = class53.method997(8);
        }
    }
}
