package deob;

import java.util.Arrays;

@ObfuscatedName("bd")
public class class28 {

    @ObfuscatedName("bd.aa")
    public int[] field129 = new int[112];

    @ObfuscatedName("bd.ac")
    public int[] field136 = new int[192];

    public class28() {
        Arrays.fill(this.field129, 3);
        Arrays.fill(this.field136, 3);
    }

    @ObfuscatedName("bd.at(III)V")
    public void method398(int arg0, int arg1) {
        if (this.method407(arg0) && this.method409(arg1)) {
            this.field129[arg0] = arg1;
        }
    }

    @ObfuscatedName("bd.ah(CII)V")
    public void method400(char arg0, int arg1) {
        if (this.method405(arg0) && this.method409(arg1)) {
            this.field136[arg0] = arg1;
        }
    }

    @ObfuscatedName("bd.ar(II)I")
    public int method401(int arg0) {
        return this.method407(arg0) ? this.field129[arg0] : 0;
    }

    @ObfuscatedName("bd.ao(CI)I")
    public int method408(char arg0) {
        return this.method405(arg0) ? this.field136[arg0] : 0;
    }

    @ObfuscatedName("bd.ab(II)Z")
    public boolean method403(int arg0) {
        return this.method407(arg0) && (this.field129[arg0] == 1 || this.field129[arg0] == 3);
    }

    @ObfuscatedName("bd.au(CI)Z")
    public boolean method404(char arg0) {
        return this.method405(arg0) && (this.field136[arg0] == 1 || this.field136[arg0] == 3);
    }

    @ObfuscatedName("bd.aa(II)Z")
    public boolean method416(int arg0) {
        return this.method407(arg0) && (this.field129[arg0] == 2 || this.field129[arg0] == 3);
    }

    @ObfuscatedName("bd.ac(CI)Z")
    public boolean method406(char arg0) {
        return this.method405(arg0) && (this.field136[arg0] == 2 || this.field136[arg0] == 3);
    }

    @ObfuscatedName("bd.al(II)Z")
    public boolean method407(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bd.az(CI)Z")
    public boolean method405(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bd.ap(IS)Z")
    public boolean method409(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
