package deob;

@ObfuscatedName("u")
public class class21 implements Runnable {

    @ObfuscatedName("u.x")
    public boolean field215 = true;

    @ObfuscatedName("u.n")
    public Object field214 = new Object();

    @ObfuscatedName("u.g")
    public int field222 = 0;

    @ObfuscatedName("u.v")
    public int[] field216 = new int[500];

    @ObfuscatedName("u.y")
    public int[] field213 = new int[500];

    public void run() {
        while (this.field215) {
            Object var1 = this.field214;
            synchronized (this.field214) {
                if (this.field222 < 500) {
                    this.field216[this.field222] = class116.field1806;
                    this.field213[this.field222] = class116.field1807;
                    this.field222++;
                }
            }
            class162.method951(50L);
        }
    }
}
