package deob;

@ObfuscatedName("be")
public class class72 implements Runnable {

    @ObfuscatedName("be.c")
    public boolean field855 = true;

    @ObfuscatedName("be.o")
    public Object field850 = new Object();

    @ObfuscatedName("be.i")
    public int field851 = 0;

    @ObfuscatedName("be.u")
    public int[] field854 = new int[500];

    @ObfuscatedName("be.g")
    public int[] field853 = new int[500];

    public void run() {
        while (this.field855) {
            Object var1 = this.field850;
            synchronized (this.field850) {
                if (this.field851 < 500) {
                    this.field854[this.field851] = class60.field731;
                    this.field853[this.field851] = class60.field732;
                    this.field851++;
                }
            }
            Statics.method2614(50L);
        }
    }
}
