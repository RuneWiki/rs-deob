package deob;

@ObfuscatedName("l")
public class class16 implements Runnable {

    @ObfuscatedName("l.g")
    public boolean field257 = true;

    @ObfuscatedName("l.h")
    public Object field264 = new Object();

    @ObfuscatedName("l.s")
    public int field258 = 0;

    @ObfuscatedName("l.o")
    public int[] field259 = new int[500];

    @ObfuscatedName("l.p")
    public int[] field260 = new int[500];

    public void run() {
        while (this.field257) {
            Object var1 = this.field264;
            synchronized (this.field264) {
                if (this.field258 < 500) {
                    this.field259[this.field258] = class77.field1374;
                    this.field260[this.field258] = class77.field1375;
                    this.field258++;
                }
            }
            class126.method2355(50L);
        }
    }
}
