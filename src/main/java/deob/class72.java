package deob;

@ObfuscatedName("bl")
public class class72 implements Runnable {

    @ObfuscatedName("bl.p")
    public boolean field841 = true;

    @ObfuscatedName("bl.m")
    public Object field842 = new Object();

    @ObfuscatedName("bl.e")
    public int field844 = 0;

    @ObfuscatedName("bl.t")
    public int[] field843 = new int[500];

    @ObfuscatedName("bl.w")
    public int[] field845 = new int[500];

    public void run() {
        while (this.field841) {
            Object var1 = this.field842;
            synchronized (this.field842) {
                if (this.field844 < 500) {
                    this.field843[this.field844] = class60.field731;
                    this.field845[this.field844] = class60.field732 * -417192073;
                    this.field844++;
                }
            }
            class182.method2791(50L);
        }
    }
}
