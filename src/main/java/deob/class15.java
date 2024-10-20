package deob;

@ObfuscatedName("c")
public class class15 implements Runnable {

    @ObfuscatedName("c.u")
    public boolean field248 = true;

    @ObfuscatedName("c.k")
    public Object field242 = new Object();

    @ObfuscatedName("c.x")
    public int field250 = 0;

    @ObfuscatedName("c.m")
    public int[] field244 = new int[500];

    @ObfuscatedName("c.n")
    public int[] field241 = new int[500];

    public void run() {
        while (this.field248) {
            Object var1 = this.field242;
            synchronized (this.field242) {
                if (this.field250 < 500) {
                    this.field244[this.field250] = class76.field1367;
                    this.field241[this.field250] = class76.field1378;
                    this.field250++;
                }
            }
            class125.method1228(50L);
        }
    }
}
