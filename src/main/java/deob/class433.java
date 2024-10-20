package deob;

@ObfuscatedName("qf")
public class class433 {

    @ObfuscatedName("qf.aq")
    public long field4677 = -1L;

    @ObfuscatedName("qf.aw")
    public long field4667 = -1L;

    @ObfuscatedName("qf.al")
    public boolean field4666 = false;

    @ObfuscatedName("qf.ai")
    public long field4669 = 0L;

    @ObfuscatedName("qf.ar")
    public long field4670 = 0L;

    @ObfuscatedName("qf.as")
    public long field4671 = 0L;

    @ObfuscatedName("qf.aa")
    public int field4672 = 0;

    @ObfuscatedName("qf.az")
    public int field4668 = 0;

    @ObfuscatedName("qf.ao")
    public int field4674 = 0;

    @ObfuscatedName("qf.au")
    public int field4673 = 0;

    @ObfuscatedName("qf.aq(S)V")
    public void method7375() {
        this.field4677 = class318.method2218();
    }

    @ObfuscatedName("qf.aw(B)V")
    public void method7357() {
        if (this.field4677 != -1L) {
            this.field4670 = class318.method2218() - this.field4677;
            this.field4677 = -1L;
        }
    }

    @ObfuscatedName("qf.al(IB)V")
    public void method7363(int arg0) {
        this.field4667 = class318.method2218();
        this.field4672 = arg0;
    }

    @ObfuscatedName("qf.ai(I)V")
    public void method7359() {
        if (this.field4667 != -1L) {
            this.field4669 = class318.method2218() - this.field4667;
            this.field4667 = -1L;
        }
        this.field4674++;
        this.field4666 = true;
    }

    @ObfuscatedName("qf.ar(I)V")
    public void method7360() {
        this.field4666 = false;
        this.field4668 = 0;
    }

    @ObfuscatedName("qf.as(B)V")
    public void method7378() {
        this.method7359();
    }

    @ObfuscatedName("qf.aa(Luq;I)V")
    public void method7361(class534 arg0) {
        long var2 = this.field4670;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8575((int) var4);
        long var6 = this.field4669;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8575((int) var8);
        long var10 = this.field4671;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8575((int) var12);
        arg0.method8575(this.field4672);
        arg0.method8575(this.field4668);
        arg0.method8575(this.field4674);
        arg0.method8575(this.field4673);
    }
}
