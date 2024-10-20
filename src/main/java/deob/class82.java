package deob;

@ObfuscatedName("ci")
public class class82 implements Runnable {

    @ObfuscatedName("ci.i")
    public boolean field1034 = true;

    @ObfuscatedName("ci.w")
    public Object field1031 = new Object();

    @ObfuscatedName("ci.s")
    public int field1032 = 0;

    @ObfuscatedName("ci.a")
    public int[] field1035 = new int[500];

    @ObfuscatedName("ci.o")
    public int[] field1033 = new int[500];

    @ObfuscatedName("ci.g")
    public long[] field1038 = new long[500];

    public void run() {
        while (this.field1034) {
            Object var1 = this.field1031;
            synchronized (this.field1031) {
                if (this.field1032 < 500) {
                    this.field1035[this.field1032] = class33.field212;
                    this.field1033[this.field1032] = class33.field221;
                    this.field1038[this.field1032] = class33.field214;
                    this.field1032++;
                }
            }
            class399.method2872(50L);
        }
    }
}
