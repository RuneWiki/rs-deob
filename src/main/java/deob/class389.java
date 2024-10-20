package deob;

@ObfuscatedName("or")
public class class389 {

    @ObfuscatedName("or.af")
    public long field4486 = -1L;

    @ObfuscatedName("or.an")
    public long field4485 = -1L;

    @ObfuscatedName("or.aw")
    public boolean field4484 = false;

    @ObfuscatedName("or.ac")
    public long field4487 = 0L;

    @ObfuscatedName("or.au")
    public long field4488 = 0L;

    @ObfuscatedName("or.ab")
    public long field4489 = 0L;

    @ObfuscatedName("or.aq")
    public int field4490 = 0;

    @ObfuscatedName("or.al")
    public int field4491 = 0;

    @ObfuscatedName("or.at")
    public int field4492 = 0;

    @ObfuscatedName("or.aa")
    public int field4493 = 0;

    @ObfuscatedName("or.af(I)V")
    public void method6952() {
        this.field4486 = class294.method2504();
    }

    @ObfuscatedName("or.an(I)V")
    public void method6963() {
        if (this.field4486 != -1L) {
            this.field4488 = class294.method2504() - this.field4486;
            this.field4486 = -1L;
        }
    }

    @ObfuscatedName("or.aw(IB)V")
    public void method6953(int arg0) {
        this.field4485 = class294.method2504();
        this.field4490 = arg0;
    }

    @ObfuscatedName("or.ac(I)V")
    public void method6954() {
        if (this.field4485 != -1L) {
            this.field4487 = class294.method2504() - this.field4485;
            this.field4485 = -1L;
        }
        this.field4492++;
        this.field4484 = true;
    }

    @ObfuscatedName("or.au(B)V")
    public void method6955() {
        this.field4484 = false;
        this.field4491 = 0;
    }

    @ObfuscatedName("or.ab(I)V")
    public void method6956() {
        this.method6954();
    }

    @ObfuscatedName("or.aq(Lsg;I)V")
    public void method6957(class489 arg0) {
        long var2 = this.field4488;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8232((int) var4);
        long var6 = this.field4487;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8232((int) var8);
        long var10 = this.field4489;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8232((int) var12);
        arg0.method8232(this.field4490);
        arg0.method8232(this.field4491);
        arg0.method8232(this.field4492);
        arg0.method8232(this.field4493);
    }
}
