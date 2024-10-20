package deob;

import java.util.Arrays;

@ObfuscatedName("ij")
public class class232 implements class30 {

    @ObfuscatedName("ij.aq")
    public char[] field2462 = new char[128];

    @ObfuscatedName("ij.ad")
    public int[] field2449 = new int[128];

    @ObfuscatedName("ij.ag")
    public int[] field2458 = new int[128];

    @ObfuscatedName("ij.ak")
    public int field2451 = 0;

    @ObfuscatedName("ij.ap")
    public int[] field2452 = new int[128];

    @ObfuscatedName("ij.an")
    public int field2453 = 0;

    @ObfuscatedName("ij.aj")
    public int field2454 = 0;

    @ObfuscatedName("ij.av")
    public int field2457 = 0;

    @ObfuscatedName("ij.ab")
    public int field2456 = 0;

    @ObfuscatedName("ij.ai")
    public boolean[] field2450 = new boolean[112];

    @ObfuscatedName("ij.ae")
    public boolean[] field2455 = new boolean[112];

    @ObfuscatedName("ij.au")
    public boolean[] field2459 = new boolean[112];

    @ObfuscatedName("ij.ah")
    public char field2460;

    @ObfuscatedName("ij.az")
    public int field2461;

    @ObfuscatedName("ij.aq(II)Z")
    public boolean method439(int arg0) {
        this.method4033(arg0);
        this.field2450[arg0] = true;
        this.field2455[arg0] = true;
        this.field2459[arg0] = false;
        this.field2458[++this.field2451 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ij.ad(IB)Z")
    public boolean method441(int arg0) {
        this.field2450[arg0] = false;
        this.field2455[arg0] = false;
        this.field2459[arg0] = true;
        this.field2452[++this.field2453 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("ij.ag(CI)Z")
    public boolean method433(char arg0) {
        int var2 = this.field2457 + 1 & 0x7F;
        if (this.field2454 != var2) {
            this.field2449[this.field2457] = -1;
            this.field2462[this.field2457] = arg0;
            this.field2457 = var2;
        }
        return false;
    }

    @ObfuscatedName("ij.au(II)V")
    public void method4033(int arg0) {
        int var2 = this.field2457 + 1 & 0x7F;
        if (this.field2454 != var2) {
            this.field2449[this.field2457] = arg0;
            this.field2462[this.field2457] = 0;
            this.field2457 = var2;
        }
    }

    @ObfuscatedName("ij.ak(ZS)Z")
    public boolean method434(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ij.ah(B)V")
    public void method4053() {
        this.field2454 = this.field2456;
        this.field2456 = this.field2457;
        this.field2451 = 0;
        this.field2453 = 0;
        Arrays.fill(this.field2455, false);
        Arrays.fill(this.field2459, false);
    }

    @ObfuscatedName("ij.az(B)Z")
    public final boolean method4034() {
        if (this.field2456 == this.field2454) {
            return false;
        } else {
            this.field2461 = this.field2449[this.field2454];
            this.field2460 = this.field2462[this.field2454];
            this.field2454 = this.field2454 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("ij.ax(II)Z")
    public boolean method4035(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2455[arg0] : false;
    }

    @ObfuscatedName("ij.ac(II)Z")
    public boolean method4036(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2450[arg0] : false;
    }

    @ObfuscatedName("ij.al(II)Z")
    public boolean method4037(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2459[arg0] : false;
    }

    @ObfuscatedName("ij.ay(I)[I")
    public int[] method4038() {
        int[] var1 = new int[this.field2451];
        for (int var2 = 0; var2 < this.field2451; var2++) {
            var1[var2] = this.field2458[var2];
        }
        return var1;
    }

    @ObfuscatedName("ij.ao(B)[I")
    public int[] method4039() {
        int[] var1 = new int[this.field2453];
        for (int var2 = 0; var2 < this.field2453; var2++) {
            var1[var2] = this.field2452[var2];
        }
        return var1;
    }
}
