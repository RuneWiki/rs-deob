package deob;

@ObfuscatedName("jj")
public class class276 {

    @ObfuscatedName("jj.w")
    public long field3735 = -1L;

    @ObfuscatedName("jj.s")
    public long field3732 = -1L;

    @ObfuscatedName("jj.q")
    public boolean field3733 = false;

    @ObfuscatedName("jj.o")
    public long field3734 = 0L;

    @ObfuscatedName("jj.g")
    public long field3731 = 0L;

    @ObfuscatedName("jj.v")
    public long field3740 = 0L;

    @ObfuscatedName("jj.p")
    public int field3741 = 0;

    @ObfuscatedName("jj.e")
    public int field3738 = 0;

    @ObfuscatedName("jj.d")
    public int field3739 = 0;

    @ObfuscatedName("jj.x")
    public int field3737 = 0;

    @ObfuscatedName("jj.w(B)V")
    public void method4650() {
        this.field3735 = class176.method3200();
    }

    @ObfuscatedName("jj.s(I)V")
    public void method4654() {
        if (this.field3735 != -1L) {
            this.field3731 = class176.method3200() - this.field3735;
            this.field3735 = -1L;
        }
    }

    @ObfuscatedName("jj.q(IB)V")
    public void method4652(int arg0) {
        this.field3732 = class176.method3200();
        this.field3741 = arg0;
    }

    @ObfuscatedName("jj.o(I)V")
    public void method4653() {
        if (this.field3732 != -1L) {
            this.field3734 = class176.method3200() - this.field3732;
            this.field3732 = -1L;
        }
        this.field3739++;
        this.field3733 = true;
    }

    @ObfuscatedName("jj.g(B)V")
    public void method4668() {
        this.field3733 = false;
        this.field3738 = 0;
    }

    @ObfuscatedName("jj.v(B)V")
    public void method4655() {
        this.method4653();
    }

    @ObfuscatedName("jj.p(Lfz;I)V")
    public void method4656(class174 arg0) {
        long var2 = this.field3731;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method2956((int) var4);
        long var6 = this.field3734;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method2956((int) var8);
        long var10 = this.field3740;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method2956((int) var12);
        arg0.method2956(this.field3741);
        arg0.method2956(this.field3738);
        arg0.method2956(this.field3739);
        arg0.method2956(this.field3737);
    }
}
