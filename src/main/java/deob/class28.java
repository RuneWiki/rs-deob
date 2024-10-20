package deob;

import java.util.Arrays;

@ObfuscatedName("aa")
public class class28 {

    @ObfuscatedName("aa.i")
    public int[] field163 = new int[112];

    @ObfuscatedName("aa.n")
    public int[] field162 = new int[192];

    public class28() {
        Arrays.fill(this.field163, 3);
        Arrays.fill(this.field162, 3);
    }

    @ObfuscatedName("aa.f(III)V")
    public void method384(int arg0, int arg1) {
        if (this.method392(arg0) && this.method394(arg1)) {
            this.field163[arg0] = arg1;
        }
    }

    @ObfuscatedName("aa.w(CII)V")
    public void method410(char arg0, int arg1) {
        if (this.method416(arg0) && this.method394(arg1)) {
            this.field162[arg0] = arg1;
        }
    }

    @ObfuscatedName("aa.v(II)I")
    public int method386(int arg0) {
        return this.method392(arg0) ? this.field163[arg0] : 0;
    }

    @ObfuscatedName("aa.s(CI)I")
    public int method387(char arg0) {
        return this.method416(arg0) ? this.field162[arg0] : 0;
    }

    @ObfuscatedName("aa.z(IB)Z")
    public boolean method409(int arg0) {
        return this.method392(arg0) && (this.field163[arg0] == 1 || this.field163[arg0] == 3);
    }

    @ObfuscatedName("aa.j(CS)Z")
    public boolean method389(char arg0) {
        return this.method416(arg0) && (this.field162[arg0] == 1 || this.field162[arg0] == 3);
    }

    @ObfuscatedName("aa.i(II)Z")
    public boolean method404(int arg0) {
        return this.method392(arg0) && (this.field163[arg0] == 2 || this.field163[arg0] == 3);
    }

    @ObfuscatedName("aa.n(CB)Z")
    public boolean method391(char arg0) {
        return this.method416(arg0) && (this.field162[arg0] == 2 || this.field162[arg0] == 3);
    }

    @ObfuscatedName("aa.l(II)Z")
    public boolean method392(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("aa.k(CB)Z")
    public boolean method416(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("aa.c(II)Z")
    public boolean method394(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
