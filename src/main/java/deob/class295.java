package deob;

@ObfuscatedName("ky")
public class class295 {

    @ObfuscatedName("ky.d")
    public long field3816 = -1L;

    @ObfuscatedName("ky.z")
    public long field3817 = -1L;

    @ObfuscatedName("ky.n")
    public boolean field3814 = false;

    @ObfuscatedName("ky.r")
    public long field3812 = 0L;

    @ObfuscatedName("ky.e")
    public long field3821 = 0L;

    @ObfuscatedName("ky.y")
    public long field3815 = 0L;

    @ObfuscatedName("ky.k")
    public int field3818 = 0;

    @ObfuscatedName("ky.s")
    public int field3819 = 0;

    @ObfuscatedName("ky.p")
    public int field3820 = 0;

    @ObfuscatedName("ky.x")
    public int field3813 = 0;

    @ObfuscatedName("ky.d(I)V")
    public void method4907() {
        this.field3816 = class197.method1501();
    }

    @ObfuscatedName("ky.z(B)V")
    public void method4933() {
        if (this.field3816 != -1L) {
            this.field3821 = class197.method1501() - this.field3816;
            this.field3816 = -1L;
        }
    }

    @ObfuscatedName("ky.n(IB)V")
    public void method4909(int arg0) {
        this.field3817 = class197.method1501();
        this.field3818 = arg0;
    }

    @ObfuscatedName("ky.r(I)V")
    public void method4910() {
        if (this.field3817 != -1L) {
            this.field3812 = class197.method1501() - this.field3817;
            this.field3817 = -1L;
        }
        this.field3820++;
        this.field3814 = true;
    }

    @ObfuscatedName("ky.e(I)V")
    public void method4912() {
        this.field3814 = false;
        this.field3819 = 0;
    }

    @ObfuscatedName("ky.y(B)V")
    public void method4932() {
        this.method4910();
    }

    @ObfuscatedName("ky.k(Lgy;B)V")
    public void method4913(class195 arg0) {
        method3031(arg0, this.field3821);
        method3031(arg0, this.field3812);
        method3031(arg0, this.field3815);
        arg0.method3360(this.field3818);
        arg0.method3360(this.field3819);
        arg0.method3360(this.field3820);
        arg0.method3360(this.field3813);
    }

    @ObfuscatedName("fv.s(Lgy;J)V")
    public static void method3031(class195 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3360((int) var3);
    }
}
