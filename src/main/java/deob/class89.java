package deob;

@ObfuscatedName("do")
public class class89 implements Runnable {

    @ObfuscatedName("do.at")
    public boolean field1080 = true;

    @ObfuscatedName("do.an")
    public Object field1073 = new Object();

    @ObfuscatedName("do.av")
    public int field1075 = 0;

    @ObfuscatedName("do.as")
    public int[] field1076 = new int[500];

    @ObfuscatedName("do.ax")
    public int[] field1081 = new int[500];

    @ObfuscatedName("do.ap")
    public long[] field1078 = new long[500];

    public void run() {
        while (this.field1080) {
            Object var1 = this.field1073;
            synchronized (this.field1073) {
                if (this.field1075 < 500) {
                    this.field1076[this.field1075] = class36.field221;
                    this.field1081[this.field1075] = class36.field229;
                    this.field1078[this.field1075] = class36.field225;
                    this.field1075++;
                }
            }
            class302.method3997(50L);
        }
    }
}
