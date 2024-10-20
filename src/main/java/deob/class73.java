package deob;

@ObfuscatedName("bh")
public class class73 implements Runnable {

    @ObfuscatedName("bh.f")
    public boolean field617 = true;

    @ObfuscatedName("bh.b")
    public Object field630 = new Object();

    @ObfuscatedName("bh.l")
    public int field623 = 0;

    @ObfuscatedName("bh.m")
    public int[] field619 = new int[500];

    @ObfuscatedName("bh.z")
    public int[] field620 = new int[500];

    @ObfuscatedName("bh.q")
    public long[] field621 = new long[500];

    public void run() {
        while (this.field617) {
            Object var1 = this.field630;
            synchronized (this.field630) {
                if (this.field623 < 500) {
                    this.field619[this.field623] = class64.field510;
                    this.field620[this.field623] = class64.field514;
                    this.field621[this.field623] = class64.field515;
                    this.field623++;
                }
            }
            class309.method735(50L);
        }
    }
}
