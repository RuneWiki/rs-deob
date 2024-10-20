package deob;

@ObfuscatedName("fk")
public class class175 extends class204 {

    @ObfuscatedName("fk.a")
    public final int field2885;

    @ObfuscatedName("fk.r")
    public final int field2884;

    @ObfuscatedName("fk.f")
    public final int[] field2886;

    @ObfuscatedName("fk.s")
    public final int[] field2887;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2885 = arg0;
        this.field2884 = arg1;
        this.field2886 = arg2;
        this.field2887 = arg3;
    }

    @ObfuscatedName("fk.a(IIS)Z")
    public boolean method3220(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2887.length) {
            int var3 = this.field2887[arg1];
            if (arg0 >= var3 && arg0 <= this.field2886[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
