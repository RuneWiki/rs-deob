package deob;

@ObfuscatedName("i")
public class class14 implements Runnable {

    @ObfuscatedName("i.a")
    public boolean field214 = true;

    @ObfuscatedName("i.w")
    public Object field207 = new Object();

    @ObfuscatedName("i.d")
    public int field209 = 0;

    @ObfuscatedName("i.c")
    public int[] field213 = new int[500];

    @ObfuscatedName("i.y")
    public int[] field210 = new int[500];

    public void run() {
        while (this.field214) {
            Object var1 = this.field207;
            synchronized (this.field207) {
                if (this.field209 < 500) {
                    this.field213[this.field209] = class141.field2152;
                    this.field210[this.field209] = class141.field2162;
                    this.field209++;
                }
            }
            class128.method56(50L);
        }
    }
}
