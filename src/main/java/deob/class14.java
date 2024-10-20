package deob;

@ObfuscatedName("c")
public class class14 implements Runnable {

    @ObfuscatedName("c.z")
    public boolean field195 = true;

    @ObfuscatedName("c.q")
    public Object field201 = new Object();

    @ObfuscatedName("c.k")
    public int field194 = 0;

    @ObfuscatedName("c.f")
    public int[] field196 = new int[500];

    @ObfuscatedName("c.d")
    public int[] field197 = new int[500];

    public void run() {
        while (this.field195) {
            Object var1 = this.field201;
            synchronized (this.field201) {
                if (this.field194 < 500) {
                    this.field196[this.field194] = class140.field2152;
                    this.field197[this.field194] = class140.field2156 * 121255813;
                    this.field194++;
                }
            }
            class127.method712(50L);
        }
    }
}
