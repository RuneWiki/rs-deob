package deob;

@ObfuscatedName("n")
public class class14 implements Runnable {

    @ObfuscatedName("n.s")
    public boolean field190 = true;

    @ObfuscatedName("n.z")
    public Object field186 = new Object();

    @ObfuscatedName("n.t")
    public int field188 = 0;

    @ObfuscatedName("n.y")
    public int[] field187 = new int[500];

    @ObfuscatedName("n.p")
    public int[] field189 = new int[500];

    public void run() {
        while (this.field190) {
            Object var1 = this.field186;
            synchronized (this.field186) {
                if (this.field188 < 500) {
                    this.field187[this.field188] = class144.field2193;
                    this.field189[this.field188] = class144.field2190;
                    this.field188++;
                }
            }
            class131.method182(50L);
        }
    }
}
