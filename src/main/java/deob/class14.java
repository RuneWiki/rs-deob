package deob;

@ObfuscatedName("d")
public class class14 implements Runnable {

    @ObfuscatedName("d.j")
    public boolean field196 = true;

    @ObfuscatedName("d.h")
    public Object field192 = new Object();

    @ObfuscatedName("d.m")
    public int field194 = 0;

    @ObfuscatedName("d.z")
    public int[] field195 = new int[500];

    @ObfuscatedName("d.x")
    public int[] field197 = new int[500];

    public void run() {
        while (this.field196) {
            Object var1 = this.field192;
            synchronized (this.field192) {
                if (this.field194 < 500) {
                    this.field195[this.field194] = class141.field2129;
                    this.field197[this.field194] = class141.field2127;
                    this.field194++;
                }
            }
            class128.method167(50L);
        }
    }
}
