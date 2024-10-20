package deob;

@ObfuscatedName("ht")
public class class227 extends class209 {

    @ObfuscatedName("ht.f")
    public final int field2624;

    @ObfuscatedName("ht.l")
    public final int field2621;

    @ObfuscatedName("ht.w")
    public final int[] field2619;

    @ObfuscatedName("ht.s")
    public final int[] field2622;

    public class227(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2624 = arg0;
        this.field2621 = arg1;
        this.field2619 = arg2;
        this.field2622 = arg3;
    }

    @ObfuscatedName("ht.f(III)Z")
    public boolean method4122(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2622.length) {
            int var3 = this.field2622[arg1];
            if (arg0 >= var3 && arg0 <= this.field2619[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
