package deob;

@ObfuscatedName("t")
public class class14 implements Runnable {

    @ObfuscatedName("t.i")
    public boolean field197 = true;

    @ObfuscatedName("t.v")
    public Object field191 = new Object();

    @ObfuscatedName("t.r")
    public int field196 = 0;

    @ObfuscatedName("t.n")
    public int[] field193 = new int[500];

    @ObfuscatedName("t.x")
    public int[] field194 = new int[500];

    public void run() {
        while (this.field197) {
            Object var1 = this.field191;
            synchronized (this.field191) {
                if (this.field196 < 500) {
                    this.field193[this.field196] = class140.field2146;
                    this.field194[this.field196] = class140.field2136;
                    this.field196++;
                }
            }
            class127.method731(50L);
        }
    }
}
