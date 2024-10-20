package deob;

@ObfuscatedName("cf")
public class class86 implements Runnable {

    @ObfuscatedName("cf.a")
    public boolean field1057 = true;

    @ObfuscatedName("cf.f")
    public Object field1066 = new Object();

    @ObfuscatedName("cf.c")
    public int field1058 = 0;

    @ObfuscatedName("cf.x")
    public int[] field1059 = new int[500];

    @ObfuscatedName("cf.h")
    public int[] field1061 = new int[500];

    @ObfuscatedName("cf.j")
    public long[] field1065 = new long[500];

    public void run() {
        while (this.field1057) {
            Object var1 = this.field1066;
            synchronized (this.field1066) {
                if (this.field1058 < 500) {
                    this.field1059[this.field1058] = class37.field241;
                    this.field1061[this.field1058] = class37.field242;
                    this.field1065[this.field1058] = class37.field243;
                    this.field1058++;
                }
            }
            class281.method3621(50L);
        }
    }
}
