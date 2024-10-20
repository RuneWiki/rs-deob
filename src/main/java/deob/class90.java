package deob;

@ObfuscatedName("dq")
public class class90 implements Runnable {

    @ObfuscatedName("dq.aq")
    public boolean field1110 = true;

    @ObfuscatedName("dq.aw")
    public Object field1109 = new Object();

    @ObfuscatedName("dq.al")
    public int field1112 = 0;

    @ObfuscatedName("dq.ai")
    public int[] field1111 = new int[500];

    @ObfuscatedName("dq.ar")
    public int[] field1108 = new int[500];

    @ObfuscatedName("dq.as")
    public long[] field1113 = new long[500];

    public void run() {
        while (this.field1110) {
            Object var1 = this.field1109;
            synchronized (this.field1109) {
                if (this.field1112 < 500) {
                    this.field1111[this.field1112] = class36.field229;
                    this.field1108[this.field1112] = class36.field230;
                    this.field1113[this.field1112] = class36.field231;
                    this.field1112++;
                }
            }
            class319.method3040(50L);
        }
    }
}
