package deob;

@ObfuscatedName("bf")
public class class70 implements Runnable {

    @ObfuscatedName("bf.t")
    public boolean field796 = true;

    @ObfuscatedName("bf.q")
    public Object field794 = new Object();

    @ObfuscatedName("bf.i")
    public int field799 = 0;

    @ObfuscatedName("bf.a")
    public int[] field797 = new int[500];

    @ObfuscatedName("bf.l")
    public int[] field795 = new int[500];

    public void run() {
        while (this.field796) {
            Object var1 = this.field794;
            synchronized (this.field794) {
                if (this.field799 < 500) {
                    this.field797[this.field799] = class61.field685;
                    this.field795[this.field799] = class61.field686;
                    this.field799++;
                }
            }
            class204.method1827(50L);
        }
    }
}
