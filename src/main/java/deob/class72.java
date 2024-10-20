package deob;

@ObfuscatedName("bb")
public class class72 implements Runnable {

    @ObfuscatedName("bb.d")
    public boolean field837 = true;

    @ObfuscatedName("bb.q")
    public Object field840 = new Object();

    @ObfuscatedName("bb.x")
    public int field838 = 0;

    @ObfuscatedName("bb.y")
    public int[] field839 = new int[500];

    @ObfuscatedName("bb.e")
    public int[] field842 = new int[500];

    public void run() {
        while (this.field837) {
            Object var1 = this.field840;
            synchronized (this.field840) {
                if (this.field838 < 500) {
                    this.field839[this.field838] = class60.field697;
                    this.field842[this.field838] = class60.field706 * -119379047;
                    this.field838++;
                }
            }
            class182.method2253(50L);
        }
    }
}
