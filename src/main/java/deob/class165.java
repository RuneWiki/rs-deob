package deob;

@ObfuscatedName("fe")
public class class165 extends class130 {

    @ObfuscatedName("fe.o")
    public final int field2165;

    @ObfuscatedName("fe.m")
    public final int field2166;

    @ObfuscatedName("fe.b")
    public final int[] field2169;

    @ObfuscatedName("fe.g")
    public final int[] field2163;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2165 = arg0;
        this.field2166 = arg1;
        this.field2169 = arg2;
        this.field2163 = arg3;
    }

    @ObfuscatedName("fe.o(III)Z")
    public boolean method2867(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2163.length) {
            int var3 = this.field2163[arg1];
            if (arg0 >= var3 && arg0 <= this.field2169[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
