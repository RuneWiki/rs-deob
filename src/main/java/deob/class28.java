package deob;

import java.util.Arrays;

@ObfuscatedName("bj")
public class class28 {

    @ObfuscatedName("bj.az")
    public int[] field143 = new int[112];

    @ObfuscatedName("bj.ap")
    public int[] field144 = new int[192];

    public class28() {
        Arrays.fill(this.field143, 3);
        Arrays.fill(this.field144, 3);
    }

    @ObfuscatedName("bj.au(IIS)V")
    public void method388(int arg0, int arg1) {
        if (this.method415(arg0) && this.method390(arg1)) {
            this.field143[arg0] = arg1;
        }
    }

    @ObfuscatedName("bj.ae(CIB)V")
    public void method413(char arg0, int arg1) {
        if (this.method384(arg0) && this.method390(arg1)) {
            this.field144[arg0] = arg1;
        }
    }

    @ObfuscatedName("bj.ao(II)I")
    public int method383(int arg0) {
        return this.method415(arg0) ? this.field143[arg0] : 0;
    }

    @ObfuscatedName("bj.at(CB)I")
    public int method389(char arg0) {
        return this.method384(arg0) ? this.field144[arg0] : 0;
    }

    @ObfuscatedName("bj.ac(II)Z")
    public boolean method379(int arg0) {
        return this.method415(arg0) && (this.field143[arg0] == 1 || this.field143[arg0] == 3);
    }

    @ObfuscatedName("bj.ai(CB)Z")
    public boolean method385(char arg0) {
        return this.method384(arg0) && (this.field144[arg0] == 1 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bj.az(IB)Z")
    public boolean method414(int arg0) {
        return this.method415(arg0) && (this.field143[arg0] == 2 || this.field143[arg0] == 3);
    }

    @ObfuscatedName("bj.ap(CI)Z")
    public boolean method382(char arg0) {
        return this.method384(arg0) && (this.field144[arg0] == 2 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bj.aa(II)Z")
    public boolean method415(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bj.af(CB)Z")
    public boolean method384(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bj.ad(IB)Z")
    public boolean method390(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
