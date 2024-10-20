package deob;

import java.util.Arrays;

@ObfuscatedName("bb")
public class class28 {

    @ObfuscatedName("bb.ag")
    public int[] field144 = new int[112];

    @ObfuscatedName("bb.az")
    public int[] field145 = new int[192];

    public class28() {
        Arrays.fill(this.field144, 3);
        Arrays.fill(this.field145, 3);
    }

    @ObfuscatedName("bb.aw(IIB)V")
    public void method382(int arg0, int arg1) {
        if (this.method390(arg0) && this.method392(arg1)) {
            this.field144[arg0] = arg1;
        }
    }

    @ObfuscatedName("bb.ay(CII)V")
    public void method383(char arg0, int arg1) {
        if (this.method402(arg0) && this.method392(arg1)) {
            this.field145[arg0] = arg1;
        }
    }

    @ObfuscatedName("bb.ar(IB)I")
    public int method384(int arg0) {
        return this.method390(arg0) ? this.field144[arg0] : 0;
    }

    @ObfuscatedName("bb.am(CS)I")
    public int method381(char arg0) {
        return this.method402(arg0) ? this.field145[arg0] : 0;
    }

    @ObfuscatedName("bb.as(II)Z")
    public boolean method386(int arg0) {
        return this.method390(arg0) && (this.field144[arg0] == 1 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bb.aj(CI)Z")
    public boolean method387(char arg0) {
        return this.method402(arg0) && (this.field145[arg0] == 1 || this.field145[arg0] == 3);
    }

    @ObfuscatedName("bb.ag(II)Z")
    public boolean method389(int arg0) {
        return this.method390(arg0) && (this.field144[arg0] == 2 || this.field144[arg0] == 3);
    }

    @ObfuscatedName("bb.az(CI)Z")
    public boolean method397(char arg0) {
        return this.method402(arg0) && (this.field145[arg0] == 2 || this.field145[arg0] == 3);
    }

    @ObfuscatedName("bb.av(II)Z")
    public boolean method390(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bb.ap(CB)Z")
    public boolean method402(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bb.aq(II)Z")
    public boolean method392(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
