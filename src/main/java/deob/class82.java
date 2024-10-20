package deob;

@ObfuscatedName("cu")
public class class82 implements Runnable {

    @ObfuscatedName("cu.n")
    public boolean field1040 = true;

    @ObfuscatedName("cu.c")
    public Object field1046 = new Object();

    @ObfuscatedName("cu.m")
    public int field1047 = 0;

    @ObfuscatedName("cu.k")
    public int[] field1039 = new int[500];

    @ObfuscatedName("cu.o")
    public int[] field1043 = new int[500];

    @ObfuscatedName("cu.g")
    public long[] field1044 = new long[500];

    public void run() {
        while (this.field1040) {
            Object var1 = this.field1046;
            synchronized (this.field1046) {
                if (this.field1047 < 500) {
                    this.field1039[this.field1047] = class33.field221;
                    this.field1043[this.field1047] = class33.field230;
                    this.field1044[this.field1047] = class33.field231;
                    this.field1047++;
                }
            }
            class398.method4655(50L);
        }
    }
}
