package deob;

@ObfuscatedName("kt")
public class class275 {

    @ObfuscatedName("kt.ak")
    public int field3043 = 0;

    @ObfuscatedName("kt.aj")
    public int field3044 = 0;

    @ObfuscatedName("kt.ai")
    public int field3045 = 0;

    @ObfuscatedName("kt.ay")
    public int field3046 = 0;

    @ObfuscatedName("kt.ap(I)I")
    public int method5345() {
        return this.field3044;
    }

    @ObfuscatedName("kt.aw(B)I")
    public int method5366() {
        return this.field3046;
    }

    @ObfuscatedName("kt.ak(I)I")
    public int method5347() {
        return this.field3045;
    }

    @ObfuscatedName("kt.aj(I)I")
    public int method5385() {
        return this.field3044 >> 7;
    }

    @ObfuscatedName("kt.ai(I)I")
    public int method5349() {
        return this.field3045 >> 7;
    }

    @ObfuscatedName("kt.ay(I)I")
    public int method5361() {
        return this.field3043;
    }

    @ObfuscatedName("kt.as(Lkt;I)V")
    public void method5351(class275 arg0) {
        this.field3043 = arg0.field3043;
        this.field3044 = arg0.field3044;
        this.field3046 = arg0.field3046;
        this.field3045 = arg0.field3045;
    }

    @ObfuscatedName("kt.ae(III)V")
    public void method5380(int arg0, int arg1) {
        this.field3044 = arg0;
        this.field3045 = arg1;
    }

    @ObfuscatedName("kt.am(III)V")
    public void method5370(int arg0, int arg1) {
        this.field3044 = class351.method6260(arg0) + 64;
        this.field3045 = class351.method6260(arg1) + 64;
    }

    @ObfuscatedName("kt.at(IB)V")
    public void method5353(int arg0) {
        this.field3043 = arg0 & 0x7FF;
    }

    @ObfuscatedName("kt.au(II)V")
    public void method5354(int arg0) {
        this.field3046 = arg0;
    }

    @ObfuscatedName("kt.an(III)V")
    public void method5355(int arg0, int arg1) {
        this.field3044 += arg0;
        this.field3045 += arg1;
    }

    @ObfuscatedName("kt.ao(IIIII)V")
    public void method5362(int arg0, int arg1, int arg2, int arg3) {
        this.field3044 += arg0;
        this.field3046 += arg1;
        this.field3045 += arg2;
        this.method5353(this.field3043 + arg3);
    }
}
