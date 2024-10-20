package deob;

import java.util.Arrays;

@ObfuscatedName("iz")
public class class213 implements class30 {

    @ObfuscatedName("iz.au")
    public char[] field2364 = new char[128];

    @ObfuscatedName("iz.ae")
    public int[] field2368 = new int[128];

    @ObfuscatedName("iz.ao")
    public int[] field2359 = new int[128];

    @ObfuscatedName("iz.at")
    public int field2360 = 0;

    @ObfuscatedName("iz.ac")
    public int[] field2361 = new int[128];

    @ObfuscatedName("iz.ai")
    public int field2362 = 0;

    @ObfuscatedName("iz.az")
    public int field2369 = 0;

    @ObfuscatedName("iz.ap")
    public int field2363 = 0;

    @ObfuscatedName("iz.aa")
    public int field2365 = 0;

    @ObfuscatedName("iz.af")
    public boolean[] field2366 = new boolean[112];

    @ObfuscatedName("iz.ad")
    public boolean[] field2367 = new boolean[112];

    @ObfuscatedName("iz.aq")
    public boolean[] field2358 = new boolean[112];

    @ObfuscatedName("iz.al")
    public char field2357;

    @ObfuscatedName("iz.an")
    public int field2370;

    @ObfuscatedName("iz.au(II)Z")
    public boolean method430(int arg0) {
        this.method3817(arg0);
        this.field2366[arg0] = true;
        this.field2367[arg0] = true;
        this.field2358[arg0] = false;
        this.field2359[++this.field2360 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("iz.ae(II)Z")
    public boolean method427(int arg0) {
        this.field2366[arg0] = false;
        this.field2367[arg0] = false;
        this.field2358[arg0] = true;
        this.field2361[++this.field2362 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("iz.ao(CI)Z")
    public boolean method428(char arg0) {
        int var2 = this.field2363 + 1 & 0x7F;
        if (this.field2369 != var2) {
            this.field2368[this.field2363] = -1;
            this.field2364[this.field2363] = arg0;
            this.field2363 = var2;
        }
        return false;
    }

    @ObfuscatedName("iz.ar(IB)V")
    public void method3817(int arg0) {
        int var2 = this.field2363 + 1 & 0x7F;
        if (this.field2369 != var2) {
            this.field2368[this.field2363] = arg0;
            this.field2364[this.field2363] = 0;
            this.field2363 = var2;
        }
    }

    @ObfuscatedName("iz.at(ZI)Z")
    public boolean method435(boolean arg0) {
        return false;
    }

    @ObfuscatedName("iz.ab(I)V")
    public void method3804() {
        this.field2369 = this.field2365;
        this.field2365 = this.field2363;
        this.field2360 = 0;
        this.field2362 = 0;
        Arrays.fill(this.field2367, false);
        Arrays.fill(this.field2358, false);
    }

    @ObfuscatedName("iz.ag(I)Z")
    public final boolean method3812() {
        if (this.field2369 == this.field2365) {
            return false;
        } else {
            this.field2370 = this.field2368[this.field2369];
            this.field2357 = this.field2364[this.field2369];
            this.field2369 = this.field2369 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("iz.am(II)Z")
    public boolean method3805(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2367[arg0] : false;
    }

    @ObfuscatedName("iz.ax(II)Z")
    public boolean method3811(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2366[arg0] : false;
    }

    @ObfuscatedName("iz.ah(IB)Z")
    public boolean method3803(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2358[arg0] : false;
    }

    @ObfuscatedName("iz.as(I)[I")
    public int[] method3807() {
        int[] var1 = new int[this.field2360];
        for (int var2 = 0; var2 < this.field2360; var2++) {
            var1[var2] = this.field2359[var2];
        }
        return var1;
    }

    @ObfuscatedName("iz.ay(B)[I")
    public int[] method3808() {
        int[] var1 = new int[this.field2362];
        for (int var2 = 0; var2 < this.field2362; var2++) {
            var1[var2] = this.field2361[var2];
        }
        return var1;
    }
}
