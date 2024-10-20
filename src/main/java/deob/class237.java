package deob;

@ObfuscatedName("ir")
public class class237 extends class219 {

    @ObfuscatedName("ir.c")
    public final int field2766;

    @ObfuscatedName("ir.i")
    public final int field2764;

    @ObfuscatedName("ir.o")
    public final int[] field2769;

    @ObfuscatedName("ir.j")
    public final int[] field2767;

    public class237(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2766 = arg0;
        this.field2764 = arg1;
        this.field2769 = arg2;
        this.field2767 = arg3;
    }

    @ObfuscatedName("ir.c(III)Z")
    public boolean method4028(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2767.length) {
            int var3 = this.field2767[arg1];
            if (arg0 >= var3 && arg0 <= this.field2769[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
