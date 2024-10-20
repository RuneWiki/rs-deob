package deob;

@ObfuscatedName("bf")
public class class72 implements Runnable {

    @ObfuscatedName("bf.i")
    public boolean field875 = true;

    @ObfuscatedName("bf.w")
    public Object field870 = new Object();

    @ObfuscatedName("bf.a")
    public int field879 = 0;

    @ObfuscatedName("bf.t")
    public int[] field872 = new int[500];

    @ObfuscatedName("bf.s")
    public int[] field873 = new int[500];

    public void run() {
        while (this.field875) {
            Object var1 = this.field870;
            synchronized (this.field870) {
                if (this.field879 < 500) {
                    this.field872[this.field879] = class60.field749;
                    this.field873[this.field879] = class60.field750;
                    this.field879++;
                }
            }
            class182.method1004(50L);
        }
    }
}
