package deob;

@ObfuscatedName("d")
public class class14 implements Runnable {

    @ObfuscatedName("d.h")
    public boolean field200 = true;

    @ObfuscatedName("d.q")
    public Object field201 = new Object();

    @ObfuscatedName("d.v")
    public int field203 = 0;

    @ObfuscatedName("d.n")
    public int[] field202 = new int[500];

    @ObfuscatedName("d.f")
    public int[] field209 = new int[500];

    public void run() {
        while (this.field200) {
            Object var1 = this.field201;
            synchronized (this.field201) {
                if (this.field203 < 500) {
                    this.field202[this.field203] = class140.field2134;
                    this.field209[this.field203] = class140.field2135 * 782474221;
                    this.field203++;
                }
            }
            class127.method2075(50L);
        }
    }
}
