package deob;

@ObfuscatedName("cu")
public class class82 implements Runnable {

    @ObfuscatedName("cu.c")
    public boolean field1064 = true;

    @ObfuscatedName("cu.l")
    public Object field1063 = new Object();

    @ObfuscatedName("cu.s")
    public int field1057 = 0;

    @ObfuscatedName("cu.e")
    public int[] field1059 = new int[500];

    @ObfuscatedName("cu.r")
    public int[] field1060 = new int[500];

    @ObfuscatedName("cu.o")
    public long[] field1061 = new long[500];

    public void run() {
        while (this.field1064) {
            Object var1 = this.field1063;
            synchronized (this.field1063) {
                if (this.field1057 < 500) {
                    this.field1059[this.field1057] = class33.field223;
                    this.field1060[this.field1057] = class33.field229;
                    this.field1061[this.field1057] = class33.field231;
                    this.field1057++;
                }
            }
            class263.method5249(50L);
        }
    }
}
