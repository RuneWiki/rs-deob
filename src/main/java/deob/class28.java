package deob;

import java.util.Arrays;

@ObfuscatedName("bk")
public class class28 {

    @ObfuscatedName("bk.ar")
    public int[] field149 = new int[112];

    @ObfuscatedName("bk.ab")
    public int[] field144 = new int[192];

    public class28() {
        Arrays.fill(this.field149, 3);
        Arrays.fill(this.field144, 3);
    }

    @ObfuscatedName("bk.ac(III)V")
    public void method363(int arg0, int arg1) {
        if (this.method371(arg0) && this.method373(arg1)) {
            this.field149[arg0] = arg1;
        }
    }

    @ObfuscatedName("bk.al(CII)V")
    public void method364(char arg0, int arg1) {
        if (this.method406(arg0) && this.method373(arg1)) {
            this.field144[arg0] = arg1;
        }
    }

    @ObfuscatedName("bk.ak(IB)I")
    public int method365(int arg0) {
        return this.method371(arg0) ? this.field149[arg0] : 0;
    }

    @ObfuscatedName("bk.ax(CI)I")
    public int method402(char arg0) {
        return this.method406(arg0) ? this.field144[arg0] : 0;
    }

    @ObfuscatedName("bk.ao(IB)Z")
    public boolean method367(int arg0) {
        return this.method371(arg0) && (this.field149[arg0] == 1 || this.field149[arg0] == 3);
    }

    @ObfuscatedName("bk.ah(CB)Z")
    public boolean method368(char arg0) {
        return this.method406(arg0) && (this.field144[arg0] == 1 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bk.ar(II)Z")
    public boolean method378(int arg0) {
        return this.method371(arg0) && (this.field149[arg0] == 2 || this.field149[arg0] == 3);
    }

    @ObfuscatedName("bk.ab(CB)Z")
    public boolean method370(char arg0) {
        return this.method406(arg0) && (this.field144[arg0] == 2 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bk.am(IB)Z")
    public boolean method371(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bk.av(CI)Z")
    public boolean method406(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bk.ag(II)Z")
    public boolean method373(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
