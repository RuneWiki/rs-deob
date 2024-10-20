package deob;

@ObfuscatedName("e")
public class class14 implements Runnable {

    @ObfuscatedName("e.o")
    public boolean field203 = true;

    @ObfuscatedName("e.f")
    public Object field199 = new Object();

    @ObfuscatedName("e.i")
    public int field200 = 0;

    @ObfuscatedName("e.h")
    public int[] field201 = new int[500];

    @ObfuscatedName("e.q")
    public int[] field212 = new int[500];

    public void run() {
        while (this.field203) {
            Object var1 = this.field199;
            synchronized (this.field199) {
                if (this.field200 < 500) {
                    this.field201[this.field200] = class140.field2150;
                    this.field212[this.field200] = class140.field2139 * -432201367;
                    this.field200++;
                }
            }
            class127.method16(50L);
        }
    }
}
