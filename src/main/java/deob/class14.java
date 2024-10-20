package deob;

@ObfuscatedName("w")
public class class14 implements Runnable {

    @ObfuscatedName("w.l")
    public boolean field207 = true;

    @ObfuscatedName("w.g")
    public Object field204 = new Object();

    @ObfuscatedName("w.r")
    public int field205 = 0;

    @ObfuscatedName("w.e")
    public int[] field211 = new int[500];

    @ObfuscatedName("w.h")
    public int[] field206 = new int[500];

    public void run() {
        while (this.field207) {
            Object var1 = this.field204;
            synchronized (this.field204) {
                if (this.field205 < 500) {
                    this.field211[this.field205] = class144.field2207;
                    this.field206[this.field205] = class144.field2210;
                    this.field205++;
                }
            }
            class131.method587(50L);
        }
    }
}
