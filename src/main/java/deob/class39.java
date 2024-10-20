package deob;

@ObfuscatedName("ag")
public class class39 implements class43 {

    @ObfuscatedName("ag.i")
    public int field520;

    @ObfuscatedName("ag.h")
    public int field512;

    @ObfuscatedName("ag.u")
    public int field511;

    @ObfuscatedName("ag.q")
    public int field513;

    @ObfuscatedName("ag.g")
    public int field515;

    @ObfuscatedName("ag.v")
    public int field516;

    @ObfuscatedName("ag.i(Laj;I)V")
    public void method196(class33 arg0) {
        if (arg0.field454 > this.field515) {
            arg0.field454 = this.field515;
        }
        if (arg0.field455 < this.field515) {
            arg0.field455 = this.field515;
        }
        if (arg0.field464 > this.field516) {
            arg0.field464 = this.field516;
        }
        if (arg0.field457 < this.field516) {
            arg0.field457 = this.field516;
        }
    }

    @ObfuscatedName("ag.h(IIIB)Z")
    public boolean method174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field520 && arg0 < this.field520 + this.field512) {
            return arg1 >> 6 == this.field511 && arg2 >> 6 == this.field513;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.u(III)Z")
    public boolean method175(int arg0, int arg1) {
        return arg0 >> 6 == this.field515 && arg1 >> 6 == this.field516;
    }

    @ObfuscatedName("ag.q(IIII)[I")
    public int[] method176(int arg0, int arg1, int arg2) {
        return this.method174(arg0, arg1, arg2) ? new int[] { this.field515 * 64 - this.field511 * 64 + arg1, this.field516 * 64 - this.field513 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.g(III)Lho;")
    public class213 method191(int arg0, int arg1) {
        if (this.method175(arg0, arg1)) {
            int var3 = this.field511 * 64 - this.field515 * 64 + arg0;
            int var4 = this.field513 * 64 - this.field516 * 64 + arg1;
            return new class213(this.field520, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.v(Lfv;I)V")
    public void method195(class174 arg0) {
        this.field520 = arg0.method2930();
        this.field512 = arg0.method2930();
        this.field511 = arg0.method2932();
        this.field513 = arg0.method2932();
        this.field515 = arg0.method2932();
        this.field516 = arg0.method2932();
        this.method483();
    }

    @ObfuscatedName("ag.t(B)V")
    public void method483() {
    }
}
