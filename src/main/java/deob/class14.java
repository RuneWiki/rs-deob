package deob;

@ObfuscatedName("p")
public class class14 implements Runnable {

    @ObfuscatedName("p.n")
    public boolean field214 = true;

    @ObfuscatedName("p.q")
    public Object field209 = new Object();

    @ObfuscatedName("p.c")
    public int field210 = 0;

    @ObfuscatedName("p.l")
    public int[] field208 = new int[500];

    @ObfuscatedName("p.r")
    public int[] field212 = new int[500];

    public void run() {
        while (this.field214) {
            Object var1 = this.field209;
            synchronized (this.field209) {
                if (this.field210 < 500) {
                    this.field208[this.field210] = class140.field2134;
                    this.field212[this.field210] = class140.field2135;
                    this.field210++;
                }
            }
            class127.method1567(50L);
        }
    }
}
