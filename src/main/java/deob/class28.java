package deob;

import java.util.Arrays;

@ObfuscatedName("bj")
public class class28 {

    @ObfuscatedName("bj.aj")
    public int[] field121 = new int[112];

    @ObfuscatedName("bj.av")
    public int[] field127 = new int[192];

    public class28() {
        Arrays.fill(this.field121, 3);
        Arrays.fill(this.field127, 3);
    }

    @ObfuscatedName("bj.aq(III)V")
    public void method388(int arg0, int arg1) {
        if (this.method396(arg0) && this.method398(arg1)) {
            this.field121[arg0] = arg1;
        }
    }

    @ObfuscatedName("bj.ad(CII)V")
    public void method389(char arg0, int arg1) {
        if (this.method397(arg0) && this.method398(arg1)) {
            this.field127[arg0] = arg1;
        }
    }

    @ObfuscatedName("bj.ag(II)I")
    public int method400(int arg0) {
        return this.method396(arg0) ? this.field121[arg0] : 0;
    }

    @ObfuscatedName("bj.ak(CI)I")
    public int method391(char arg0) {
        return this.method397(arg0) ? this.field127[arg0] : 0;
    }

    @ObfuscatedName("bj.ap(IB)Z")
    public boolean method392(int arg0) {
        return this.method396(arg0) && (this.field121[arg0] == 1 || this.field121[arg0] == 3);
    }

    @ObfuscatedName("bj.an(CI)Z")
    public boolean method393(char arg0) {
        return this.method397(arg0) && (this.field127[arg0] == 1 || this.field127[arg0] == 3);
    }

    @ObfuscatedName("bj.aj(II)Z")
    public boolean method394(int arg0) {
        return this.method396(arg0) && (this.field121[arg0] == 2 || this.field121[arg0] == 3);
    }

    @ObfuscatedName("bj.av(CI)Z")
    public boolean method395(char arg0) {
        return this.method397(arg0) && (this.field127[arg0] == 2 || this.field127[arg0] == 3);
    }

    @ObfuscatedName("bj.ab(II)Z")
    public boolean method396(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bj.ai(CB)Z")
    public boolean method397(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bj.ae(II)Z")
    public boolean method398(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
