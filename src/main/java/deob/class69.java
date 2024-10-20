package deob;

@ObfuscatedName("bz")
public class class69 implements Runnable {

    @ObfuscatedName("bz.b")
    public boolean field763 = true;

    @ObfuscatedName("bz.q")
    public Object field758 = new Object();

    @ObfuscatedName("bz.o")
    public int field759 = 0;

    @ObfuscatedName("bz.p")
    public int[] field764 = new int[500];

    @ObfuscatedName("bz.a")
    public int[] field761 = new int[500];

    public void run() {
        while (this.field763) {
            Object var1 = this.field758;
            synchronized (this.field758) {
                if (this.field759 < 500) {
                    this.field764[this.field759] = class60.field670;
                    this.field761[this.field759] = class60.field668;
                    this.field759++;
                }
            }
            class202.method141(50L);
        }
    }
}
