package deob;

@ObfuscatedName("dp")
public class class91 implements Runnable {

    @ObfuscatedName("dp.ac")
    public boolean field1096 = true;

    @ObfuscatedName("dp.al")
    public Object field1091 = new Object();

    @ObfuscatedName("dp.ak")
    public int field1094 = 0;

    @ObfuscatedName("dp.ax")
    public int[] field1090 = new int[500];

    @ObfuscatedName("dp.ao")
    public int[] field1093 = new int[500];

    @ObfuscatedName("dp.ah")
    public long[] field1095 = new long[500];

    public void run() {
        while (this.field1096) {
            Object var1 = this.field1091;
            synchronized (this.field1091) {
                if (this.field1094 < 500) {
                    this.field1090[this.field1094] = class36.field235;
                    this.field1093[this.field1094] = class36.field241;
                    this.field1095[this.field1094] = class36.field237;
                    this.field1094++;
                }
            }
            class317.method2610(50L);
        }
    }
}
