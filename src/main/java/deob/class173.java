package deob;

@ObfuscatedName("fy")
public class class173 extends class180 {

    @ObfuscatedName("fy.z")
    public long field2053 = System.nanoTime();

    @ObfuscatedName("fy.z(I)V")
    public void method3268() {
        this.field2053 = System.nanoTime();
    }

    @ObfuscatedName("fy.k(III)I")
    public int method3269(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2053 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class308.method3834(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2053 < var7)) {
            var9++;
            this.field2053 += (long) arg0 * 1000000L;
        }
        if (this.field2053 < var7) {
            this.field2053 = var7;
        }
        return var9;
    }
}
