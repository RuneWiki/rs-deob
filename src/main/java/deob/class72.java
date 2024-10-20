package deob;

@ObfuscatedName("bb")
public class class72 implements Runnable {

    @ObfuscatedName("bb.i")
    public boolean field882 = true;

    @ObfuscatedName("bb.j")
    public Object field879 = new Object();

    @ObfuscatedName("bb.a")
    public int field881 = 0;

    @ObfuscatedName("bb.r")
    public int[] field880 = new int[500];

    @ObfuscatedName("bb.o")
    public int[] field883 = new int[500];

    public void run() {
        while (this.field882) {
            Object var1 = this.field879;
            synchronized (this.field879) {
                if (this.field881 < 500) {
                    this.field880[this.field881] = class60.field753;
                    this.field883[this.field881] = class60.field748;
                    this.field881++;
                }
            }
            Statics.method1558(50L);
        }
    }
}
