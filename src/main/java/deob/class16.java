package deob;

@ObfuscatedName("n")
public class class16 implements Runnable {

    @ObfuscatedName("n.c")
    public boolean field260 = true;

    @ObfuscatedName("n.q")
    public Object field262 = new Object();

    @ObfuscatedName("n.y")
    public int field252 = 0;

    @ObfuscatedName("n.v")
    public int[] field253 = new int[500];

    @ObfuscatedName("n.g")
    public int[] field254 = new int[500];

    public void run() {
        while (this.field260) {
            Object var1 = this.field262;
            synchronized (this.field262) {
                if (this.field252 < 500) {
                    this.field253[this.field252] = class77.field1397;
                    this.field254[this.field252] = class77.field1404;
                    this.field252++;
                }
            }
            class126.method577(50L);
        }
    }
}
