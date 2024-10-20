package deob;

@ObfuscatedName("jp")
public class class286 {

    @ObfuscatedName("jp.n")
    public long field3671 = -1L;

    @ObfuscatedName("jp.h")
    public long field3667 = -1L;

    @ObfuscatedName("jp.l")
    public boolean field3669 = false;

    @ObfuscatedName("jp.g")
    public long field3670 = 0L;

    @ObfuscatedName("jp.b")
    public long field3668 = 0L;

    @ObfuscatedName("jp.a")
    public long field3672 = 0L;

    @ObfuscatedName("jp.c")
    public int field3673 = 0;

    @ObfuscatedName("jp.z")
    public int field3676 = 0;

    @ObfuscatedName("jp.j")
    public int field3675 = 0;

    @ObfuscatedName("jp.d")
    public int field3678 = 0;

    @ObfuscatedName("jp.n(I)V")
    public void method5080() {
        this.field3671 = class192.method81();
    }

    @ObfuscatedName("jp.h(I)V")
    public void method5081() {
        if (this.field3671 != -1L) {
            this.field3668 = class192.method81() - this.field3671;
            this.field3671 = -1L;
        }
    }

    @ObfuscatedName("jp.l(II)V")
    public void method5089(int arg0) {
        this.field3667 = class192.method81();
        this.field3673 = arg0;
    }

    @ObfuscatedName("jp.g(I)V")
    public void method5083() {
        if (this.field3667 != -1L) {
            this.field3670 = class192.method81() - this.field3667;
            this.field3667 = -1L;
        }
        this.field3675++;
        this.field3669 = true;
    }

    @ObfuscatedName("jp.b(B)V")
    public void method5084() {
        this.field3669 = false;
        this.field3676 = 0;
    }

    @ObfuscatedName("jp.a(I)V")
    public void method5105() {
        this.method5083();
    }

    @ObfuscatedName("jp.c(Lgc;I)V")
    public void method5086(class190 arg0) {
        long var2 = this.field3668;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3508((int) var4);
        long var6 = this.field3670;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3508((int) var8);
        long var10 = this.field3672;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3508((int) var12);
        arg0.method3508(this.field3673);
        arg0.method3508(this.field3676);
        arg0.method3508(this.field3675);
        arg0.method3508(this.field3678);
    }
}
