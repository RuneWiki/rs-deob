package deob;

@ObfuscatedName("br")
public class class64 implements Runnable {

    @ObfuscatedName("br.u")
    public boolean field590 = true;

    @ObfuscatedName("br.f")
    public Object field583 = new Object();

    @ObfuscatedName("br.b")
    public int field584 = 0;

    @ObfuscatedName("br.g")
    public int[] field585 = new int[500];

    @ObfuscatedName("br.z")
    public int[] field582 = new int[500];

    @ObfuscatedName("br.p")
    public long[] field587 = new long[500];

    public void run() {
        while (this.field590) {
            Object var1 = this.field583;
            synchronized (this.field583) {
                if (this.field584 < 500) {
                    this.field585[this.field584] = class55.field473;
                    this.field582[this.field584] = class55.field483;
                    this.field587[this.field584] = class55.field480;
                    this.field584++;
                }
            }
            long var3 = 49L;
            try {
                Thread.sleep(var3);
            } catch (InterruptedException var8) {
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException var7) {
            }
        }
    }
}
