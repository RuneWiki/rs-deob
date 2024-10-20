package deob;

@ObfuscatedName("bt")
public class class71 implements Runnable {

    @ObfuscatedName("bt.d")
    public boolean field860 = true;

    @ObfuscatedName("bt.k")
    public Object field861 = new Object();

    @ObfuscatedName("bt.e")
    public int field862 = 0;

    @ObfuscatedName("bt.p")
    public int[] field863 = new int[500];

    @ObfuscatedName("bt.q")
    public int[] field864 = new int[500];

    public void run() {
        while (this.field860) {
            Object var1 = this.field861;
            synchronized (this.field861) {
                if (this.field862 < 500) {
                    this.field863[this.field862] = class60.field746;
                    this.field864[this.field862] = class60.field747;
                    this.field862++;
                }
            }
            class182.method3711(50L);
        }
    }
}
