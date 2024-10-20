package deob;

@ObfuscatedName("cn")
public class class82 implements Runnable {

    @ObfuscatedName("cn.c")
    public boolean field1058 = true;

    @ObfuscatedName("cn.p")
    public Object field1056 = new Object();

    @ObfuscatedName("cn.f")
    public int field1054 = 0;

    @ObfuscatedName("cn.n")
    public int[] field1055 = new int[500];

    @ObfuscatedName("cn.k")
    public int[] field1057 = new int[500];

    @ObfuscatedName("cn.w")
    public long[] field1059 = new long[500];

    public void run() {
        while (this.field1058) {
            Object var1 = this.field1056;
            synchronized (this.field1056) {
                if (this.field1054 < 500) {
                    this.field1055[this.field1054] = class33.field232;
                    this.field1057[this.field1054] = class33.field231;
                    this.field1059[this.field1054] = class33.field224;
                    this.field1054++;
                }
            }
            class272.method406(50L);
        }
    }
}
