package deob;

@ObfuscatedName("p")
public class class14 implements Runnable {

    @ObfuscatedName("p.f")
    public boolean field206 = true;

    @ObfuscatedName("p.s")
    public Object field205 = new Object();

    @ObfuscatedName("p.q")
    public int field213 = 0;

    @ObfuscatedName("p.g")
    public int[] field204 = new int[500];

    @ObfuscatedName("p.m")
    public int[] field208 = new int[500];

    public void run() {
        while (this.field206) {
            Object var1 = this.field205;
            synchronized (this.field205) {
                if (this.field213 < 500) {
                    this.field204[this.field213] = class140.field2144;
                    this.field208[this.field213] = class140.field2138;
                    this.field213++;
                }
            }
            class127.method1962(50L);
        }
    }
}
