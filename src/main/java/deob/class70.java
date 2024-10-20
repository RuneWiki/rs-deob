package deob;

@ObfuscatedName("bb")
public class class70 implements Runnable {

    @ObfuscatedName("bb.d")
    public boolean field809 = true;

    @ObfuscatedName("bb.z")
    public Object field804 = new Object();

    @ObfuscatedName("bb.n")
    public int field808 = 0;

    @ObfuscatedName("bb.r")
    public int[] field806 = new int[500];

    @ObfuscatedName("bb.e")
    public int[] field807 = new int[500];

    public void run() {
        while (this.field809) {
            Object var1 = this.field804;
            synchronized (this.field804) {
                if (this.field808 < 500) {
                    this.field806[this.field808] = class61.field723;
                    this.field807[this.field808] = class61.field715;
                    this.field808++;
                }
            }
            class204.method3573(50L);
        }
    }
}
