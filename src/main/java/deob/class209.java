package deob;

import java.util.Arrays;

@ObfuscatedName("ic")
public class class209 implements class30 {

    @ObfuscatedName("ic.aj")
    public char[] field2295 = new char[128];

    @ObfuscatedName("ic.al")
    public int[] field2290 = new int[128];

    @ObfuscatedName("ic.ac")
    public int[] field2291 = new int[128];

    @ObfuscatedName("ic.ab")
    public int field2292 = 0;

    @ObfuscatedName("ic.an")
    public int[] field2293 = new int[128];

    @ObfuscatedName("ic.ao")
    public int field2294 = 0;

    @ObfuscatedName("ic.av")
    public int field2302 = 0;

    @ObfuscatedName("ic.aq")
    public int field2296 = 0;

    @ObfuscatedName("ic.ap")
    public int field2297 = 0;

    @ObfuscatedName("ic.ar")
    public boolean[] field2298 = new boolean[112];

    @ObfuscatedName("ic.ak")
    public boolean[] field2299 = new boolean[112];

    @ObfuscatedName("ic.ax")
    public boolean[] field2289 = new boolean[112];

    @ObfuscatedName("ic.as")
    public char field2301;

    @ObfuscatedName("ic.ay")
    public int field2300;

    @ObfuscatedName("ic.aj(II)Z")
    public boolean method431(int arg0) {
        this.method3742(arg0);
        this.field2298[arg0] = true;
        this.field2299[arg0] = true;
        this.field2289[arg0] = false;
        this.field2291[++this.field2292 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ic.al(II)Z")
    public boolean method424(int arg0) {
        this.field2298[arg0] = false;
        this.field2299[arg0] = false;
        this.field2289[arg0] = true;
        this.field2293[++this.field2294 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ic.ac(CI)Z")
    public boolean method425(char arg0) {
        int var2 = this.field2296 + 1 & 0x7F;
        if (this.field2302 != var2) {
            this.field2290[this.field2296] = -1;
            this.field2295[this.field2296] = arg0;
            this.field2296 = var2;
        }
        return false;
    }

    @ObfuscatedName("ic.ay(II)V")
    public void method3742(int arg0) {
        int var2 = this.field2296 + 1 & 0x7F;
        if (this.field2302 != var2) {
            this.field2290[this.field2296] = arg0;
            this.field2295[this.field2296] = 0;
            this.field2296 = var2;
        }
    }

    @ObfuscatedName("ic.ab(ZB)Z")
    public boolean method426(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ic.am(I)V")
    public void method3749() {
        this.field2302 = this.field2297;
        this.field2297 = this.field2296;
        this.field2292 = 0;
        this.field2294 = 0;
        Arrays.fill(this.field2299, false);
        Arrays.fill(this.field2289, false);
    }

    @ObfuscatedName("ic.az(I)Z")
    public final boolean method3745() {
        if (this.field2302 == this.field2297) {
            return false;
        } else {
            this.field2300 = this.field2290[this.field2302];
            this.field2301 = this.field2295[this.field2302];
            this.field2302 = this.field2302 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("ic.ae(IB)Z")
    public boolean method3746(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2299[arg0] : false;
    }

    @ObfuscatedName("ic.au(II)Z")
    public boolean method3741(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2298[arg0] : false;
    }

    @ObfuscatedName("ic.ag(II)Z")
    public boolean method3743(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2289[arg0] : false;
    }

    @ObfuscatedName("ic.at(I)[I")
    public int[] method3763() {
        int[] var1 = new int[this.field2292];
        for (int var2 = 0; var2 < this.field2292; var2++) {
            var1[var2] = this.field2291[var2];
        }
        return var1;
    }

    @ObfuscatedName("ic.af(B)[I")
    public int[] method3750() {
        int[] var1 = new int[this.field2294];
        for (int var2 = 0; var2 < this.field2294; var2++) {
            var1[var2] = this.field2293[var2];
        }
        return var1;
    }
}
