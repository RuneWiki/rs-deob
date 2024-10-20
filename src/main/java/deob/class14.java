package deob;

@ObfuscatedName("o")
public class class14 implements Runnable {

    @ObfuscatedName("o.t")
    public boolean field209 = true;

    @ObfuscatedName("o.i")
    public Object field205 = new Object();

    @ObfuscatedName("o.g")
    public int field207 = 0;

    @ObfuscatedName("o.h")
    public int[] field202 = new int[500];

    @ObfuscatedName("o.z")
    public int[] field203 = new int[500];

    public void run() {
        while (this.field209) {
            Object var1 = this.field205;
            synchronized (this.field205) {
                if (this.field207 < 500) {
                    this.field202[this.field207] = class141.field2193;
                    this.field203[this.field207] = class141.field2190;
                    this.field207++;
                }
            }
            class128.method894(50L);
        }
    }
}
