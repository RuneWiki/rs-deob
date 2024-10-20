package deob;

@ObfuscatedName("be")
public class class72 implements Runnable {

    @ObfuscatedName("be.i")
    public boolean field836 = true;

    @ObfuscatedName("be.h")
    public Object field835 = new Object();

    @ObfuscatedName("be.u")
    public int field834 = 0;

    @ObfuscatedName("be.q")
    public int[] field837 = new int[500];

    @ObfuscatedName("be.g")
    public int[] field838 = new int[500];

    public void run() {
        while (this.field836) {
            Object var1 = this.field835;
            synchronized (this.field835) {
                if (this.field834 < 500) {
                    this.field837[this.field834] = class60.field722;
                    this.field838[this.field834] = class60.field723 * -113761157;
                    this.field834++;
                }
            }
            class182.method138(50L);
        }
    }
}
