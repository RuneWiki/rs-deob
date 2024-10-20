package deob;

@ObfuscatedName("dg")
public class class91 implements Runnable {

    @ObfuscatedName("dg.ak")
    public boolean field1111 = true;

    @ObfuscatedName("dg.al")
    public Object field1108 = new Object();

    @ObfuscatedName("dg.aj")
    public int field1109 = 0;

    @ObfuscatedName("dg.az")
    public int[] field1110 = new int[500];

    @ObfuscatedName("dg.af")
    public int[] field1114 = new int[500];

    @ObfuscatedName("dg.aa")
    public long[] field1112 = new long[500];

    public void run() {
        while (this.field1111) {
            Object var1 = this.field1108;
            synchronized (this.field1108) {
                if (this.field1109 < 500) {
                    this.field1110[this.field1109] = class36.field230;
                    this.field1114[this.field1109] = class36.field221;
                    this.field1112[this.field1109] = class36.field233;
                    this.field1109++;
                }
            }
            class327.method8101(50L);
        }
    }
}
