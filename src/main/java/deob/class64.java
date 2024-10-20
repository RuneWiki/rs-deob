package deob;

@ObfuscatedName("bu")
public class class64 implements Runnable {

    @ObfuscatedName("bu.m")
    public boolean field568 = true;

    @ObfuscatedName("bu.f")
    public Object field562 = new Object();

    @ObfuscatedName("bu.q")
    public int field564 = 0;

    @ObfuscatedName("bu.w")
    public int[] field561 = new int[500];

    @ObfuscatedName("bu.o")
    public int[] field565 = new int[500];

    @ObfuscatedName("bu.u")
    public long[] field566 = new long[500];

    public void run() {
        while (this.field568) {
            Object var1 = this.field562;
            synchronized (this.field562) {
                if (this.field564 < 500) {
                    this.field561[this.field564] = class54.field456;
                    this.field565[this.field564] = class54.field463;
                    this.field566[this.field564] = class54.field464;
                    this.field564++;
                }
            }
            class211.method3659(50L);
        }
    }
}
