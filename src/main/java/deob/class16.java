package deob;

@ObfuscatedName("w")
public class class16 implements Runnable {

    @ObfuscatedName("w.a")
    public boolean field247 = true;

    @ObfuscatedName("w.x")
    public Object field244 = new Object();

    @ObfuscatedName("w.e")
    public int field234 = 0;

    @ObfuscatedName("w.r")
    public int[] field235 = new int[500];

    @ObfuscatedName("w.p")
    public int[] field236 = new int[500];

    public void run() {
        while (this.field247) {
            Object var1 = this.field244;
            synchronized (this.field244) {
                if (this.field234 < 500) {
                    this.field235[this.field234] = class77.field1398;
                    this.field236[this.field234] = class77.field1395;
                    this.field234++;
                }
            }
            class126.method164(50L);
        }
    }
}
