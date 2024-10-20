package deob;

@ObfuscatedName("fk")
public class class165 extends class130 {

    @ObfuscatedName("fk.b")
    public final int field2152;

    @ObfuscatedName("fk.e")
    public final int field2147;

    @ObfuscatedName("fk.c")
    public final int[] field2148;

    @ObfuscatedName("fk.l")
    public final int[] field2155;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2152 = arg0;
        this.field2147 = arg1;
        this.field2148 = arg2;
        this.field2155 = arg3;
    }

    @ObfuscatedName("fk.b(III)Z")
    public boolean method2984(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2155.length) {
            int var3 = this.field2155[arg1];
            if (arg0 >= var3 && arg0 <= this.field2148[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
