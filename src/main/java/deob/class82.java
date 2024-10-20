package deob;

@ObfuscatedName("cl")
public class class82 implements Runnable {

    @ObfuscatedName("cl.s")
    public boolean field1059 = true;

    @ObfuscatedName("cl.h")
    public Object field1049 = new Object();

    @ObfuscatedName("cl.w")
    public int field1055 = 0;

    @ObfuscatedName("cl.v")
    public int[] field1051 = new int[500];

    @ObfuscatedName("cl.c")
    public int[] field1052 = new int[500];

    @ObfuscatedName("cl.q")
    public long[] field1053 = new long[500];

    public void run() {
        while (this.field1059) {
            Object var1 = this.field1049;
            synchronized (this.field1049) {
                if (this.field1055 < 500) {
                    this.field1051[this.field1055] = class33.field220;
                    this.field1052[this.field1055] = class33.field228;
                    this.field1053[this.field1055] = class33.field222;
                    this.field1055++;
                }
            }
            class271.method2748(50L);
        }
    }
}
