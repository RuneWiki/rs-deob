package deob;

@ObfuscatedName("bb")
public class class71 implements Runnable {

    @ObfuscatedName("bb.m")
    public boolean field804 = true;

    @ObfuscatedName("bb.p")
    public Object field805 = new Object();

    @ObfuscatedName("bb.i")
    public int field812 = 0;

    @ObfuscatedName("bb.j")
    public int[] field807 = new int[500];

    @ObfuscatedName("bb.v")
    public int[] field808 = new int[500];

    public void run() {
        while (this.field804) {
            Object var1 = this.field805;
            synchronized (this.field805) {
                if (this.field812 < 500) {
                    this.field807[this.field812] = class60.field705;
                    this.field808[this.field812] = class60.field709;
                    this.field812++;
                }
            }
            class189.method1011(50L);
        }
    }
}
