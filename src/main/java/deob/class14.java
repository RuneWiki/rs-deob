package deob;

@ObfuscatedName("j")
public class class14 implements Runnable {

    @ObfuscatedName("j.a")
    public boolean field198 = true;

    @ObfuscatedName("j.d")
    public Object field188 = new Object();

    @ObfuscatedName("j.v")
    public int field197 = 0;

    @ObfuscatedName("j.r")
    public int[] field190 = new int[500];

    @ObfuscatedName("j.z")
    public int[] field191 = new int[500];

    public void run() {
        while (this.field198) {
            Object var1 = this.field188;
            synchronized (this.field188) {
                if (this.field197 < 500) {
                    this.field190[this.field197] = class144.field2226;
                    this.field191[this.field197] = class144.field2223 * 672137893;
                    this.field197++;
                }
            }
            class131.method674(50L);
        }
    }
}
