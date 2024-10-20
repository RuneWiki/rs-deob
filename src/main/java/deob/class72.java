package deob;

@ObfuscatedName("be")
public class class72 implements Runnable {

    @ObfuscatedName("be.w")
    public boolean field874 = true;

    @ObfuscatedName("be.o")
    public Object field875 = new Object();

    @ObfuscatedName("be.x")
    public int field879 = 0;

    @ObfuscatedName("be.k")
    public int[] field876 = new int[500];

    @ObfuscatedName("be.f")
    public int[] field878 = new int[500];

    public void run() {
        while (this.field874) {
            Object var1 = this.field875;
            synchronized (this.field875) {
                if (this.field879 < 500) {
                    this.field876[this.field879] = class60.field750;
                    this.field878[this.field879] = class60.field758 * 939681921;
                    this.field879++;
                }
            }
            class185.method7(50L);
        }
    }
}
