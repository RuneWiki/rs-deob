package deob;

@ObfuscatedName("q")
public class class14 implements Runnable {

    @ObfuscatedName("q.o")
    public boolean field197 = true;

    @ObfuscatedName("q.e")
    public Object field184 = new Object();

    @ObfuscatedName("q.u")
    public int field187 = 0;

    @ObfuscatedName("q.b")
    public int[] field186 = new int[500];

    @ObfuscatedName("q.p")
    public int[] field183 = new int[500];

    public void run() {
        while (this.field197) {
            Object var1 = this.field184;
            synchronized (this.field184) {
                if (this.field187 < 500) {
                    this.field186[this.field187] = class140.field2144;
                    this.field183[this.field187] = class140.field2145;
                    this.field187++;
                }
            }
            class127.method2614(50L);
        }
    }
}
