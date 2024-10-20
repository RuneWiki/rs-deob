package deob;

@ObfuscatedName("jg")
public class class281 {

    @ObfuscatedName("jg.w")
    public long field3624 = -1L;

    @ObfuscatedName("jg.m")
    public long field3615 = -1L;

    @ObfuscatedName("jg.q")
    public boolean field3617 = false;

    @ObfuscatedName("jg.b")
    public long field3618 = 0L;

    @ObfuscatedName("jg.f")
    public long field3619 = 0L;

    @ObfuscatedName("jg.n")
    public long field3620 = 0L;

    @ObfuscatedName("jg.h")
    public int field3621 = 0;

    @ObfuscatedName("jg.x")
    public int field3622 = 0;

    @ObfuscatedName("jg.j")
    public int field3623 = 0;

    @ObfuscatedName("jg.a")
    public int field3625 = 0;

    @ObfuscatedName("jg.w(I)V")
    public void method4866() {
        this.field3624 = class185.method3151();
    }

    @ObfuscatedName("jg.m(I)V")
    public void method4867() {
        if (this.field3624 != -1L) {
            this.field3619 = class185.method3151() - this.field3624;
            this.field3624 = -1L;
        }
    }

    @ObfuscatedName("jg.q(II)V")
    public void method4868(int arg0) {
        this.field3615 = class185.method3151();
        this.field3621 = arg0;
    }

    @ObfuscatedName("jg.x(I)V")
    public void method4870() {
        if (this.field3615 != -1L) {
            this.field3618 = class185.method3151() - this.field3615;
            this.field3615 = -1L;
        }
        this.field3623++;
        this.field3617 = true;
    }

    @ObfuscatedName("jg.j(I)V")
    public void method4865() {
        this.field3617 = false;
        this.field3622 = 0;
    }

    @ObfuscatedName("jg.a(B)V")
    public void method4871() {
        this.method4870();
    }

    @ObfuscatedName("jg.l(Lgy;I)V")
    public void method4872(class183 arg0) {
        long var2 = this.field3619;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3296((int) var4);
        long var6 = this.field3618;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3296((int) var8);
        long var10 = this.field3620;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3296((int) var12);
        arg0.method3296(this.field3621);
        arg0.method3296(this.field3622);
        arg0.method3296(this.field3623);
        arg0.method3296(this.field3625);
    }
}
