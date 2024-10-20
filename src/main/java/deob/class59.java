package deob;

@ObfuscatedName("bx")
public class class59 implements Runnable {

    @ObfuscatedName("bx.v")
    public boolean field566 = true;

    @ObfuscatedName("bx.s")
    public Object field564 = new Object();

    @ObfuscatedName("bx.o")
    public int field561 = 0;

    @ObfuscatedName("bx.k")
    public int[] field562 = new int[500];

    @ObfuscatedName("bx.u")
    public int[] field563 = new int[500];

    @ObfuscatedName("bx.i")
    public long[] field560 = new long[500];

    public void run() {
        while (this.field566) {
            Object var1 = this.field564;
            synchronized (this.field564) {
                if (this.field561 < 500) {
                    this.field562[this.field561] = class49.field456;
                    this.field563[this.field561] = class49.field458 * -53945113;
                    this.field560[this.field561] = class49.field449;
                    this.field561++;
                }
            }
            class194.method668(50L);
        }
    }
}
