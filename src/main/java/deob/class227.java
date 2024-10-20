package deob;

import java.util.Arrays;

@ObfuscatedName("it")
public class class227 implements class30 {

    @ObfuscatedName("it.ac")
    public char[] field2375 = new char[128];

    @ObfuscatedName("it.al")
    public int[] field2380 = new int[128];

    @ObfuscatedName("it.ak")
    public int[] field2374 = new int[128];

    @ObfuscatedName("it.ax")
    public int field2377 = 0;

    @ObfuscatedName("it.ao")
    public int[] field2378 = new int[128];

    @ObfuscatedName("it.ah")
    public int field2379 = 0;

    @ObfuscatedName("it.ar")
    public int field2386 = 0;

    @ObfuscatedName("it.ab")
    public int field2381 = 0;

    @ObfuscatedName("it.am")
    public int field2382 = 0;

    @ObfuscatedName("it.av")
    public boolean[] field2383 = new boolean[112];

    @ObfuscatedName("it.ag")
    public boolean[] field2384 = new boolean[112];

    @ObfuscatedName("it.aa")
    public boolean[] field2385 = new boolean[112];

    @ObfuscatedName("it.ap")
    public char field2376;

    @ObfuscatedName("it.ay")
    public int field2387;

    @ObfuscatedName("it.ac(II)Z")
    public boolean method430(int arg0) {
        this.method3914(arg0);
        this.field2383[arg0] = true;
        this.field2384[arg0] = true;
        this.field2385[arg0] = false;
        this.field2374[++this.field2377 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("it.al(II)Z")
    public boolean method413(int arg0) {
        this.field2383[arg0] = false;
        this.field2384[arg0] = false;
        this.field2385[arg0] = true;
        this.field2378[++this.field2379 - 1] = arg0;
        return true;
    }

    @ObfuscatedName("it.ak(CB)Z")
    public boolean method422(char arg0) {
        int var2 = this.field2381 + 1 & 0x7F;
        if (this.field2386 != var2) {
            this.field2380[this.field2381] = -1;
            this.field2375[this.field2381] = arg0;
            this.field2381 = var2;
        }
        return false;
    }

    @ObfuscatedName("it.aw(II)V")
    public void method3914(int arg0) {
        int var2 = this.field2381 + 1 & 0x7F;
        if (this.field2386 != var2) {
            this.field2380[this.field2381] = arg0;
            this.field2375[this.field2381] = 0;
            this.field2381 = var2;
        }
    }

    @ObfuscatedName("it.ax(ZI)Z")
    public boolean method415(boolean arg0) {
        return false;
    }

    @ObfuscatedName("it.aq(B)V")
    public void method3912() {
        this.field2386 = this.field2382;
        this.field2382 = this.field2381;
        this.field2377 = 0;
        this.field2379 = 0;
        Arrays.fill(this.field2384, false);
        Arrays.fill(this.field2385, false);
    }

    @ObfuscatedName("it.az(I)Z")
    public final boolean method3915() {
        if (this.field2386 == this.field2382) {
            return false;
        } else {
            this.field2387 = this.field2380[this.field2386];
            this.field2376 = this.field2375[this.field2386];
            this.field2386 = this.field2386 + 1 & 0x7F;
            return true;
        }
    }

    @ObfuscatedName("it.at(II)Z")
    public boolean method3921(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2384[arg0] : false;
    }

    @ObfuscatedName("it.af(II)Z")
    public boolean method3924(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2383[arg0] : false;
    }

    @ObfuscatedName("it.ad(II)Z")
    public boolean method3917(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? this.field2385[arg0] : false;
    }

    @ObfuscatedName("it.bn(B)[I")
    public int[] method3941() {
        int[] var1 = new int[this.field2377];
        for (int var2 = 0; var2 < this.field2377; var2++) {
            var1[var2] = this.field2374[var2];
        }
        return var1;
    }

    @ObfuscatedName("it.bk(B)[I")
    public int[] method3935() {
        int[] var1 = new int[this.field2379];
        for (int var2 = 0; var2 < this.field2379; var2++) {
            var1[var2] = this.field2378[var2];
        }
        return var1;
    }
}
