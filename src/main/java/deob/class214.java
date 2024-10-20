package deob;

@ObfuscatedName("hu")
public class class214 extends class198 {

    @ObfuscatedName("hu.s")
    public final int field2618;

    @ObfuscatedName("hu.c")
    public final int field2617;

    @ObfuscatedName("hu.f")
    public final int[] field2619;

    @ObfuscatedName("hu.m")
    public final int[] field2620;

    public class214(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2618 = arg0;
        this.field2617 = arg1;
        this.field2619 = arg2;
        this.field2620 = arg3;
    }

    @ObfuscatedName("hu.s(IIB)Z")
    public boolean method3676(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2620.length) {
            int var3 = this.field2620[arg1];
            if (arg0 >= var3 && arg0 <= this.field2619[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
