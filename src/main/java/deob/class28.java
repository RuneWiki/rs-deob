package deob;

import java.util.Arrays;

@ObfuscatedName("bo")
public class class28 {

    @ObfuscatedName("bo.aa")
    public int[] field128 = new int[112];

    @ObfuscatedName("bo.az")
    public int[] field129 = new int[192];

    public class28() {
        Arrays.fill(this.field128, 3);
        Arrays.fill(this.field129, 3);
    }

    @ObfuscatedName("bo.aq(IIB)V")
    public void method354(int arg0, int arg1) {
        if (this.method381(arg0) && this.method364(arg1)) {
            this.field128[arg0] = arg1;
        }
    }

    @ObfuscatedName("bo.aw(CII)V")
    public void method355(char arg0, int arg1) {
        if (this.method372(arg0) && this.method364(arg1)) {
            this.field129[arg0] = arg1;
        }
    }

    @ObfuscatedName("bo.al(II)I")
    public int method356(int arg0) {
        return this.method381(arg0) ? this.field128[arg0] : 0;
    }

    @ObfuscatedName("bo.ai(CI)I")
    public int method357(char arg0) {
        return this.method372(arg0) ? this.field129[arg0] : 0;
    }

    @ObfuscatedName("bo.ar(II)Z")
    public boolean method358(int arg0) {
        return this.method381(arg0) && (this.field128[arg0] == 1 || this.field128[arg0] == 3);
    }

    @ObfuscatedName("bo.as(CI)Z")
    public boolean method353(char arg0) {
        return this.method372(arg0) && (this.field129[arg0] == 1 || this.field129[arg0] == 3);
    }

    @ObfuscatedName("bo.aa(II)Z")
    public boolean method382(int arg0) {
        return this.method381(arg0) && (this.field128[arg0] == 2 || this.field128[arg0] == 3);
    }

    @ObfuscatedName("bo.az(CI)Z")
    public boolean method375(char arg0) {
        return this.method372(arg0) && (this.field129[arg0] == 2 || this.field129[arg0] == 3);
    }

    @ObfuscatedName("bo.ao(II)Z")
    public boolean method381(int arg0) {
        if (arg0 >= 0 && arg0 < 112) {
            return true;
        } else {
            System.out.println("Invalid keycode: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bo.au(CI)Z")
    public boolean method372(char arg0) {
        if (arg0 >= 0 && arg0 < 192) {
            return true;
        } else {
            System.out.println("Invalid keychar: " + arg0);
            return false;
        }
    }

    @ObfuscatedName("bo.ak(IB)Z")
    public boolean method364(int arg0) {
        if (arg0 >= 0 && arg0 < 4) {
            return true;
        } else {
            System.out.println("Invalid mode: " + arg0);
            return false;
        }
    }
}
