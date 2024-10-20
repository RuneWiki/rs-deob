package deob;

@ObfuscatedName("j")
public class class14 implements Runnable {

    @ObfuscatedName("j.e")
    public boolean field217 = true;

    @ObfuscatedName("j.l")
    public Object field207 = new Object();

    @ObfuscatedName("j.c")
    public int field215 = 0;

    @ObfuscatedName("j.h")
    public int[] field209 = new int[500];

    @ObfuscatedName("j.r")
    public int[] field210 = new int[500];

    public void run() {
        while (this.field217) {
            Object var1 = this.field207;
            synchronized (this.field207) {
                if (this.field215 < 500) {
                    this.field209[this.field215] = class144.field2199;
                    this.field210[this.field215] = class144.field2202;
                    this.field215++;
                }
            }
            class131.method2735(50L);
        }
    }
}
