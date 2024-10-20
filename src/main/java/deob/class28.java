package deob;

import java.util.Arrays;

@ObfuscatedName("bj")
public class class28 {

    @ObfuscatedName("bj.as")
    public int[] field110 = new int[112];

    @ObfuscatedName("bj.ae")
    public int[] field111 = new int[192];

    public class28() {
        Arrays.fill(this.field110, 3);
        Arrays.fill(this.field111, 3);
    }

    @ObfuscatedName("bj.ap(IIB)V")
    public void method390(int arg0, int arg1) {
        if (this.method397(arg0) && this.method399(arg1)) {
            this.field110[arg0] = arg1;
        }
    }

    @ObfuscatedName("bj.aw(CIS)V")
    public void method395(char arg0, int arg1) {
        if (this.method398(arg0) && this.method399(arg1)) {
            this.field111[arg0] = arg1;
        }
    }

    @ObfuscatedName("bj.ak(IB)I")
    public int method392(int arg0) {
        return this.method397(arg0) ? this.field110[arg0] : 0;
    }

    @ObfuscatedName("bj.aj(CI)I")
    public int method430(char arg0) {
        return this.method398(arg0) ? this.field111[arg0] : 0;
    }

    @ObfuscatedName("bj.ai(IB)Z")
    public boolean method394(int arg0) {
        return this.method397(arg0) && (this.field110[arg0] == 1 || this.field110[arg0] == 3);
    }

    @ObfuscatedName("bj.ay(CB)Z")
    public boolean method391(char arg0) {
        return this.method398(arg0) && (this.field111[arg0] == 1 || this.field111[arg0] == 3);
    }

    @ObfuscatedName("bj.as(II)Z")
    public boolean method424(int arg0) {
        return this.method397(arg0) && (this.field110[arg0] == 2 || this.field110[arg0] == 3);
    }

    @ObfuscatedName("bj.ae(CB)Z")
    public boolean method396(char arg0) {
        return this.method398(arg0) && (this.field111[arg0] == 2 || this.field111[arg0] == 3);
    }

    @ObfuscatedName("bj.am(IS)Z")
    public boolean method397(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bj.at(CI)Z")
    public boolean method398(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bj.au(II)Z")
    public boolean method399(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
