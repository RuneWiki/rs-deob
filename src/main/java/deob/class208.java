package deob;

import java.util.Arrays;

@ObfuscatedName("hy")
public class class208 implements class30 {

    @ObfuscatedName("hy.af")
    public char[] field2356 = new char[128];

    @ObfuscatedName("hy.an")
    public int[] field2360 = new int[128];

    @ObfuscatedName("hy.aw")
    public int[] field2350 = new int[128];

    @ObfuscatedName("hy.ac")
    public int field2364 = 0;

    @ObfuscatedName("hy.au")
    public int[] field2354 = new int[128];

    @ObfuscatedName("hy.ab")
    public int field2355 = 0;

    @ObfuscatedName("hy.aq")
    public int field2351 = 0;

    @ObfuscatedName("hy.al")
    public int field2365 = 0;

    @ObfuscatedName("hy.at")
    public int field2358 = 0;

    @ObfuscatedName("hy.aa")
    public boolean[] field2359 = new boolean[112];

    @ObfuscatedName("hy.ay")
    public boolean[] field2352 = new boolean[112];

    @ObfuscatedName("hy.ao")
    public boolean[] field2361 = new boolean[112];

    @ObfuscatedName("hy.ax")
    public char field2362;

    @ObfuscatedName("hy.ai")
    public int field2363;

    @ObfuscatedName("hy.af(II)Z")
    public boolean method455(int arg0) {
        this.method3878(arg0);
        this.field2359[arg0] = true;
        this.field2352[arg0] = true;
        this.field2361[arg0] = false;
        this.field2350[++this.field2364 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("hy.an(II)Z")
    public boolean method448(int arg0) {
        this.field2359[arg0] = false;
        this.field2352[arg0] = false;
        this.field2361[arg0] = true;
        this.field2354[++this.field2355 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("hy.aw(CI)Z")
    public boolean method447(char arg0) {
        int var2 = this.field2365 + 1 & 0x7F;
        if (this.field2351 != var2) {
            this.field2360[this.field2365] = -1;
            this.field2356[this.field2365] = arg0;
            this.field2365 = var2;
        }
        return false;
    }

    @ObfuscatedName("hy.ax(IB)V")
    public void method3878(int arg0) {
        int var2 = this.field2365 + 1 & 0x7F;
        if (this.field2351 != var2) {
            this.field2360[this.field2365] = arg0;
            this.field2356[this.field2365] = 0;
            this.field2365 = var2;
        }
    }

    @ObfuscatedName("hy.ac(ZB)Z")
    public boolean method450(boolean arg0) {
        return false;
    }

    @ObfuscatedName("hy.ai(B)V")
    public void method3880() {
        this.field2351 = this.field2358;
        this.field2358 = this.field2365;
        this.field2364 = 0;
        this.field2355 = 0;
        Arrays.fill(this.field2352, false);
        Arrays.fill(this.field2361, false);
    }

    @ObfuscatedName("hy.ag(I)Z")
    public final boolean method3883() {
        if (this.field2358 == this.field2351) {
            return false;
        } else {
            this.field2363 = this.field2360[this.field2351];
            this.field2362 = this.field2356[this.field2351];
            this.field2351 = this.field2351 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("hy.ah(IB)Z")
    public boolean method3882(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2352[arg0] : false;
    }

    @ObfuscatedName("hy.av(II)Z")
    public boolean method3888(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2359[arg0] : false;
    }

    @ObfuscatedName("hy.ar(II)Z")
    public boolean method3890(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2361[arg0] : false;
    }

    @ObfuscatedName("hy.am(I)[I")
    public int[] method3884() {
        int[] var1 = new int[this.field2364];
        for (int var2 = 0; var2 < this.field2364; var2++) {
            var1[var2] = this.field2350[var2];
        }
        return var1;
    }

    @ObfuscatedName("hy.as(I)[I")
    public int[] method3881() {
        int[] var1 = new int[this.field2355];
        for (int var2 = 0; var2 < this.field2355; var2++) {
            var1[var2] = this.field2354[var2];
        }
        return var1;
    }
}
