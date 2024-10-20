package deob;

@ObfuscatedName("c")
public class class14 implements Runnable {

    @ObfuscatedName("c.m")
    public boolean field182 = true;

    @ObfuscatedName("c.l")
    public Object field180 = new Object();

    @ObfuscatedName("c.y")
    public int field183 = 0;

    @ObfuscatedName("c.u")
    public int[] field181 = new int[500];

    @ObfuscatedName("c.k")
    public int[] field185 = new int[500];

    public void run() {
        while (this.field182) {
            Object var1 = this.field180;
            synchronized (this.field180) {
                if (this.field183 < 500) {
                    this.field181[this.field183] = class140.field2121;
                    this.field185[this.field183] = class140.field2122;
                    this.field183++;
                }
            }
            class127.method3199(50L);
        }
    }
}
