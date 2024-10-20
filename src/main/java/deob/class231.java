package deob;

import java.util.Arrays;

@ObfuscatedName("is")
public class class231 implements class30 {

    @ObfuscatedName("is.ak")
    public char[] field2467 = new char[128];

    @ObfuscatedName("is.al")
    public int[] field2466 = new int[128];

    @ObfuscatedName("is.aj")
    public int[] field2474 = new int[128];

    @ObfuscatedName("is.az")
    public int field2468 = 0;

    @ObfuscatedName("is.af")
    public int[] field2469 = new int[128];

    @ObfuscatedName("is.aa")
    public int field2470 = 0;

    @ObfuscatedName("is.at")
    public int field2476 = 0;

    @ObfuscatedName("is.ab")
    public int field2472 = 0;

    @ObfuscatedName("is.ac")
    public int field2473 = 0;

    @ObfuscatedName("is.ao")
    public boolean[] field2478 = new boolean[112];

    @ObfuscatedName("is.ah")
    public boolean[] field2475 = new boolean[112];

    @ObfuscatedName("is.av")
    public boolean[] field2471 = new boolean[112];

    @ObfuscatedName("is.aq")
    public char field2465;

    @ObfuscatedName("is.ap")
    public int field2477;

    @ObfuscatedName("is.ak(II)Z")
    public boolean method434(int arg0) {
        this.method4084(arg0);
        this.field2478[arg0] = true;
        this.field2475[arg0] = true;
        this.field2471[arg0] = false;
        this.field2474[++this.field2468 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("is.al(II)Z")
    public boolean method436(int arg0) {
        this.field2478[arg0] = false;
        this.field2475[arg0] = false;
        this.field2471[arg0] = true;
        this.field2469[++this.field2470 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("is.aj(CI)Z")
    public boolean method423(char arg0) {
        int var2 = this.field2472 + 1 & 0x7F;
        if (this.field2476 != var2) {
            this.field2466[this.field2472] = -1;
            this.field2467[this.field2472] = arg0;
            this.field2472 = var2;
        }
        return false;
    }

    @ObfuscatedName("is.as(IB)V")
    public void method4084(int arg0) {
        int var2 = this.field2472 + 1 & 0x7F;
        if (this.field2476 != var2) {
            this.field2466[this.field2472] = arg0;
            this.field2467[this.field2472] = 0;
            this.field2472 = var2;
        }
    }

    @ObfuscatedName("is.az(ZS)Z")
    public boolean method437(boolean arg0) {
        return false;
    }

    @ObfuscatedName("is.aw(I)V")
    public void method4085() {
        this.field2476 = this.field2473;
        this.field2473 = this.field2472;
        this.field2468 = 0;
        this.field2470 = 0;
        Arrays.fill(this.field2475, false);
        Arrays.fill(this.field2471, false);
    }

    @ObfuscatedName("is.ad(I)Z")
    public final boolean method4098() {
        if (this.field2476 == this.field2473) {
            return false;
        } else {
            this.field2477 = this.field2466[this.field2476];
            this.field2465 = this.field2467[this.field2476];
            this.field2476 = this.field2476 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("is.ai(II)Z")
    public boolean method4108(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2475[arg0] : false;
    }

    @ObfuscatedName("is.an(II)Z")
    public boolean method4087(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2478[arg0] : false;
    }

    @ObfuscatedName("is.am(II)Z")
    public boolean method4088(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2471[arg0] : false;
    }

    @ObfuscatedName("is.ar(I)[I")
    public int[] method4091() {
        int[] var1 = new int[this.field2468];
        for (int var2 = 0; var2 < this.field2468; var2++) {
            var1[var2] = this.field2474[var2];
        }
        return var1;
    }

    @ObfuscatedName("is.ag(I)[I")
    public int[] method4104() {
        int[] var1 = new int[this.field2470];
        for (int var2 = 0; var2 < this.field2470; var2++) {
            var1[var2] = this.field2469[var2];
        }
        return var1;
    }
}
