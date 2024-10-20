package deob;

@ObfuscatedName("bd")
public class class72 implements Runnable {

    @ObfuscatedName("bd.i")
    public boolean field871 = true;

    @ObfuscatedName("bd.c")
    public Object field870 = new Object();

    @ObfuscatedName("bd.e")
    public int field873 = 0;

    @ObfuscatedName("bd.v")
    public int[] field872 = new int[500];

    @ObfuscatedName("bd.b")
    public int[] field869 = new int[500];

    public void run() {
        while (this.field871) {
            Object var1 = this.field870;
            synchronized (this.field870) {
                if (this.field873 < 500) {
                    this.field872[this.field873] = class60.field738;
                    this.field869[this.field873] = class60.field739;
                    this.field873++;
                }
            }
            class182.method10(50L);
        }
    }
}
