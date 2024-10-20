package deob;

@ObfuscatedName("hh")
public class class219 extends class346 {

    @ObfuscatedName("hh.f")
    public final int field2571;

    @ObfuscatedName("hh.o")
    public final int field2572;

    @ObfuscatedName("hh.u")
    public final int[] field2575;

    @ObfuscatedName("hh.p")
    public final int[] field2573;

    public class219(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2571 = arg0;
        this.field2572 = arg1;
        this.field2575 = arg2;
        this.field2573 = arg3;
    }

    @ObfuscatedName("hh.f(III)Z")
    public boolean method3659(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2573.length) {
            int var3 = this.field2573[arg1];
            if (arg0 >= var3 && arg0 <= this.field2575[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
