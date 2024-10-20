package deob;

@ObfuscatedName("cx")
public class class82 implements Runnable {

    @ObfuscatedName("cx.c")
    public boolean field1063 = true;

    @ObfuscatedName("cx.v")
    public Object field1060 = new Object();

    @ObfuscatedName("cx.q")
    public int field1061 = 0;

    @ObfuscatedName("cx.f")
    public int[] field1062 = new int[500];

    @ObfuscatedName("cx.j")
    public int[] field1059 = new int[500];

    @ObfuscatedName("cx.e")
    public long[] field1064 = new long[500];

    public void run() {
        while (this.field1063) {
            Object var1 = this.field1060;
            synchronized (this.field1060) {
                if (this.field1061 < 500) {
                    this.field1062[this.field1061] = class33.field223;
                    this.field1059[this.field1061] = class33.field225;
                    this.field1064[this.field1061] = class33.field215;
                    this.field1061++;
                }
            }
            class270.method1896(50L);
        }
    }
}
