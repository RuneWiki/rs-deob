package deob;

@ObfuscatedName("fi")
public class class176 extends class205 {

    @ObfuscatedName("fi.b")
    public final int field2889;

    @ObfuscatedName("fi.g")
    public final int field2890;

    @ObfuscatedName("fi.j")
    public final int[] field2893;

    @ObfuscatedName("fi.d")
    public final int[] field2892;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2889 = arg0;
        this.field2890 = arg1;
        this.field2893 = arg2;
        this.field2892 = arg3;
    }

    @ObfuscatedName("fi.b(III)Z")
    public boolean method3217(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2892.length) {
            int var3 = this.field2892[arg1];
            if (arg0 >= var3 && arg0 <= this.field2893[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
