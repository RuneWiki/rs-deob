package deob;

@ObfuscatedName("v")
public class class14 implements Runnable {

    @ObfuscatedName("v.l")
    public boolean field205 = true;

    @ObfuscatedName("v.e")
    public Object field207 = new Object();

    @ObfuscatedName("v.q")
    public int field209 = 0;

    @ObfuscatedName("v.o")
    public int[] field200 = new int[500];

    @ObfuscatedName("v.g")
    public int[] field201 = new int[500];

    public void run() {
        while (this.field205) {
            Object var1 = this.field207;
            synchronized (this.field207) {
                if (this.field209 < 500) {
                    this.field200[this.field209] = class140.field2151;
                    this.field201[this.field209] = class140.field2152;
                    this.field209++;
                }
            }
            class127.method2667(50L);
        }
    }
}
