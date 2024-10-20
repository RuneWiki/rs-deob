package deob;

@ObfuscatedName("q")
public class class14 implements Runnable {

    @ObfuscatedName("q.f")
    public boolean field205 = true;

    @ObfuscatedName("q.u")
    public Object field200 = new Object();

    @ObfuscatedName("q.x")
    public int field201 = 0;

    @ObfuscatedName("q.b")
    public int[] field202 = new int[500];

    @ObfuscatedName("q.l")
    public int[] field203 = new int[500];

    public void run() {
        while (this.field205) {
            Object var1 = this.field200;
            synchronized (this.field200) {
                if (this.field201 < 500) {
                    this.field202[this.field201] = class141.field2147;
                    this.field203[this.field201] = class141.field2152;
                    this.field201++;
                }
            }
            class128.method2102(50L);
        }
    }
}
