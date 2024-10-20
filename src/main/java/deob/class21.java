package deob;

@ObfuscatedName("n")
public class class21 implements Runnable {

    @ObfuscatedName("n.o")
    public boolean field227 = true;

    @ObfuscatedName("n.m")
    public Object field224 = new Object();

    @ObfuscatedName("n.b")
    public int field225 = 0;

    @ObfuscatedName("n.g")
    public int[] field226 = new int[500];

    @ObfuscatedName("n.h")
    public int[] field228 = new int[500];

    public void run() {
        while (this.field227) {
            Object var1 = this.field224;
            synchronized (this.field224) {
                if (this.field225 < 500) {
                    this.field226[this.field225] = class116.field1815;
                    this.field228[this.field225] = class116.field1822;
                    this.field225++;
                }
            }
            class162.method238(50L);
        }
    }
}
