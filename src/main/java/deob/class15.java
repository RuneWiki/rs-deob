package deob;

@ObfuscatedName("h")
public class class15 implements Runnable {

    @ObfuscatedName("h.c")
    public boolean field251 = true;

    @ObfuscatedName("h.j")
    public Object field246 = new Object();

    @ObfuscatedName("h.f")
    public int field245 = 0;

    @ObfuscatedName("h.y")
    public int[] field248 = new int[500];

    @ObfuscatedName("h.x")
    public int[] field249 = new int[500];

    public void run() {
        while (this.field251) {
            Object var1 = this.field246;
            synchronized (this.field246) {
                if (this.field245 < 500) {
                    this.field248[this.field245] = class76.field1365;
                    this.field249[this.field245] = class76.field1369;
                    this.field245++;
                }
            }
            class126.method2308(50L);
        }
    }
}
