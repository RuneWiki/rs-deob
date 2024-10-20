package deob;

@ObfuscatedName("cg")
public class class82 implements Runnable {

    @ObfuscatedName("cg.l")
    public boolean field1056 = true;

    @ObfuscatedName("cg.q")
    public Object field1051 = new Object();

    @ObfuscatedName("cg.f")
    public int field1058 = 0;

    @ObfuscatedName("cg.j")
    public int[] field1053 = new int[500];

    @ObfuscatedName("cg.m")
    public int[] field1054 = new int[500];

    @ObfuscatedName("cg.k")
    public long[] field1055 = new long[500];

    public void run() {
        while (this.field1056) {
            Object var1 = this.field1051;
            synchronized (this.field1051) {
                if (this.field1058 < 500) {
                    this.field1053[this.field1058] = class33.field224;
                    this.field1054[this.field1058] = class33.field225;
                    this.field1055[this.field1058] = class33.field226;
                    this.field1058++;
                }
            }
            class399.method2395(50L);
        }
    }
}
