package deob;

@ObfuscatedName("r")
public class class14 implements Runnable {

    @ObfuscatedName("r.s")
    public boolean field194 = true;

    @ObfuscatedName("r.j")
    public Object field193 = new Object();

    @ObfuscatedName("r.p")
    public int field196 = 0;

    @ObfuscatedName("r.x")
    public int[] field195 = new int[500];

    @ObfuscatedName("r.d")
    public int[] field192 = new int[500];

    public void run() {
        while (this.field194) {
            Object var1 = this.field193;
            synchronized (this.field193) {
                if (this.field196 < 500) {
                    this.field195[this.field196] = class141.field2163;
                    this.field192[this.field196] = class141.field2164;
                    this.field196++;
                }
            }
            class128.method2294(50L);
        }
    }
}
