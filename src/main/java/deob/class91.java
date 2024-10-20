package deob;

@ObfuscatedName("di")
public class class91 implements Runnable {

    @ObfuscatedName("di.aq")
    public boolean field1093 = true;

    @ObfuscatedName("di.ad")
    public Object field1094 = new Object();

    @ObfuscatedName("di.ag")
    public int field1095 = 0;

    @ObfuscatedName("di.ak")
    public int[] field1097 = new int[500];

    @ObfuscatedName("di.ap")
    public int[] field1098 = new int[500];

    @ObfuscatedName("di.an")
    public long[] field1096 = new long[500];

    public void run() {
        while (this.field1093) {
            Object var1 = this.field1094;
            synchronized (this.field1094) {
                if (this.field1095 < 500) {
                    this.field1097[this.field1095] = class36.field224;
                    this.field1098[this.field1095] = class36.field214;
                    this.field1096[this.field1095] = class36.field204;
                    this.field1095++;
                }
            }
            class328.method3390(50L);
        }
    }
}
