package deob;

@ObfuscatedName("r")
public class class16 implements Runnable {

    @ObfuscatedName("r.p")
    public boolean field243 = true;

    @ObfuscatedName("r.e")
    public Object field247 = new Object();

    @ObfuscatedName("r.a")
    public int field240 = 0;

    @ObfuscatedName("r.h")
    public int[] field241 = new int[500];

    @ObfuscatedName("r.y")
    public int[] field238 = new int[500];

    public void run() {
        while (this.field243) {
            Object var1 = this.field247;
            synchronized (this.field247) {
                if (this.field240 < 500) {
                    this.field241[this.field240] = class77.field1396;
                    this.field238[this.field240] = class77.field1397;
                    this.field240++;
                }
            }
            class126.method47(50L);
        }
    }
}
