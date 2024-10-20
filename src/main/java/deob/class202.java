package deob;

import java.util.Arrays;

@ObfuscatedName("gc")
public class class202 implements class31 {

    @ObfuscatedName("gc.h")
    public char[] field2328 = new char[128];

    @ObfuscatedName("gc.e")
    public int[] field2317 = new int[128];

    @ObfuscatedName("gc.v")
    public int[] field2324 = new int[128];

    @ObfuscatedName("gc.x")
    public int field2327 = 0;

    @ObfuscatedName("gc.m")
    public int[] field2320 = new int[128];

    @ObfuscatedName("gc.q")
    public int field2321 = 0;

    @ObfuscatedName("gc.f")
    public int field2322 = 0;

    @ObfuscatedName("gc.r")
    public int field2323 = 0;

    @ObfuscatedName("gc.u")
    public int field2318 = 0;

    @ObfuscatedName("gc.b")
    public boolean[] field2325 = new boolean[112];

    @ObfuscatedName("gc.j")
    public boolean[] field2326 = new boolean[112];

    @ObfuscatedName("gc.g")
    public boolean[] field2319 = new boolean[112];

    @ObfuscatedName("gc.i")
    public char field2316;

    @ObfuscatedName("gc.o")
    public int field2329;

    @ObfuscatedName("gc.h(II)Z")
    public boolean method432(int arg0) {
        this.method3733(arg0);
        this.field2325[arg0] = true;
        this.field2326[arg0] = true;
        this.field2319[arg0] = false;
        this.field2324[++this.field2327 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("gc.e(II)Z")
    public boolean method433(int arg0) {
        this.field2325[arg0] = false;
        this.field2326[arg0] = false;
        this.field2319[arg0] = true;
        this.field2320[++this.field2321 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("gc.v(CI)Z")
    public boolean method427(char arg0) {
        int var2 = this.field2323 + 1 & 0x7F;
        if (this.field2322 != var2) {
            this.field2317[this.field2323] = -1;
            this.field2328[this.field2323] = arg0;
            this.field2323 = var2;
        }
        return false;
    }

    @ObfuscatedName("gc.a(IB)V")
    public void method3733(int arg0) {
        int var2 = this.field2323 + 1 & 0x7F;
        if (this.field2322 != var2) {
            this.field2317[this.field2323] = arg0;
            this.field2328[this.field2323] = 0;
            this.field2323 = var2;
        }
    }

    @ObfuscatedName("gc.x(ZI)Z")
    public boolean method428(boolean arg0) {
        return false;
    }

    @ObfuscatedName("gc.s(B)V")
    public void method3734() {
        this.field2322 = this.field2318;
        this.field2318 = this.field2323;
        this.field2327 = 0;
        this.field2321 = 0;
        Arrays.fill(this.field2326, false);
        Arrays.fill(this.field2319, false);
    }

    @ObfuscatedName("gc.l(B)Z")
    public final boolean method3742() {
        if (this.field2322 == this.field2318) {
            return false;
        } else {
            this.field2329 = this.field2317[this.field2322];
            this.field2316 = this.field2328[this.field2322];
            this.field2322 = this.field2322 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("gc.t(II)Z")
    public boolean method3757(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2326[arg0] : false;
    }

    @ObfuscatedName("gc.c(IB)Z")
    public boolean method3737(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2325[arg0] : false;
    }

    @ObfuscatedName("gc.p(II)Z")
    public boolean method3735(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2319[arg0] : false;
    }

    @ObfuscatedName("gc.d(B)[I")
    public int[] method3739() {
        int[] var1 = new int[this.field2327];
        for (int var2 = 0; var2 < this.field2327; var2++) {
            var1[var2] = this.field2324[var2];
        }
        return var1;
    }

    @ObfuscatedName("gc.y(I)[I")
    public int[] method3740() {
        int[] var1 = new int[this.field2321];
        for (int var2 = 0; var2 < this.field2321; var2++) {
            var1[var2] = this.field2320[var2];
        }
        return var1;
    }
}
