package deob;

@ObfuscatedName("k")
public class class14 implements Runnable {

    @ObfuscatedName("k.d")
    public boolean field197 = true;

    @ObfuscatedName("k.p")
    public Object field205 = new Object();

    @ObfuscatedName("k.v")
    public int field199 = 0;

    @ObfuscatedName("k.l")
    public int[] field198 = new int[500];

    @ObfuscatedName("k.y")
    public int[] field201 = new int[500];

    public void run() {
        while (this.field197) {
            Object var1 = this.field205;
            synchronized (this.field205) {
                if (this.field199 < 500) {
                    this.field198[this.field199] = class140.field2128;
                    this.field201[this.field199] = class140.field2129;
                    this.field199++;
                }
            }
            class127.method724(50L);
        }
    }
}
