package deob;

@ObfuscatedName("bb")
public class class73 implements Runnable {

    @ObfuscatedName("bb.n")
    public boolean field600 = true;

    @ObfuscatedName("bb.v")
    public Object field601 = new Object();

    @ObfuscatedName("bb.d")
    public int field605 = 0;

    @ObfuscatedName("bb.c")
    public int[] field602 = new int[500];

    @ObfuscatedName("bb.y")
    public int[] field606 = new int[500];

    @ObfuscatedName("bb.h")
    public long[] field604 = new long[500];

    public void run() {
        while (this.field600) {
            Object var1 = this.field601;
            synchronized (this.field601) {
                if (this.field605 < 500) {
                    this.field602[this.field605] = class64.field502;
                    this.field606[this.field605] = class64.field503;
                    this.field604[this.field605] = class64.field500;
                    this.field605++;
                }
            }
            class309.method1173(50L);
        }
    }
}
