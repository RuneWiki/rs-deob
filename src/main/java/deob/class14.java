package deob;

@ObfuscatedName("e")
public class class14 implements Runnable {

    @ObfuscatedName("e.k")
    public boolean field195 = true;

    @ObfuscatedName("e.h")
    public Object field190 = new Object();

    @ObfuscatedName("e.o")
    public int field200 = 0;

    @ObfuscatedName("e.z")
    public int[] field191 = new int[500];

    @ObfuscatedName("e.c")
    public int[] field193 = new int[500];

    public void run() {
        while (this.field195) {
            Object var1 = this.field190;
            synchronized (this.field190) {
                if (this.field200 < 500) {
                    this.field191[this.field200] = class140.field2120;
                    this.field193[this.field200] = class140.field2121 * -566087441;
                    this.field200++;
                }
            }
            class127.method890(50L);
        }
    }
}
