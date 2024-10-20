package deob;

@ObfuscatedName("b")
public class class16 implements Runnable {

    @ObfuscatedName("b.x")
    public boolean field228 = true;

    @ObfuscatedName("b.p")
    public Object field229 = new Object();

    @ObfuscatedName("b.k")
    public int field230 = 0;

    @ObfuscatedName("b.a")
    public int[] field231 = new int[500];

    @ObfuscatedName("b.q")
    public int[] field232 = new int[500];

    public void run() {
        while (this.field228) {
            Object var1 = this.field229;
            synchronized (this.field229) {
                if (this.field230 < 500) {
                    this.field231[this.field230] = class77.field1373;
                    this.field232[this.field230] = class77.field1366;
                    this.field230++;
                }
            }
            class126.method731(50L);
        }
    }
}
