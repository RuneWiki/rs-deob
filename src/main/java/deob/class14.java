package deob;

@ObfuscatedName("z")
public class class14 implements Runnable {

    @ObfuscatedName("z.b")
    public boolean field197 = true;

    @ObfuscatedName("z.g")
    public Object field202 = new Object();

    @ObfuscatedName("z.j")
    public int field198 = 0;

    @ObfuscatedName("z.d")
    public int[] field203 = new int[500];

    @ObfuscatedName("z.x")
    public int[] field199 = new int[500];

    public void run() {
        while (this.field197) {
            Object var1 = this.field202;
            synchronized (this.field202) {
                if (this.field198 < 500) {
                    this.field203[this.field198] = class141.field2135;
                    this.field199[this.field198] = class141.field2136;
                    this.field198++;
                }
            }
            class128.method2289(50L);
        }
    }
}
