package deob;

@ObfuscatedName("s")
public class class88 implements Runnable {

    @ObfuscatedName("s.o")
    public int field1033 = 0;

    @ObfuscatedName("s.j")
    public boolean field1042 = true;

    @ObfuscatedName("s.h")
    public int[] field1035 = new int[500];

    @ObfuscatedName("s.t")
    public int[] field1036 = new int[500];

    @ObfuscatedName("s.p")
    public Object field1037 = new Object();

    public void run() {
        while (this.field1042) {
            Object var1 = this.field1037;
            synchronized (this.field1037) {
                if (this.field1033 < 500) {
                    this.field1036[this.field1033] = class108.field1742;
                    this.field1035[this.field1033] = class108.field1743;
                    this.field1033++;
                }
            }
            class30.method1166(50L);
        }
    }
}
