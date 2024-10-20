package deob;

import java.util.Arrays;

@ObfuscatedName("iw")
public class class229 implements class30 {

    @ObfuscatedName("iw.aq")
    public char[] field2434 = new char[128];

    @ObfuscatedName("iw.aw")
    public int[] field2422 = new int[128];

    @ObfuscatedName("iw.al")
    public int[] field2424 = new int[128];

    @ObfuscatedName("iw.ai")
    public int field2432 = 0;

    @ObfuscatedName("iw.ar")
    public int[] field2426 = new int[128];

    @ObfuscatedName("iw.as")
    public int field2425 = 0;

    @ObfuscatedName("iw.aa")
    public int field2428 = 0;

    @ObfuscatedName("iw.az")
    public int field2427 = 0;

    @ObfuscatedName("iw.ao")
    public int field2430 = 0;

    @ObfuscatedName("iw.au")
    public boolean[] field2431 = new boolean[112];

    @ObfuscatedName("iw.ak")
    public boolean[] field2423 = new boolean[112];

    @ObfuscatedName("iw.ah")
    public boolean[] field2433 = new boolean[112];

    @ObfuscatedName("iw.aj")
    public char field2429;

    @ObfuscatedName("iw.af")
    public int field2435;

    @ObfuscatedName("iw.aq(II)Z")
    public boolean method403(int arg0) {
        this.method4040(arg0);
        this.field2431[arg0] = true;
        this.field2423[arg0] = true;
        this.field2433[arg0] = false;
        this.field2424[++this.field2432 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("iw.aw(II)Z")
    public boolean method396(int arg0) {
        this.field2431[arg0] = false;
        this.field2423[arg0] = false;
        this.field2433[arg0] = true;
        this.field2426[++this.field2425 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("iw.al(CB)Z")
    public boolean method402(char arg0) {
        int var2 = this.field2427 + 1 & 0x7F;
        if (this.field2428 != var2) {
            this.field2422[this.field2427] = -1;
            this.field2434[this.field2427] = arg0;
            this.field2427 = var2;
        }
        return false;
    }

    @ObfuscatedName("iw.ag(II)V")
    public void method4040(int arg0) {
        int var2 = this.field2427 + 1 & 0x7F;
        if (this.field2428 != var2) {
            this.field2422[this.field2427] = arg0;
            this.field2434[this.field2427] = 0;
            this.field2427 = var2;
        }
    }

    @ObfuscatedName("iw.ai(ZI)Z")
    public boolean method401(boolean arg0) {
        return false;
    }

    @ObfuscatedName("iw.am(I)V")
    public void method4042() {
        this.field2428 = this.field2430;
        this.field2430 = this.field2427;
        this.field2432 = 0;
        this.field2425 = 0;
        Arrays.fill(this.field2423, false);
        Arrays.fill(this.field2433, false);
    }

    @ObfuscatedName("iw.ad(I)Z")
    public final boolean method4043() {
        if (this.field2430 == this.field2428) {
            return false;
        } else {
            this.field2435 = this.field2422[this.field2428];
            this.field2429 = this.field2434[this.field2428];
            this.field2428 = this.field2428 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("iw.at(II)Z")
    public boolean method4052(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2423[arg0] : false;
    }

    @ObfuscatedName("iw.ay(IB)Z")
    public boolean method4065(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2431[arg0] : false;
    }

    @ObfuscatedName("iw.ae(II)Z")
    public boolean method4047(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2433[arg0] : false;
    }

    @ObfuscatedName("iw.ac(B)[I")
    public int[] method4045() {
        int[] var1 = new int[this.field2432];
        for (int var2 = 0; var2 < this.field2432; var2++) {
            var1[var2] = this.field2424[var2];
        }
        return var1;
    }

    @ObfuscatedName("iw.ab(I)[I")
    public int[] method4046() {
        int[] var1 = new int[this.field2425];
        for (int var2 = 0; var2 < this.field2425; var2++) {
            var1[var2] = this.field2426[var2];
        }
        return var1;
    }
}
