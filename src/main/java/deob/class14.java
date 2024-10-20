package deob;

@ObfuscatedName("e")
public class class14 implements Runnable {

    @ObfuscatedName("e.k")
    public boolean field190 = true;

    @ObfuscatedName("e.q")
    public Object field191 = new Object();

    @ObfuscatedName("e.f")
    public int field192 = 0;

    @ObfuscatedName("e.c")
    public int[] field193 = new int[500];

    @ObfuscatedName("e.v")
    public int[] field194 = new int[500];

    public void run() {
        while (this.field190) {
            Object var1 = this.field191;
            synchronized (this.field191) {
                if (this.field192 < 500) {
                    this.field193[this.field192] = class144.field2201;
                    this.field194[this.field192] = class144.field2205 * 5099509;
                    this.field192++;
                }
            }
            class131.method2702(50L);
        }
    }
}
