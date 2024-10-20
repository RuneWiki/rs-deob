package deob;

import java.util.Arrays;

@ObfuscatedName("bd")
public class class28 {

    @ObfuscatedName("bd.ag")
    public int[] field139 = new int[112];

    @ObfuscatedName("bd.ao")
    public int[] field141 = new int[192];

    public class28() {
        Arrays.fill(this.field139, 3);
        Arrays.fill(this.field141, 3);
    }

    @ObfuscatedName("bd.am(IIB)V")
    public void method422(int arg0, int arg1) {
        if (this.method395(arg0) && this.method417(arg1)) {
            this.field139[arg0] = arg1;
        }
    }

    @ObfuscatedName("bd.ap(CIB)V")
    public void method388(char arg0, int arg1) {
        if (this.method392(arg0) && this.method417(arg1)) {
            this.field141[arg0] = arg1;
        }
    }

    @ObfuscatedName("bd.af(II)I")
    public int method389(int arg0) {
        return this.method395(arg0) ? this.field139[arg0] : 0;
    }

    @ObfuscatedName("bd.aj(CB)I")
    public int method390(char arg0) {
        return this.method392(arg0) ? this.field141[arg0] : 0;
    }

    @ObfuscatedName("bd.aq(II)Z")
    public boolean method407(int arg0) {
        return this.method395(arg0) && (this.field139[arg0] == 1 || this.field139[arg0] == 3);
    }

    @ObfuscatedName("bd.ar(CB)Z")
    public boolean method413(char arg0) {
        return this.method392(arg0) && (this.field141[arg0] == 1 || this.field141[arg0] == 3);
    }

    @ObfuscatedName("bd.ag(II)Z")
    public boolean method393(int arg0) {
        return this.method395(arg0) && (this.field139[arg0] == 2 || this.field139[arg0] == 3);
    }

    @ObfuscatedName("bd.ao(CI)Z")
    public boolean method394(char arg0) {
        return this.method392(arg0) && (this.field141[arg0] == 2 || this.field141[arg0] == 3);
    }

    @ObfuscatedName("bd.ae(IB)Z")
    public boolean method395(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bd.aa(CB)Z")
    public boolean method392(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bd.au(IB)Z")
    public boolean method417(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
