package deob;

@ObfuscatedName("bl")
public class class71 implements Runnable {

    @ObfuscatedName("bl.a")
    public boolean field793 = true;

    @ObfuscatedName("bl.w")
    public Object field790 = new Object();

    @ObfuscatedName("bl.e")
    public int field791 = 0;

    @ObfuscatedName("bl.k")
    public int[] field789 = new int[500];

    @ObfuscatedName("bl.u")
    public int[] field792 = new int[500];

    public void run() {
        while (this.field793) {
            Object var1 = this.field790;
            synchronized (this.field790) {
                if (this.field791 < 500) {
                    this.field789[this.field791] = class60.field680;
                    this.field792[this.field791] = class60.field683 * -469125321;
                    this.field791++;
                }
            }
            class193.method1373(50L);
        }
    }
}
