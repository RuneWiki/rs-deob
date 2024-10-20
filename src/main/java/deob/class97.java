package deob;

@ObfuscatedName("cb")
public class class97 implements Runnable {

    @ObfuscatedName("cb.v")
    public boolean field1189 = true;

    @ObfuscatedName("cb.n")
    public Object field1185 = new Object();

    @ObfuscatedName("cb.f")
    public int field1186 = 0;

    @ObfuscatedName("cb.y")
    public int[] field1184 = new int[500];

    @ObfuscatedName("cb.p")
    public int[] field1188 = new int[500];

    @ObfuscatedName("cb.j")
    public long[] field1187 = new long[500];

    public void run() {
        while (this.field1189) {
            Object var1 = this.field1185;
            synchronized (this.field1185) {
                if (this.field1186 < 500) {
                    this.field1184[this.field1186] = class48.field389;
                    this.field1188[this.field1186] = class48.field370;
                    this.field1187[this.field1186] = class48.field379;
                    this.field1186++;
                }
            }
            long var3 = 49L;
            try {
                Thread.sleep(var3);
            } catch (InterruptedException var8) {
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException var7) {
            }
        }
    }
}
