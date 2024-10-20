package deob;

@ObfuscatedName("bt")
public class class64 implements Runnable {

    @ObfuscatedName("bt.c")
    public boolean field589 = true;

    @ObfuscatedName("bt.t")
    public Object field588 = new Object();

    @ObfuscatedName("bt.o")
    public int field592 = 0;

    @ObfuscatedName("bt.e")
    public int[] field590 = new int[500];

    @ObfuscatedName("bt.i")
    public int[] field591 = new int[500];

    @ObfuscatedName("bt.g")
    public long[] field594 = new long[500];

    public void run() {
        while (this.field589) {
            Object var1 = this.field588;
            synchronized (this.field588) {
                if (this.field592 < 500) {
                    this.field590[this.field592] = class55.field494;
                    this.field591[this.field592] = class55.field492;
                    this.field594[this.field592] = class55.field491;
                    this.field592++;
                }
            }
            class299.method4884(50L);
        }
    }
}
