package deob;

@ObfuscatedName("u")
public class class21 implements Runnable {

    @ObfuscatedName("u.k")
    public boolean field216 = true;

    @ObfuscatedName("u.y")
    public Object field211 = new Object();

    @ObfuscatedName("u.o")
    public int field212 = 0;

    @ObfuscatedName("u.r")
    public int[] field213 = new int[500];

    @ObfuscatedName("u.w")
    public int[] field219 = new int[500];

    public void run() {
        while (this.field216) {
            Object var1 = this.field211;
            synchronized (this.field211) {
                if (this.field212 < 500) {
                    this.field213[this.field212] = class116.field1800;
                    this.field219[this.field212] = class116.field1795;
                    this.field212++;
                }
            }
            class169.method3344(50L);
        }
    }
}
