package deob;

@ObfuscatedName("lh")
public class class325 {

    @ObfuscatedName("lh.n")
    public long field3882 = -1L;

    @ObfuscatedName("lh.c")
    public long field3881 = -1L;

    @ObfuscatedName("lh.m")
    public boolean field3890 = false;

    @ObfuscatedName("lh.k")
    public long field3883 = 0L;

    @ObfuscatedName("lh.o")
    public long field3884 = 0L;

    @ObfuscatedName("lh.g")
    public long field3886 = 0L;

    @ObfuscatedName("lh.z")
    public int field3888 = 0;

    @ObfuscatedName("lh.a")
    public int field3887 = 0;

    @ObfuscatedName("lh.u")
    public int field3885 = 0;

    @ObfuscatedName("lh.e")
    public int field3889 = 0;

    @ObfuscatedName("lh.n(I)V")
    public void method5348() {
        this.field3882 = class397.method3986();
    }

    @ObfuscatedName("lh.c(S)V")
    public void method5349() {
        if (this.field3882 != -1L) {
            this.field3884 = class397.method3986() - this.field3882;
            this.field3882 = -1L;
        }
    }

    @ObfuscatedName("lh.m(II)V")
    public void method5354(int arg0) {
        this.field3881 = class397.method3986();
        this.field3888 = arg0;
    }

    @ObfuscatedName("lh.k(I)V")
    public void method5351() {
        if (this.field3881 != -1L) {
            this.field3883 = class397.method3986() - this.field3881;
            this.field3881 = -1L;
        }
        this.field3885++;
        this.field3890 = true;
    }

    @ObfuscatedName("lh.o(I)V")
    public void method5352() {
        this.field3890 = false;
        this.field3887 = 0;
    }

    @ObfuscatedName("lh.g(I)V")
    public void method5353() {
        this.method5351();
    }

    @ObfuscatedName("lh.z(Lot;I)V")
    public void method5360(class400 arg0) {
        method2314(arg0, this.field3884);
        method2314(arg0, this.field3883);
        method2314(arg0, this.field3886);
        arg0.method6311(this.field3888);
        arg0.method6311(this.field3887);
        arg0.method6311(this.field3885);
        arg0.method6311(this.field3889);
    }

    @ObfuscatedName("ds.a(Lot;J)V")
    public static void method2314(class400 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method6311((int) var3);
    }
}
