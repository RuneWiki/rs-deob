package deob;

import java.util.Arrays;

@ObfuscatedName("bf")
public class class28 {

    @ObfuscatedName("bf.at")
    public int[] field142 = new int[112];

    @ObfuscatedName("bf.ab")
    public int[] field140 = new int[192];

    public class28() {
        Arrays.fill(this.field142, 3);
        Arrays.fill(this.field140, 3);
    }

    @ObfuscatedName("bf.ak(III)V")
    public void method377(int arg0, int arg1) {
        if (this.method385(arg0) && this.method387(arg1)) {
            this.field142[arg0] = arg1;
        }
    }

    @ObfuscatedName("bf.al(CIB)V")
    public void method378(char arg0, int arg1) {
        if (this.method386(arg0) && this.method387(arg1)) {
            this.field140[arg0] = arg1;
        }
    }

    @ObfuscatedName("bf.aj(II)I")
    public int method396(int arg0) {
        return this.method385(arg0) ? this.field142[arg0] : 0;
    }

    @ObfuscatedName("bf.az(CI)I")
    public int method382(char arg0) {
        return this.method386(arg0) ? this.field140[arg0] : 0;
    }

    @ObfuscatedName("bf.af(IB)Z")
    public boolean method381(int arg0) {
        return this.method385(arg0) && (this.field142[arg0] == 1 || this.field142[arg0] == 3);
    }

    @ObfuscatedName("bf.aa(CI)Z")
    public boolean method379(char arg0) {
        return this.method386(arg0) && (this.field140[arg0] == 1 || this.field140[arg0] == 3);
    }

    @ObfuscatedName("bf.at(II)Z")
    public boolean method383(int arg0) {
        return this.method385(arg0) && (this.field142[arg0] == 2 || this.field142[arg0] == 3);
    }

    @ObfuscatedName("bf.ab(CB)Z")
    public boolean method384(char arg0) {
        return this.method386(arg0) && (this.field140[arg0] == 2 || this.field140[arg0] == 3);
    }

    @ObfuscatedName("bf.ac(II)Z")
    public boolean method385(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bf.ao(CI)Z")
    public boolean method386(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bf.ah(II)Z")
    public boolean method387(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
