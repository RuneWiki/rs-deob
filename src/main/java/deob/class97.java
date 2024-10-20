package deob;

@ObfuscatedName("co")
public class class97 implements Runnable {

    @ObfuscatedName("co.f")
    public boolean field1172 = true;

    @ObfuscatedName("co.e")
    public Object field1168 = new Object();

    @ObfuscatedName("co.v")
    public int field1169 = 0;

    @ObfuscatedName("co.y")
    public int[] field1170 = new int[500];

    @ObfuscatedName("co.j")
    public int[] field1174 = new int[500];

    @ObfuscatedName("co.o")
    public long[] field1171 = new long[500];

    public void run() {
        while (this.field1172) {
            Object var1 = this.field1168;
            synchronized (this.field1168) {
                if (this.field1169 < 500) {
                    this.field1170[this.field1169] = class48.field368;
                    this.field1174[this.field1169] = class48.field362;
                    this.field1171[this.field1169] = class48.field363;
                    this.field1169++;
                }
            }
            class382.method169(50L);
        }
    }
}
