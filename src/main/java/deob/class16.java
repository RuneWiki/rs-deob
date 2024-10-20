package deob;

@ObfuscatedName("r")
public class class16 implements Runnable {

    @ObfuscatedName("r.d")
    public boolean field251 = true;

    @ObfuscatedName("r.g")
    public Object field249 = new Object();

    @ObfuscatedName("r.a")
    public int field246 = 0;

    @ObfuscatedName("r.t")
    public int[] field247 = new int[500];

    @ObfuscatedName("r.f")
    public int[] field248 = new int[500];

    public void run() {
        while (this.field251) {
            Object var1 = this.field249;
            synchronized (this.field249) {
                if (this.field246 < 500) {
                    this.field247[this.field246] = class77.field1405;
                    this.field248[this.field246] = class77.field1394;
                    this.field246++;
                }
            }
            class126.method112(50L);
        }
    }
}
