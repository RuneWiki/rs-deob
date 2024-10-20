package deob;

@ObfuscatedName("jy")
public class class276 {

    @ObfuscatedName("jy.d")
    public long field3734 = -1L;

    @ObfuscatedName("jy.k")
    public long field3739 = -1L;

    @ObfuscatedName("jy.e")
    public boolean field3736 = false;

    @ObfuscatedName("jy.p")
    public long field3735 = 0L;

    @ObfuscatedName("jy.q")
    public long field3740 = 0L;

    @ObfuscatedName("jy.s")
    public long field3738 = 0L;

    @ObfuscatedName("jy.r")
    public int field3737 = 0;

    @ObfuscatedName("jy.g")
    public int field3741 = 0;

    @ObfuscatedName("jy.v")
    public int field3742 = 0;

    @ObfuscatedName("jy.t")
    public int field3743 = 0;

    @ObfuscatedName("jy.d(I)V")
    public void method4634() {
        this.field3734 = class176.method2725();
    }

    @ObfuscatedName("jy.k(B)V")
    public void method4626() {
        if (this.field3734 != -1L) {
            this.field3740 = class176.method2725() - this.field3734;
            this.field3734 = -1L;
        }
    }

    @ObfuscatedName("jy.e(II)V")
    public void method4624(int arg0) {
        this.field3739 = class176.method2725();
        this.field3737 = arg0;
    }

    @ObfuscatedName("jy.p(I)V")
    public void method4628() {
        if (this.field3739 != -1L) {
            this.field3735 = class176.method2725() - this.field3739;
            this.field3739 = -1L;
        }
        this.field3742++;
        this.field3736 = true;
    }

    @ObfuscatedName("jy.q(B)V")
    public void method4629() {
        this.field3736 = false;
        this.field3741 = 0;
    }

    @ObfuscatedName("jy.s(I)V")
    public void method4647() {
        this.method4628();
    }

    @ObfuscatedName("jy.r(Lfg;B)V")
    public void method4631(class174 arg0) {
        method3214(arg0, this.field3740);
        method3214(arg0, this.field3735);
        method3214(arg0, this.field3738);
        arg0.method2940(this.field3737);
        arg0.method2940(this.field3741);
        arg0.method2940(this.field3742);
        arg0.method2940(this.field3743);
    }

    @ObfuscatedName("fd.g(Lfg;J)V")
    public static void method3214(class174 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method2940((int) var3);
    }
}
