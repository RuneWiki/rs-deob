package deob;

@ObfuscatedName("g")
public class class16 implements Runnable {

    @ObfuscatedName("g.p")
    public boolean field236 = true;

    @ObfuscatedName("g.l")
    public Object field232 = new Object();

    @ObfuscatedName("g.d")
    public int field233 = 0;

    @ObfuscatedName("g.x")
    public int[] field239 = new int[500];

    @ObfuscatedName("g.o")
    public int[] field235 = new int[500];

    public void run() {
        while (this.field236) {
            Object var1 = this.field232;
            synchronized (this.field232) {
                if (this.field233 < 500) {
                    this.field239[this.field233] = class77.field1377;
                    this.field235[this.field233] = class77.field1381;
                    this.field233++;
                }
            }
            class126.method1463(50L);
        }
    }
}
