package deob;

@ObfuscatedName("y")
public class class16 implements Runnable {

    @ObfuscatedName("y.l")
    public boolean field241 = true;

    @ObfuscatedName("y.b")
    public Object field236 = new Object();

    @ObfuscatedName("y.o")
    public int field237 = 0;

    @ObfuscatedName("y.w")
    public int[] field238 = new int[500];

    @ObfuscatedName("y.r")
    public int[] field239 = new int[500];

    public void run() {
        while (this.field241) {
            Object var1 = this.field236;
            synchronized (this.field236) {
                if (this.field237 < 500) {
                    this.field238[this.field237] = class77.field1378;
                    this.field239[this.field237] = class77.field1379 * -1108917615;
                    this.field237++;
                }
            }
            class126.method46(50L);
        }
    }
}
