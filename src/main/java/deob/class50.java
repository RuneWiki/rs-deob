package deob;

@ObfuscatedName("bc")
public class class50 {

    @ObfuscatedName("bc.af")
    public int field369;

    @ObfuscatedName("bc.an")
    public int field368;

    @ObfuscatedName("bc.aw")
    public int[] field367;

    @ObfuscatedName("bc.ac")
    public int[] field370;

    public class50() {
        class53.method1030(16);
        this.field369 = class53.method1031() == 0 ? 1 : class53.method1030(4) + 1;
        if (class53.method1031() != 0) {
            class53.method1030(8);
        }
        class53.method1030(2);
        if (this.field369 > 1) {
            this.field368 = class53.method1030(4);
        }
        this.field367 = new int[this.field369];
        this.field370 = new int[this.field369];
        for (int var1 = 0; var1 < this.field369; var1++) {
            class53.method1030(8);
            this.field367[var1] = class53.method1030(8);
            this.field370[var1] = class53.method1030(8);
        }
    }
}
