package deob;

@ObfuscatedName("bo")
public class class73 implements Runnable {

    @ObfuscatedName("bo.z")
    public boolean field603 = true;

    @ObfuscatedName("bo.k")
    public Object field606 = new Object();

    @ObfuscatedName("bo.s")
    public int field605 = 0;

    @ObfuscatedName("bo.t")
    public int[] field607 = new int[500];

    @ObfuscatedName("bo.i")
    public int[] field604 = new int[500];

    @ObfuscatedName("bo.o")
    public long[] field608 = new long[500];

    public void run() {
        while (this.field603) {
            Object var1 = this.field606;
            synchronized (this.field606) {
                if (this.field605 < 500) {
                    this.field607[this.field605] = class64.field504;
                    this.field604[this.field605] = class64.field505;
                    this.field608[this.field605] = class64.field506;
                    this.field605++;
                }
            }
            class308.method3834(50L);
        }
    }
}
