package deob;

import java.util.Arrays;

@ObfuscatedName("bz")
public class class28 {

    @ObfuscatedName("bz.am")
    public int[] field116 = new int[112];

    @ObfuscatedName("bz.ac")
    public int[] field117 = new int[192];

    public class28() {
        Arrays.fill(this.field116, 3);
        Arrays.fill(this.field117, 3);
    }

    @ObfuscatedName("bz.ab(III)V")
    public void method357(int arg0, int arg1) {
        if (this.method365(arg0) && this.method375(arg1)) {
            this.field116[arg0] = arg1;
        }
    }

    @ObfuscatedName("bz.ay(CIB)V")
    public void method358(char arg0, int arg1) {
        if (this.method366(arg0) && this.method375(arg1)) {
            this.field117[arg0] = arg1;
        }
    }

    @ObfuscatedName("bz.an(IB)I")
    public int method359(int arg0) {
        return this.method365(arg0) ? this.field116[arg0] : 0;
    }

    @ObfuscatedName("bz.au(CI)I")
    public int method367(char arg0) {
        return this.method366(arg0) ? this.field117[arg0] : 0;
    }

    @ObfuscatedName("bz.ax(II)Z")
    public boolean method361(int arg0) {
        return this.method365(arg0) && (this.field116[arg0] == 1 || this.field116[arg0] == 3);
    }

    @ObfuscatedName("bz.ao(CI)Z")
    public boolean method394(char arg0) {
        return this.method366(arg0) && (this.field117[arg0] == 1 || this.field117[arg0] == 3);
    }

    @ObfuscatedName("bz.am(II)Z")
    public boolean method363(int arg0) {
        return this.method365(arg0) && (this.field116[arg0] == 2 || this.field116[arg0] == 3);
    }

    @ObfuscatedName("bz.ac(CI)Z")
    public boolean method360(char arg0) {
        return this.method366(arg0) && (this.field117[arg0] == 2 || this.field117[arg0] == 3);
    }

    @ObfuscatedName("bz.ae(II)Z")
    public boolean method365(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bz.ad(CB)Z")
    public boolean method366(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bz.aq(II)Z")
    public boolean method375(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
