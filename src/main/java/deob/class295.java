package deob;

@ObfuscatedName("ka")
public class class295 {

    @ObfuscatedName("ka.c")
    public long field3814 = -1L;

    @ObfuscatedName("ka.i")
    public long field3815 = -1L;

    @ObfuscatedName("ka.o")
    public boolean field3817 = false;

    @ObfuscatedName("ka.j")
    public long field3813 = 0L;

    @ObfuscatedName("ka.k")
    public long field3810 = 0L;

    @ObfuscatedName("ka.x")
    public long field3812 = 0L;

    @ObfuscatedName("ka.z")
    public int field3816 = 0;

    @ObfuscatedName("ka.p")
    public int field3811 = 0;

    @ObfuscatedName("ka.w")
    public int field3818 = 0;

    @ObfuscatedName("ka.r")
    public int field3819 = 0;

    @ObfuscatedName("ka.c(B)V")
    public void method4834() {
        this.field3814 = class197.method26();
    }

    @ObfuscatedName("ka.i(I)V")
    public void method4835() {
        if (this.field3814 != -1L) {
            this.field3810 = class197.method26() - this.field3814;
            this.field3814 = -1L;
        }
    }

    @ObfuscatedName("ka.o(II)V")
    public void method4836(int arg0) {
        this.field3815 = class197.method26();
        this.field3816 = arg0;
    }

    @ObfuscatedName("ka.j(I)V")
    public void method4837() {
        if (this.field3815 != -1L) {
            this.field3813 = class197.method26() - this.field3815;
            this.field3815 = -1L;
        }
        this.field3818++;
        this.field3817 = true;
    }

    @ObfuscatedName("ka.k(B)V")
    public void method4838() {
        this.field3817 = false;
        this.field3811 = 0;
    }

    @ObfuscatedName("ka.x(I)V")
    public void method4853() {
        this.method4837();
    }

    @ObfuscatedName("ka.z(Lgp;I)V")
    public void method4840(class195 arg0) {
        long var2 = this.field3810;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3210((int) var4);
        long var6 = this.field3813;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3210((int) var8);
        long var10 = this.field3812;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3210((int) var12);
        arg0.method3210(this.field3816);
        arg0.method3210(this.field3811);
        arg0.method3210(this.field3818);
        arg0.method3210(this.field3819);
    }
}
