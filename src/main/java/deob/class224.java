package deob;

import java.util.Arrays;

@ObfuscatedName("il")
public class class224 implements class30 {

    @ObfuscatedName("il.at")
    public char[] field2367 = new char[128];

    @ObfuscatedName("il.ah")
    public int[] field2353 = new int[128];

    @ObfuscatedName("il.ar")
    public int[] field2354 = new int[128];

    @ObfuscatedName("il.ao")
    public int field2355 = 0;

    @ObfuscatedName("il.ab")
    public int[] field2356 = new int[128];

    @ObfuscatedName("il.au")
    public int field2357 = 0;

    @ObfuscatedName("il.aa")
    public int field2360 = 0;

    @ObfuscatedName("il.ac")
    public int field2359 = 0;

    @ObfuscatedName("il.al")
    public int field2366 = 0;

    @ObfuscatedName("il.az")
    public boolean[] field2358 = new boolean[112];

    @ObfuscatedName("il.ap")
    public boolean[] field2362 = new boolean[112];

    @ObfuscatedName("il.av")
    public boolean[] field2363 = new boolean[112];

    @ObfuscatedName("il.ax")
    public char field2364;

    @ObfuscatedName("il.as")
    public int field2361;

    @ObfuscatedName("il.at(IS)Z")
    public boolean method453(int arg0) {
        this.method3948(arg0);
        this.field2358[arg0] = true;
        this.field2362[arg0] = true;
        this.field2363[arg0] = false;
        this.field2354[++this.field2355 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("il.ah(II)Z")
    public boolean method455(int arg0) {
        this.field2358[arg0] = false;
        this.field2362[arg0] = false;
        this.field2363[arg0] = true;
        this.field2356[++this.field2357 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("il.ar(CI)Z")
    public boolean method447(char arg0) {
        int var2 = this.field2359 + 1 & 0x7F;
        if (this.field2360 != var2) {
            this.field2353[this.field2359] = -1;
            this.field2367[this.field2359] = arg0;
            this.field2359 = var2;
        }
        return false;
    }

    @ObfuscatedName("il.av(IS)V")
    public void method3948(int arg0) {
        int var2 = this.field2359 + 1 & 0x7F;
        if (this.field2360 != var2) {
            this.field2353[this.field2359] = arg0;
            this.field2367[this.field2359] = 0;
            this.field2359 = var2;
        }
    }

    @ObfuscatedName("il.ao(ZB)Z")
    public boolean method445(boolean arg0) {
        return false;
    }

    @ObfuscatedName("il.ax(I)V")
    public void method3949() {
        this.field2360 = this.field2366;
        this.field2366 = this.field2359;
        this.field2355 = 0;
        this.field2357 = 0;
        Arrays.fill(this.field2362, false);
        Arrays.fill(this.field2363, false);
    }

    @ObfuscatedName("il.as(I)Z")
    public final boolean method3956() {
        if (this.field2366 == this.field2360) {
            return false;
        } else {
            this.field2361 = this.field2353[this.field2360];
            this.field2364 = this.field2367[this.field2360];
            this.field2360 = this.field2360 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("il.ay(IB)Z")
    public boolean method3951(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2362[arg0] : false;
    }

    @ObfuscatedName("il.ak(II)Z")
    public boolean method3952(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2358[arg0] : false;
    }

    @ObfuscatedName("il.aj(II)Z")
    public boolean method3953(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2363[arg0] : false;
    }

    @ObfuscatedName("il.am(I)[I")
    public int[] method3954() {
        int[] var1 = new int[this.field2355];
        for (int var2 = 0; var2 < this.field2355; var2++) {
            var1[var2] = this.field2354[var2];
        }
        return var1;
    }

    @ObfuscatedName("il.aq(I)[I")
    public int[] method3955() {
        int[] var1 = new int[this.field2357];
        for (int var2 = 0; var2 < this.field2357; var2++) {
            var1[var2] = this.field2356[var2];
        }
        return var1;
    }
}
