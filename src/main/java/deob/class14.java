package deob;

@ObfuscatedName("t")
public class class14 implements Runnable {

    @ObfuscatedName("t.x")
    public boolean field193 = true;

    @ObfuscatedName("t.r")
    public Object field191 = new Object();

    @ObfuscatedName("t.j")
    public int field201 = 0;

    @ObfuscatedName("t.z")
    public int[] field194 = new int[500];

    @ObfuscatedName("t.i")
    public int[] field195 = new int[500];

    public void run() {
        while (this.field193) {
            Object var1 = this.field191;
            synchronized (this.field191) {
                if (this.field201 < 500) {
                    this.field194[this.field201] = class144.field2205;
                    this.field195[this.field201] = class144.field2211 * -117362325;
                    this.field201++;
                }
            }
            class131.method2672(50L);
        }
    }
}
