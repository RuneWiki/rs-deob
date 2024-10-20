package deob;

@ObfuscatedName("v")
public class class14 implements Runnable {

    @ObfuscatedName("v.i")
    public boolean field214 = true;

    @ObfuscatedName("v.h")
    public Object field217 = new Object();

    @ObfuscatedName("v.e")
    public int field212 = 0;

    @ObfuscatedName("v.g")
    public int[] field213 = new int[500];

    @ObfuscatedName("v.n")
    public int[] field210 = new int[500];

    public void run() {
        while (this.field214) {
            Object var1 = this.field217;
            synchronized (this.field217) {
                if (this.field212 < 500) {
                    this.field213[this.field212] = class144.field2205;
                    this.field210[this.field212] = class144.field2207 * 900883817;
                    this.field212++;
                }
            }
            class131.method3297(50L);
        }
    }
}
