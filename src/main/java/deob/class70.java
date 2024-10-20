package deob;

@ObfuscatedName("bc")
public class class70 implements Runnable {

    @ObfuscatedName("bc.o")
    public boolean field819 = true;

    @ObfuscatedName("bc.k")
    public Object field810 = new Object();

    @ObfuscatedName("bc.t")
    public int field817 = 0;

    @ObfuscatedName("bc.d")
    public int[] field809 = new int[500];

    @ObfuscatedName("bc.h")
    public int[] field813 = new int[500];

    public void run() {
        while (this.field819) {
            Object var1 = this.field810;
            synchronized (this.field810) {
                if (this.field817 < 500) {
                    this.field809[this.field817] = class61.field717;
                    this.field813[this.field817] = class61.field715;
                    this.field817++;
                }
            }
            class204.method12(50L);
        }
    }
}
