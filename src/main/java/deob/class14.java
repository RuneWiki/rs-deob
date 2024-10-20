package deob;

@ObfuscatedName("l")
public class class14 implements Runnable {

    @ObfuscatedName("l.v")
    public boolean field203 = true;

    @ObfuscatedName("l.f")
    public Object field197 = new Object();

    @ObfuscatedName("l.i")
    public int field198 = 0;

    @ObfuscatedName("l.d")
    public int[] field199 = new int[500];

    @ObfuscatedName("l.o")
    public int[] field200 = new int[500];

    public void run() {
        while (this.field203) {
            Object var1 = this.field197;
            synchronized (this.field197) {
                if (this.field198 < 500) {
                    this.field199[this.field198] = class140.field2161;
                    this.field200[this.field198] = class140.field2170;
                    this.field198++;
                }
            }
            class127.method2134(50L);
        }
    }
}
