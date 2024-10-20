package deob;

import java.util.Arrays;

@ObfuscatedName("kh")
public class class270 implements class30 {

    @ObfuscatedName("kh.ae")
    public char[] field2979 = new char[128];

    @ObfuscatedName("kh.ag")
    public int[] field2980 = new int[128];

    @ObfuscatedName("kh.am")
    public int[] field2981 = new int[128];

    @ObfuscatedName("kh.ax")
    public int field2988 = 0;

    @ObfuscatedName("kh.aq")
    public int[] field2983 = new int[128];

    @ObfuscatedName("kh.af")
    public int field2984 = 0;

    @ObfuscatedName("kh.at")
    public int field2978 = 0;

    @ObfuscatedName("kh.au")
    public int field2982 = 0;

    @ObfuscatedName("kh.ar")
    public int field2987 = 0;

    @ObfuscatedName("kh.al")
    public boolean[] field2985 = new boolean[112];

    @ObfuscatedName("kh.ad")
    public boolean[] field2989 = new boolean[112];

    @ObfuscatedName("kh.ah")
    public boolean[] field2986 = new boolean[112];

    @ObfuscatedName("kh.ap")
    public char field2991;

    @ObfuscatedName("kh.ab")
    public int field2992;

    @ObfuscatedName("kh.ac(II)Z")
    public boolean method437(int arg0) {
        this.method5083(arg0);
        this.field2985[arg0] = true;
        this.field2989[arg0] = true;
        this.field2986[arg0] = false;
        if (this.field2988 < 128) {
            this.field2981[++this.field2988 - 1] = arg0;
        }
        return true;
    }

    @ObfuscatedName("kh.ae(II)Z")
    public boolean method427(int arg0) {
        this.field2985[arg0] = false;
        this.field2989[arg0] = false;
        this.field2986[arg0] = true;
        if (this.field2984 < 128) {
            this.field2983[++this.field2984 - 1] = arg0;
        }
        return true;
    }

    @ObfuscatedName("kh.ag(CI)Z")
    public boolean method428(char arg0) {
        int var2 = this.field2982 + 1 & 0x7F;
        if (this.field2978 != var2) {
            this.field2980[this.field2982] = -1;
            this.field2979[this.field2982] = arg0;
            this.field2982 = var2;
        }
        return false;
    }

    @ObfuscatedName("kh.ah(II)V")
    public void method5083(int arg0) {
        int var2 = this.field2982 + 1 & 0x7F;
        if (this.field2978 != var2) {
            this.field2980[this.field2982] = arg0;
            this.field2979[this.field2982] = 0;
            this.field2982 = var2;
        }
    }

    @ObfuscatedName("kh.am(ZI)Z")
    public boolean method429(boolean arg0) {
        return false;
    }

    @ObfuscatedName("kh.ap(I)V")
    public void method5074() {
        this.field2978 = this.field2987;
        this.field2987 = this.field2982;
        this.field2988 = 0;
        this.field2984 = 0;
        Arrays.fill(this.field2989, false);
        Arrays.fill(this.field2986, false);
    }

    @ObfuscatedName("kh.ab(B)Z")
    public final boolean method5075() {
        if (this.field2987 == this.field2978) {
            return false;
        } else {
            this.field2992 = this.field2980[this.field2978];
            this.field2991 = this.field2979[this.field2978];
            this.field2978 = this.field2978 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("kh.az(II)Z")
    public boolean method5076(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2989[arg0] : false;
    }

    @ObfuscatedName("kh.aa(II)Z")
    public boolean method5077(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2985[arg0] : false;
    }

    @ObfuscatedName("kh.ai(IB)Z")
    public boolean method5078(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2986[arg0] : false;
    }

    @ObfuscatedName("kh.ao(I)[I")
    public int[] method5079() {
        int[] var1 = new int[this.field2988];
        for (int var2 = 0; var2 < this.field2988; var2++) {
            var1[var2] = this.field2981[var2];
        }
        return var1;
    }

    @ObfuscatedName("kh.as(I)[I")
    public int[] method5091() {
        int[] var1 = new int[this.field2984];
        for (int var2 = 0; var2 < this.field2984; var2++) {
            var1[var2] = this.field2983[var2];
        }
        return var1;
    }
}
