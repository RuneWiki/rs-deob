package deob;

@ObfuscatedName("ao")
public class class52 implements class47 {

    @ObfuscatedName("ao.n")
    public int field394;

    @ObfuscatedName("ao.v")
    public int field387;

    @ObfuscatedName("ao.d")
    public int field388;

    @ObfuscatedName("ao.c")
    public int field389;

    @ObfuscatedName("ao.y")
    public int field395;

    @ObfuscatedName("ao.h")
    public int field390;

    @ObfuscatedName("ao.z")
    public int field392;

    @ObfuscatedName("ao.e")
    public int field393;

    @ObfuscatedName("ao.q")
    public int field386;

    @ObfuscatedName("ao.l")
    public int field391;

    @ObfuscatedName("ao.n(Lar;B)V")
    public void method280(class36 arg0) {
        if (arg0.field246 > this.field395) {
            arg0.field246 = this.field395;
        }
        if (arg0.field247 < this.field395) {
            arg0.field247 = this.field395;
        }
        if (arg0.field248 > this.field390) {
            arg0.field248 = this.field390;
        }
        if (arg0.field251 < this.field390) {
            arg0.field251 = this.field390;
        }
    }

    @ObfuscatedName("ao.v(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field394 && arg0 < this.field394 + this.field387) {
            return arg1 >= (this.field392 << 3) + (this.field388 << 6) && arg1 <= (this.field392 << 3) + (this.field388 << 6) + 7 && arg2 >= (this.field393 << 3) + (this.field389 << 6) && arg2 <= (this.field393 << 3) + (this.field389 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.d(IIB)Z")
    public boolean method267(int arg0, int arg1) {
        return arg0 >= (this.field395 << 6) + (this.field386 << 3) && arg0 <= (this.field395 << 6) + (this.field386 << 3) + 7 && arg1 >= (this.field391 << 3) + (this.field390 << 6) && arg1 <= (this.field391 << 3) + (this.field390 << 6) + 7;
    }

    @ObfuscatedName("ao.c(IIIB)[I")
    public int[] method271(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field386 * 8 - this.field392 * 8 + this.field395 * 64 - this.field388 * 64 + arg1, this.field391 * 8 - this.field393 * 8 + this.field390 * 64 - this.field389 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ao.y(III)Lhd;")
    public class223 method266(int arg0, int arg1) {
        if (this.method267(arg0, arg1)) {
            int var3 = this.field392 * 8 - this.field386 * 8 + this.field388 * 64 - this.field395 * 64 + arg0;
            int var4 = this.field393 * 8 - this.field391 * 8 + this.field389 * 64 - this.field390 * 64 + arg1;
            return new class223(this.field394, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.h(Lkx;I)V")
    public void method270(class311 arg0) {
        this.field394 = arg0.method5310();
        this.field387 = arg0.method5310();
        this.field388 = arg0.method5247();
        this.field392 = arg0.method5310();
        this.field389 = arg0.method5247();
        this.field393 = arg0.method5310();
        this.field395 = arg0.method5247();
        this.field386 = arg0.method5310();
        this.field390 = arg0.method5247();
        this.field391 = arg0.method5310();
        this.method734();
    }

    @ObfuscatedName("ao.z(B)V")
    public void method734() {
    }
}
