package deob;

@ObfuscatedName("q")
public class class14 implements Runnable {

    @ObfuscatedName("q.w")
    public boolean field216 = true;

    @ObfuscatedName("q.x")
    public Object field208 = new Object();

    @ObfuscatedName("q.t")
    public int field207 = 0;

    @ObfuscatedName("q.p")
    public int[] field210 = new int[500];

    @ObfuscatedName("q.e")
    public int[] field211 = new int[500];

    public void run() {
        while (this.field216) {
            Object var1 = this.field208;
            synchronized (this.field208) {
                if (this.field207 < 500) {
                    this.field210[this.field207] = class141.field2169;
                    this.field211[this.field207] = class141.field2183;
                    this.field207++;
                }
            }
            class128.method2158(50L);
        }
    }
}
