package deob;

@ObfuscatedName("bb")
public class class72 implements Runnable {

    @ObfuscatedName("bb.s")
    public boolean field855 = true;

    @ObfuscatedName("bb.c")
    public Object field847 = new Object();

    @ObfuscatedName("bb.f")
    public int field848 = 0;

    @ObfuscatedName("bb.m")
    public int[] field849 = new int[500];

    @ObfuscatedName("bb.h")
    public int[] field846 = new int[500];

    public void run() {
        while (this.field855) {
            Object var1 = this.field847;
            synchronized (this.field847) {
                if (this.field848 < 500) {
                    this.field849[this.field848] = class60.field742;
                    this.field846[this.field848] = class60.field738;
                    this.field848++;
                }
            }
            class185.method631(50L);
        }
    }
}
