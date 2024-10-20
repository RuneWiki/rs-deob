package deob;

@ObfuscatedName("f")
public class class14 implements Runnable {

    @ObfuscatedName("f.n")
    public boolean field194 = true;

    @ObfuscatedName("f.d")
    public Object field195 = new Object();

    @ObfuscatedName("f.s")
    public int field189 = 0;

    @ObfuscatedName("f.q")
    public int[] field190 = new int[500];

    @ObfuscatedName("f.j")
    public int[] field191 = new int[500];

    public void run() {
        while (this.field194) {
            Object var1 = this.field195;
            synchronized (this.field195) {
                if (this.field189 < 500) {
                    this.field190[this.field189] = class140.field2131;
                    this.field191[this.field189] = class140.field2142;
                    this.field189++;
                }
            }
            class127.method1160(50L);
        }
    }
}
