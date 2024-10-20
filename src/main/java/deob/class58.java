package deob;

@ObfuscatedName("bk")
public class class58 implements Runnable {

    @ObfuscatedName("bk.w")
    public boolean field532 = true;

    @ObfuscatedName("bk.m")
    public Object field529 = new Object();

    @ObfuscatedName("bk.q")
    public int field534 = 0;

    @ObfuscatedName("bk.b")
    public int[] field531 = new int[500];

    @ObfuscatedName("bk.f")
    public int[] field530 = new int[500];

    public void run() {
        while (this.field532) {
            Object var1 = this.field529;
            synchronized (this.field529) {
                if (this.field534 < 500) {
                    this.field531[this.field534] = class49.field426;
                    this.field530[this.field534] = class49.field418;
                    this.field534++;
                }
            }
            class192.method196(50L);
        }
    }
}
