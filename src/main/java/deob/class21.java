package deob;

@ObfuscatedName("a")
public class class21 implements Runnable {

    @ObfuscatedName("a.q")
    public boolean field234 = true;

    @ObfuscatedName("a.d")
    public Object field226 = new Object();

    @ObfuscatedName("a.h")
    public int field227 = 0;

    @ObfuscatedName("a.p")
    public int[] field235 = new int[500];

    @ObfuscatedName("a.j")
    public int[] field225 = new int[500];

    public void run() {
        while (this.field234) {
            Object var1 = this.field226;
            synchronized (this.field226) {
                if (this.field227 < 500) {
                    this.field235[this.field227] = class116.field1793;
                    this.field225[this.field227] = class116.field1800;
                    this.field227++;
                }
            }
            class162.method2156(50L);
        }
    }
}
