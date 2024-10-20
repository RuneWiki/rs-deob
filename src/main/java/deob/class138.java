package deob;

@ObfuscatedName("cx")
public class class138 extends class113 {

    @ObfuscatedName("cx.j")
    public long field2033 = System.nanoTime();

    @ObfuscatedName("cx.j(I)V")
    public void method1933() {
        this.field2033 = System.nanoTime();
    }

    @ObfuscatedName("cx.p(III)I")
    public int method1934(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2033 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class30.method1166(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2033 < var7)) {
            var9++;
            this.field2033 += (long) arg0 * 1000000L;
        }
        if (this.field2033 < var7) {
            this.field2033 = var7;
        }
        return var9;
    }
}
