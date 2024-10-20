package deob;

@ObfuscatedName("k")
public class class16 implements Runnable {

    @ObfuscatedName("k.i")
    public boolean field256 = true;

    @ObfuscatedName("k.v")
    public Object field251 = new Object();

    @ObfuscatedName("k.m")
    public int field252 = 0;

    @ObfuscatedName("k.j")
    public int[] field250 = new int[500];

    @ObfuscatedName("k.o")
    public int[] field254 = new int[500];

    public void run() {
        while (this.field256) {
            Object var1 = this.field251;
            synchronized (this.field251) {
                if (this.field252 < 500) {
                    this.field250[this.field252] = class77.field1392;
                    this.field254[this.field252] = class77.field1393;
                    this.field252++;
                }
            }
            class126.method1440(50L);
        }
    }
}
