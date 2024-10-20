package deob;

@ObfuscatedName("g")
public class class21 implements Runnable {

    @ObfuscatedName("g.f")
    public boolean field229 = true;

    @ObfuscatedName("g.i")
    public Object field228 = new Object();

    @ObfuscatedName("g.u")
    public int field235 = 0;

    @ObfuscatedName("g.h")
    public int[] field230 = new int[500];

    @ObfuscatedName("g.r")
    public int[] field227 = new int[500];

    public void run() {
        while (this.field229) {
            Object var1 = this.field228;
            synchronized (this.field228) {
                if (this.field235 < 500) {
                    this.field230[this.field235] = class116.field1818;
                    this.field227[this.field235] = class116.field1819;
                    this.field235++;
                }
            }
            class162.method2141(50L);
        }
    }
}
