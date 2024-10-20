package deob;

@ObfuscatedName("jx")
public class class272 {

    @ObfuscatedName("jx.f")
    public long field3561 = -1L;

    @ObfuscatedName("jx.i")
    public long field3555 = -1L;

    @ObfuscatedName("jx.y")
    public boolean field3556 = false;

    @ObfuscatedName("jx.w")
    public long field3557 = 0L;

    @ObfuscatedName("jx.p")
    public long field3560 = 0L;

    @ObfuscatedName("jx.b")
    public long field3559 = 0L;

    @ObfuscatedName("jx.e")
    public int field3563 = 0;

    @ObfuscatedName("jx.x")
    public int field3558 = 0;

    @ObfuscatedName("jx.a")
    public int field3562 = 0;

    @ObfuscatedName("jx.d")
    public int field3564 = 0;

    @ObfuscatedName("jx.f(I)V")
    public void method4624() {
        this.field3561 = class297.method481();
    }

    @ObfuscatedName("jx.i(I)V")
    public void method4633() {
        if (this.field3561 != -1L) {
            this.field3560 = class297.method481() - this.field3561;
            this.field3561 = -1L;
        }
    }

    @ObfuscatedName("jx.y(II)V")
    public void method4625(int arg0) {
        this.field3555 = class297.method481();
        this.field3563 = arg0;
    }

    @ObfuscatedName("jx.w(I)V")
    public void method4645() {
        if (this.field3555 != -1L) {
            this.field3557 = class297.method481() - this.field3555;
            this.field3555 = -1L;
        }
        this.field3562++;
        this.field3556 = true;
    }

    @ObfuscatedName("jx.p(I)V")
    public void method4647() {
        this.field3556 = false;
        this.field3558 = 0;
    }

    @ObfuscatedName("jx.b(I)V")
    public void method4628() {
        this.method4645();
    }

    @ObfuscatedName("jx.e(Lkq;I)V")
    public void method4629(class300 arg0) {
        method3351(arg0, this.field3560);
        method3351(arg0, this.field3557);
        method3351(arg0, this.field3559);
        arg0.method5095(this.field3563);
        arg0.method5095(this.field3558);
        arg0.method5095(this.field3562);
        arg0.method5095(this.field3564);
    }

    @ObfuscatedName("gt.x(Lkq;J)V")
    public static void method3351(class300 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5095((int) var3);
    }
}
