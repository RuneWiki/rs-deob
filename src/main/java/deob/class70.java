package deob;

@ObfuscatedName("bn")
public class class70 implements Runnable {

    @ObfuscatedName("bn.c")
    public boolean field798 = true;

    @ObfuscatedName("bn.i")
    public Object field796 = new Object();

    @ObfuscatedName("bn.o")
    public int field795 = 0;

    @ObfuscatedName("bn.j")
    public int[] field794 = new int[500];

    @ObfuscatedName("bn.k")
    public int[] field799 = new int[500];

    public void run() {
        while (this.field798) {
            Object var1 = this.field796;
            synchronized (this.field796) {
                if (this.field795 < 500) {
                    this.field794[this.field795] = class61.field701;
                    this.field799[this.field795] = class61.field694;
                    this.field795++;
                }
            }
            class204.method2982(50L);
        }
    }
}
