package deob;

@ObfuscatedName("bw")
public class class73 implements Runnable {

    @ObfuscatedName("bw.e")
    public boolean field862 = true;

    @ObfuscatedName("bw.n")
    public Object field860 = new Object();

    @ObfuscatedName("bw.g")
    public int field858 = 0;

    @ObfuscatedName("bw.y")
    public int[] field861 = new int[500];

    @ObfuscatedName("bw.w")
    public int[] field864 = new int[500];

    public void run() {
        while (this.field862) {
            Object var1 = this.field860;
            synchronized (this.field860) {
                if (this.field858 < 500) {
                    this.field861[this.field858] = class60.field719;
                    this.field864[this.field858] = class60.field720 * 752920449;
                    this.field858++;
                }
            }
            class183.method534(50L);
        }
    }
}
