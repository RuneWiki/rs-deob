package deob;

@ObfuscatedName("k")
public class class14 implements Runnable {

    @ObfuscatedName("k.g")
    public boolean field206 = true;

    @ObfuscatedName("k.b")
    public Object field203 = new Object();

    @ObfuscatedName("k.w")
    public int field204 = 0;

    @ObfuscatedName("k.d")
    public int[] field207 = new int[500];

    @ObfuscatedName("k.z")
    public int[] field202 = new int[500];

    public void run() {
        while (this.field206) {
            Object var1 = this.field203;
            synchronized (this.field203) {
                if (this.field204 < 500) {
                    this.field207[this.field204] = class140.field2139;
                    this.field202[this.field204] = class140.field2145;
                    this.field204++;
                }
            }
            class127.method2632(50L);
        }
    }
}
