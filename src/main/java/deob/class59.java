package deob;

@ObfuscatedName("bb")
public class class59 implements Runnable {

    @ObfuscatedName("bb.f")
    public boolean field557 = true;

    @ObfuscatedName("bb.h")
    public Object field547 = new Object();

    @ObfuscatedName("bb.e")
    public int field548 = 0;

    @ObfuscatedName("bb.b")
    public int[] field549 = new int[500];

    @ObfuscatedName("bb.l")
    public int[] field550 = new int[500];

    @ObfuscatedName("bb.w")
    public long[] field554 = new long[500];

    public void run() {
        while (this.field557) {
            Object var1 = this.field547;
            synchronized (this.field547) {
                if (this.field548 < 500) {
                    this.field549[this.field548] = class49.field437;
                    this.field550[this.field548] = class49.field439;
                    this.field554[this.field548] = class49.field438;
                    this.field548++;
                }
            }
            class194.method3013(50L);
        }
    }
}
