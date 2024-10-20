package deob;

import java.util.Arrays;

@ObfuscatedName("ao")
public class class29 {

    @ObfuscatedName("ao.f")
    public int[] field155 = new int[112];

    @ObfuscatedName("ao.r")
    public int[] field156 = new int[192];

    public class29() {
        Arrays.fill(this.field155, 3);
        Arrays.fill(this.field156, 3);
    }

    @ObfuscatedName("ao.h(III)V")
    public void method391(int arg0, int arg1) {
        if (this.method393(arg0) && this.method394(arg1)) {
            this.field155[arg0] = arg1;
        }
    }

    @ObfuscatedName("ao.e(CII)V")
    public void method385(char arg0, int arg1) {
        if (this.method401(arg0) && this.method394(arg1)) {
            this.field156[arg0] = arg1;
        }
    }

    @ObfuscatedName("ao.v(IB)I")
    public int method384(int arg0) {
        return this.method393(arg0) ? this.field155[arg0] : 0;
    }

    @ObfuscatedName("ao.x(CI)I")
    public int method387(char arg0) {
        return this.method401(arg0) ? this.field156[arg0] : 0;
    }

    @ObfuscatedName("ao.m(II)Z")
    public boolean method413(int arg0) {
        return this.method393(arg0) && (this.field155[arg0] == 1 || this.field155[arg0] == 3);
    }

    @ObfuscatedName("ao.q(CI)Z")
    public boolean method389(char arg0) {
        return this.method401(arg0) && (this.field156[arg0] == 1 || this.field156[arg0] == 3);
    }

    @ObfuscatedName("ao.f(II)Z")
    public boolean method392(int arg0) {
        return this.method393(arg0) && (this.field155[arg0] == 2 || this.field155[arg0] == 3);
    }

    @ObfuscatedName("ao.r(CB)Z")
    public boolean method402(char arg0) {
        return this.method401(arg0) && (this.field156[arg0] == 2 || this.field156[arg0] == 3);
    }

    @ObfuscatedName("ao.u(IB)Z")
    public boolean method393(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("ao.b(CB)Z")
    public boolean method401(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("ao.j(II)Z")
    public boolean method394(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
