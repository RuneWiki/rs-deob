package deob;

import java.util.Arrays;

@ObfuscatedName("il")
public class class212 implements class30 {

    @ObfuscatedName("il.at")
    public char[] field2347 = new char[128];

    @ObfuscatedName("il.an")
    public int[] field2338 = new int[128];

    @ObfuscatedName("il.av")
    public int[] field2340 = new int[128];

    @ObfuscatedName("il.as")
    public int field2339 = 0;

    @ObfuscatedName("il.ax")
    public int[] field2342 = new int[128];

    @ObfuscatedName("il.ap")
    public int field2337 = 0;

    @ObfuscatedName("il.ab")
    public int field2343 = 0;

    @ObfuscatedName("il.ak")
    public int field2344 = 0;

    @ObfuscatedName("il.ae")
    public int field2345 = 0;

    @ObfuscatedName("il.af")
    public boolean[] field2346 = new boolean[112];

    @ObfuscatedName("il.ao")
    public boolean[] field2348 = new boolean[112];

    @ObfuscatedName("il.aa")
    public boolean[] field2353 = new boolean[112];

    @ObfuscatedName("il.aj")
    public char field2349;

    @ObfuscatedName("il.ad")
    public int field2350;

    @ObfuscatedName("il.at(II)Z")
    public boolean method417(int arg0) {
        this.method3798(arg0);
        this.field2346[arg0] = true;
        this.field2348[arg0] = true;
        this.field2353[arg0] = false;
        this.field2340[++this.field2339 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("il.an(IB)Z")
    public boolean method416(int arg0) {
        this.field2346[arg0] = false;
        this.field2348[arg0] = false;
        this.field2353[arg0] = true;
        this.field2342[++this.field2337 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("il.av(CB)Z")
    public boolean method418(char arg0) {
        int var2 = this.field2344 + 1 & 0x7F;
        if (this.field2343 != var2) {
            this.field2338[this.field2344] = -1;
            this.field2347[this.field2344] = arg0;
            this.field2344 = var2;
        }
        return false;
    }

    @ObfuscatedName("il.aa(IB)V")
    public void method3798(int arg0) {
        int var2 = this.field2344 + 1 & 0x7F;
        if (this.field2343 != var2) {
            this.field2338[this.field2344] = arg0;
            this.field2347[this.field2344] = 0;
            this.field2344 = var2;
        }
    }

    @ObfuscatedName("il.as(ZI)Z")
    public boolean method423(boolean arg0) {
        return false;
    }

    @ObfuscatedName("il.aj(I)V")
    public void method3799() {
        this.field2343 = this.field2345;
        this.field2345 = this.field2344;
        this.field2339 = 0;
        this.field2337 = 0;
        Arrays.fill(this.field2348, false);
        Arrays.fill(this.field2353, false);
    }

    @ObfuscatedName("il.ad(B)Z")
    public final boolean method3790() {
        if (this.field2345 == this.field2343) {
            return false;
        } else {
            this.field2350 = this.field2338[this.field2343];
            this.field2349 = this.field2347[this.field2343];
            this.field2343 = this.field2343 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("il.ac(IB)Z")
    public boolean method3822(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2348[arg0] : false;
    }

    @ObfuscatedName("il.ag(II)Z")
    public boolean method3791(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2346[arg0] : false;
    }

    @ObfuscatedName("il.ar(II)Z")
    public boolean method3792(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2353[arg0] : false;
    }

    @ObfuscatedName("il.ah(I)[I")
    public int[] method3793() {
        int[] var1 = new int[this.field2339];
        for (int var2 = 0; var2 < this.field2339; var2++) {
            var1[var2] = this.field2340[var2];
        }
        return var1;
    }

    @ObfuscatedName("il.az(I)[I")
    public int[] method3794() {
        int[] var1 = new int[this.field2337];
        for (int var2 = 0; var2 < this.field2337; var2++) {
            var1[var2] = this.field2342[var2];
        }
        return var1;
    }
}
