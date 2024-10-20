package deob;

@ObfuscatedName("jr")
public class class283 {

    @ObfuscatedName("jr.n")
    public long field3621 = -1L;

    @ObfuscatedName("jr.v")
    public long field3612 = -1L;

    @ObfuscatedName("jr.d")
    public boolean field3617 = false;

    @ObfuscatedName("jr.c")
    public long field3615 = 0L;

    @ObfuscatedName("jr.y")
    public long field3613 = 0L;

    @ObfuscatedName("jr.h")
    public long field3616 = 0L;

    @ObfuscatedName("jr.z")
    public int field3618 = 0;

    @ObfuscatedName("jr.e")
    public int field3619 = 0;

    @ObfuscatedName("jr.q")
    public int field3614 = 0;

    @ObfuscatedName("jr.l")
    public int field3620 = 0;

    @ObfuscatedName("jr.n(B)V")
    public void method4812() {
        this.field3621 = class308.method1082();
    }

    @ObfuscatedName("jr.v(I)V")
    public void method4806() {
        if (this.field3621 != -1L) {
            this.field3613 = class308.method1082() - this.field3621;
            this.field3621 = -1L;
        }
    }

    @ObfuscatedName("jr.d(II)V")
    public void method4811(int arg0) {
        this.field3612 = class308.method1082();
        this.field3618 = arg0;
    }

    @ObfuscatedName("jr.c(B)V")
    public void method4798() {
        if (this.field3612 != -1L) {
            this.field3615 = class308.method1082() - this.field3612;
            this.field3612 = -1L;
        }
        this.field3614++;
        this.field3617 = true;
    }

    @ObfuscatedName("jr.y(I)V")
    public void method4799() {
        this.field3617 = false;
        this.field3619 = 0;
    }

    @ObfuscatedName("jr.h(I)V")
    public void method4800() {
        this.method4798();
    }

    @ObfuscatedName("jr.z(Lkx;S)V")
    public void method4801(class311 arg0) {
        long var2 = this.field3613;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5229((int) var4);
        long var6 = this.field3615;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5229((int) var8);
        long var10 = this.field3616;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5229((int) var12);
        arg0.method5229(this.field3618);
        arg0.method5229(this.field3619);
        arg0.method5229(this.field3614);
        arg0.method5229(this.field3620);
    }
}
