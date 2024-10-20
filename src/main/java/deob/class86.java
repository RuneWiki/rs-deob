package deob;

@ObfuscatedName("cs")
public class class86 implements Runnable {

    @ObfuscatedName("cs.h")
    public boolean field1092 = true;

    @ObfuscatedName("cs.e")
    public Object field1091 = new Object();

    @ObfuscatedName("cs.v")
    public int field1097 = 0;

    @ObfuscatedName("cs.x")
    public int[] field1093 = new int[500];

    @ObfuscatedName("cs.m")
    public int[] field1094 = new int[500];

    @ObfuscatedName("cs.q")
    public long[] field1095 = new long[500];

    public void run() {
        while (this.field1092) {
            Object var1 = this.field1091;
            synchronized (this.field1091) {
                if (this.field1097 < 500) {
                    this.field1093[this.field1097] = class37.field254;
                    this.field1094[this.field1097] = class37.field249;
                    this.field1095[this.field1097] = class37.field256;
                    this.field1097++;
                }
            }
            class284.method148(50L);
        }
    }
}
