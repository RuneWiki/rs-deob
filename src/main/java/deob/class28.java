package deob;

@ObfuscatedName("ah")
public class class28 implements class32 {

    @ObfuscatedName("ah.z")
    public int field227;

    @ObfuscatedName("ah.w")
    public int field226;

    @ObfuscatedName("ah.s")
    public int field235;

    @ObfuscatedName("ah.l")
    public int field228;

    @ObfuscatedName("ah.u")
    public int field234;

    @ObfuscatedName("ah.q")
    public int field230;

    @ObfuscatedName("ah.z(La;B)V")
    public void method116(class21 arg0) {
        if (arg0.field167 > this.field234) {
            arg0.field167 = this.field234;
        }
        if (arg0.field168 < this.field234) {
            arg0.field168 = this.field234;
        }
        if (arg0.field169 > this.field230) {
            arg0.field169 = this.field230;
        }
        if (arg0.field163 < this.field230) {
            arg0.field163 = this.field230;
        }
    }

    @ObfuscatedName("ah.w(IIII)Z")
    public boolean method117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field227 && arg0 < this.field227 + this.field226) {
            return arg1 >> 6 == this.field235 && arg2 >> 6 == this.field228;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.s(III)Z")
    public boolean method118(int arg0, int arg1) {
        return arg0 >> 6 == this.field234 && arg1 >> 6 == this.field230;
    }

    @ObfuscatedName("ah.l(IIIB)[I")
    public int[] method119(int arg0, int arg1, int arg2) {
        return this.method117(arg0, arg1, arg2) ? new int[] { this.field234 * 64 - this.field235 * 64 + arg1, this.field230 * 64 - this.field228 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.u(III)Lha;")
    public class227 method120(int arg0, int arg1) {
        if (this.method118(arg0, arg1)) {
            int var3 = this.field235 * 64 - this.field234 * 64 + arg0;
            int var4 = this.field228 * 64 - this.field230 * 64 + arg1;
            return new class227(this.field227, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.q(Lgk;B)V")
    public void method121(class183 arg0) {
        this.field227 = arg0.method3247();
        this.field226 = arg0.method3247();
        this.field235 = arg0.method3253();
        this.field228 = arg0.method3253();
        this.field234 = arg0.method3253();
        this.field230 = arg0.method3253();
        this.method419();
    }

    @ObfuscatedName("ah.i(B)V")
    public void method419() {
    }
}
