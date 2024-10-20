package deob;

import java.util.Arrays;

@ObfuscatedName("bc")
public class class28 {

    @ObfuscatedName("bc.ab")
    public int[] field136 = new int[112];

    @ObfuscatedName("bc.ak")
    public int[] field140 = new int[192];

    public class28() {
        Arrays.fill(this.field136, 3);
        Arrays.fill(this.field140, 3);
    }

    @ObfuscatedName("bc.at(III)V")
    public void method375(int arg0, int arg1) {
        if (this.method374(arg0) && this.method396(arg1)) {
            this.field136[arg0] = arg1;
        }
    }

    @ObfuscatedName("bc.an(CIB)V")
    public void method376(char arg0, int arg1) {
        if (this.method383(arg0) && this.method396(arg1)) {
            this.field140[arg0] = arg1;
        }
    }

    @ObfuscatedName("bc.av(II)I")
    public int method413(int arg0) {
        return this.method374(arg0) ? this.field136[arg0] : 0;
    }

    @ObfuscatedName("bc.as(CB)I")
    public int method378(char arg0) {
        return this.method383(arg0) ? this.field140[arg0] : 0;
    }

    @ObfuscatedName("bc.ax(II)Z")
    public boolean method379(int arg0) {
        return this.method374(arg0) && (this.field136[arg0] == 1 || this.field136[arg0] == 3);
    }

    @ObfuscatedName("bc.ap(CI)Z")
    public boolean method380(char arg0) {
        return this.method383(arg0) && (this.field140[arg0] == 1 || this.field140[arg0] == 3);
    }

    @ObfuscatedName("bc.ab(II)Z")
    public boolean method381(int arg0) {
        return this.method374(arg0) && (this.field136[arg0] == 2 || this.field136[arg0] == 3);
    }

    @ObfuscatedName("bc.ak(CB)Z")
    public boolean method382(char arg0) {
        return this.method383(arg0) && (this.field140[arg0] == 2 || this.field140[arg0] == 3);
    }

    @ObfuscatedName("bc.ae(II)Z")
    public boolean method374(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bc.af(CI)Z")
    public boolean method383(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bc.ao(II)Z")
    public boolean method396(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
