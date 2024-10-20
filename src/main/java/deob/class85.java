package deob;

@ObfuscatedName("cc")
public class class85 implements Runnable {

    @ObfuscatedName("cc.f")
    public boolean field1076 = true;

    @ObfuscatedName("cc.w")
    public Object field1075 = new Object();

    @ObfuscatedName("cc.v")
    public int field1082 = 0;

    @ObfuscatedName("cc.s")
    public int[] field1077 = new int[500];

    @ObfuscatedName("cc.z")
    public int[] field1078 = new int[500];

    @ObfuscatedName("cc.j")
    public long[] field1074 = new long[500];

    public void run() {
        while (this.field1076) {
            Object var1 = this.field1075;
            synchronized (this.field1075) {
                if (this.field1082 < 500) {
                    this.field1077[this.field1082] = class36.field251;
                    this.field1078[this.field1082] = class36.field252;
                    this.field1074[this.field1082] = class36.field253;
                    this.field1082++;
                }
            }
            class288.method3270(50L);
        }
    }
}
