package deob;

@ObfuscatedName("fv")
public class class167 implements class188 {

    @ObfuscatedName("fv.s")
    public int field1936;

    @ObfuscatedName("fv.t")
    public int field1933;

    @ObfuscatedName("fv.v")
    public int field1938;

    @ObfuscatedName("fv.j")
    public int field1935;

    @ObfuscatedName("fv.l")
    public int field1934;

    @ObfuscatedName("fv.n")
    public int field1937;

    @ObfuscatedName("fv.w")
    public int field1943;

    @ObfuscatedName("fv.f")
    public int field1939;

    @ObfuscatedName("fv.o")
    public int field1940;

    @ObfuscatedName("fv.x")
    public int field1941;

    @ObfuscatedName("fv.s(Lfa;I)V")
    public void method2967(class168 arg0) {
        if (arg0.field1953 > this.field1943) {
            arg0.field1953 = this.field1943;
        }
        if (arg0.field1951 < this.field1940) {
            arg0.field1951 = this.field1940;
        }
        if (arg0.field1952 > this.field1939) {
            arg0.field1952 = this.field1939;
        }
        if (arg0.field1957 < this.field1941) {
            arg0.field1957 = this.field1941;
        }
    }

    @ObfuscatedName("fv.t(IIIB)Z")
    public boolean method2946(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1936 && arg0 < this.field1936 + this.field1933) {
            return arg1 >> 6 >= this.field1938 && arg1 >> 6 <= this.field1934 && arg2 >> 6 >= this.field1935 && arg2 >> 6 <= this.field1937;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fv.v(III)Z")
    public boolean method2948(int arg0, int arg1) {
        return arg0 >> 6 >= this.field1943 && arg0 >> 6 <= this.field1940 && arg1 >> 6 >= this.field1939 && arg1 >> 6 <= this.field1941;
    }

    @ObfuscatedName("fv.j(IIII)[I")
    public int[] method2962(int arg0, int arg1, int arg2) {
        return this.method2946(arg0, arg1, arg2) ? new int[] { this.field1943 * 64 - this.field1938 * 64 + arg1, this.field1939 * 64 - this.field1935 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fv.l(IIB)Lij;")
    public class245 method2947(int arg0, int arg1) {
        if (this.method2948(arg0, arg1)) {
            int var3 = this.field1938 * 64 - this.field1943 * 64 + arg0;
            int var4 = this.field1935 * 64 - this.field1939 * 64 + arg1;
            return new class245(this.field1936, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fv.n(Lnv;I)V")
    public void method2949(class385 arg0) {
        this.field1936 = arg0.method5958();
        this.field1933 = arg0.method5958();
        this.field1938 = arg0.method6053();
        this.field1935 = arg0.method6053();
        this.field1934 = arg0.method6053();
        this.field1937 = arg0.method6053();
        this.field1943 = arg0.method6053();
        this.field1939 = arg0.method6053();
        this.field1940 = arg0.method6053();
        this.field1941 = arg0.method6053();
        this.method2952();
    }

    @ObfuscatedName("fv.w(I)V")
    public void method2952() {
    }
}
