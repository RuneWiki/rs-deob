package deob;

@ObfuscatedName("bo")
public class class64 implements Runnable {

    @ObfuscatedName("bo.f")
    public boolean field574 = true;

    @ObfuscatedName("bo.i")
    public Object field572 = new Object();

    @ObfuscatedName("bo.y")
    public int field566 = 0;

    @ObfuscatedName("bo.w")
    public int[] field567 = new int[500];

    @ObfuscatedName("bo.p")
    public int[] field568 = new int[500];

    @ObfuscatedName("bo.b")
    public long[] field569 = new long[500];

    public void run() {
        while (this.field574) {
            Object var1 = this.field572;
            synchronized (this.field572) {
                if (this.field566 < 500) {
                    this.field567[this.field566] = class54.field466;
                    this.field568[this.field566] = class54.field477;
                    this.field569[this.field566] = class54.field468;
                    this.field566++;
                }
            }
            class298.method3743(50L);
        }
    }
}
