package deob;

@ObfuscatedName("z")
public class class14 implements Runnable {

    @ObfuscatedName("z.j")
    public boolean field201 = true;

    @ObfuscatedName("z.m")
    public Object field189 = new Object();

    @ObfuscatedName("z.f")
    public int field191 = 0;

    @ObfuscatedName("z.l")
    public int[] field188 = new int[500];

    @ObfuscatedName("z.u")
    public int[] field192 = new int[500];

    public void run() {
        while (this.field201) {
            Object var1 = this.field189;
            synchronized (this.field189) {
                if (this.field191 < 500) {
                    this.field188[this.field191] = class140.field2135;
                    this.field192[this.field191] = class140.field2136;
                    this.field191++;
                }
            }
            class127.method692(50L);
        }
    }
}
