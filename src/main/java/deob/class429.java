package deob;

@ObfuscatedName("qq")
public class class429 {

    @ObfuscatedName("qq.ac")
    public long field4610 = -1L;

    @ObfuscatedName("qq.al")
    public long field4611 = -1L;

    @ObfuscatedName("qq.ak")
    public boolean field4618 = false;

    @ObfuscatedName("qq.ax")
    public long field4613 = 0L;

    @ObfuscatedName("qq.ao")
    public long field4614 = 0L;

    @ObfuscatedName("qq.ah")
    public long field4612 = 0L;

    @ObfuscatedName("qq.ar")
    public int field4616 = 0;

    @ObfuscatedName("qq.ab")
    public int field4617 = 0;

    @ObfuscatedName("qq.am")
    public int field4615 = 0;

    @ObfuscatedName("qq.av")
    public int field4619 = 0;

    @ObfuscatedName("qq.ac(I)V")
    public void method7132() {
        this.field4610 = class316.method6401();
    }

    @ObfuscatedName("qq.al(B)V")
    public void method7136() {
        if (this.field4610 != -1L) {
            this.field4614 = class316.method6401() - this.field4610;
            this.field4610 = -1L;
        }
    }

    @ObfuscatedName("qq.ak(IB)V")
    public void method7133(int arg0) {
        this.field4611 = class316.method6401();
        this.field4616 = arg0;
    }

    @ObfuscatedName("qq.ax(I)V")
    public void method7134() {
        if (this.field4611 != -1L) {
            this.field4613 = class316.method6401() - this.field4611;
            this.field4611 = -1L;
        }
        this.field4615++;
        this.field4618 = true;
    }

    @ObfuscatedName("qq.ao(I)V")
    public void method7135() {
        this.field4618 = false;
        this.field4617 = 0;
    }

    @ObfuscatedName("qq.ah(I)V")
    public void method7137() {
        this.method7134();
    }

    @ObfuscatedName("qq.ar(Lul;I)V")
    public void method7131(class530 arg0) {
        long var2 = this.field4614;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8349((int) var4);
        long var6 = this.field4613;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8349((int) var8);
        long var10 = this.field4612;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8349((int) var12);
        arg0.method8349(this.field4616);
        arg0.method8349(this.field4617);
        arg0.method8349(this.field4615);
        arg0.method8349(this.field4619);
    }
}
