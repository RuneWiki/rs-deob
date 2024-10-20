package deob;

@ObfuscatedName("c")
public class class21 implements Runnable {

    @ObfuscatedName("c.b")
    public boolean field209 = true;

    @ObfuscatedName("c.l")
    public Object field207 = new Object();

    @ObfuscatedName("c.i")
    public int field208 = 0;

    @ObfuscatedName("c.t")
    public int[] field213 = new int[500];

    @ObfuscatedName("c.k")
    public int[] field210 = new int[500];

    public void run() {
        while (this.field209) {
            Object var1 = this.field207;
            synchronized (this.field207) {
                if (this.field208 < 500) {
                    this.field213[this.field208] = class116.field1803;
                    this.field210[this.field208] = class116.field1802 * 603852017;
                    this.field208++;
                }
            }
            class162.method2157(50L);
        }
    }
}
