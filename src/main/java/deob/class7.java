package deob;

@ObfuscatedName("r")
public class class7 implements Runnable {

    @ObfuscatedName("r.q")
    public boolean field117 = true;

    @ObfuscatedName("r.l")
    public Object field113 = new Object();

    @ObfuscatedName("r.a")
    public int field114 = 0;

    @ObfuscatedName("r.o")
    public int[] field116 = new int[500];

    @ObfuscatedName("r.c")
    public int[] field115 = new int[500];

    public void run() {
        while (this.field117) {
            Object var1 = this.field113;
            synchronized (this.field113) {
                if (this.field114 < 500) {
                    this.field116[this.field114] = class37.field492;
                    this.field115[this.field114] = class37.field499;
                    this.field114++;
                }
            }
            class68.method86(50L);
        }
    }
}
