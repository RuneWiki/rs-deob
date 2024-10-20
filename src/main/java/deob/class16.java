package deob;

@ObfuscatedName("p")
public class class16 implements Runnable {

    @ObfuscatedName("p.g")
    public boolean field233 = true;

    @ObfuscatedName("p.m")
    public Object field231 = new Object();

    @ObfuscatedName("p.v")
    public int field232 = 0;

    @ObfuscatedName("p.r")
    public int[] field235 = new int[500];

    @ObfuscatedName("p.n")
    public int[] field234 = new int[500];

    public void run() {
        while (this.field233) {
            Object var1 = this.field231;
            synchronized (this.field231) {
                if (this.field232 < 500) {
                    this.field235[this.field232] = class77.field1384;
                    this.field234[this.field232] = class77.field1385;
                    this.field232++;
                }
            }
            class126.method209(50L);
        }
    }
}
