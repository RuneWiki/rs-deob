package deob;

@ObfuscatedName("hx")
public class class227 extends class209 {

    @ObfuscatedName("hx.g")
    public final int field2627;

    @ObfuscatedName("hx.r")
    public final int field2622;

    @ObfuscatedName("hx.e")
    public final int[] field2623;

    @ObfuscatedName("hx.q")
    public final int[] field2624;

    public class227(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2627 = arg0;
        this.field2622 = arg1;
        this.field2623 = arg2;
        this.field2624 = arg3;
    }

    @ObfuscatedName("hx.g(III)Z")
    public boolean method4266(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2624.length) {
            int var3 = this.field2624[arg1];
            if (arg0 >= var3 && arg0 <= this.field2623[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
