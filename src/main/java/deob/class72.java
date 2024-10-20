package deob;

@ObfuscatedName("bj")
public class class72 implements Runnable {

    @ObfuscatedName("bj.e")
    public boolean field855 = true;

    @ObfuscatedName("bj.o")
    public Object field850 = new Object();

    @ObfuscatedName("bj.m")
    public int field851 = 0;

    @ObfuscatedName("bj.g")
    public int[] field852 = new int[500];

    @ObfuscatedName("bj.d")
    public int[] field853 = new int[500];

    public void run() {
        while (this.field855) {
            Object var1 = this.field850;
            synchronized (this.field850) {
                if (this.field851 < 500) {
                    this.field852[this.field851] = class60.field729;
                    this.field853[this.field851] = class60.field726;
                    this.field851++;
                }
            }
            class182.method1535(50L);
        }
    }
}
