package deob;

@ObfuscatedName("v")
public class class14 implements Runnable {

    @ObfuscatedName("v.a")
    public boolean field192 = true;

    @ObfuscatedName("v.r")
    public Object field189 = new Object();

    @ObfuscatedName("v.f")
    public int field190 = 0;

    @ObfuscatedName("v.s")
    public int[] field198 = new int[500];

    @ObfuscatedName("v.y")
    public int[] field196 = new int[500];

    public void run() {
        while (this.field192) {
            Object var1 = this.field189;
            synchronized (this.field189) {
                if (this.field190 < 500) {
                    this.field198[this.field190] = class140.field2141;
                    this.field196[this.field190] = class140.field2136;
                    this.field190++;
                }
            }
            class127.method2148(50L);
        }
    }
}
