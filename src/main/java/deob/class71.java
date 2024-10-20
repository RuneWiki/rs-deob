package deob;

@ObfuscatedName("bm")
public class class71 implements Runnable {

    @ObfuscatedName("bm.w")
    public boolean field870 = true;

    @ObfuscatedName("bm.s")
    public Object field868 = new Object();

    @ObfuscatedName("bm.q")
    public int field872 = 0;

    @ObfuscatedName("bm.o")
    public int[] field874 = new int[500];

    @ObfuscatedName("bm.g")
    public int[] field871 = new int[500];

    public void run() {
        while (this.field870) {
            Object var1 = this.field868;
            synchronized (this.field868) {
                if (this.field872 < 500) {
                    this.field874[this.field872] = class60.field757;
                    this.field871[this.field872] = class60.field742;
                    this.field872++;
                }
            }
            class182.method1687(50L);
        }
    }
}
