package deob;

@ObfuscatedName("j")
public class class7 implements Runnable {

    @ObfuscatedName("j.r")
    public boolean field115 = true;

    @ObfuscatedName("j.d")
    public Object field119 = new Object();

    @ObfuscatedName("j.l")
    public int field117 = 0;

    @ObfuscatedName("j.m")
    public int[] field118 = new int[500];

    @ObfuscatedName("j.c")
    public int[] field116 = new int[500];

    public void run() {
        while (this.field115) {
            Object var1 = this.field119;
            synchronized (this.field119) {
                if (this.field117 < 500) {
                    this.field118[this.field117] = class36.field488;
                    this.field116[this.field117] = class36.field492;
                    this.field117++;
                }
            }
            class67.method1020(50L);
        }
    }
}
