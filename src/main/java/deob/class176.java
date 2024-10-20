package deob;

@ObfuscatedName("fs")
public class class176 extends class205 {

    @ObfuscatedName("fs.w")
    public final int field2912;

    @ObfuscatedName("fs.x")
    public final int field2913;

    @ObfuscatedName("fs.t")
    public final int[] field2915;

    @ObfuscatedName("fs.p")
    public final int[] field2910;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2912 = arg0;
        this.field2913 = arg1;
        this.field2915 = arg2;
        this.field2910 = arg3;
    }

    @ObfuscatedName("fs.w(III)Z")
    public boolean method3260(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2910.length) {
            int var3 = this.field2910[arg1];
            if (arg0 >= var3 && arg0 <= this.field2915[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
