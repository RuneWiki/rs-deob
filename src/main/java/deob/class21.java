package deob;

@ObfuscatedName("n")
public class class21 implements Runnable {

    @ObfuscatedName("n.b")
    public boolean field227 = true;

    @ObfuscatedName("n.e")
    public Object field222 = new Object();

    @ObfuscatedName("n.c")
    public int field223 = 0;

    @ObfuscatedName("n.l")
    public int[] field229 = new int[500];

    @ObfuscatedName("n.y")
    public int[] field225 = new int[500];

    public void run() {
        while (this.field227) {
            Object var1 = this.field222;
            synchronized (this.field222) {
                if (this.field223 < 500) {
                    this.field229[this.field223] = class116.field1787;
                    this.field225[this.field223] = class116.field1783 * -667823397;
                    this.field223++;
                }
            }
            class162.method2120(50L);
        }
    }
}
