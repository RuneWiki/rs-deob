package deob;

@ObfuscatedName("bq")
public class class58 implements Runnable {

    @ObfuscatedName("bq.z")
    public boolean field530 = true;

    @ObfuscatedName("bq.w")
    public Object field524 = new Object();

    @ObfuscatedName("bq.s")
    public int field523 = 0;

    @ObfuscatedName("bq.l")
    public int[] field526 = new int[500];

    @ObfuscatedName("bq.u")
    public int[] field527 = new int[500];

    public void run() {
        while (this.field530) {
            Object var1 = this.field524;
            synchronized (this.field524) {
                if (this.field523 < 500) {
                    this.field526[this.field523] = class49.field426;
                    this.field527[this.field523] = class49.field427 * 673804999;
                    this.field523++;
                }
            }
            class192.method1435(50L);
        }
    }
}
