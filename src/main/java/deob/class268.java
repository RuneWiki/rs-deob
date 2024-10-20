package deob;

import java.util.Arrays;

@ObfuscatedName("kk")
public class class268 implements class30 {

    @ObfuscatedName("kk.ab")
    public char[] field2924 = new char[128];

    @ObfuscatedName("kk.ay")
    public int[] field2930 = new int[128];

    @ObfuscatedName("kk.an")
    public int[] field2921 = new int[128];

    @ObfuscatedName("kk.au")
    public int field2919 = 0;

    @ObfuscatedName("kk.ax")
    public int[] field2923 = new int[128];

    @ObfuscatedName("kk.ao")
    public int field2920 = 0;

    @ObfuscatedName("kk.am")
    public int field2925 = 0;

    @ObfuscatedName("kk.ac")
    public int field2926 = 0;

    @ObfuscatedName("kk.ae")
    public int field2922 = 0;

    @ObfuscatedName("kk.ad")
    public boolean[] field2928 = new boolean[112];

    @ObfuscatedName("kk.aq")
    public boolean[] field2929 = new boolean[112];

    @ObfuscatedName("kk.al")
    public boolean[] field2927 = new boolean[112];

    @ObfuscatedName("kk.aj")
    public char field2932;

    @ObfuscatedName("kk.as")
    public int field2931;

    @ObfuscatedName("kk.ab(IB)Z")
    public boolean method402(int arg0) {
        this.method4936(arg0);
        this.field2928[arg0] = true;
        this.field2929[arg0] = true;
        this.field2927[arg0] = false;
        this.field2921[++this.field2919 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("kk.ay(II)Z")
    public boolean method400(int arg0) {
        this.field2928[arg0] = false;
        this.field2929[arg0] = false;
        this.field2927[arg0] = true;
        this.field2923[++this.field2920 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("kk.an(CI)Z")
    public boolean method405(char arg0) {
        int var2 = this.field2926 + 1 & 0x7F;
        if (this.field2925 != var2) {
            this.field2930[this.field2926] = -1;
            this.field2924[this.field2926] = arg0;
            this.field2926 = var2;
        }
        return false;
    }

    @ObfuscatedName("kk.aw(IB)V")
    public void method4936(int arg0) {
        int var2 = this.field2926 + 1 & 0x7F;
        if (this.field2925 != var2) {
            this.field2930[this.field2926] = arg0;
            this.field2924[this.field2926] = 0;
            this.field2926 = var2;
        }
    }

    @ObfuscatedName("kk.au(ZI)Z")
    public boolean method399(boolean arg0) {
        return false;
    }

    @ObfuscatedName("kk.af(B)V")
    public void method4944() {
        this.field2925 = this.field2922;
        this.field2922 = this.field2926;
        this.field2919 = 0;
        this.field2920 = 0;
        Arrays.fill(this.field2929, false);
        Arrays.fill(this.field2927, false);
    }

    @ObfuscatedName("kk.aa(I)Z")
    public final boolean method4948() {
        if (this.field2925 == this.field2922) {
            return false;
        } else {
            this.field2931 = this.field2930[this.field2925];
            this.field2932 = this.field2924[this.field2925];
            this.field2925 = this.field2925 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("kk.ah(IB)Z")
    public boolean method4939(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2929[arg0] : false;
    }

    @ObfuscatedName("kk.ag(IB)Z")
    public boolean method4940(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2928[arg0] : false;
    }

    @ObfuscatedName("kk.av(IB)Z")
    public boolean method4946(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2927[arg0] : false;
    }

    @ObfuscatedName("kk.ar(B)[I")
    public int[] method4935() {
        int[] var1 = new int[this.field2919];
        for (int var2 = 0; var2 < this.field2919; var2++) {
            var1[var2] = this.field2921[var2];
        }
        return var1;
    }

    @ObfuscatedName("kk.ap(I)[I")
    public int[] method4942() {
        int[] var1 = new int[this.field2920];
        for (int var2 = 0; var2 < this.field2920; var2++) {
            var1[var2] = this.field2923[var2];
        }
        return var1;
    }
}
