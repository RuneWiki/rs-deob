package deob;

@ObfuscatedName("fs")
public class class166 implements class187 {

    @ObfuscatedName("fs.f")
    public int field1958;

    @ObfuscatedName("fs.e")
    public int field1957;

    @ObfuscatedName("fs.v")
    public int field1959;

    @ObfuscatedName("fs.y")
    public int field1960;

    @ObfuscatedName("fs.j")
    public int field1961;

    @ObfuscatedName("fs.o")
    public int field1962;

    @ObfuscatedName("fs.m")
    public int field1963;

    @ObfuscatedName("fs.r")
    public int field1964;

    @ObfuscatedName("fs.h")
    public int field1965;

    @ObfuscatedName("fs.d")
    public int field1966;

    @ObfuscatedName("fs.f(Lfa;B)V")
    public void method2991(class167 arg0) {
        if (arg0.field1973 > this.field1963) {
            arg0.field1973 = this.field1963;
        }
        if (arg0.field1980 < this.field1965) {
            arg0.field1980 = this.field1965;
        }
        if (arg0.field1976 > this.field1964) {
            arg0.field1976 = this.field1964;
        }
        if (arg0.field1968 < this.field1966) {
            arg0.field1968 = this.field1966;
        }
    }

    @ObfuscatedName("fs.e(IIII)Z")
    public boolean method3004(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1958 && arg0 < this.field1958 + this.field1957) {
            return arg1 >> 6 >= this.field1959 && arg1 >> 6 <= this.field1961 && arg2 >> 6 >= this.field1960 && arg2 >> 6 <= this.field1962;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fs.v(III)Z")
    public boolean method3017(int arg0, int arg1) {
        return arg0 >> 6 >= this.field1963 && arg0 >> 6 <= this.field1965 && arg1 >> 6 >= this.field1964 && arg1 >> 6 <= this.field1966;
    }

    @ObfuscatedName("fs.y(IIII)[I")
    public int[] method2993(int arg0, int arg1, int arg2) {
        return this.method3004(arg0, arg1, arg2) ? new int[] { this.field1963 * 64 - this.field1959 * 64 + arg1, this.field1964 * 64 - this.field1960 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fs.j(IIB)Liw;")
    public class244 method2994(int arg0, int arg1) {
        if (this.method3017(arg0, arg1)) {
            int var3 = this.field1959 * 64 - this.field1963 * 64 + arg0;
            int var4 = this.field1960 * 64 - this.field1964 * 64 + arg1;
            return new class244(this.field1958, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fs.o(Lnt;I)V")
    public void method2995(class384 arg0) {
        this.field1958 = arg0.method5902();
        this.field1957 = arg0.method5902();
        this.field1959 = arg0.method5899();
        this.field1960 = arg0.method5899();
        this.field1961 = arg0.method5899();
        this.field1962 = arg0.method5899();
        this.field1963 = arg0.method5899();
        this.field1964 = arg0.method5899();
        this.field1965 = arg0.method5899();
        this.field1966 = arg0.method5899();
        this.method2992();
    }

    @ObfuscatedName("fs.m(I)V")
    public void method2992() {
    }
}
