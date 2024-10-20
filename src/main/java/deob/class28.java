package deob;

import java.util.Arrays;

@ObfuscatedName("bz")
public class class28 {

    @ObfuscatedName("bz.ab")
    public int[] field122 = new int[112];

    @ObfuscatedName("bz.aw")
    public int[] field119 = new int[192];

    public class28() {
        Arrays.fill(this.field122, 3);
        Arrays.fill(this.field119, 3);
    }

    @ObfuscatedName("bz.az(III)V")
    public void method392(int arg0, int arg1) {
        if (this.method368(arg0) && this.method357(arg1)) {
            this.field122[arg0] = arg1;
        }
    }

    @ObfuscatedName("bz.ah(CII)V")
    public void method398(char arg0, int arg1) {
        if (this.method367(arg0) && this.method357(arg1)) {
            this.field119[arg0] = arg1;
        }
    }

    @ObfuscatedName("bz.af(IB)I")
    public int method360(int arg0) {
        return this.method368(arg0) ? this.field122[arg0] : 0;
    }

    @ObfuscatedName("bz.at(CB)I")
    public int method375(char arg0) {
        return this.method367(arg0) ? this.field119[arg0] : 0;
    }

    @ObfuscatedName("bz.an(II)Z")
    public boolean method362(int arg0) {
        return this.method368(arg0) && (this.field122[arg0] == 1 || this.field122[arg0] == 3);
    }

    @ObfuscatedName("bz.ao(CI)Z")
    public boolean method363(char arg0) {
        return this.method367(arg0) && (this.field119[arg0] == 1 || this.field119[arg0] == 3);
    }

    @ObfuscatedName("bz.ab(IB)Z")
    public boolean method364(int arg0) {
        return this.method368(arg0) && (this.field122[arg0] == 2 || this.field122[arg0] == 3);
    }

    @ObfuscatedName("bz.aw(CI)Z")
    public boolean method361(char arg0) {
        return this.method367(arg0) && (this.field119[arg0] == 2 || this.field119[arg0] == 3);
    }

    @ObfuscatedName("bz.ad(IB)Z")
    public boolean method368(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bz.al(CB)Z")
    public boolean method367(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bz.as(II)Z")
    public boolean method357(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
