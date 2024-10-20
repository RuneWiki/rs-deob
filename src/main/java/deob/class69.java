package deob;

@ObfuscatedName("bn")
public class class69 implements Runnable {

    @ObfuscatedName("bn.s")
    public boolean field966 = true;

    @ObfuscatedName("bn.t")
    public Object field975 = new Object();

    @ObfuscatedName("bn.v")
    public int field967 = 0;

    @ObfuscatedName("bn.j")
    public int[] field968 = new int[500];

    @ObfuscatedName("bn.l")
    public int[] field969 = new int[500];

    @ObfuscatedName("bn.n")
    public long[] field970 = new long[500];

    public void run() {
        while (this.field966) {
            Object var1 = this.field975;
            synchronized (this.field975) {
                if (this.field967 < 500) {
                    this.field968[this.field967] = class20.field142;
                    this.field969[this.field967] = class20.field145;
                    this.field970[this.field967] = class20.field144;
                    this.field967++;
                }
            }
            class383.method3882(50L);
        }
    }
}
