package deob;

@ObfuscatedName("g")
public class class16 implements Runnable {

    @ObfuscatedName("g.q")
    public boolean field250 = true;

    @ObfuscatedName("g.c")
    public Object field248 = new Object();

    @ObfuscatedName("g.p")
    public int field244 = 0;

    @ObfuscatedName("g.z")
    public int[] field243 = new int[500];

    @ObfuscatedName("g.m")
    public int[] field246 = new int[500];

    public void run() {
        while (this.field250) {
            Object var1 = this.field248;
            synchronized (this.field248) {
                if (this.field244 < 500) {
                    this.field243[this.field244] = class77.field1396;
                    this.field246[this.field244] = class77.field1397;
                    this.field244++;
                }
            }
            class126.method210(50L);
        }
    }
}
