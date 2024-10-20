package deob;

@ObfuscatedName("bg")
public class class70 implements Runnable {

    @ObfuscatedName("bg.g")
    public boolean field797 = true;

    @ObfuscatedName("bg.e")
    public Object field791 = new Object();

    @ObfuscatedName("bg.b")
    public int field792 = 0;

    @ObfuscatedName("bg.z")
    public int[] field793 = new int[500];

    @ObfuscatedName("bg.n")
    public int[] field799 = new int[500];

    public void run() {
        while (this.field797) {
            Object var1 = this.field791;
            synchronized (this.field791) {
                if (this.field792 < 500) {
                    this.field793[this.field792] = class61.field708;
                    this.field799[this.field792] = class61.field709;
                    this.field792++;
                }
            }
            class204.method48(50L);
        }
    }
}
