package deob;

@ObfuscatedName("r")
public class class16 implements Runnable {

    @ObfuscatedName("r.b")
    public boolean field258 = true;

    @ObfuscatedName("r.e")
    public Object field245 = new Object();

    @ObfuscatedName("r.g")
    public int field256 = 0;

    @ObfuscatedName("r.o")
    public int[] field248 = new int[500];

    @ObfuscatedName("r.a")
    public int[] field252 = new int[500];

    public void run() {
        while (this.field258) {
            Object var1 = this.field245;
            synchronized (this.field245) {
                if (this.field256 < 500) {
                    this.field248[this.field256] = class77.field1379;
                    this.field252[this.field256] = class77.field1380;
                    this.field256++;
                }
            }
            class127.method686(50L);
        }
    }
}
