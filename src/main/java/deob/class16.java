package deob;

@ObfuscatedName("q")
public class class16 implements Runnable {

    @ObfuscatedName("q.j")
    public boolean field240 = true;

    @ObfuscatedName("q.r")
    public Object field247 = new Object();

    @ObfuscatedName("q.v")
    public int field243 = 0;

    @ObfuscatedName("q.p")
    public int[] field241 = new int[500];

    @ObfuscatedName("q.e")
    public int[] field242 = new int[500];

    public void run() {
        while (this.field240) {
            Object var1 = this.field247;
            synchronized (this.field247) {
                if (this.field243 < 500) {
                    this.field241[this.field243] = class77.field1382;
                    this.field242[this.field243] = class77.field1375;
                    this.field243++;
                }
            }
            class126.method1316(50L);
        }
    }
}
