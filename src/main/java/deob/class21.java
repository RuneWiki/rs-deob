package deob;

@ObfuscatedName("y")
public class class21 implements Runnable {

    @ObfuscatedName("y.i")
    public boolean field210 = true;

    @ObfuscatedName("y.e")
    public Object field218 = new Object();

    @ObfuscatedName("y.f")
    public int field211 = 0;

    @ObfuscatedName("y.k")
    public int[] field212 = new int[500];

    @ObfuscatedName("y.g")
    public int[] field220 = new int[500];

    public void run() {
        while (this.field210) {
            Object var1 = this.field218;
            synchronized (this.field218) {
                if (this.field211 < 500) {
                    this.field212[this.field211] = class116.field1795;
                    this.field220[this.field211] = class116.field1798;
                    this.field211++;
                }
            }
            class162.method150(50L);
        }
    }
}
