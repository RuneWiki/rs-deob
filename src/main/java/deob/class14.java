package deob;

@ObfuscatedName("s")
public class class14 implements Runnable {

    @ObfuscatedName("s.y")
    public boolean field209 = true;

    @ObfuscatedName("s.d")
    public Object field206 = new Object();

    @ObfuscatedName("s.g")
    public int field202 = 0;

    @ObfuscatedName("s.w")
    public int[] field208 = new int[500];

    @ObfuscatedName("s.e")
    public int[] field204 = new int[500];

    public void run() {
        while (this.field209) {
            Object var1 = this.field206;
            synchronized (this.field206) {
                if (this.field202 < 500) {
                    this.field208[this.field202] = class140.field2131;
                    this.field204[this.field202] = class140.field2132 * -1076088155;
                    this.field202++;
                }
            }
            class127.method1535(50L);
        }
    }
}
