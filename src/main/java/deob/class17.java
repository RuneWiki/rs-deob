package deob;

@ObfuscatedName("y")
public class class17 {

    @ObfuscatedName("y.q")
    public int field234;

    @ObfuscatedName("y.l")
    public int field233;

    @ObfuscatedName("y.a")
    public int[] field235;

    @ObfuscatedName("y.o")
    public int[] field236;

    public class17() {
        class131.method1537(16);
        this.field234 = class131.method1542() == 0 ? 1 : class131.method1537(4) + 1;
        if (class131.method1542() != 0) {
            class131.method1537(8);
        }
        class131.method1537(2);
        if (this.field234 > 1) {
            this.field233 = class131.method1537(4);
        }
        this.field235 = new int[this.field234];
        this.field236 = new int[this.field234];
        for (int var1 = 0; var1 < this.field234; var1++) {
            class131.method1537(8);
            this.field235[var1] = class131.method1537(8);
            this.field236[var1] = class131.method1537(8);
        }
    }
}
