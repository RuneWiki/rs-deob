package deob;

import java.util.Arrays;

@ObfuscatedName("bv")
public class class28 {

    @ObfuscatedName("bv.av")
    public int[] field145 = new int[112];

    @ObfuscatedName("bv.aq")
    public int[] field144 = new int[192];

    public class28() {
        Arrays.fill(this.field145, 3);
        Arrays.fill(this.field144, 3);
    }

    @ObfuscatedName("bv.aj(III)V")
    public void method378(int arg0, int arg1) {
        if (this.method386(arg0) && this.method391(arg1)) {
            this.field145[arg0] = arg1;
        }
    }

    @ObfuscatedName("bv.al(CIB)V")
    public void method379(char arg0, int arg1) {
        if (this.method412(arg0) && this.method391(arg1)) {
            this.field144[arg0] = arg1;
        }
    }

    @ObfuscatedName("bv.ac(II)I")
    public int method380(int arg0) {
        return this.method386(arg0) ? this.field145[arg0] : 0;
    }

    @ObfuscatedName("bv.ab(CI)I")
    public int method381(char arg0) {
        return this.method412(arg0) ? this.field144[arg0] : 0;
    }

    @ObfuscatedName("bv.an(II)Z")
    public boolean method382(int arg0) {
        return this.method386(arg0) && (this.field145[arg0] == 1 || this.field145[arg0] == 3);
    }

    @ObfuscatedName("bv.ao(CI)Z")
    public boolean method383(char arg0) {
        return this.method412(arg0) && (this.field144[arg0] == 1 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bv.av(II)Z")
    public boolean method384(int arg0) {
        return this.method386(arg0) && (this.field145[arg0] == 2 || this.field145[arg0] == 3);
    }

    @ObfuscatedName("bv.aq(CI)Z")
    public boolean method385(char arg0) {
        return this.method412(arg0) && (this.field144[arg0] == 2 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bv.ap(IB)Z")
    public boolean method386(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bv.ar(CB)Z")
    public boolean method412(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bv.ak(IB)Z")
    public boolean method391(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
