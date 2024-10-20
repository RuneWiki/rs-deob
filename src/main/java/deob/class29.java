package deob;

import java.util.Arrays;

@ObfuscatedName("ah")
public class class29 {

    @ObfuscatedName("ah.y")
    public int[] field148 = new int[112];

    @ObfuscatedName("ah.d")
    public int[] field151 = new int[192];

    public class29() {
        Arrays.fill(this.field148, 3);
        Arrays.fill(this.field151, 3);
    }

    @ObfuscatedName("ah.a(III)V")
    public void method401(int arg0, int arg1) {
        if (this.method409(arg0) && this.method411(arg1)) {
            this.field148[arg0] = arg1;
        }
    }

    @ObfuscatedName("ah.f(CIB)V")
    public void method402(char arg0, int arg1) {
        if (this.method410(arg0) && this.method411(arg1)) {
            this.field151[arg0] = arg1;
        }
    }

    @ObfuscatedName("ah.c(II)I")
    public int method403(int arg0) {
        return this.method409(arg0) ? this.field148[arg0] : 0;
    }

    @ObfuscatedName("ah.x(CI)I")
    public int method404(char arg0) {
        return this.method410(arg0) ? this.field151[arg0] : 0;
    }

    @ObfuscatedName("ah.h(IB)Z")
    public boolean method405(int arg0) {
        return this.method409(arg0) && (this.field148[arg0] == 1 || this.field148[arg0] == 3);
    }

    @ObfuscatedName("ah.j(CI)Z")
    public boolean method406(char arg0) {
        return this.method410(arg0) && (this.field151[arg0] == 1 || this.field151[arg0] == 3);
    }

    @ObfuscatedName("ah.y(IB)Z")
    public boolean method424(int arg0) {
        return this.method409(arg0) && (this.field148[arg0] == 2 || this.field148[arg0] == 3);
    }

    @ObfuscatedName("ah.d(CB)Z")
    public boolean method421(char arg0) {
        return this.method410(arg0) && (this.field151[arg0] == 2 || this.field151[arg0] == 3);
    }

    @ObfuscatedName("ah.n(II)Z")
    public boolean method409(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("ah.r(CI)Z")
    public boolean method410(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("ah.l(II)Z")
    public boolean method411(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
