package deob;

@ObfuscatedName("cf")
public class class82 implements Runnable {

    @ObfuscatedName("cf.v")
    public boolean field1052 = true;

    @ObfuscatedName("cf.c")
    public Object field1047 = new Object();

    @ObfuscatedName("cf.i")
    public int field1048 = 0;

    @ObfuscatedName("cf.f")
    public int[] field1046 = new int[500];

    @ObfuscatedName("cf.b")
    public int[] field1050 = new int[500];

    @ObfuscatedName("cf.n")
    public long[] field1049 = new long[500];

    public void run() {
        while (this.field1052) {
            Object var1 = this.field1047;
            synchronized (this.field1047) {
                if (this.field1048 < 500) {
                    this.field1046[this.field1048] = class33.field229;
                    this.field1050[this.field1048] = class33.field230;
                    this.field1049[this.field1048] = class33.field231;
                    this.field1048++;
                }
            }
            class271.method2274(50L);
        }
    }
}
