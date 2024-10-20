package deob;

import java.util.Arrays;

@ObfuscatedName("bh")
public class class28 {

    @ObfuscatedName("bh.af")
    public int[] field120 = new int[112];

    @ObfuscatedName("bh.at")
    public int[] field116 = new int[192];

    public class28() {
        Arrays.fill(this.field120, 3);
        Arrays.fill(this.field116, 3);
    }

    @ObfuscatedName("bh.ac(IIB)V")
    public void method372(int arg0, int arg1) {
        if (this.method409(arg0) && this.method375(arg1)) {
            this.field120[arg0] = arg1;
        }
    }

    @ObfuscatedName("bh.ae(CII)V")
    public void method373(char arg0, int arg1) {
        if (this.method403(arg0) && this.method375(arg1)) {
            this.field116[arg0] = arg1;
        }
    }

    @ObfuscatedName("bh.ag(II)I")
    public int method374(int arg0) {
        return this.method409(arg0) ? this.field120[arg0] : 0;
    }

    @ObfuscatedName("bh.am(CI)I")
    public int method385(char arg0) {
        return this.method403(arg0) ? this.field116[arg0] : 0;
    }

    @ObfuscatedName("bh.ax(II)Z")
    public boolean method376(int arg0) {
        return this.method409(arg0) && (this.field120[arg0] == 1 || this.field120[arg0] == 3);
    }

    @ObfuscatedName("bh.aq(CI)Z")
    public boolean method379(char arg0) {
        return this.method403(arg0) && (this.field116[arg0] == 1 || this.field116[arg0] == 3);
    }

    @ObfuscatedName("bh.af(II)Z")
    public boolean method378(int arg0) {
        return this.method409(arg0) && (this.field120[arg0] == 2 || this.field120[arg0] == 3);
    }

    @ObfuscatedName("bh.at(CB)Z")
    public boolean method397(char arg0) {
        return this.method403(arg0) && (this.field116[arg0] == 2 || this.field116[arg0] == 3);
    }

    @ObfuscatedName("bh.au(IB)Z")
    public boolean method409(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bh.ar(CI)Z")
    public boolean method403(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bh.al(II)Z")
    public boolean method375(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
