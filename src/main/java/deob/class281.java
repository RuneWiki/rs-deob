package deob;

@ObfuscatedName("jb")
public class class281 {

    @ObfuscatedName("jb.z")
    public long field3600 = -1L;

    @ObfuscatedName("jb.w")
    public long field3599 = -1L;

    @ObfuscatedName("jb.s")
    public boolean field3598 = false;

    @ObfuscatedName("jb.l")
    public long field3601 = 0L;

    @ObfuscatedName("jb.u")
    public long field3602 = 0L;

    @ObfuscatedName("jb.q")
    public long field3603 = 0L;

    @ObfuscatedName("jb.k")
    public int field3605 = 0;

    @ObfuscatedName("jb.i")
    public int field3604 = 0;

    @ObfuscatedName("jb.x")
    public int field3606 = 0;

    @ObfuscatedName("jb.e")
    public int field3607 = 0;

    @ObfuscatedName("jb.z(B)V")
    public void method4850() {
        this.field3600 = class185.method3250();
    }

    @ObfuscatedName("jb.w(B)V")
    public void method4868() {
        if (this.field3600 != -1L) {
            this.field3602 = class185.method3250() - this.field3600;
            this.field3600 = -1L;
        }
    }

    @ObfuscatedName("jb.s(II)V")
    public void method4852(int arg0) {
        this.field3599 = class185.method3250();
        this.field3605 = arg0;
    }

    @ObfuscatedName("jb.l(I)V")
    public void method4853() {
        if (this.field3599 != -1L) {
            this.field3601 = class185.method3250() - this.field3599;
            this.field3599 = -1L;
        }
        this.field3606++;
        this.field3598 = true;
    }

    @ObfuscatedName("jb.u(I)V")
    public void method4854() {
        this.field3598 = false;
        this.field3604 = 0;
    }

    @ObfuscatedName("jb.q(I)V")
    public void method4855() {
        this.method4853();
    }

    @ObfuscatedName("jb.i(Lgk;B)V")
    public void method4851(class183 arg0) {
        long var2 = this.field3602;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3458((int) var4);
        long var6 = this.field3601;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3458((int) var8);
        long var10 = this.field3603;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3458((int) var12);
        arg0.method3458(this.field3605);
        arg0.method3458(this.field3604);
        arg0.method3458(this.field3606);
        arg0.method3458(this.field3607);
    }
}
