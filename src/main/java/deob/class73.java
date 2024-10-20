package deob;

@ObfuscatedName("bf")
public class class73 implements Runnable {

    @ObfuscatedName("bf.j")
    public boolean field878 = true;

    @ObfuscatedName("bf.h")
    public Object field876 = new Object();

    @ObfuscatedName("bf.f")
    public int field877 = 0;

    @ObfuscatedName("bf.p")
    public int[] field879 = new int[500];

    @ObfuscatedName("bf.x")
    public int[] field875 = new int[500];

    public void run() {
        while (this.field878) {
            Object var1 = this.field876;
            synchronized (this.field876) {
                if (this.field877 < 500) {
                    this.field879[this.field877] = class60.field735;
                    this.field875[this.field877] = class60.field736 * -261504029;
                    this.field877++;
                }
            }
            class183.method40(50L);
        }
    }
}
