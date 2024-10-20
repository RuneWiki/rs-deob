package deob;

@ObfuscatedName("bx")
public class class73 implements Runnable {

    @ObfuscatedName("bx.m")
    public boolean field614 = true;

    @ObfuscatedName("bx.o")
    public Object field610 = new Object();

    @ObfuscatedName("bx.q")
    public int field611 = 0;

    @ObfuscatedName("bx.j")
    public int[] field609 = new int[500];

    @ObfuscatedName("bx.p")
    public int[] field613 = new int[500];

    @ObfuscatedName("bx.g")
    public long[] field615 = new long[500];

    public void run() {
        while (this.field614) {
            Object var1 = this.field610;
            synchronized (this.field610) {
                if (this.field611 < 500) {
                    this.field609[this.field611] = class64.field508;
                    this.field613[this.field611] = class64.field498;
                    this.field615[this.field611] = class64.field510;
                    this.field611++;
                }
            }
            class308.method3708(49L);
            class308.method3708(1L);
        }
    }
}
