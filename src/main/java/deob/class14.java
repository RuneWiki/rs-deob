package deob;

@ObfuscatedName("y")
public class class14 implements Runnable {

    @ObfuscatedName("y.m")
    public boolean field187 = true;

    @ObfuscatedName("y.w")
    public Object field181 = new Object();

    @ObfuscatedName("y.e")
    public int field186 = 0;

    @ObfuscatedName("y.o")
    public int[] field180 = new int[500];

    @ObfuscatedName("y.g")
    public int[] field179 = new int[500];

    public void run() {
        while (this.field187) {
            Object var1 = this.field181;
            synchronized (this.field181) {
                if (this.field186 < 500) {
                    this.field180[this.field186] = class144.field2214;
                    this.field179[this.field186] = class144.field2215 * 148505657;
                    this.field186++;
                }
            }
            class131.method2828(50L);
        }
    }
}
