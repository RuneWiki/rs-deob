package deob;

@ObfuscatedName("m")
public class class15 implements Runnable {

    @ObfuscatedName("m.p")
    public boolean field248 = true;

    @ObfuscatedName("m.j")
    public Object field241 = new Object();

    @ObfuscatedName("m.w")
    public int field247 = 0;

    @ObfuscatedName("m.h")
    public int[] field240 = new int[500];

    @ObfuscatedName("m.v")
    public int[] field244 = new int[500];

    public void run() {
        while (this.field248) {
            Object var1 = this.field241;
            synchronized (this.field241) {
                if (this.field247 < 500) {
                    this.field240[this.field247] = class76.field1399;
                    this.field244[this.field247] = class76.field1388;
                    this.field247++;
                }
            }
            class125.method123(50L);
        }
    }
}
