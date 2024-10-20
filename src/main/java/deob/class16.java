package deob;

@ObfuscatedName("q")
public class class16 implements Runnable {

    @ObfuscatedName("q.f")
    public boolean field249 = true;

    @ObfuscatedName("q.t")
    public Object field242 = new Object();

    @ObfuscatedName("q.n")
    public int field240 = 0;

    @ObfuscatedName("q.e")
    public int[] field241 = new int[500];

    @ObfuscatedName("q.l")
    public int[] field238 = new int[500];

    public void run() {
        while (this.field249) {
            Object var1 = this.field242;
            synchronized (this.field242) {
                if (this.field240 < 500) {
                    this.field241[this.field240] = class77.field1376;
                    this.field238[this.field240] = class77.field1375;
                    this.field240++;
                }
            }
            class126.method815(50L);
        }
    }
}
