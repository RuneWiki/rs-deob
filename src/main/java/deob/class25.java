package deob;

@ObfuscatedName("l")
public class class25 implements class38 {

    @ObfuscatedName("l.u")
    public int field200;

    @ObfuscatedName("l.f")
    public int field190;

    @ObfuscatedName("l.b")
    public int field191;

    @ObfuscatedName("l.g")
    public int field192;

    @ObfuscatedName("l.z")
    public int field199;

    @ObfuscatedName("l.p")
    public int field193;

    @ObfuscatedName("l.h")
    public int field195;

    @ObfuscatedName("l.y")
    public int field196;

    @ObfuscatedName("l.w")
    public int field197;

    @ObfuscatedName("l.i")
    public int field198;

    @ObfuscatedName("l.u(Laf;I)V")
    public void method206(class27 arg0) {
        if (arg0.field215 > this.field195) {
            arg0.field215 = this.field195;
        }
        if (arg0.field224 < this.field197) {
            arg0.field224 = this.field197;
        }
        if (arg0.field217 > this.field196) {
            arg0.field217 = this.field196;
        }
        if (arg0.field218 < this.field198) {
            arg0.field218 = this.field198;
        }
    }

    @ObfuscatedName("l.f(IIIB)Z")
    public boolean method207(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field200 && arg0 < this.field200 + this.field190) {
            return arg1 >> 6 >= this.field191 && arg1 >> 6 <= this.field199 && arg2 >> 6 >= this.field192 && arg2 >> 6 <= this.field193;
        } else {
            return false;
        }
    }

    @ObfuscatedName("l.b(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >> 6 >= this.field195 && arg0 >> 6 <= this.field197 && arg1 >> 6 >= this.field196 && arg1 >> 6 <= this.field198;
    }

    @ObfuscatedName("l.g(IIIB)[I")
    public int[] method236(int arg0, int arg1, int arg2) {
        return this.method207(arg0, arg1, arg2) ? new int[] { this.field195 * 64 - this.field191 * 64 + arg1, this.field196 * 64 - this.field192 * 64 + arg2 } : null;
    }

    @ObfuscatedName("l.z(III)Lhx;")
    public class214 method209(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field191 * 64 - this.field195 * 64 + arg0;
            int var4 = this.field192 * 64 - this.field196 * 64 + arg1;
            return new class214(this.field200, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("l.p(Lkg;I)V")
    public void method211(class300 arg0) {
        this.field200 = arg0.method5138();
        this.field190 = arg0.method5138();
        this.field191 = arg0.method5337();
        this.field192 = arg0.method5337();
        this.field199 = arg0.method5337();
        this.field193 = arg0.method5337();
        this.field195 = arg0.method5337();
        this.field196 = arg0.method5337();
        this.field197 = arg0.method5337();
        this.field198 = arg0.method5337();
        this.method289();
    }

    @ObfuscatedName("l.h(B)V")
    public void method289() {
    }
}
