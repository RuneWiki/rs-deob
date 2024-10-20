package deob;

@ObfuscatedName("ds")
public class class87 implements Runnable {

    @ObfuscatedName("ds.aj")
    public boolean field1059 = true;

    @ObfuscatedName("ds.al")
    public Object field1060 = new Object();

    @ObfuscatedName("ds.ac")
    public int field1061 = 0;

    @ObfuscatedName("ds.ab")
    public int[] field1062 = new int[500];

    @ObfuscatedName("ds.an")
    public int[] field1063 = new int[500];

    @ObfuscatedName("ds.ao")
    public long[] field1064 = new long[500];

    public void run() {
        while (this.field1059) {
            Object var1 = this.field1060;
            synchronized (this.field1060) {
                if (this.field1061 < 500) {
                    this.field1062[this.field1061] = class36.field228;
                    this.field1063[this.field1061] = class36.field227;
                    this.field1064[this.field1061] = class36.field230;
                    this.field1061++;
                }
            }
            class291.method1994(50L);
        }
    }
}
