package deob;

@ObfuscatedName("ll")
public class class306 extends class444 {

    @ObfuscatedName("ll.af")
    public final int field3477;

    @ObfuscatedName("ll.an")
    public final int field3472;

    @ObfuscatedName("ll.aw")
    public final int[] field3474;

    @ObfuscatedName("ll.ac")
    public final int[] field3475;

    public class306(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3477 = arg0;
        this.field3472 = arg1;
        this.field3474 = arg2;
        this.field3475 = arg3;
    }

    @ObfuscatedName("ll.af(III)Z")
    public boolean method5399(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3475.length) {
            int var3 = this.field3475[arg1];
            if (arg0 >= var3 && arg0 <= this.field3474[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
