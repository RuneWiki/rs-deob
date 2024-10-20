package deob;

@ObfuscatedName("dx")
public class class92 implements Runnable {

    @ObfuscatedName("dx.ap")
    public boolean field1113 = true;

    @ObfuscatedName("dx.aw")
    public Object field1112 = new Object();

    @ObfuscatedName("dx.ak")
    public int field1111 = 0;

    @ObfuscatedName("dx.aj")
    public int[] field1114 = new int[500];

    @ObfuscatedName("dx.ai")
    public int[] field1115 = new int[500];

    @ObfuscatedName("dx.ay")
    public long[] field1116 = new long[500];

    public void run() {
        while (this.field1113) {
            Object var1 = this.field1112;
            synchronized (this.field1112) {
                if (this.field1111 < 500) {
                    this.field1114[this.field1111] = class36.field195;
                    this.field1115[this.field1111] = class36.field198;
                    this.field1116[this.field1111] = class36.field202;
                    this.field1111++;
                }
            }
            class331.method1920(50L);
        }
    }
}
