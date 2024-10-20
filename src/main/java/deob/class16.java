package deob;

@ObfuscatedName("r")
public class class16 implements Runnable {

    @ObfuscatedName("r.j")
    public boolean field247 = true;

    @ObfuscatedName("r.f")
    public Object field250 = new Object();

    @ObfuscatedName("r.o")
    public int field259 = 0;

    @ObfuscatedName("r.h")
    public int[] field248 = new int[500];

    @ObfuscatedName("r.u")
    public int[] field249 = new int[500];

    public void run() {
        while (this.field247) {
            Object var1 = this.field250;
            synchronized (this.field250) {
                if (this.field259 < 500) {
                    this.field248[this.field259] = class77.field1402;
                    this.field249[this.field259] = class77.field1406;
                    this.field259++;
                }
            }
            class126.method768(50L);
        }
    }
}
