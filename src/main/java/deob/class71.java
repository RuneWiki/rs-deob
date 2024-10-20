package deob;

@ObfuscatedName("bt")
public class class71 implements Runnable {

    @ObfuscatedName("bt.d")
    public boolean field824 = true;

    @ObfuscatedName("bt.x")
    public Object field820 = new Object();

    @ObfuscatedName("bt.k")
    public int field819 = 0;

    @ObfuscatedName("bt.z")
    public int[] field825 = new int[500];

    @ObfuscatedName("bt.v")
    public int[] field823 = new int[500];

    public void run() {
        while (this.field824) {
            Object var1 = this.field820;
            synchronized (this.field820) {
                if (this.field819 < 500) {
                    this.field825[this.field819] = class60.field704;
                    this.field823[this.field819] = class60.field716 * 10625923;
                    this.field819++;
                }
            }
            class189.method13(50L);
        }
    }
}
