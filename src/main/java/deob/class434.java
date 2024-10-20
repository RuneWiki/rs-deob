package deob;

@ObfuscatedName("qm")
public class class434 {

    @ObfuscatedName("qm.az")
    public long field4701 = -1L;

    @ObfuscatedName("qm.ah")
    public long field4698 = -1L;

    @ObfuscatedName("qm.af")
    public boolean field4697 = false;

    @ObfuscatedName("qm.at")
    public long field4700 = 0L;

    @ObfuscatedName("qm.an")
    public long field4708 = 0L;

    @ObfuscatedName("qm.ao")
    public long field4699 = 0L;

    @ObfuscatedName("qm.ab")
    public int field4703 = 0;

    @ObfuscatedName("qm.aw")
    public int field4704 = 0;

    @ObfuscatedName("qm.ad")
    public int field4705 = 0;

    @ObfuscatedName("qm.al")
    public int field4706 = 0;

    @ObfuscatedName("qm.az(B)V")
    public void method7237() {
        this.field4701 = class318.method3596();
    }

    @ObfuscatedName("qm.ah(I)V")
    public void method7239() {
        if (this.field4701 != -1L) {
            this.field4708 = class318.method3596() - this.field4701;
            this.field4701 = -1L;
        }
    }

    @ObfuscatedName("qm.af(IB)V")
    public void method7252(int arg0) {
        this.field4698 = class318.method3596();
        this.field4703 = arg0;
    }

    @ObfuscatedName("qm.at(I)V")
    public void method7240() {
        if (this.field4698 != -1L) {
            this.field4700 = class318.method3596() - this.field4698;
            this.field4698 = -1L;
        }
        this.field4705++;
        this.field4697 = true;
    }

    @ObfuscatedName("qm.an(I)V")
    public void method7241() {
        this.field4697 = false;
        this.field4704 = 0;
    }

    @ObfuscatedName("qm.ao(I)V")
    public void method7242() {
        this.method7240();
    }

    @ObfuscatedName("qm.ab(Lur;B)V")
    public void method7255(class535 arg0) {
        method5126(arg0, this.field4708);
        method5126(arg0, this.field4700);
        method5126(arg0, this.field4699);
        arg0.method8446(this.field4703);
        arg0.method8446(this.field4704);
        arg0.method8446(this.field4705);
        arg0.method8446(this.field4706);
    }

    @ObfuscatedName("kg.aw(Lur;J)V")
    public static void method5126(class535 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method8446((int) var3);
    }
}
