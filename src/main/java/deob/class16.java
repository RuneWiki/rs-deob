package deob;

@ObfuscatedName("l")
public class class16 implements Runnable {

    @ObfuscatedName("l.b")
    public boolean field272 = true;

    @ObfuscatedName("l.c")
    public Object field269 = new Object();

    @ObfuscatedName("l.j")
    public int field270 = 0;

    @ObfuscatedName("l.i")
    public int[] field271 = new int[500];

    @ObfuscatedName("l.k")
    public int[] field268 = new int[500];

    public void run() {
        while (this.field272) {
            Object var1 = this.field269;
            synchronized (this.field269) {
                if (this.field270 < 500) {
                    this.field271[this.field270] = class77.field1410;
                    this.field268[this.field270] = class77.field1411;
                    this.field270++;
                }
            }
            class126.method874(50L);
        }
    }
}
