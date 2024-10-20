package deob;

@ObfuscatedName("bv")
public class class71 implements Runnable {

    @ObfuscatedName("bv.n")
    public boolean field815 = true;

    @ObfuscatedName("bv.v")
    public Object field814 = new Object();

    @ObfuscatedName("bv.y")
    public int field819 = 0;

    @ObfuscatedName("bv.r")
    public int[] field816 = new int[500];

    @ObfuscatedName("bv.h")
    public int[] field817 = new int[500];

    public void run() {
        while (this.field815) {
            Object var1 = this.field814;
            synchronized (this.field814) {
                if (this.field819 < 500) {
                    this.field816[this.field819] = class60.field705;
                    this.field817[this.field819] = class60.field706;
                    this.field819++;
                }
            }
            class193.method980(50L);
        }
    }
}
