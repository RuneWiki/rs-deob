package deob;

@ObfuscatedName("aa")
public class class49 implements class43 {

    @ObfuscatedName("aa.i")
    public int field607;

    @ObfuscatedName("aa.h")
    public int field606;

    @ObfuscatedName("aa.u")
    public int field602;

    @ObfuscatedName("aa.q")
    public int field604;

    @ObfuscatedName("aa.g")
    public int field605;

    @ObfuscatedName("aa.v")
    public int field609;

    @ObfuscatedName("aa.t")
    public int field603;

    @ObfuscatedName("aa.p")
    public int field608;

    @ObfuscatedName("aa.l")
    public int field601;

    @ObfuscatedName("aa.a")
    public int field610;

    @ObfuscatedName("aa.i(Laj;I)V")
    public void method196(class33 arg0) {
        if (arg0.field454 > this.field605) {
            arg0.field454 = this.field605;
        }
        if (arg0.field455 < this.field605) {
            arg0.field455 = this.field605;
        }
        if (arg0.field464 > this.field609) {
            arg0.field464 = this.field609;
        }
        if (arg0.field457 < this.field609) {
            arg0.field457 = this.field609;
        }
    }

    @ObfuscatedName("aa.h(IIIB)Z")
    public boolean method174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field607 && arg0 < this.field607 + this.field606) {
            return arg1 >= (this.field603 << 3) + (this.field602 << 6) && arg1 <= (this.field603 << 3) + (this.field602 << 6) + 7 && arg2 >= (this.field608 << 3) + (this.field604 << 6) && arg2 <= (this.field608 << 3) + (this.field604 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.u(III)Z")
    public boolean method175(int arg0, int arg1) {
        return arg0 >= (this.field605 << 6) + (this.field601 << 3) && arg0 <= (this.field605 << 6) + (this.field601 << 3) + 7 && arg1 >= (this.field610 << 3) + (this.field609 << 6) && arg1 <= (this.field610 << 3) + (this.field609 << 6) + 7;
    }

    @ObfuscatedName("aa.q(IIII)[I")
    public int[] method176(int arg0, int arg1, int arg2) {
        return this.method174(arg0, arg1, arg2) ? new int[] { this.field601 * 8 - this.field603 * 8 + this.field605 * 64 - this.field602 * 64 + arg1, this.field610 * 8 - this.field608 * 8 + this.field609 * 64 - this.field604 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.g(III)Lho;")
    public class213 method191(int arg0, int arg1) {
        if (this.method175(arg0, arg1)) {
            int var3 = this.field603 * 8 - this.field601 * 8 + this.field602 * 64 - this.field605 * 64 + arg0;
            int var4 = this.field608 * 8 - this.field610 * 8 + this.field604 * 64 - this.field609 * 64 + arg1;
            return new class213(this.field607, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.v(Lfv;I)V")
    public void method195(class174 arg0) {
        this.field607 = arg0.method2930();
        this.field606 = arg0.method2930();
        this.field602 = arg0.method2932();
        this.field603 = arg0.method2930();
        this.field604 = arg0.method2932();
        this.field608 = arg0.method2930();
        this.field605 = arg0.method2932();
        this.field601 = arg0.method2930();
        this.field609 = arg0.method2932();
        this.field610 = arg0.method2930();
        this.method643();
    }

    @ObfuscatedName("aa.t(I)V")
    public void method643() {
    }
}
