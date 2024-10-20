package deob;

@ObfuscatedName("qn")
public class class426 {

    @ObfuscatedName("qn.at")
    public long field4601 = -1L;

    @ObfuscatedName("qn.ah")
    public long field4596 = -1L;

    @ObfuscatedName("qn.ar")
    public boolean field4597 = false;

    @ObfuscatedName("qn.ao")
    public long field4598 = 0L;

    @ObfuscatedName("qn.ab")
    public long field4599 = 0L;

    @ObfuscatedName("qn.au")
    public long field4595 = 0L;

    @ObfuscatedName("qn.aa")
    public int field4603 = 0;

    @ObfuscatedName("qn.ac")
    public int field4606 = 0;

    @ObfuscatedName("qn.al")
    public int field4605 = 0;

    @ObfuscatedName("qn.az")
    public int field4604 = 0;

    @ObfuscatedName("qn.at(I)V")
    public void method7208() {
        this.field4601 = class313.method3460();
    }

    @ObfuscatedName("qn.ah(I)V")
    public void method7209() {
        if (this.field4601 != -1L) {
            this.field4599 = class313.method3460() - this.field4601;
            this.field4601 = -1L;
        }
    }

    @ObfuscatedName("qn.ar(II)V")
    public void method7216(int arg0) {
        this.field4596 = class313.method3460();
        this.field4603 = arg0;
    }

    @ObfuscatedName("qn.ao(B)V")
    public void method7211() {
        if (this.field4596 != -1L) {
            this.field4598 = class313.method3460() - this.field4596;
            this.field4596 = -1L;
        }
        this.field4605++;
        this.field4597 = true;
    }

    @ObfuscatedName("qn.ab(I)V")
    public void method7212() {
        this.field4597 = false;
        this.field4606 = 0;
    }

    @ObfuscatedName("qn.au(B)V")
    public void method7213() {
        this.method7211();
    }

    @ObfuscatedName("qn.aa(Luj;I)V")
    public void method7214(class527 arg0) {
        long var2 = this.field4599;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8394((int) var4);
        long var6 = this.field4598;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8394((int) var8);
        long var10 = this.field4595;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8394((int) var12);
        arg0.method8394(this.field4603);
        arg0.method8394(this.field4606);
        arg0.method8394(this.field4605);
        arg0.method8394(this.field4604);
    }
}
