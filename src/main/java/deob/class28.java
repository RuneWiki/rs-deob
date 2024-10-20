package deob;

import java.util.Arrays;

@ObfuscatedName("bb")
public class class28 {

    @ObfuscatedName("bb.aq")
    public int[] field141 = new int[112];

    @ObfuscatedName("bb.al")
    public int[] field147 = new int[192];

    public class28() {
        Arrays.fill(this.field141, 3);
        Arrays.fill(this.field147, 3);
    }

    @ObfuscatedName("bb.af(IIB)V")
    public void method400(int arg0, int arg1) {
        if (this.method407(arg0) && this.method420(arg1)) {
            this.field141[arg0] = arg1;
        }
    }

    @ObfuscatedName("bb.an(CII)V")
    public void method401(char arg0, int arg1) {
        if (this.method439(arg0) && this.method420(arg1)) {
            this.field147[arg0] = arg1;
        }
    }

    @ObfuscatedName("bb.aw(II)I")
    public int method402(int arg0) {
        return this.method407(arg0) ? this.field141[arg0] : 0;
    }

    @ObfuscatedName("bb.ac(CB)I")
    public int method403(char arg0) {
        return this.method439(arg0) ? this.field147[arg0] : 0;
    }

    @ObfuscatedName("bb.au(II)Z")
    public boolean method404(int arg0) {
        return this.method407(arg0) && (this.field141[arg0] == 1 || this.field141[arg0] == 3);
    }

    @ObfuscatedName("bb.ab(CI)Z")
    public boolean method405(char arg0) {
        return this.method439(arg0) && (this.field147[arg0] == 1 || this.field147[arg0] == 3);
    }

    @ObfuscatedName("bb.aq(II)Z")
    public boolean method406(int arg0) {
        return this.method407(arg0) && (this.field141[arg0] == 2 || this.field141[arg0] == 3);
    }

    @ObfuscatedName("bb.al(CI)Z")
    public boolean method434(char arg0) {
        return this.method439(arg0) && (this.field147[arg0] == 2 || this.field147[arg0] == 3);
    }

    @ObfuscatedName("bb.at(II)Z")
    public boolean method407(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bb.aa(CI)Z")
    public boolean method439(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bb.ay(II)Z")
    public boolean method420(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
