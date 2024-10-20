package deob;

@ObfuscatedName("u")
public class class14 implements Runnable {

    @ObfuscatedName("u.j")
    public boolean field204 = true;

    @ObfuscatedName("u.l")
    public Object field199 = new Object();

    @ObfuscatedName("u.a")
    public int field206 = 0;

    @ObfuscatedName("u.i")
    public int[] field203 = new int[500];

    @ObfuscatedName("u.f")
    public int[] field207 = new int[500];

    public void run() {
        while (this.field204) {
            Object var1 = this.field199;
            synchronized (this.field199) {
                if (this.field206 < 500) {
                    this.field203[this.field206] = class140.field2163;
                    this.field207[this.field206] = class140.field2172 * 488798971;
                    this.field206++;
                }
            }
            class127.method2202(50L);
        }
    }
}
