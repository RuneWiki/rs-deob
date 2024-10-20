package deob;

@ObfuscatedName("fb")
public class class165 implements class186 {

    @ObfuscatedName("fb.v")
    public int field1954;

    @ObfuscatedName("fb.n")
    public int field1949;

    @ObfuscatedName("fb.f")
    public int field1955;

    @ObfuscatedName("fb.y")
    public int field1950;

    @ObfuscatedName("fb.p")
    public int field1951;

    @ObfuscatedName("fb.j")
    public int field1952;

    @ObfuscatedName("fb.r")
    public int field1953;

    @ObfuscatedName("fb.b")
    public int field1948;

    @ObfuscatedName("fb.d")
    public int field1947;

    @ObfuscatedName("fb.s")
    public int field1956;

    @ObfuscatedName("fb.v(Lfo;I)V")
    public void method2996(class166 arg0) {
        if (arg0.field1968 > this.field1953) {
            arg0.field1968 = this.field1953;
        }
        if (arg0.field1959 < this.field1947) {
            arg0.field1959 = this.field1947;
        }
        if (arg0.field1967 > this.field1948) {
            arg0.field1967 = this.field1948;
        }
        if (arg0.field1966 < this.field1956) {
            arg0.field1966 = this.field1956;
        }
    }

    @ObfuscatedName("fb.n(IIII)Z")
    public boolean method2995(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1954 && arg0 < this.field1954 + this.field1949) {
            return arg1 >> 6 >= this.field1955 && arg1 >> 6 <= this.field1951 && arg2 >> 6 >= this.field1950 && arg2 >> 6 <= this.field1952;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fb.f(IIB)Z")
    public boolean method2998(int arg0, int arg1) {
        return arg0 >> 6 >= this.field1953 && arg0 >> 6 <= this.field1947 && arg1 >> 6 >= this.field1948 && arg1 >> 6 <= this.field1956;
    }

    @ObfuscatedName("fb.y(IIII)[I")
    public int[] method3002(int arg0, int arg1, int arg2) {
        return this.method2995(arg0, arg1, arg2) ? new int[] { this.field1953 * 64 - this.field1955 * 64 + arg1, this.field1948 * 64 - this.field1950 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fb.p(III)Lii;")
    public class243 method3000(int arg0, int arg1) {
        if (this.method2998(arg0, arg1)) {
            int var3 = this.field1955 * 64 - this.field1953 * 64 + arg0;
            int var4 = this.field1950 * 64 - this.field1948 * 64 + arg1;
            return new class243(this.field1954, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fb.j(Lnd;I)V")
    public void method3001(class383 arg0) {
        this.field1954 = arg0.method5965();
        this.field1949 = arg0.method5965();
        this.field1955 = arg0.method5967();
        this.field1950 = arg0.method5967();
        this.field1951 = arg0.method5967();
        this.field1952 = arg0.method5967();
        this.field1953 = arg0.method5967();
        this.field1948 = arg0.method5967();
        this.field1947 = arg0.method5967();
        this.field1956 = arg0.method5967();
        this.method3011();
    }

    @ObfuscatedName("fb.r(I)V")
    public void method3011() {
    }
}
