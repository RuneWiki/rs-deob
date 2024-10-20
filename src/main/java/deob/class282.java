package deob;

@ObfuscatedName("jy")
public class class282 {

    @ObfuscatedName("jy.m")
    public long field3614 = -1L;

    @ObfuscatedName("jy.o")
    public long field3613 = -1L;

    @ObfuscatedName("jy.q")
    public boolean field3619 = false;

    @ObfuscatedName("jy.j")
    public long field3612 = 0L;

    @ObfuscatedName("jy.p")
    public long field3618 = 0L;

    @ObfuscatedName("jy.g")
    public long field3610 = 0L;

    @ObfuscatedName("jy.n")
    public int field3615 = 0;

    @ObfuscatedName("jy.u")
    public int field3616 = 0;

    @ObfuscatedName("jy.a")
    public int field3617 = 0;

    @ObfuscatedName("jy.z")
    public int field3611 = 0;

    @ObfuscatedName("jy.m(I)V")
    public void method4726() {
        this.field3614 = class307.method3253();
    }

    @ObfuscatedName("jy.o(I)V")
    public void method4725() {
        if (this.field3614 != -1L) {
            this.field3618 = class307.method3253() - this.field3614;
            this.field3614 = -1L;
        }
    }

    @ObfuscatedName("jy.q(II)V")
    public void method4748(int arg0) {
        this.field3613 = class307.method3253();
        this.field3615 = arg0;
    }

    @ObfuscatedName("jy.j(B)V")
    public void method4742() {
        if (this.field3613 != -1L) {
            this.field3612 = class307.method3253() - this.field3613;
            this.field3613 = -1L;
        }
        this.field3617++;
        this.field3619 = true;
    }

    @ObfuscatedName("jy.p(I)V")
    public void method4729() {
        this.field3619 = false;
        this.field3616 = 0;
    }

    @ObfuscatedName("jy.g(I)V")
    public void method4730() {
        this.method4742();
    }

    @ObfuscatedName("jy.n(Lkn;I)V")
    public void method4727(class310 arg0) {
        method3332(arg0, this.field3618);
        method3332(arg0, this.field3612);
        method3332(arg0, this.field3610);
        arg0.method5387(this.field3615);
        arg0.method5387(this.field3616);
        arg0.method5387(this.field3617);
        arg0.method5387(this.field3611);
    }

    @ObfuscatedName("fh.u(Lkn;J)V")
    public static void method3332(class310 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5387((int) var3);
    }
}
