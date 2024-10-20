package deob;

@ObfuscatedName("g")
public class class15 implements class32 {

    @ObfuscatedName("g.z")
    public int field101;

    @ObfuscatedName("g.w")
    public int field91;

    @ObfuscatedName("g.s")
    public int field92;

    @ObfuscatedName("g.l")
    public int field103;

    @ObfuscatedName("g.u")
    public int field94;

    @ObfuscatedName("g.q")
    public int field97;

    @ObfuscatedName("g.k")
    public int field96;

    @ObfuscatedName("g.i")
    public int field106;

    @ObfuscatedName("g.x")
    public int field98;

    @ObfuscatedName("g.e")
    public int field99;

    @ObfuscatedName("g.p")
    public int field100;

    @ObfuscatedName("g.b")
    public int field90;

    @ObfuscatedName("g.n")
    public int field102;

    @ObfuscatedName("g.f")
    public int field104;

    @ObfuscatedName("g.z(La;B)V")
    public void method116(class21 arg0) {
        if (arg0.field167 > this.field94) {
            arg0.field167 = this.field94;
        }
        if (arg0.field168 < this.field94) {
            arg0.field168 = this.field94;
        }
        if (arg0.field169 > this.field97) {
            arg0.field169 = this.field97;
        }
        if (arg0.field163 < this.field97) {
            arg0.field163 = this.field97;
        }
    }

    @ObfuscatedName("g.w(IIII)Z")
    public boolean method117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field101 && arg0 < this.field91 + this.field101) {
            return arg1 >= (this.field96 << 3) + (this.field92 << 6) && arg1 <= (this.field98 << 3) + (this.field92 << 6) + 7 && arg2 >= (this.field106 << 3) + (this.field103 << 6) && arg2 <= (this.field99 << 3) + (this.field103 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.s(III)Z")
    public boolean method118(int arg0, int arg1) {
        return arg0 >= (this.field94 << 6) + (this.field100 << 3) && arg0 <= (this.field94 << 6) + (this.field102 << 3) + 7 && arg1 >= (this.field97 << 6) + (this.field90 << 3) && arg1 <= (this.field97 << 6) + (this.field104 << 3) + 7;
    }

    @ObfuscatedName("g.l(IIIB)[I")
    public int[] method119(int arg0, int arg1, int arg2) {
        return this.method117(arg0, arg1, arg2) ? new int[] { this.field100 * 8 - this.field96 * 8 + this.field94 * 64 - this.field92 * 64 + arg1, this.field90 * 8 - this.field106 * 8 + this.field97 * 64 - this.field103 * 64 + arg2 } : null;
    }

    @ObfuscatedName("g.u(III)Lha;")
    public class227 method120(int arg0, int arg1) {
        if (this.method118(arg0, arg1)) {
            int var3 = this.field96 * 8 - this.field100 * 8 + this.field92 * 64 - this.field94 * 64 + arg0;
            int var4 = this.field106 * 8 - this.field90 * 8 + this.field103 * 64 - this.field97 * 64 + arg1;
            return new class227(this.field101, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("g.q(Lgk;B)V")
    public void method121(class183 arg0) {
        this.field101 = arg0.method3247();
        this.field91 = arg0.method3247();
        this.field92 = arg0.method3253();
        this.field96 = arg0.method3247();
        this.field98 = arg0.method3247();
        this.field103 = arg0.method3253();
        this.field106 = arg0.method3247();
        this.field99 = arg0.method3247();
        this.field94 = arg0.method3253();
        this.field100 = arg0.method3247();
        this.field102 = arg0.method3247();
        this.field97 = arg0.method3253();
        this.field90 = arg0.method3247();
        this.field104 = arg0.method3247();
        this.method122();
    }

    @ObfuscatedName("g.i(B)V")
    public void method122() {
    }
}
