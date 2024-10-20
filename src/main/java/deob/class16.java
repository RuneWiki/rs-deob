package deob;

@ObfuscatedName("s")
public class class16 implements Runnable {

    @ObfuscatedName("s.a")
    public boolean field242 = true;

    @ObfuscatedName("s.r")
    public Object field238 = new Object();

    @ObfuscatedName("s.u")
    public int field237 = 0;

    @ObfuscatedName("s.t")
    public int[] field239 = new int[500];

    @ObfuscatedName("s.k")
    public int[] field235 = new int[500];

    public void run() {
        while (this.field242) {
            Object var1 = this.field238;
            synchronized (this.field238) {
                if (this.field237 < 500) {
                    this.field239[this.field237] = class77.field1365;
                    this.field235[this.field237] = class77.field1366;
                    this.field237++;
                }
            }
            class127.method1598(50L);
        }
    }
}
