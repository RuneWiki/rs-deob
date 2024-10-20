package deob;

@ObfuscatedName("br")
public class class59 implements Runnable {

    @ObfuscatedName("br.c")
    public boolean field587 = true;

    @ObfuscatedName("br.q")
    public Object field581 = new Object();

    @ObfuscatedName("br.m")
    public int field582 = 0;

    @ObfuscatedName("br.j")
    public int[] field588 = new int[500];

    @ObfuscatedName("br.g")
    public int[] field584 = new int[500];

    @ObfuscatedName("br.i")
    public long[] field585 = new long[500];

    public void run() {
        while (this.field587) {
            Object var1 = this.field581;
            synchronized (this.field581) {
                if (this.field582 < 500) {
                    this.field588[this.field582] = class49.field466;
                    this.field584[this.field582] = class49.field468;
                    this.field585[this.field582] = class49.field465;
                    this.field582++;
                }
            }
            class194.method672(50L);
        }
    }
}
