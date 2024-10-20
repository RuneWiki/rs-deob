package deob;

@ObfuscatedName("b")
public class class14 implements Runnable {

    @ObfuscatedName("b.i")
    public boolean field197 = true;

    @ObfuscatedName("b.v")
    public Object field194 = new Object();

    @ObfuscatedName("b.f")
    public int field195 = 0;

    @ObfuscatedName("b.h")
    public int[] field196 = new int[500];

    @ObfuscatedName("b.a")
    public int[] field201 = new int[500];

    public void run() {
        while (this.field197) {
            Object var1 = this.field194;
            synchronized (this.field194) {
                if (this.field195 < 500) {
                    this.field196[this.field195] = class140.field2143;
                    this.field201[this.field195] = class140.field2139 * 869381013;
                    this.field195++;
                }
            }
            class127.method848(50L);
        }
    }
}
