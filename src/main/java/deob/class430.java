package deob;

@ObfuscatedName("ql")
public class class430 {

    @ObfuscatedName("ql.am")
    public long field4638 = -1L;

    @ObfuscatedName("ql.ap")
    public long field4633 = -1L;

    @ObfuscatedName("ql.af")
    public boolean field4634 = false;

    @ObfuscatedName("ql.aj")
    public long field4635 = 0L;

    @ObfuscatedName("ql.aq")
    public long field4632 = 0L;

    @ObfuscatedName("ql.ar")
    public long field4637 = 0L;

    @ObfuscatedName("ql.ag")
    public int field4641 = 0;

    @ObfuscatedName("ql.ao")
    public int field4636 = 0;

    @ObfuscatedName("ql.ae")
    public int field4640 = 0;

    @ObfuscatedName("ql.aa")
    public int field4642 = 0;

    @ObfuscatedName("ql.am(S)V")
    public void method7347() {
        this.field4638 = Statics.method2852();
    }

    @ObfuscatedName("ql.ap(I)V")
    public void method7343() {
        if (this.field4638 != -1L) {
            this.field4632 = Statics.method2852() - this.field4638;
            this.field4638 = -1L;
        }
    }

    @ObfuscatedName("ql.af(II)V")
    public void method7344(int arg0) {
        this.field4633 = Statics.method2852();
        this.field4641 = arg0;
    }

    @ObfuscatedName("ql.aj(I)V")
    public void method7345() {
        if (this.field4633 != -1L) {
            this.field4635 = Statics.method2852() - this.field4633;
            this.field4633 = -1L;
        }
        this.field4640++;
        this.field4634 = true;
    }

    @ObfuscatedName("ql.aq(I)V")
    public void method7346() {
        this.field4634 = false;
        this.field4636 = 0;
    }

    @ObfuscatedName("ql.ar(S)V")
    public void method7341() {
        this.method7345();
    }

    @ObfuscatedName("ql.ag(Luk;I)V")
    public void method7342(class531 arg0) {
        long var2 = this.field4632;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8737((int) var4);
        long var6 = this.field4635;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8737((int) var8);
        long var10 = this.field4637;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8737((int) var12);
        arg0.method8737(this.field4641);
        arg0.method8737(this.field4636);
        arg0.method8737(this.field4640);
        arg0.method8737(this.field4642);
    }
}
