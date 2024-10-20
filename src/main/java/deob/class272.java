package deob;

@ObfuscatedName("jd")
public class class272 {

    @ObfuscatedName("jd.z")
    public long field3562 = -1L;

    @ObfuscatedName("jd.n")
    public long field3563 = -1L;

    @ObfuscatedName("jd.v")
    public boolean field3564 = false;

    @ObfuscatedName("jd.u")
    public long field3565 = 0L;

    @ObfuscatedName("jd.r")
    public long field3566 = 0L;

    @ObfuscatedName("jd.p")
    public long field3567 = 0L;

    @ObfuscatedName("jd.q")
    public int field3568 = 0;

    @ObfuscatedName("jd.m")
    public int field3569 = 0;

    @ObfuscatedName("jd.y")
    public int field3570 = 0;

    @ObfuscatedName("jd.i")
    public int field3571 = 0;

    @ObfuscatedName("jd.z(B)V")
    public void method4528() {
        this.field3562 = class297.method502();
    }

    @ObfuscatedName("jd.n(B)V")
    public void method4529() {
        if (this.field3562 != -1L) {
            this.field3566 = class297.method502() - this.field3562;
            this.field3562 = -1L;
        }
    }

    @ObfuscatedName("jd.v(II)V")
    public void method4530(int arg0) {
        this.field3563 = class297.method502();
        this.field3568 = arg0;
    }

    @ObfuscatedName("jd.u(I)V")
    public void method4531() {
        if (this.field3563 != -1L) {
            this.field3565 = class297.method502() - this.field3563;
            this.field3563 = -1L;
        }
        this.field3570++;
        this.field3564 = true;
    }

    @ObfuscatedName("jd.r(I)V")
    public void method4532() {
        this.field3564 = false;
        this.field3569 = 0;
    }

    @ObfuscatedName("jd.p(I)V")
    public void method4533() {
        this.method4531();
    }

    @ObfuscatedName("jd.q(Lkl;I)V")
    public void method4534(class300 arg0) {
        long var2 = this.field3566;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method4975((int) var4);
        long var6 = this.field3565;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method4975((int) var8);
        long var10 = this.field3567;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method4975((int) var12);
        arg0.method4975(this.field3568);
        arg0.method4975(this.field3569);
        arg0.method4975(this.field3570);
        arg0.method4975(this.field3571);
    }
}
