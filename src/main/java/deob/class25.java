package deob;

@ObfuscatedName("a")
public class class25 implements class38 {

    @ObfuscatedName("a.c")
    public int field197;

    @ObfuscatedName("a.x")
    public int field190;

    @ObfuscatedName("a.t")
    public int field191;

    @ObfuscatedName("a.g")
    public int field192;

    @ObfuscatedName("a.l")
    public int field196;

    @ObfuscatedName("a.u")
    public int field194;

    @ObfuscatedName("a.j")
    public int field189;

    @ObfuscatedName("a.v")
    public int field195;

    @ObfuscatedName("a.d")
    public int field193;

    @ObfuscatedName("a.z")
    public int field198;

    @ObfuscatedName("a.c(Lag;S)V")
    public void method185(class27 arg0) {
        if (arg0.field220 > this.field189) {
            arg0.field220 = this.field189;
        }
        if (arg0.field217 < this.field193) {
            arg0.field217 = this.field193;
        }
        if (arg0.field214 > this.field195) {
            arg0.field214 = this.field195;
        }
        if (arg0.field215 < this.field198) {
            arg0.field215 = this.field198;
        }
    }

    @ObfuscatedName("a.x(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field197 && arg0 < this.field197 + this.field190) {
            return arg1 >> 6 >= this.field191 && arg1 >> 6 <= this.field196 && arg2 >> 6 >= this.field192 && arg2 >> 6 <= this.field194;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.t(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >> 6 >= this.field189 && arg0 >> 6 <= this.field193 && arg1 >> 6 >= this.field195 && arg1 >> 6 <= this.field198;
    }

    @ObfuscatedName("a.g(IIII)[I")
    public int[] method198(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field189 * 64 - this.field191 * 64 + arg1, this.field195 * 64 - this.field192 * 64 + arg2 } : null;
    }

    @ObfuscatedName("a.l(IIB)Lhj;")
    public class214 method188(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field191 * 64 - this.field189 * 64 + arg0;
            int var4 = this.field192 * 64 - this.field195 * 64 + arg1;
            return new class214(this.field197, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("a.u(Lkz;I)V")
    public void method189(class300 arg0) {
        this.field197 = arg0.method5103();
        this.field190 = arg0.method5103();
        this.field191 = arg0.method5304();
        this.field192 = arg0.method5304();
        this.field196 = arg0.method5304();
        this.field194 = arg0.method5304();
        this.field189 = arg0.method5304();
        this.field195 = arg0.method5304();
        this.field193 = arg0.method5304();
        this.field198 = arg0.method5304();
        this.method240();
    }

    @ObfuscatedName("a.j(I)V")
    public void method240() {
    }
}
