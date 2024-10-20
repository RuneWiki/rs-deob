package deob;

@ObfuscatedName("f")
public class class16 implements Runnable {

    @ObfuscatedName("f.y")
    public boolean field251 = true;

    @ObfuscatedName("f.m")
    public Object field246 = new Object();

    @ObfuscatedName("f.d")
    public int field247 = 0;

    @ObfuscatedName("f.k")
    public int[] field245 = new int[500];

    @ObfuscatedName("f.n")
    public int[] field249 = new int[500];

    public void run() {
        while (this.field251) {
            Object var1 = this.field246;
            synchronized (this.field246) {
                if (this.field247 < 500) {
                    this.field245[this.field247] = class77.field1401;
                    this.field249[this.field247] = class77.field1393;
                    this.field247++;
                }
            }
            class126.method1326(50L);
        }
    }
}
