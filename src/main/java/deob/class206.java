package deob;

import java.util.Arrays;

@ObfuscatedName("gl")
public class class206 implements class30 {

    @ObfuscatedName("gl.f")
    public char[] field2327 = new char[128];

    @ObfuscatedName("gl.w")
    public int[] field2328 = new int[128];

    @ObfuscatedName("gl.v")
    public int[] field2329 = new int[128];

    @ObfuscatedName("gl.s")
    public int field2336 = 0;

    @ObfuscatedName("gl.z")
    public int[] field2338 = new int[128];

    @ObfuscatedName("gl.j")
    public int field2330 = 0;

    @ObfuscatedName("gl.i")
    public int field2333 = 0;

    @ObfuscatedName("gl.n")
    public int field2332 = 0;

    @ObfuscatedName("gl.l")
    public int field2335 = 0;

    @ObfuscatedName("gl.k")
    public boolean[] field2339 = new boolean[112];

    @ObfuscatedName("gl.c")
    public boolean[] field2337 = new boolean[112];

    @ObfuscatedName("gl.r")
    public boolean[] field2331 = new boolean[112];

    @ObfuscatedName("gl.b")
    public char field2334;

    @ObfuscatedName("gl.m")
    public int field2340;

    @ObfuscatedName("gl.f(IB)Z")
    public boolean method430(int arg0) {
        this.method3816(arg0);
        this.field2339[arg0] = true;
        this.field2337[arg0] = true;
        this.field2331[arg0] = false;
        this.field2329[++this.field2336 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("gl.w(IB)Z")
    public boolean method429(int arg0) {
        this.field2339[arg0] = false;
        this.field2337[arg0] = false;
        this.field2331[arg0] = true;
        this.field2338[++this.field2330 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("gl.v(CI)Z")
    public boolean method437(char arg0) {
        int var2 = this.field2332 + 1 & 0x7F;
        if (this.field2333 != var2) {
            this.field2328[this.field2332] = -1;
            this.field2327[this.field2332] = arg0;
            this.field2332 = var2;
        }
        return false;
    }

    @ObfuscatedName("gl.x(II)V")
    public void method3816(int arg0) {
        int var2 = this.field2332 + 1 & 0x7F;
        if (this.field2333 != var2) {
            this.field2328[this.field2332] = arg0;
            this.field2327[this.field2332] = 0;
            this.field2332 = var2;
        }
    }

    @ObfuscatedName("gl.s(ZI)Z")
    public boolean method431(boolean arg0) {
        return false;
    }

    @ObfuscatedName("gl.a(B)V")
    public void method3817() {
        this.field2333 = this.field2335;
        this.field2335 = this.field2332;
        this.field2336 = 0;
        this.field2330 = 0;
        Arrays.fill(this.field2337, false);
        Arrays.fill(this.field2331, false);
    }

    @ObfuscatedName("gl.q(B)Z")
    public final boolean method3818() {
        if (this.field2335 == this.field2333) {
            return false;
        } else {
            this.field2340 = this.field2328[this.field2333];
            this.field2334 = this.field2327[this.field2333];
            this.field2333 = this.field2333 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("gl.d(IB)Z")
    public boolean method3819(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2337[arg0] : false;
    }

    @ObfuscatedName("gl.e(IB)Z")
    public boolean method3820(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2339[arg0] : false;
    }

    @ObfuscatedName("gl.g(II)Z")
    public boolean method3824(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2331[arg0] : false;
    }

    @ObfuscatedName("gl.y(B)[I")
    public int[] method3841() {
        int[] var1 = new int[this.field2336];
        for (int var2 = 0; var2 < this.field2336; var2++) {
            var1[var2] = this.field2329[var2];
        }
        return var1;
    }

    @ObfuscatedName("gl.af(I)[I")
    public int[] method3822() {
        int[] var1 = new int[this.field2330];
        for (int var2 = 0; var2 < this.field2330; var2++) {
            var1[var2] = this.field2338[var2];
        }
        return var1;
    }
}
