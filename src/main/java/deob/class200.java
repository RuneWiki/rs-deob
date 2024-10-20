package deob;

import java.util.Arrays;

@ObfuscatedName("gw")
public class class200 implements class31 {

    @ObfuscatedName("gw.a")
    public char[] field2254 = new char[128];

    @ObfuscatedName("gw.f")
    public int[] field2245 = new int[128];

    @ObfuscatedName("gw.c")
    public int[] field2247 = new int[128];

    @ObfuscatedName("gw.x")
    public int field2248 = 0;

    @ObfuscatedName("gw.h")
    public int[] field2261 = new int[128];

    @ObfuscatedName("gw.j")
    public int field2256 = 0;

    @ObfuscatedName("gw.y")
    public int field2251 = 0;

    @ObfuscatedName("gw.d")
    public int field2250 = 0;

    @ObfuscatedName("gw.n")
    public int field2259 = 0;

    @ObfuscatedName("gw.r")
    public boolean[] field2252 = new boolean[112];

    @ObfuscatedName("gw.l")
    public boolean[] field2255 = new boolean[112];

    @ObfuscatedName("gw.s")
    public boolean[] field2258 = new boolean[112];

    @ObfuscatedName("gw.p")
    public char field2257;

    @ObfuscatedName("gw.b")
    public int field2253;

    @ObfuscatedName("gw.a(II)Z")
    public boolean method454(int arg0) {
        this.method3623(arg0);
        this.field2252[arg0] = true;
        this.field2255[arg0] = true;
        this.field2258[arg0] = false;
        this.field2247[++this.field2248 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("gw.f(II)Z")
    public boolean method444(int arg0) {
        this.field2252[arg0] = false;
        this.field2255[arg0] = false;
        this.field2258[arg0] = true;
        this.field2261[++this.field2256 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("gw.c(CI)Z")
    public boolean method445(char arg0) {
        int var2 = this.field2250 + 1 & 0x7F;
        if (this.field2251 != var2) {
            this.field2245[this.field2250] = -1;
            this.field2254[this.field2250] = arg0;
            this.field2250 = var2;
        }
        return false;
    }

    @ObfuscatedName("gw.u(II)V")
    public void method3623(int arg0) {
        int var2 = this.field2250 + 1 & 0x7F;
        if (this.field2251 != var2) {
            this.field2245[this.field2250] = arg0;
            this.field2254[this.field2250] = 0;
            this.field2250 = var2;
        }
    }

    @ObfuscatedName("gw.x(ZB)Z")
    public boolean method446(boolean arg0) {
        return false;
    }

    @ObfuscatedName("gw.z(I)V")
    public void method3624() {
        this.field2251 = this.field2259;
        this.field2259 = this.field2250;
        this.field2248 = 0;
        this.field2256 = 0;
        Arrays.fill(this.field2255, false);
        Arrays.fill(this.field2258, false);
    }

    @ObfuscatedName("gw.t(B)Z")
    public final boolean method3642() {
        if (this.field2259 == this.field2251) {
            return false;
        } else {
            this.field2253 = this.field2245[this.field2251];
            this.field2257 = this.field2254[this.field2251];
            this.field2251 = this.field2251 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("gw.w(II)Z")
    public boolean method3650(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2255[arg0] : false;
    }

    @ObfuscatedName("gw.m(II)Z")
    public boolean method3626(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2252[arg0] : false;
    }

    @ObfuscatedName("gw.q(IB)Z")
    public boolean method3631(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2258[arg0] : false;
    }

    @ObfuscatedName("gw.i(I)[I")
    public int[] method3646() {
        int[] var1 = new int[this.field2248];
        for (int var2 = 0; var2 < this.field2248; var2++) {
            var1[var2] = this.field2247[var2];
        }
        return var1;
    }

    @ObfuscatedName("gw.e(B)[I")
    public int[] method3627() {
        int[] var1 = new int[this.field2256];
        for (int var2 = 0; var2 < this.field2256; var2++) {
            var1[var2] = this.field2261[var2];
        }
        return var1;
    }
}
