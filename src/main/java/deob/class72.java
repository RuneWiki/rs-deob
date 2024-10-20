package deob;

@ObfuscatedName("bg")
public class class72 implements Runnable {

    @ObfuscatedName("bg.n")
    public boolean field850 = true;

    @ObfuscatedName("bg.p")
    public Object field849 = new Object();

    @ObfuscatedName("bg.i")
    public int field845 = 0;

    @ObfuscatedName("bg.j")
    public int[] field848 = new int[500];

    @ObfuscatedName("bg.f")
    public int[] field847 = new int[500];

    public void run() {
        while (this.field850) {
            Object var1 = this.field849;
            synchronized (this.field849) {
                if (this.field845 < 500) {
                    this.field848[this.field845] = class60.field730;
                    this.field847[this.field845] = class60.field716 * 1327680731;
                    this.field845++;
                }
            }
            class182.method1713(50L);
        }
    }
}
