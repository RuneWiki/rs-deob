package deob;

@ObfuscatedName("u")
public class class14 implements Runnable {

    @ObfuscatedName("u.h")
    public boolean field191 = true;

    @ObfuscatedName("u.m")
    public Object field194 = new Object();

    @ObfuscatedName("u.i")
    public int field197 = 0;

    @ObfuscatedName("u.q")
    public int[] field193 = new int[500];

    @ObfuscatedName("u.p")
    public int[] field198 = new int[500];

    public void run() {
        while (this.field191) {
            Object var1 = this.field194;
            synchronized (this.field194) {
                if (this.field197 < 500) {
                    this.field193[this.field197] = class140.field2163;
                    this.field198[this.field197] = class140.field2155;
                    this.field197++;
                }
            }
            class127.method952(50L);
        }
    }
}
