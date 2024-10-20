package deob;

@ObfuscatedName("cv")
public class class82 implements Runnable {

    @ObfuscatedName("cv.o")
    public boolean field1071 = true;

    @ObfuscatedName("cv.q")
    public Object field1069 = new Object();

    @ObfuscatedName("cv.l")
    public int field1067 = 0;

    @ObfuscatedName("cv.k")
    public int[] field1068 = new int[500];

    @ObfuscatedName("cv.a")
    public int[] field1070 = new int[500];

    @ObfuscatedName("cv.m")
    public long[] field1065 = new long[500];

    public void run() {
        while (this.field1071) {
            Object var1 = this.field1069;
            synchronized (this.field1069) {
                if (this.field1067 < 500) {
                    this.field1068[this.field1067] = class33.field227;
                    this.field1070[this.field1067] = class33.field228;
                    this.field1065[this.field1067] = class33.field234;
                    this.field1067++;
                }
            }
            class271.method4446(50L);
        }
    }
}
