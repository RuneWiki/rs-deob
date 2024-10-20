package deob;

@ObfuscatedName("fs")
public class class176 extends class205 {

    @ObfuscatedName("fs.s")
    public final int field2915;

    @ObfuscatedName("fs.j")
    public final int field2910;

    @ObfuscatedName("fs.p")
    public final int[] field2911;

    @ObfuscatedName("fs.x")
    public final int[] field2912;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2915 = arg0;
        this.field2910 = arg1;
        this.field2911 = arg2;
        this.field2912 = arg3;
    }

    @ObfuscatedName("fs.s(III)Z")
    public boolean method3198(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2912.length) {
            int var3 = this.field2912[arg1];
            if (arg0 >= var3 && arg0 <= this.field2911[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
