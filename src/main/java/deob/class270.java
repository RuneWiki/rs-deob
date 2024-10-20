package deob;

import java.util.Arrays;

@ObfuscatedName("kr")
public class class270 implements class30 {

    @ObfuscatedName("kr.aw")
    public char[] field2986 = new char[128];

    @ObfuscatedName("kr.ak")
    public int[] field2984 = new int[128];

    @ObfuscatedName("kr.aj")
    public int[] field2987 = new int[128];

    @ObfuscatedName("kr.ai")
    public int field2991 = 0;

    @ObfuscatedName("kr.ay")
    public int[] field2985 = new int[128];

    @ObfuscatedName("kr.as")
    public int field2994 = 0;

    @ObfuscatedName("kr.ae")
    public int field2990 = 0;

    @ObfuscatedName("kr.am")
    public int field2992 = 0;

    @ObfuscatedName("kr.at")
    public int field2988 = 0;

    @ObfuscatedName("kr.au")
    public boolean[] field2998 = new boolean[112];

    @ObfuscatedName("kr.an")
    public boolean[] field2995 = new boolean[112];

    @ObfuscatedName("kr.ao")
    public boolean[] field2996 = new boolean[112];

    @ObfuscatedName("kr.af")
    public char field2997;

    @ObfuscatedName("kr.ar")
    public int field2989;

    @ObfuscatedName("kr.ap(IB)Z")
    public boolean method445(int arg0) {
        this.method5240(arg0);
        this.field2998[arg0] = true;
        this.field2995[arg0] = true;
        this.field2996[arg0] = false;
        if (this.field2991 < 128) {
            this.field2987[++this.field2991 - 1] = arg0;
        }
        return true;
    }

    @ObfuscatedName("kr.aw(IB)Z")
    public boolean method450(int arg0) {
        this.field2998[arg0] = false;
        this.field2995[arg0] = false;
        this.field2996[arg0] = true;
        if (this.field2994 < 128) {
            this.field2985[++this.field2994 - 1] = arg0;
        }
        return true;
    }

    @ObfuscatedName("kr.ak(CI)Z")
    public boolean method447(char arg0) {
        int var2 = this.field2992 + 1 & 0x7F;
        if (this.field2990 != var2) {
            this.field2984[this.field2992] = -1;
            this.field2986[this.field2992] = arg0;
            this.field2992 = var2;
        }
        return false;
    }

    @ObfuscatedName("kr.af(IB)V")
    public void method5240(int arg0) {
        int var2 = this.field2992 + 1 & 0x7F;
        if (this.field2990 != var2) {
            this.field2984[this.field2992] = arg0;
            this.field2986[this.field2992] = 0;
            this.field2992 = var2;
        }
    }

    @ObfuscatedName("kr.aj(ZB)Z")
    public boolean method442(boolean arg0) {
        return false;
    }

    @ObfuscatedName("kr.ar(I)V")
    public void method5241() {
        this.field2990 = this.field2988;
        this.field2988 = this.field2992;
        this.field2991 = 0;
        this.field2994 = 0;
        Arrays.fill(this.field2995, false);
        Arrays.fill(this.field2996, false);
    }

    @ObfuscatedName("kr.ab(I)Z")
    public final boolean method5242() {
        if (this.field2990 == this.field2988) {
            return false;
        } else {
            this.field2989 = this.field2984[this.field2990];
            this.field2997 = this.field2986[this.field2990];
            this.field2990 = this.field2990 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("kr.az(IB)Z")
    public boolean method5243(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2995[arg0] : false;
    }

    @ObfuscatedName("kr.ag(II)Z")
    public boolean method5249(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2998[arg0] : false;
    }

    @ObfuscatedName("kr.ad(II)Z")
    public boolean method5244(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2996[arg0] : false;
    }

    @ObfuscatedName("kr.ac(B)[I")
    public int[] method5245() {
        int[] var1 = new int[this.field2991];
        for (int var2 = 0; var2 < this.field2991; var2++) {
            var1[var2] = this.field2987[var2];
        }
        return var1;
    }

    @ObfuscatedName("kr.av(I)[I")
    public int[] method5246() {
        int[] var1 = new int[this.field2994];
        for (int var2 = 0; var2 < this.field2994; var2++) {
            var1[var2] = this.field2985[var2];
        }
        return var1;
    }
}
