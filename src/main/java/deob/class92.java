package deob;

@ObfuscatedName("dh")
public class class92 implements Runnable {

    @ObfuscatedName("dh.ac")
    public boolean field1115 = true;

    @ObfuscatedName("dh.ae")
    public Object field1116 = new Object();

    @ObfuscatedName("dh.ag")
    public int field1117 = 0;

    @ObfuscatedName("dh.am")
    public int[] field1118 = new int[500];

    @ObfuscatedName("dh.ax")
    public int[] field1119 = new int[500];

    @ObfuscatedName("dh.aq")
    public long[] field1121 = new long[500];

    public void run() {
        while (this.field1115) {
            Object var1 = this.field1116;
            synchronized (this.field1116) {
                if (this.field1117 < 500) {
                    this.field1118[this.field1117] = class36.field217;
                    this.field1119[this.field1117] = class36.field210;
                    this.field1121[this.field1117] = class36.field211;
                    this.field1117++;
                }
            }
            class332.method4128(50L);
        }
    }
}
