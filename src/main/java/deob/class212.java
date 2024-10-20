package deob;

@ObfuscatedName("hi")
public class class212 extends class176 {

    @ObfuscatedName("hi.c")
    public final int field2489;

    @ObfuscatedName("hi.x")
    public final int field2491;

    @ObfuscatedName("hi.t")
    public final int[] field2490;

    @ObfuscatedName("hi.g")
    public final int[] field2488;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2489 = arg0;
        this.field2491 = arg1;
        this.field2490 = arg2;
        this.field2488 = arg3;
    }

    @ObfuscatedName("hi.c(III)Z")
    public boolean method3649(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2488.length) {
            int var3 = this.field2488[arg1];
            if (arg0 >= var3 && arg0 <= this.field2490[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
