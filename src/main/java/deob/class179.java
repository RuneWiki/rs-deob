package deob;

@ObfuscatedName("fd")
public class class179 extends class208 {

    @ObfuscatedName("fd.x")
    public final int field2954;

    @ObfuscatedName("fd.r")
    public final int field2953;

    @ObfuscatedName("fd.j")
    public final int[] field2957;

    @ObfuscatedName("fd.z")
    public final int[] field2955;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2954 = arg0;
        this.field2953 = arg1;
        this.field2957 = arg2;
        this.field2955 = arg3;
    }

    @ObfuscatedName("fd.x(III)Z")
    public boolean method3255(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2955.length) {
            int var3 = this.field2955[arg1];
            if (arg0 >= var3 && arg0 <= this.field2957[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
