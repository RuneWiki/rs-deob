package deob;

@ObfuscatedName("cd")
public class class82 implements Runnable {

    @ObfuscatedName("cd.c")
    public boolean field1038 = true;

    @ObfuscatedName("cd.b")
    public Object field1036 = new Object();

    @ObfuscatedName("cd.p")
    public int field1037 = 0;

    @ObfuscatedName("cd.m")
    public int[] field1041 = new int[500];

    @ObfuscatedName("cd.t")
    public int[] field1039 = new int[500];

    @ObfuscatedName("cd.s")
    public long[] field1040 = new long[500];

    public void run() {
        while (this.field1038) {
            Object var1 = this.field1036;
            synchronized (this.field1036) {
                if (this.field1037 < 500) {
                    this.field1041[this.field1037] = class33.field227;
                    this.field1039[this.field1037] = class33.field228;
                    this.field1040[this.field1037] = class33.field238;
                    this.field1037++;
                }
            }
            class417.method5965(50L);
        }
    }
}
