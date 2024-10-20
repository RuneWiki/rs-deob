package deob;

@ObfuscatedName("fo")
public class class179 extends class208 {

    @ObfuscatedName("fo.l")
    public final int field2954;

    @ObfuscatedName("fo.g")
    public final int field2951;

    @ObfuscatedName("fo.r")
    public final int[] field2952;

    @ObfuscatedName("fo.e")
    public final int[] field2955;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2954 = arg0;
        this.field2951 = arg1;
        this.field2952 = arg2;
        this.field2955 = arg3;
    }

    @ObfuscatedName("fo.l(IIB)Z")
    public boolean method3391(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2955.length) {
            int var3 = this.field2955[arg1];
            if (arg0 >= var3 && arg0 <= this.field2952[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
