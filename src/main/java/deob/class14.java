package deob;

@ObfuscatedName("x")
public class class14 implements Runnable {

    @ObfuscatedName("x.c")
    public boolean field184 = true;

    @ObfuscatedName("x.h")
    public Object field185 = new Object();

    @ObfuscatedName("x.k")
    public int field190 = 0;

    @ObfuscatedName("x.t")
    public int[] field187 = new int[500];

    @ObfuscatedName("x.g")
    public int[] field188 = new int[500];

    public void run() {
        while (this.field184) {
            Object var1 = this.field185;
            synchronized (this.field185) {
                if (this.field190 < 500) {
                    this.field187[this.field190] = class140.field2116;
                    this.field188[this.field190] = class140.field2120;
                    this.field190++;
                }
            }
            class127.method2079(50L);
        }
    }
}
